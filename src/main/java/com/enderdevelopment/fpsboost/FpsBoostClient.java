package com.enderdevelopment.fpsboost;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.OptionInstance;
import net.minecraft.client.Options;
import net.minecraft.client.ParticleStatus;

public final class FpsBoostClient implements ClientModInitializer {
    private static final int TARGET_RENDER_DISTANCE = 8;
    private static final int TARGET_SIMULATION_DISTANCE = 5;
    private static final int TARGET_FPS = 400;

    @Override
    public void onInitializeClient() {
        ClientLifecycleEvents.CLIENT_STARTED.register(this::applyPerformanceSettings);
    }

    private void applyPerformanceSettings(Minecraft client) {
        Options options = client.options;
        setInt(options.renderDistance(), TARGET_RENDER_DISTANCE);
        setInt(options.simulationDistance(), TARGET_SIMULATION_DISTANCE);
        setInt(options.framerateLimit(), TARGET_FPS);
        options.graphicsMode().set(Options.GraphicsMode.FAST);
        options.cloudStatus().set(Options.CloudStatus.OFF);
        options.entityShadows().set(false);
        options.bobView().set(false);
        options.biomeBlendRadius().set(0);
        options.particles().set(ParticleStatus.MINIMAL);
        options.enableVsync().set(false);
        options.save();
    }

    private static void setInt(OptionInstance<Integer> option, int value) {
        option.set(value);
    }
}
