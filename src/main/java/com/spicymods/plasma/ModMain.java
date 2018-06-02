package com.spicymods.plasma;

import com.spicymods.plasma.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModMain.MODID, name = ModMain.NAME, version = ModMain.VERSION)
public class ModMain
{
    public static final String MODID = "spicyplasma";
    public static final String NAME = "Spicy Plasma";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
    }
}
