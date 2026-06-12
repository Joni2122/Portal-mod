package com.portalmod;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PortalFrameDetector {

    public static boolean isValidFrame(World world, BlockPos center) {

        // VERY SIMPLE prototype logic:
        // Checks only a small 4x5 rectangle around the center

        Block baseBlock = world.getBlockState(center.down()).getBlock();

        if (baseBlock == Blocks.AIR) return false;

        // check frame consistency (simplified)
        for (int x = -2; x <= 2; x++) {
            for (int y = -3; y <= 1; y++) {
                BlockPos checkPos = center.add(x, y, 0);
                Block block = world.getBlockState(checkPos).getBlock();

                if (block != Blocks.AIR && block != baseBlock) {
                    return false;
                }
            }
        }

        return true;
    }

    public static Block getFrameBlock(World world, BlockPos center) {
        return world.getBlockState(center.down()).getBlock();
    }
}
