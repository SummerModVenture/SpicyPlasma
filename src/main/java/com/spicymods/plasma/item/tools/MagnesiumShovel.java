package com.spicymods.plasma.item.tools;

import net.minecraft.item.ItemSpade;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class MagnesiumShovel extends ItemSpade {

    public MagnesiumShovel() {
        super(ToolMaterial.GOLD);
        this.setRegistryName("magnesium_shovel");
        this.setUnlocalizedName(MODID+".magnesium_shovel");
        this.setCreativeTab(plasmaTab);
        this.attackDamage = 5;
    }
}
