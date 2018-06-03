package com.spicymods.plasma.init;

import com.spicymods.plasma.ModMain;
import com.spicymods.plasma.item.misc.*;
import com.spicymods.plasma.item.tools.MagnesiumAxe;
import com.spicymods.plasma.item.tools.MagnesiumHoe;
import com.spicymods.plasma.item.tools.MagnesiumPickaxe;
import com.spicymods.plasma.item.tools.MagnesiumShovel;
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
    public static Item plasma;
    public static Item ionicPlasma;
    public static Item magnesiumRod;
    public static Item plasmaPlate;
    public static Item plasmaticIngot;
    public static Item magnesiumPickaxe;
    public static Item magnesiumAxe;
    public static Item magnesiumShovel;
    public static Item magnesiumHoe;

    public static void init() {
        magnesiumIngot = new MagnesiumIngot();
        magnesiumShard = new MagnesiumShard();
        plasma = new Plasma();
        ionicPlasma = new IonicPlasma();
        magnesiumRod = new MagnesiumRod();
        plasmaPlate = new PlasmaPlate();
        plasmaticIngot = new PlasmaticIngot();
        magnesiumPickaxe = new MagnesiumPickaxe();
        magnesiumAxe = new MagnesiumAxe();
        magnesiumShovel = new MagnesiumShovel();
        magnesiumHoe = new MagnesiumHoe();
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(magnesiumIngot);
        event.getRegistry().register(magnesiumShard);
        event.getRegistry().register(plasma);
        event.getRegistry().register(ionicPlasma);
        event.getRegistry().register(magnesiumRod);
        event.getRegistry().register(plasmaPlate);
        event.getRegistry().register(plasmaticIngot);
        event.getRegistry().register(magnesiumPickaxe);
        event.getRegistry().register(magnesiumAxe);
        event.getRegistry().register(magnesiumShovel);
        event.getRegistry().register(magnesiumHoe);
    }

    @SubscribeEvent
    public static void registerRender(ModelRegistryEvent event) {
        registerRender(magnesiumIngot);
        registerRender(magnesiumShard);
        registerRender(plasma);
        registerRender(ionicPlasma);
        registerRender(magnesiumRod);
        registerRender(plasmaPlate);
        registerRender(plasmaticIngot);
        registerRender(magnesiumPickaxe);
        registerRender(magnesiumAxe);
        registerRender(magnesiumShovel);
        registerRender(magnesiumHoe);
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
