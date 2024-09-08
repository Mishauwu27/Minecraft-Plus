package dev.mishauwu27.minecraftplus.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Fertilizable;
import net.minecraft.block.SlabBlock;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

import java.util.List;
import java.util.Optional;

public class GrassSlabBlock extends SpreadableSlabBlock implements Fertilizable {
    public static final MapCodec<GrassSlabBlock> CODEC = createCodec(GrassSlabBlock::new);

    public GrassSlabBlock(Settings settings) { super(settings); }

    @Override
    public MapCodec<? extends GrassSlabBlock> getCodec() {
        return CODEC;
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return world.getBlockState(pos.up()).isAir();
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockPos blockPos = pos.up();
        BlockState blockState = Blocks.SHORT_GRASS.getDefaultState();
        Optional<RegistryEntry.Reference<PlacedFeature>> optional = world.getRegistryManager()
                .get(RegistryKeys.PLACED_FEATURE)
                .getEntry(VegetationPlacedFeatures.GRASS_BONEMEAL);

        label49:
        for (int i = 0; i < 128; i++) {
            BlockPos blockPos2 = blockPos;

            for (int j = 0; j < i / 16; j++) {
                blockPos2 = blockPos2.add(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
                if (!world.getBlockState(blockPos2.down()).isOf(this) || world.getBlockState(blockPos2).isFullCube(world, blockPos2)) {
                    continue label49;
                }
            }

            BlockState blockState2 = world.getBlockState(blockPos2);
            if (blockState2.isOf(blockState.getBlock()) && random.nextInt(10) == 0) {
                ((Fertilizable) blockState.getBlock()).grow(world, random, blockPos2, blockState2);
            }

            if (blockState2.isAir()) {
                RegistryEntry<PlacedFeature> registryEntry;
                if (random.nextInt(8) == 0) {
                    List<ConfiguredFeature<?, ?>> list = world.getBiome(blockPos2).value().getGenerationSettings().getFlowerFeatures();
                    if (list.isEmpty()) {
                        continue;
                    }

                    registryEntry = ((RandomPatchFeatureConfig) list.getFirst().config()).feature();
                } else {
                    if (optional.isEmpty()) {
                        continue;
                    }

                    registryEntry = optional.get();
                }

                registryEntry.value().generateUnregistered(world, world.getChunkManager().getChunkGenerator(), random, blockPos2);
            }
        }
    }

    @Override
    public Fertilizable.FertilizableType getFertilizableType() {
        return Fertilizable.FertilizableType.NEIGHBOR_SPREADER;
    }
}
