package com.spicymods.plasma.init;

import com.spicymods.plasma.ModMain;
import com.spicymods.plasma.entity.EntityPlasmaGolem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import static com.spicymods.plasma.ModMain.MODID;

public class ModEntity {

    public static void registerEntities() {
        EntityRegistry.registerModEntity(new ResourceLocation( MODID + ":plasma_golem"), EntityPlasmaGolem.class, "Plasma Golem", 0, ModMain.instance, 64, 1, true);
    }
}
