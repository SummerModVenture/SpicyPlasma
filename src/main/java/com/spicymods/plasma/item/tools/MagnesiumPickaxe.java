package com.spicymods.plasma.item.tools;

import net.minecraft.item.ItemPickaxe;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.init.ModItems.TOOL_MAGNESIUM;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class MagnesiumPickaxe extends ItemPickaxe {

    public MagnesiumPickaxe() {
        super(TOOL_MAGNESIUM);
        this.setRegistryName("magnesium_pickaxe");
        this.setUnlocalizedName(MODID+".magnesium_pickaxe");
        this.setCreativeTab(plasmaTab);
        this.attackDamage = 3.0F;
    }
}
