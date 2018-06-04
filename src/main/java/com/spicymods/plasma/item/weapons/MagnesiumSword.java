package com.spicymods.plasma.item.weapons;

import net.minecraft.item.ItemSword;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.init.ModItems.TOOL_MAGNESIUM;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class MagnesiumSword extends ItemSword {

    public MagnesiumSword() {
        super(TOOL_MAGNESIUM);
        this.setRegistryName("magnesium_sword");
        this.setUnlocalizedName(MODID+".magnesium_sword");
        this.setCreativeTab(plasmaTab);
    }
}
