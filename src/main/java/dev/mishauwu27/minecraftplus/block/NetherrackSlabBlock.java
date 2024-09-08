package dev.mishauwu27.minecraftplus.block;

import com.mojang.serialization.MapCodec;
import dev.mishauwu27.minecraftplus.init.PlusBlocks;
import net.minecraft.block.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class NetherrackSlabBlock extends SlabBlock implements Fertilizable{
    public static final MapCodec<NetherrackSlabBlock> CODEC = createCodec(NetherrackSlabBlock::new);

    public NetherrackSlabBlock(Settings settings) { super(settings); }

    @Override
    public MapCodec<NetherrackSlabBlock> getCodec() {
        return CODEC;
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        if (world.getBlockState(pos.up()).isTransparent(world, pos)) {
            for (BlockPos blockPos : BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
                if (world.getBlockState(blockPos).isIn(BlockTags.NYLIUM)) {
                    return true;
                }
            }

        }
        return false;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        boolean bl = false;
        boolean bl2 = false;

        for (BlockPos blockPos : BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.isOf(Blocks.WARPED_NYLIUM)) {
                bl2 = true;
            }

            if (blockState.isOf(Blocks.CRIMSON_NYLIUM)) {
                bl = true;
            }

            if (bl2 && bl) {
                break;
            }
        }

        BlockState newSlabState;
        if (bl2 && bl) {
            newSlabState = random.nextBoolean() ? PlusBlocks.WARPED_NYLIUM_SLAB.getDefaultState() : PlusBlocks.CRIMSON_NYLIUM_SLAB.getDefaultState();
        } else if (bl2) {
            newSlabState = PlusBlocks.WARPED_NYLIUM_SLAB.getDefaultState();
        } else if (bl) {
            newSlabState = PlusBlocks.CRIMSON_NYLIUM_SLAB.getDefaultState();
        } else {
            return;
        }

        newSlabState = newSlabState.with(SlabBlock.TYPE, state.get(SlabBlock.TYPE));

        newSlabState = newSlabState.with(SlabBlock.WATERLOGGED, state.get(SlabBlock.WATERLOGGED));

        world.setBlockState(pos, newSlabState, Block.NOTIFY_ALL);
    }

    @Override
    public Fertilizable.FertilizableType getFertilizableType() { return Fertilizable.FertilizableType.NEIGHBOR_SPREADER; }
}
