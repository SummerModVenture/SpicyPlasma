package com.spicymods.plasma.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
       GameRegistry.addSmelting(ModBlocks.magnesiumOre, new ItemStack(ModItems.magnesiumIngot, 1), 1.0F);
       GameRegistry.addSmelting(ModBlocks.magnesiumBlock, new ItemStack(ModItems.plasma, 4), 2.0F);
    }
}
