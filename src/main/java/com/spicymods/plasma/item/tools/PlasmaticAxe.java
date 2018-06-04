package com.spicymods.plasma.item.tools;

import net.minecraft.item.ItemAxe;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.init.ModItems.TOOL_PLASMATIC;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class PlasmaticAxe extends ItemAxe {

    public PlasmaticAxe() {
        super(TOOL_PLASMATIC, 11.0F, -3.0F);
        this.setRegistryName("plasmatic_axe");
        this.setUnlocalizedName(MODID+".plasmatic_axe");
        this.setCreativeTab(plasmaTab);
    }
}
