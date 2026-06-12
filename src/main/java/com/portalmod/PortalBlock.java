package com.portalmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class PortalBlock extends Block {

    public PortalBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        super.onBlockAdded(state, world, pos, oldState, notify);

        // Simple placeholder logic:
        // Detects placement and prepares portal behavior

        if (!world.isClient) {
            System.out.println("Portal block placed at " + pos);
        }
    }

    public void teleportPlayer(ServerWorld world, BlockPos pos) {
        Random random = new Random();

        // Placeholder teleport logic
        int x = pos.getX() + random.nextInt(10) - 5;
        int y = pos.getY();
        int z = pos.getZ() + random.nextInt(10) - 5;

        System.out.println("Teleport target: " + x + "," + y + "," + z);
    }
}
