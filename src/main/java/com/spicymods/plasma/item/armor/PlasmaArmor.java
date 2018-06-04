package com.spicymods.plasma.item.armor;

import com.spicymods.plasma.init.ModItems;
import net.minecraft.inventory.EntityEquipmentSlot;

import static com.spicymods.plasma.ModMain.MODID;

public class PlasmaArmor extends SpicyPlasmaArmor {

    public PlasmaArmor(EntityEquipmentSlot slot, String name) {
        super(ModItems.ARMOR_PLASMA, 3, slot, "plasma");
        this.setRegistryName(name);
        this.setUnlocalizedName(MODID+"."+name);
    }
}
