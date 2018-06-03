package com.spicymods.plasma.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class MagnesiumBlock extends Block {

    public MagnesiumBlock() {
        super(Material.IRON);
        this.setRegistryName("magnesium_block");
        this.setUnlocalizedName(MODID+".magnesium_block");
        this.setCreativeTab(plasmaTab);
        this.setHardness(5);
    }

    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.SOLID;
    }
}
