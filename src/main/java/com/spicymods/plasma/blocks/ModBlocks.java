package com.spicymods.plasma.blocks;

import com.spicymods.plasma.ModMain;
import com.spicymods.plasma.blocks.ore.MagnesiumOre;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = ModMain.MODID)
public class ModBlocks {

    public static Block magnesiumOre;

    public static void init() {
        magnesiumOre = new MagnesiumOre();
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(magnesiumOre);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(magnesiumOre).setRegistryName(magnesiumOre.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerRender(ModelRegistryEvent event) {
        registerRender(Item.getItemFromBlock(magnesiumOre));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
