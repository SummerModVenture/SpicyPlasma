package com.spicymods.plasma.renders;

import com.spicymods.plasma.entity.EntityPlasmaGolem;
import com.spicymods.plasma.renders.entity.RenderPlasmaGolem;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderRegistry {

    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityPlasmaGolem.class, new IRenderFactory<EntityPlasmaGolem>() {

            @Override
            public Render<? super EntityPlasmaGolem> createRenderFor(RenderManager manager) {
                return new RenderPlasmaGolem(manager);
            }
        });
    }
}
