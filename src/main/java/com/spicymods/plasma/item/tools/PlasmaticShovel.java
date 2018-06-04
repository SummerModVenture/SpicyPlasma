package com.spicymods.plasma.item.tools;

import net.minecraft.item.ItemSpade;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.init.ModItems.TOOL_PLASMATIC;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class PlasmaticShovel extends ItemSpade {

    public PlasmaticShovel() {
        super(TOOL_PLASMATIC);
        this.setRegistryName("plasmatic_shovel");
        this.setUnlocalizedName(MODID+".plasmatic_shovel");
        this.setCreativeTab(plasmaTab);
    }
}
