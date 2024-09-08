package dev.mishauwu27.minecraftplus.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

public class SnowySlabBlock extends SlabBlock {
    public static final MapCodec<SnowySlabBlock> CODEC = createCodec(SnowySlabBlock::new);
    public static final BooleanProperty SNOWY = Properties.SNOWY;

    public SnowySlabBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(SNOWY, Boolean.FALSE));
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (direction == Direction.UP) {
            return state.with(SNOWY, isSnow(neighborState));
        }
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        BlockState blockState = ctx.getWorld().getBlockState(blockPos);
        BlockState blockAbove = ctx.getWorld().getBlockState(blockPos.up());
        boolean isSnowy = isSnow(blockAbove);

        if (blockState.isOf(this)) {
            return blockState.with(TYPE, SlabType.DOUBLE).with(WATERLOGGED, false).with(SNOWY, isSnowy);
        } else {
            FluidState fluidState = ctx.getWorld().getFluidState(blockPos);
            BlockState newState = this.getDefaultState()
                    .with(TYPE, SlabType.BOTTOM)
                    .with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER)
                    .with(SNOWY, isSnowy);
            Direction direction = ctx.getSide();
            return direction != Direction.DOWN && (direction == Direction.UP || !(ctx.getHitPos().y - (double)blockPos.getY() > 0.5))
                    ? newState
                    : newState.with(TYPE, SlabType.TOP);
        }
    }

    private static boolean isSnow(BlockState state) {
        return state.isIn(BlockTags.SNOW);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(SNOWY);
    }
}
