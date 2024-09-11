package dev.mishauwu27.minecraftplus.data.provider;

import dev.mishauwu27.minecraftplus.init.PlusBlocks;
import dev.mishauwu27.minecraftplus.init.PlusItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class PlusRecipeProvider extends FabricRecipeProvider {
    public PlusRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static void offerLumbersRecipe(RecipeExporter exporter, ItemConvertible output, TagKey<Item> input, int count) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, count).input(input).group("lumbers").criterion("has_logs", conditionsFromTag(input)).offerTo(exporter);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerLumbersRecipe(exporter, PlusItems.ACACIA_LUMBER, ItemTags.ACACIA_LOGS, 4);
        offerLumbersRecipe(exporter, PlusItems.BIRCH_LUMBER, ItemTags.BIRCH_LOGS, 4);
        offerLumbersRecipe(exporter, PlusItems.CHERRY_LUMBER, ItemTags.CHERRY_LOGS, 4);
        offerLumbersRecipe(exporter, PlusItems.CRIMSON_LUMBER, ItemTags.CRIMSON_STEMS, 4);
        offerLumbersRecipe(exporter, PlusItems.DARK_OAK_LUMBER, ItemTags.DARK_OAK_LOGS, 4);
        offerLumbersRecipe(exporter, PlusItems.JUNGLE_LUMBER, ItemTags.JUNGLE_LOGS, 4);
        offerLumbersRecipe(exporter, PlusItems.MANGROVE_LUMBER, ItemTags.MANGROVE_LOGS, 4);
        offerLumbersRecipe(exporter, PlusItems.OAK_LUMBER, ItemTags.OAK_LOGS, 4);
        offerLumbersRecipe(exporter, PlusItems.SPRUCE_LUMBER, ItemTags.SPRUCE_LOGS, 4);
        offerLumbersRecipe(exporter, PlusItems.WARPED_LUMBER, ItemTags.WARPED_STEMS, 4);
        RecipeProvider.offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC,
                PlusItems.OBSIDIAN_SHARD,
                RecipeCategory.BUILDING_BLOCKS,
                Items.OBSIDIAN);
        RecipeProvider.offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC,
                PlusItems.CRYING_OBSIDIAN_SHARD,
                RecipeCategory.BUILDING_BLOCKS,
                Items.CRYING_OBSIDIAN);
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, PlusItems.GOLDEN_POTATO)
                .input('#', Items.RAW_GOLD)
                .input('X', Items.POTATO)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .criterion("has_raw_gold", conditionsFromItem(Items.RAW_GOLD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, PlusItems.GOLDEN_POISONOUS_POTATO)
                .input('#', Items.GOLD_BLOCK)
                .input('X', Items.POISONOUS_POTATO)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .criterion("has_gold_block", conditionsFromItem(Blocks.GOLD_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.NETHER_WART, 9)
                .input(Items.NETHER_WART_BLOCK)
                .criterion("has_nether_wart_block", conditionsFromItem(Blocks.NETHER_WART_BLOCK))
                .offerTo(exporter);
        RecipeProvider.offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC,
                PlusItems.WARPED_WART,
                RecipeCategory.BUILDING_BLOCKS,
                Items.WARPED_WART_BLOCK);
        offerSmelting(exporter,
                List.of(PlusBlocks.NETHER_IRON_ORE),
                RecipeCategory.MISC,
                Items.IRON_INGOT,
                0.7F,
                200,
                "iron_ingot");
        offerBlasting(exporter,
                List.of(PlusBlocks.NETHER_IRON_ORE),
                RecipeCategory.MISC,
                Items.IRON_INGOT,
                0.7F,
                200,
                "iron_ingot");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(PlusItems.GOLDEN_POTATO), RecipeCategory.FOOD, PlusItems.GOLDEN_BAKED_POTATO, 0.35F, 200)
                .criterion("has_golden_potato", conditionsFromItem(PlusItems.GOLDEN_POTATO))
                .offerTo(exporter);
    }
}
