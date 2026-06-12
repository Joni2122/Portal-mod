package com.portalmod;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PortalRenderer {

    public static void renderPortal(World world, BlockPos pos, MatrixStack matrices, VertexConsumerProvider vertexConsumers) {

        // Placeholder visual effect logic
        // Real portal shaders would go here

        if (world.isClient) {
            WorldRenderer.drawBox(
                    matrices,
                    vertexConsumers.getBuffer(null),
                    pos.getX(), pos.getY(), pos.getZ(),
                    pos.getX() + 1, pos.getY() + 2, pos.getZ() + 1,
                    0.2f, 0.0f, 0.8f, 0.5f
            );
        }
    }
}
