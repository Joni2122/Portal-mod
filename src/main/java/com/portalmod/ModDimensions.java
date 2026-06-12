package com.portalmod;

import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {

    public static final RegistryKey<World> CUSTOM_DIMENSION_KEY =
            RegistryKey.of(RegistryKeys.WORLD, new Identifier("portalmod", "custom_dimension"));

    public static void register() {
        System.out.println("Registering custom dimension...");
    }
}
