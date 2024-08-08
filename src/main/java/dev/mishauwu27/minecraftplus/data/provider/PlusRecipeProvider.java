package dev.mishauwu27.minecraftplus.data.provider;

import dev.mishauwu27.minecraftplus.init.PlusBlocks;
import dev.mishauwu27.minecraftplus.init.PlusItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class PlusRecipeProvider extends FabricRecipeProvider {
    public PlusRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.CRYING_OBSIDIAN)
                .input('S', PlusItems.CRYING_OBSIDIAN_SHARD)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .criterion(hasItem(Blocks.CRYING_OBSIDIAN), conditionsFromItem(Blocks.CRYING_OBSIDIAN))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, PlusItems.CRYING_OBSIDIAN_SHARD, 9)
                .input(Blocks.CRYING_OBSIDIAN)
                .criterion(hasItem(PlusItems.CRYING_OBSIDIAN_SHARD), conditionsFromItem(PlusItems.CRYING_OBSIDIAN_SHARD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Blocks.OBSIDIAN)
                .input('S', PlusItems.OBSIDIAN_SHARD)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .criterion(hasItem(Blocks.OBSIDIAN), conditionsFromItem(Blocks.OBSIDIAN))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, PlusItems.OBSIDIAN_SHARD, 9)
                .input(Blocks.OBSIDIAN)
                .criterion(hasItem(PlusItems.OBSIDIAN_SHARD), conditionsFromItem(PlusItems.OBSIDIAN_SHARD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, PlusItems.GOLDEN_POTATO)
                .input('P', Items.POTATO)
                .input('G', Items.RAW_GOLD)
                .pattern("GGG")
                .pattern("GPG")
                .pattern("GGG")
                .criterion(hasItem(Items.POTATO), conditionsFromItem(Items.POTATO))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, PlusItems.GOLDEN_POISONOUS_POTATO)
                .input('P', Items.POISONOUS_POTATO)
                .input('G', Items.GOLD_BLOCK)
                .pattern("GGG")
                .pattern("GPG")
                .pattern("GGG")
                .criterion(hasItem(Items.POISONOUS_POTATO), conditionsFromItem(Items.POISONOUS_POTATO))
                .offerTo(exporter);
    }
}
