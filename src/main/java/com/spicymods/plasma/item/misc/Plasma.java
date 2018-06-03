package com.spicymods.plasma.item.misc;

import net.minecraft.item.Item;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class Plasma extends Item {

    public Plasma() {
        this.setRegistryName("plasma");
        this.setUnlocalizedName(MODID+".plasma");
        this.setMaxStackSize(64);
        this.setCreativeTab(plasmaTab);
    }
}
