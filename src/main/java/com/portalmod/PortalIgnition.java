package com.portalmod;

import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PortalIgnition {

    public static void tryIgnite(World world, BlockPos pos) {

        if (world.isClient) return;

        // Simple placeholder logic:
        // Check if a portal frame is nearby (NOT full detection yet)

        boolean hasFrame = true; // TODO: real frame detection later

        if (hasFrame) {
            System.out.println("Portal ignited at " + pos);

            // Placeholder: spawn portal effect (no real dimension yet)
            ((ServerWorld) world).spawnParticles(
                    net.minecraft.particle.ParticleTypes.PORTAL,
                    pos.getX(), pos.getY(), pos.getZ(),
                    50, 1, 1, 1, 0.1
            );
        }
    }
}
