package com.spicymods.plasma;

import com.spicymods.plasma.init.ModBlocks;
import com.spicymods.plasma.gen.OreGen;
import com.spicymods.plasma.init.ModEntity;
import com.spicymods.plasma.init.ModItems;
import com.spicymods.plasma.init.ModRecipes;
import com.spicymods.plasma.renders.RenderRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModMain.MODID, name = ModMain.NAME, version = ModMain.VERSION)
public class ModMain {
    public static final String MODID = "spicyplasma";
    public static final String NAME = "Spicy Plasma";
    public static final String VERSION = "1.0";

    @Mod.Instance(MODID)
    public static ModMain instance;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("Creating some plasma");

        ModItems.init();
        ModBlocks.init();
        RenderRegistry.registerEntityRenders();

        logger.info("Generating Magnesium");
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Registering recipes and entities.");
        ModRecipes.init();
        ModEntity.registerEntities();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
