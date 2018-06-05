package com.spicymods.plasma.init;

import com.spicymods.plasma.ModMain;
import com.spicymods.plasma.block.MagnesiumBlock;
import com.spicymods.plasma.block.MagnesiumOre;
import com.spicymods.plasma.block.PlasmaGolemHead;
import com.spicymods.plasma.block.PlasmaticBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
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
    public static Block magnesiumBlock;
    public static Block plasmaticBlock;
    public static BlockHorizontal plasmaGolemHead;

    public static void init() {
        magnesiumOre = new MagnesiumOre();
        magnesiumBlock = new MagnesiumBlock();
        plasmaticBlock = new PlasmaticBlock();
        plasmaGolemHead = new PlasmaGolemHead();
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(magnesiumOre);
        event.getRegistry().register(magnesiumBlock);
        event.getRegistry().register(plasmaticBlock);
        event.getRegistry().register(plasmaGolemHead);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(magnesiumOre).setRegistryName(magnesiumOre.getRegistryName()));
        event.getRegistry().register(new ItemBlock(magnesiumBlock).setRegistryName(magnesiumBlock.getRegistryName()));
        event.getRegistry().register(new ItemBlock(plasmaticBlock).setRegistryName(plasmaticBlock.getRegistryName()));
        event.getRegistry().register(new ItemBlock(plasmaGolemHead).setRegistryName(plasmaGolemHead.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerRender(ModelRegistryEvent event) {
        registerRender(Item.getItemFromBlock(magnesiumOre));
        registerRender(Item.getItemFromBlock(magnesiumBlock));
        registerRender(Item.getItemFromBlock(plasmaticBlock));
        registerRender(Item.getItemFromBlock(plasmaGolemHead));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
