package com.spicymods.plasma.item.tools;

import net.minecraft.item.ItemPickaxe;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.init.ModItems.TOOL_PLASMATIC;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class PlasmaticPickaxe extends ItemPickaxe {

    public PlasmaticPickaxe() {
        super(TOOL_PLASMATIC);
        this.setRegistryName("plasmatic_pickaxe");
        this.setUnlocalizedName(MODID+".plasmatic_pickaxe");
        this.setCreativeTab(plasmaTab);
    }
}
