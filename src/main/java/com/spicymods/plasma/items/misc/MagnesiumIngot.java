package com.spicymods.plasma.items.misc;

import net.minecraft.item.Item;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.customTab;

public class MagnesiumIngot extends Item {

    public MagnesiumIngot() {
        this.setRegistryName("magnesium_ingot");
        this.setUnlocalizedName(MODID+".magnesium_ingot");
        this.setMaxStackSize(64);
        this.setCreativeTab(customTab);
    }
}
