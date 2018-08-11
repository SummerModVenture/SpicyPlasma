package com.spicymods.plasma.item.misc;

import net.minecraft.item.Item;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class InfusedShard extends Item {

    public InfusedShard() {
        this.setRegistryName("infused_shard");
        this.setUnlocalizedName(MODID+".infused_shard");
        this.setMaxStackSize(64);
        this.setCreativeTab(plasmaTab);
    }
}
