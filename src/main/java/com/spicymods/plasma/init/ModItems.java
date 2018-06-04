package com.spicymods.plasma.init;

import com.spicymods.plasma.ModMain;
import com.spicymods.plasma.item.armor.MagnesiumArmor;
import com.spicymods.plasma.item.armor.PlasmaArmor;
import com.spicymods.plasma.item.misc.*;
import com.spicymods.plasma.item.tools.*;
import com.spicymods.plasma.item.weapons.MagnesiumSword;
import com.spicymods.plasma.item.weapons.PlasmaticSword;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = ModMain.MODID)
public class ModItems {

    //armor material
    public static final ArmorMaterial ARMOR_MAGNESIUM = EnumHelper.addArmorMaterial("magnesium","magnesium",150, new int[]{1,4,5,2}, 0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ArmorMaterial ARMOR_PLASMA = EnumHelper.addArmorMaterial("plasma", "plasma", 600, new int[]{5,9,12,6}, 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);

    //tool material
    public static final ToolMaterial TOOL_MAGNESIUM = EnumHelper.addToolMaterial("magnesium", 2, 100, 5.0F, 1.0F, 0);
    public static final ToolMaterial TOOL_PLASMATIC = EnumHelper.addToolMaterial("plasmatic", 4, 3000, 20.0F, 10.0F, 0);

    //misc items
    public static Item magnesiumIngot;
    public static Item magnesiumShard;
    public static Item plasma;
    public static Item ionicPlasma;
    public static Item magnesiumRod;
    public static Item plasmaPlate;
    public static Item plasmaticIngot;

    //tools
    public static Item magnesiumPickaxe;
    public static Item magnesiumAxe;
    public static Item magnesiumShovel;
    public static Item magnesiumHoe;
    public static Item magnesiumSword;
    public static Item plasmaticPickaxe;
    public static Item plasmaticAxe;
    public static Item plasmaticShovel;
    public static Item plasmaticHoe;
    public static Item plasmaticSword;

    //armor
    public static Item magnesiumHelmet;
    public static Item magnesiumChestPlate;
    public static Item magnesiumLeggings;
    public static Item magnesiumBoots;
    public static Item plasmaHelmet;
    public static Item plasmaChestPlate;
    public static Item plasmaLeggings;
    public static Item plasmaBoots;

    public static void init() {
        //misc items
        magnesiumIngot = new MagnesiumIngot();
        magnesiumShard = new MagnesiumShard();
        plasma = new Plasma();
        ionicPlasma = new IonicPlasma();
        magnesiumRod = new MagnesiumRod();
        plasmaPlate = new PlasmaPlate();
        plasmaticIngot = new PlasmaticIngot();
        //tools
        magnesiumPickaxe = new MagnesiumPickaxe();
        magnesiumAxe = new MagnesiumAxe();
        magnesiumShovel = new MagnesiumShovel();
        magnesiumHoe = new MagnesiumHoe();
        magnesiumSword = new MagnesiumSword();
        plasmaticPickaxe = new PlasmaticPickaxe();
        plasmaticAxe = new PlasmaticAxe();
        plasmaticShovel = new PlasmaticShovel();
        plasmaticHoe = new PlasmaticHoe();
        plasmaticSword = new PlasmaticSword();
        //armor
        magnesiumHelmet = new MagnesiumArmor(EntityEquipmentSlot.HEAD, "magnesium_helmet");
        magnesiumChestPlate = new MagnesiumArmor(EntityEquipmentSlot.CHEST, "magnesium_chestplate");
        magnesiumLeggings = new MagnesiumArmor(EntityEquipmentSlot.LEGS, "magnesium_leggings");
        magnesiumBoots = new MagnesiumArmor(EntityEquipmentSlot.FEET, "magnesium_boots");
        plasmaHelmet = new PlasmaArmor(EntityEquipmentSlot.HEAD, "plasma_helmet");
        plasmaChestPlate = new PlasmaArmor(EntityEquipmentSlot.CHEST, "plasma_chestplate");
        plasmaLeggings = new PlasmaArmor(EntityEquipmentSlot.LEGS, "plasma_leggings");
        plasmaBoots = new PlasmaArmor(EntityEquipmentSlot.FEET, "plasma_boots");
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        //misc items
        event.getRegistry().register(magnesiumIngot);
        event.getRegistry().register(magnesiumShard);
        event.getRegistry().register(plasma);
        event.getRegistry().register(ionicPlasma);
        event.getRegistry().register(magnesiumRod);
        event.getRegistry().register(plasmaPlate);
        event.getRegistry().register(plasmaticIngot);
        //tools
        event.getRegistry().register(magnesiumPickaxe);
        event.getRegistry().register(magnesiumAxe);
        event.getRegistry().register(magnesiumShovel);
        event.getRegistry().register(magnesiumHoe);
        event.getRegistry().register(magnesiumSword);
        event.getRegistry().register(plasmaticPickaxe);
        event.getRegistry().register(plasmaticAxe);
        event.getRegistry().register(plasmaticShovel);
        event.getRegistry().register(plasmaticHoe);
        event.getRegistry().register(plasmaticSword);
        //armor
        event.getRegistry().register(magnesiumHelmet);
        event.getRegistry().register(magnesiumChestPlate);
        event.getRegistry().register(magnesiumLeggings);
        event.getRegistry().register(magnesiumBoots);
        event.getRegistry().register(plasmaHelmet);
        event.getRegistry().register(plasmaChestPlate);
        event.getRegistry().register(plasmaLeggings);
        event.getRegistry().register(plasmaBoots);
    }

    @SubscribeEvent
    public static void registerRender(ModelRegistryEvent event) {
        //misc items
        registerRender(magnesiumIngot);
        registerRender(magnesiumShard);
        registerRender(plasma);
        registerRender(ionicPlasma);
        registerRender(magnesiumRod);
        registerRender(plasmaPlate);
        registerRender(plasmaticIngot);
        //tools
        registerRender(magnesiumPickaxe);
        registerRender(magnesiumAxe);
        registerRender(magnesiumShovel);
        registerRender(magnesiumHoe);
        registerRender(magnesiumSword);
        registerRender(plasmaticPickaxe);
        registerRender(plasmaticAxe);
        registerRender(plasmaticShovel);
        registerRender(plasmaticHoe);
        registerRender(plasmaticSword);
        //armor
        registerRender(magnesiumHelmet);
        registerRender(magnesiumChestPlate);
        registerRender(magnesiumLeggings);
        registerRender(magnesiumBoots);
        registerRender(plasmaHelmet);
        registerRender(plasmaChestPlate);
        registerRender(plasmaLeggings);
        registerRender(plasmaBoots);
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
