package com.spicymods.plasma.item.misc;

import net.minecraft.item.Item;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class MagnesiumShard extends Item {

    public MagnesiumShard() {
        this.setRegistryName("magnesium_shard");
        this.setUnlocalizedName(MODID+".magnesium_shard");
        this.setMaxStackSize(64);
        this.setCreativeTab(plasmaTab);
    }
}
