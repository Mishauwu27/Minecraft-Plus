package dev.mishauwu27.minecraftplus.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.shape.VoxelShape;

public class FarmlandSlabBlock extends SlabBlock {
    public static final MapCodec<FarmlandSlabBlock> CODEC = createCodec(FarmlandSlabBlock::new);
    public static final IntProperty MOISTURE = Properties.MOISTURE;
    protected static final VoxelShape BOTTOM_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 7.5, 16.0);
    protected static final VoxelShape TOP_SHAPE = Block.createCuboidShape(0.0, 7.5, 0.0, 16.0, 15.0, 16.0);
    protected static final VoxelShape DOUBLE_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
    public static final int MAX_MOISTURE = 7;

    public FarmlandSlabBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(MOISTURE, 0));
    }

    @Override
    public MapCodec<FarmlandSlabBlock> getCodec() {
        return CODEC;
    }
}