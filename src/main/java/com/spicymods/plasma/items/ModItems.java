package com.spicymods.plasma.items;

import com.spicymods.plasma.ModMain;
import com.spicymods.plasma.items.misc.MagnesiumIngot;
import com.spicymods.plasma.items.misc.MagnesiumShard;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = ModMain.MODID)
public class ModItems {

    public static Item magnesiumIngot;
    public static Item magnesiumShard;

    public static void init() {
        magnesiumIngot = new MagnesiumIngot();
        magnesiumShard = new MagnesiumShard();
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(magnesiumIngot);
        event.getRegistry().register(magnesiumShard);
    }

    @SubscribeEvent
    public static void registerRender(ModelRegistryEvent event) {
        registerRender(magnesiumIngot);
        registerRender(magnesiumShard);
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
