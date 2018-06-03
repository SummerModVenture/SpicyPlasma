package com.spicymods.plasma.blocks.ore;

import com.spicymods.plasma.items.misc.MagnesiumShard;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.customTab;

public class MagnesiumOre extends Block {

    public MagnesiumOre() {
        super(Material.ROCK);
        this.setRegistryName("magnesium_ore");
        this.setUnlocalizedName(MODID+".magnesium_ore");
        this.setCreativeTab(customTab);
    }

    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.SOLID;
    }
}
