package com.spicymods.plasma.item.weapons;

import com.google.common.collect.Multimap;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class PlasmaticWand extends Item {

    public PlasmaticWand() {
        this.setRegistryName("plasmatic_wand");
        this.setUnlocalizedName(MODID+".plasmatic_wand");
        this.setMaxStackSize(1);
        this.setCreativeTab(plasmaTab);
        this.setMaxDamage(1000);
    }

    //causes the user to be teleported via an ender pearl and is healed in brace for the impact
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        playerIn.getCooldownTracker().setCooldown(this, 20);

        EnderTeleportEvent enderteleportevent = new EnderTeleportEvent(playerIn, playerIn.posX, playerIn.posY, playerIn.posZ, 1);

        if (!worldIn.isRemote)
        {
            EntityEnderPearl entityenderpearl = new EntityEnderPearl(worldIn, playerIn);
            entityenderpearl.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 3.0F, 1.0F);
            worldIn.spawnEntity(entityenderpearl);
        }

        playerIn.heal(20.0F);

        this.setDamage(itemstack, 20);

        return new ActionResult<>(EnumActionResult.PASS, itemstack);
    }

    //causes the user to have a chance to strike lightning on those it hits and drags the enemy towards the user
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        EntityPlayer entityplayer = (EntityPlayer) attacker;
        World world = attacker.getEntityWorld();

        int x = target.getPosition().getX();
        int y = target.getPosition().getY();
        int z = target.getPosition().getZ();

        double chance = Math.random() * 10;

        if (chance > 8.5) {
            world.addWeatherEffect(new EntityLightningBolt(world, x, y, z, true));
        }

        target.setPosition(attacker.posX, attacker.posY, attacker.posZ);
        attacker.setPosition(x, y, z);

        this.setDamage(stack, 1);

        return super.hitEntity(stack, target, attacker);
    }

    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

        if (equipmentSlot == EntityEquipmentSlot.MAINHAND)
        {
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -3.0F, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", 0.0F, 0));
        }

        return multimap;
    }

    @Override
    public boolean getIsRepairable(ItemStack stack, ItemStack ItemStack) {
        return false;
    }
}
