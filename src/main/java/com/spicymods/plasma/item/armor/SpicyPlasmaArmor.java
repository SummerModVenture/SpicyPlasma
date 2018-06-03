package com.spicymods.plasma.item.armor;

import com.spicymods.plasma.tab.SpicyPlasmaTab;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class SpicyPlasmaArmor extends ItemArmor {

    public final String armorTexture1, armorTexture2;
    public final String armorName;

    public SpicyPlasmaArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String armorName) {
        super(materialIn, renderIndexIn, equipmentSlotIn);

        this.armorName = armorName;
        this.setCreativeTab(plasmaTab);

        this.armorTexture1 = "spicyplasma/textures/models/armor/" + armorName + "_1.png";
        this.armorTexture2 = "spicyplasma/textures/models/armor/" +armorName + "_2.png";
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type){

        if(slot == EntityEquipmentSlot.LEGS){
            return "spicyplasma:textures/models/armor/" + armorName + "_2.png";
        }

        else {
            return "spicyplasma:textures/models/armor/" + armorName + "_1.png";
        }
    }

    @Nullable
    @Override
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        return super.getArmorModel(entityLiving, itemStack, armorSlot, _default);
    }
}
