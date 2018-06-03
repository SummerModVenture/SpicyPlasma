package com.spicymods.plasma.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class PlasmaticBlock extends Block {

    public PlasmaticBlock() {
        super(Material.IRON);
        this.setRegistryName("plasmatic_block");
        this.setUnlocalizedName(MODID+".plasmatic_block");
        this.setCreativeTab(plasmaTab);
        this.setHardness(5);
    }

    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.SOLID;
    }
}
