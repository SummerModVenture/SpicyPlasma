package com.spicymods.plasma.item.misc;

import net.minecraft.item.Item;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class PlasmaPlate extends Item {

    public PlasmaPlate() {
        this.setRegistryName("plasma_plate");
        this.setUnlocalizedName(MODID+".plasma_plate");
        this.setMaxStackSize(64);
        this.setCreativeTab(plasmaTab);
    }
}
