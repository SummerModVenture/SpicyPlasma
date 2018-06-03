package com.spicymods.plasma.items.misc;

import net.minecraft.item.Item;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class PlasmaticIngot extends Item {

    public PlasmaticIngot() {
        this.setRegistryName("plasmatic_ingot");
        this.setUnlocalizedName(MODID+".plasmatic_ingot");
        this.setMaxStackSize(64);
        this.setCreativeTab(plasmaTab);
    }
}
