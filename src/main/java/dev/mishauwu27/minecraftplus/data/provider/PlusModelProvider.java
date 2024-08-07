package dev.mishauwu27.minecraftplus.data.provider;

import dev.mishauwu27.minecraftplus.init.PlusBlocks;
import dev.mishauwu27.minecraftplus.init.PlusItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class PlusModelProvider extends FabricModelProvider {
    public PlusModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(PlusBlocks.NETHER_IRON_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(PlusItems.ENCHANTED_GOLDEN_BAKED_POTATO, Models.GENERATED);
        itemModelGenerator.register(PlusItems.ENCHANTED_GOLDEN_CARROT, Models.GENERATED);
        itemModelGenerator.register(PlusItems.GOLDEN_BAKED_POTATO, Models.GENERATED);
        itemModelGenerator.register(PlusItems.GOLDEN_POISONOUS_POTATO, Models.GENERATED);
        itemModelGenerator.register(PlusItems.GOLDEN_POTATO, Models.GENERATED);
        itemModelGenerator.register(PlusItems.OBSIDIAN_SHARD, Models.GENERATED);
    }
}
