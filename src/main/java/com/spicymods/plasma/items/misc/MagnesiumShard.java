package com.spicymods.plasma.items.misc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.customTab;

public class MagnesiumShard extends Item {

    public MagnesiumShard() {
        this.setRegistryName("magnesium_shard");
        this.setUnlocalizedName(MODID+".magnesium_shard");
        this.setMaxStackSize(64);
        this.setCreativeTab(customTab);
    }
}
