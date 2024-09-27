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
        offerLumbersRecipe(exporter, PlusItems.BAMBOO_LUMBER, ItemTags.BAMBOO_BLOCKS, 2);
        offerLumbersRecipe(exporter, PlusItems.BIRCH_LUMBER, ItemTags.BIRCH_LOGS, 4);
        offerLumbersRecipe(exporter, PlusItems.CHERRY_LUMBER, ItemTags.CHERRY_LOGS, 4);
        offerLumbersRecipe(exporter, PlusItems.CRIMSON_LUMBER, ItemTags.CRIMSON_STEMS, 4);
        offerLumbersRecipe(exporter, PlusItems.DARK_OAK_LUMBER, ItemTags.DARK_OAK_LOGS, 4);
        offerLumbersRecipe(exporter, PlusItems.JUNGLE_LUMBER, ItemTags.JUNGLE_LOGS, 4);
        offerLumbersRecipe(exporter, PlusItems.MANGROVE_LUMBER, ItemTags.MANGROVE_LOGS, 4);
        offerLumbersRecipe(exporter, PlusItems.OAK_LUMBER, ItemTags.OAK_LOGS, 4);
        offerLumbersRecipe(exporter, PlusItems.SPRUCE_LUMBER, ItemTags.SPRUCE_LOGS, 4);
        offerLumbersRecipe(exporter, PlusItems.WARPED_LUMBER, ItemTags.WARPED_STEMS, 4);
        RecipeProvider.offer2x2CompactingRecipe(exporter,
                RecipeCategory.BUILDING_BLOCKS,
                Items.OBSIDIAN,
                PlusItems.OBSIDIAN_SHARD);
        RecipeProvider.offer2x2CompactingRecipe(exporter,
                RecipeCategory.BUILDING_BLOCKS,
                Items.CRYING_OBSIDIAN,
                PlusItems.CRYING_OBSIDIAN_SHARD);
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
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.GRASS_SLAB, Items.GRASS_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.PODZOL_SLAB, Items.PODZOL);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.MYCELIUM_SLAB, Items.MYCELIUM);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.DIRT_SLAB, Items.DIRT);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.COARSE_DIRT_SLAB, Items.COARSE_DIRT);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.MUD_SLAB, Items.MUD);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.CLAY_SLAB, Items.CLAY);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.GRAVEL_SLAB, Items.GRAVEL);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.SAND_SLAB, Items.SAND);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.RED_SAND_SLAB, Items.RED_SAND);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.ICE_SLAB, Items.ICE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.PACKED_ICE_SLAB, Items.PACKED_ICE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.BLUE_ICE_SLAB, Items.BLUE_ICE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.SNOW_SLAB, Items.SNOW_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.MOSS_SLAB, Items.MOSS_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.DEEPSLATE_SLAB, Items.DEEPSLATE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.CALCITE_SLAB, Items.CALCITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.DRIPSTONE_SLAB, Items.DRIPSTONE_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.MAGMA_SLAB, Items.MAGMA_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.NETHERRACK_SLAB, Items.NETHERRACK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.CRIMSON_NYLIUM_SLAB, Items.CRIMSON_NYLIUM);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.WARPED_NYLIUM_SLAB, Items.WARPED_NYLIUM);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.SOUL_SAND_SLAB, Items.SOUL_SAND);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.SOUL_SOIL_SLAB, Items.SOUL_SOIL);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.BASALT_SLAB, Items.BASALT);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.SMOOTH_BASALT_SLAB, Items.SMOOTH_BASALT);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.END_STONE_SLAB, Items.END_STONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.SCULK_SLAB, Items.SCULK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, PlusBlocks.BEDROCK_SLAB, Items.BEDROCK);
    }
}
