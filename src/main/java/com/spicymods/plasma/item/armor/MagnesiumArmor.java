package com.spicymods.plasma.item.armor;

import com.spicymods.plasma.init.ModItems;
import net.minecraft.inventory.EntityEquipmentSlot;

import static com.spicymods.plasma.ModMain.MODID;

public class MagnesiumArmor extends SpicyPlasmaArmor {

    public MagnesiumArmor(EntityEquipmentSlot slot, String name) {
        super(ModItems.ARMOR_MAGNESIUM, 3, slot, "magnesium");
        this.setRegistryName(name);
        this.setUnlocalizedName(MODID+"."+name);
    }
}
