package com.spicymods.plasma.item.tools;

import net.minecraft.item.ItemSpade;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.init.ModItems.TOOL_MAGNESIUM;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class MagnesiumShovel extends ItemSpade {

    public MagnesiumShovel() {
        super(TOOL_MAGNESIUM);
        this.setRegistryName("magnesium_shovel");
        this.setUnlocalizedName(MODID+".magnesium_shovel");
        this.setCreativeTab(plasmaTab);
        this.attackDamage = 3.0F;
    }
}
