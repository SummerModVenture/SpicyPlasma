package com.spicymods.plasma.items.misc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import static com.spicymods.plasma.ModMain.MODID;

public class MagnesiumIngot extends Item {

    public MagnesiumIngot() {
        this.setRegistryName("magnesium_ingot");
        this.setUnlocalizedName(MODID+".magnesium_ingot");
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTabs.MISC);
    }
}
