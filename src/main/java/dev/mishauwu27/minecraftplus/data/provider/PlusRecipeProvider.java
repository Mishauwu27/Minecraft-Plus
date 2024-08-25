package dev.mishauwu27.minecraftplus.data.provider;

import dev.mishauwu27.minecraftplus.init.PlusBlocks;
import dev.mishauwu27.minecraftplus.init.PlusItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.CookingRecipeCategory;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class PlusRecipeProvider extends FabricRecipeProvider {
    public PlusRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        RecipeProvider.offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC,
                PlusItems.CRYING_OBSIDIAN_SHARD,
                RecipeCategory.BUILDING_BLOCKS,
                Items.CRYING_OBSIDIAN);
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, PlusItems.GOLDEN_POISONOUS_POTATO)
                .input('#', Items.GOLD_BLOCK)
                .input('X', Items.POISONOUS_POTATO)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .criterion("has_gold_block", conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, PlusItems.GOLDEN_POTATO)
                .input('#', Items.RAW_GOLD)
                .input('X', Items.POTATO)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .criterion("has_raw_gold", conditionsFromItem(Items.RAW_GOLD))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.NETHER_WART, 9)
                .input(Items.NETHER_WART_BLOCK)
                .criterion("has_block", conditionsFromItem(Blocks.NETHER_WART_BLOCK))
                .offerTo(exporter);
        RecipeProvider.offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC,
                PlusItems.OBSIDIAN_SHARD,
                RecipeCategory.BUILDING_BLOCKS,
                Items.OBSIDIAN);
        RecipeProvider.offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC,
                PlusItems.WARPED_WART,
                RecipeCategory.BUILDING_BLOCKS,
                Items.WARPED_WART_BLOCK);
    }
}
