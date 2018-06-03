package com.spicymods.plasma.item.misc;

import net.minecraft.item.Item;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class IonicPlasma extends Item {

    public IonicPlasma() {
        this.setRegistryName("ionic_plasma");
        this.setUnlocalizedName(MODID+".ionic_plasma");
        this.setMaxStackSize(64);
        this.setCreativeTab(plasmaTab);
    }
}
