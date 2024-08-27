package dev.mishauwu27.minecraftplus.data.provider;

import dev.mishauwu27.minecraftplus.init.PlusBlocks;
import dev.mishauwu27.minecraftplus.init.PlusItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;

public class PlusModelProvider extends FabricModelProvider {
    public PlusModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerAxisRotated(PlusBlocks.NETHER_IRON_ORE, TexturedModel.CUBE_COLUMN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(PlusItems.OBSIDIAN_SHARD, Models.GENERATED);
        itemModelGenerator.register(PlusItems.CRYING_OBSIDIAN_SHARD, Models.GENERATED);
        itemModelGenerator.register(PlusItems.ENCHANTED_GOLDEN_CARROT, Models.GENERATED);
        itemModelGenerator.register(PlusItems.GOLDEN_POTATO, Models.GENERATED);
        itemModelGenerator.register(PlusItems.GOLDEN_BAKED_POTATO, Models.GENERATED);
        itemModelGenerator.register(PlusItems.ENCHANTED_GOLDEN_BAKED_POTATO, Models.GENERATED);
        itemModelGenerator.register(PlusItems.GOLDEN_POISONOUS_POTATO, Models.GENERATED);
        itemModelGenerator.register(PlusItems.ACACIA_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.BIRCH_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.CHERRY_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.CRIMSON_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.DARK_OAK_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.JUNGLE_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.MANGROVE_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.OAK_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.SPRUCE_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.WARPED_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.WARPED_WART, Models.GENERATED);
    }
}
