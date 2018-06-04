package com.spicymods.plasma.item.tools;

import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemHoe;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.init.ModItems.TOOL_PLASMATIC;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class PlasmaticHoe extends ItemHoe {

    public PlasmaticHoe() {
        super(TOOL_PLASMATIC);
        this.setRegistryName("plasmatic_hoe");
        this.setUnlocalizedName(MODID+".plasmatic_hoe");
        this.setCreativeTab(plasmaTab);
    }

    public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot)
    {
        Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);

        if (equipmentSlot == EntityEquipmentSlot.MAINHAND)
        {
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", -9.0F, 0));
        }

        return multimap;
    }
}
