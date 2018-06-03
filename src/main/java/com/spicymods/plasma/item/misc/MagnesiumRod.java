package com.spicymods.plasma.item.misc;

import net.minecraft.item.Item;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class MagnesiumRod extends Item {

    public MagnesiumRod() {
        this.setRegistryName("magnesium_rod");
        this.setUnlocalizedName(MODID+".magnesium_rod");
        this.setMaxStackSize(64);
        this.setCreativeTab(plasmaTab);
    }
}
