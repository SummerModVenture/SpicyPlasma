package com.spicymods.plasma.blocks;

import com.spicymods.plasma.items.misc.MagnesiumShard;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class MagnesiumOre extends Block {

    public MagnesiumOre() {
        super(Material.ROCK);
        this.setRegistryName("magnesium_ore");
        this.setUnlocalizedName(MODID+".magnesium_ore");
        this.setCreativeTab(plasmaTab);
    }

    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.SOLID;
    }
}
