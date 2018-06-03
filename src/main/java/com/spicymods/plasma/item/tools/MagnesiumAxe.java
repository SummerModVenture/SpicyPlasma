package com.spicymods.plasma.item.tools;

import net.minecraft.item.ItemAxe;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.init.ModItems.TOOL_MAGNESIUM;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class MagnesiumAxe extends ItemAxe {

    public MagnesiumAxe() {
        super(TOOL_MAGNESIUM, 7.0F, -3.0F);
        this.setRegistryName("magnesium_axe");
        this.setUnlocalizedName(MODID+".magnesium_axe");
        this.setCreativeTab(plasmaTab);
    }
}
