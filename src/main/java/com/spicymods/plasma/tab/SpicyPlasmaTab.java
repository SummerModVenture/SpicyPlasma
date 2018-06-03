package com.spicymods.plasma.tab;

import com.spicymods.plasma.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SpicyPlasmaTab {
    public static CreativeTabs plasmaTab = new CreativeTabs("spicy_plasma_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.magnesiumShard);
        }
    };
}
