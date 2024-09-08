package dev.mishauwu27.minecraftplus.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;

public abstract class SpreadableSlabBlock extends SnowySlabBlock{
    protected SpreadableSlabBlock(AbstractBlock.Settings settings) { super(settings); }

    @Override
    public abstract MapCodec<? extends SpreadableSlabBlock> getCodec();

    private static boolean canSurvive(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.up();
        BlockState blockState = world.getBlockState(blockPos);
        if (blockState.isOf(Blocks.SNOW) && blockState.get(SnowBlock.LAYERS) == 1) {
            return true;
        } else if (blockState.getFluidState().getLevel() == 8) {
            return false;
        } else {
            int i = ChunkLightProvider.getRealisticOpacity(world, state, pos, blockState, blockPos, Direction.UP, blockState.getOpacity(world, blockPos));
            return i < world.getMaxLightLevel();
        }
    }

    private static boolean canSpread(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.up();
        return canSurvive(state, world, pos) && !world.getFluidState(blockPos).isIn(FluidTags.WATER);
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canSurvive(state, world, pos)) {
            world.setBlockState(pos, Blocks.DIRT.getDefaultState());
        } else {
            if (world.getLightLevel(pos.up()) >= 9) {
                BlockState blockState = this.getDefaultState();

                for (int i = 0; i < 4; i++) {
                    BlockPos blockPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                    BlockState targetState = world.getBlockState(blockPos);

                    if (targetState.isOf(Blocks.DIRT) && canSpread(blockState, world, blockPos)) {
                        world.setBlockState(blockPos, blockState.with(TYPE, SlabType.BOTTOM).with(SNOWY, world.getBlockState(blockPos.up()).isOf(Blocks.SNOW)));
                    }
                }
            }
        }
    }
}