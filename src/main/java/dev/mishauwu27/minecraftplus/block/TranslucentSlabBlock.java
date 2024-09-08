package dev.mishauwu27.minecraftplus.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.util.math.Direction;

public class TranslucentSlabBlock extends SlabBlock {
    public static final MapCodec<TranslucentSlabBlock> CODEC = createCodec(TranslucentSlabBlock::new);

    public TranslucentSlabBlock(Settings settings) { super(settings); }

    @Override
    public MapCodec<? extends TranslucentSlabBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) { return stateFrom.isOf(this) || super.isSideInvisible(state, stateFrom, direction); }
}
