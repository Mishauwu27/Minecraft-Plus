package dev.mishauwu27.minecraftplus.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class MudSlabBlock extends SlabBlock {
    public static final MapCodec<MudSlabBlock> CODEC = createCodec(MudSlabBlock::new);
    protected static final VoxelShape BOTTOM_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
    protected static final VoxelShape TOP_SHAPE = Block.createCuboidShape(0.0, 7.0, 0.0, 16.0, 14.0, 16.0);
    protected static final VoxelShape DOUBLE_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

    public MudSlabBlock(Settings settings) { super(settings); }

    @Override
    public MapCodec<? extends MudSlabBlock> getCodec() { return CODEC; }

    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        SlabType slabType = state.get(TYPE);
        return switch (slabType) {
            case DOUBLE -> DOUBLE_SHAPE;
            case TOP -> TOP_SHAPE;
            default -> BOTTOM_SHAPE;
        };
    }

    @Override
    protected VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) { return VoxelShapes.fullCube(); }

    @Override
    protected VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) { return VoxelShapes.fullCube(); }

    @Override
    protected boolean canPathfindThrough(BlockState state, NavigationType type) { return false; }

    @Override
    protected float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) { return 0.2F; }
}