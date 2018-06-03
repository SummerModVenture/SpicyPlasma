package com.spicymods.plasma.item.tools;

import net.minecraft.item.ItemAxe;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class MagnesiumAxe extends ItemAxe {

    public MagnesiumAxe() {
        super(ToolMaterial.GOLD);
        this.setRegistryName("magnesium_axe");
        this.setUnlocalizedName(MODID+".magnesium_axe");
        this.setCreativeTab(plasmaTab);
        this.attackDamage = 10;
    }
}
