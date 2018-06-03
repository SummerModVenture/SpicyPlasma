package com.spicymods.plasma.item.tools;

import net.minecraft.item.ItemHoe;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class MagnesiumHoe extends ItemHoe {

    public MagnesiumHoe() {
        super(ToolMaterial.IRON);
        this.setRegistryName("magnesium_hoe");
        this.setUnlocalizedName(MODID+".magnesium_hoe");
        this.setCreativeTab(plasmaTab);
    }
}
