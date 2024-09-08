package dev.mishauwu27.minecraftplus.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class MyceliumSlabBlock extends SpreadableSlabBlock {
    public static final MapCodec<MyceliumSlabBlock> CODEC = createCodec(MyceliumSlabBlock::new);

    public MyceliumSlabBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends MyceliumSlabBlock> getCodec() {
        return CODEC;
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);
        if (random.nextInt(10) == 0) {
            world.addParticle(
                    ParticleTypes.MYCELIUM, (double) pos.getX() + random.nextDouble(), (double) pos.getY() + 1.1, (double) pos.getZ() + random.nextDouble(), 0.0, 0.0, 0.0
            );
        }
    }
}
