package dev.mishauwu27.minecraftplus.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.block.MossBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.gen.feature.UndergroundConfiguredFeatures;

public class MossSlabBlock extends SlabBlock implements Fertilizable {
    public static final MapCodec<MossSlabBlock> CODEC = createCodec(MossSlabBlock::new);

    public MossSlabBlock(Settings settings) { super(settings); }

    @Override
    public MapCodec<MossSlabBlock> getCodec() {
        return CODEC;
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) { return world.getBlockState(pos.up()).isAir(); }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) { return true; }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        world.getRegistryManager()
                .getOptional(RegistryKeys.CONFIGURED_FEATURE)
                .flatMap(key -> key.getEntry(UndergroundConfiguredFeatures.MOSS_PATCH_BONEMEAL))
                .ifPresent(entry -> entry.value().generate(world, world.getChunkManager().getChunkGenerator(), random, pos.up()));
    }

    @Override
    public Fertilizable.FertilizableType getFertilizableType() { return Fertilizable.FertilizableType.NEIGHBOR_SPREADER; }
}
