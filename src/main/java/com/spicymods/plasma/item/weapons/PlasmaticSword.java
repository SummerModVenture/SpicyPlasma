package com.spicymods.plasma.item.weapons;

import net.minecraft.item.ItemSword;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.init.ModItems.TOOL_PLASMATIC;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class PlasmaticSword extends ItemSword {

    public PlasmaticSword() {
        super(TOOL_PLASMATIC);
        this.setRegistryName("plasmatic_sword");
        this.setUnlocalizedName(MODID+".plasmatic_sword");
        this.setCreativeTab(plasmaTab);
    }
}
