package dev.mishauwu27.minecraftplus.data.provider;

import dev.mishauwu27.minecraftplus.init.PlusItems;
import dev.mishauwu27.minecraftplus.lists.PlusTagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class PlusRecipeProvider extends FabricRecipeProvider {
    public PlusRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) { super(output, registriesFuture); }

    // add lumbers again

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                offerLumbersRecipe(PlusItems.ACACIA_LUMBER, ItemTags.ACACIA_LOGS, 4);
                offerLumbersRecipe(PlusItems.BAMBOO_LUMBER, ItemTags.BAMBOO_BLOCKS, 2);
                offerLumbersRecipe(PlusItems.BIRCH_LUMBER, ItemTags.BIRCH_LOGS, 4);
                offerLumbersRecipe(PlusItems.CHERRY_LUMBER, ItemTags.CHERRY_LOGS, 4);
                offerLumbersRecipe(PlusItems.CRIMSON_LUMBER, ItemTags.CRIMSON_STEMS, 4);
                offerLumbersRecipe(PlusItems.DARK_OAK_LUMBER, ItemTags.DARK_OAK_LOGS, 4);
                offerLumbersRecipe(PlusItems.JUNGLE_LUMBER, ItemTags.JUNGLE_LOGS, 4);
                offerLumbersRecipe(PlusItems.MANGROVE_LUMBER, ItemTags.MANGROVE_LOGS, 4);
                offerLumbersRecipe(PlusItems.OAK_LUMBER, ItemTags.OAK_LOGS, 4);
                offerLumbersRecipe(PlusItems.SPRUCE_LUMBER, ItemTags.SPRUCE_LOGS, 4);
                offerLumbersRecipe(PlusItems.WARPED_LUMBER, ItemTags.WARPED_STEMS, 4);
                offerReversibleCompactingRecipes(RecipeCategory.MISC, PlusItems.OBSIDIAN_SHARD, RecipeCategory.BUILDING_BLOCKS, Items.OBSIDIAN);
                createShaped(RecipeCategory.DECORATIONS, Blocks.ENDER_CHEST)
                        .input('#', PlusItems.OBSIDIAN_SHARD)
                        .input('E', Items.ENDER_EYE)
                        .pattern("###")
                        .pattern("#E#")
                        .pattern("###")
                        .criterion("has_ender_eye", conditionsFromItem(Items.ENDER_EYE))
                        .offerTo(exporter);
                offerReversibleCompactingRecipes(RecipeCategory.MISC, PlusItems.CRYING_OBSIDIAN_SHARD, RecipeCategory.BUILDING_BLOCKS, Items.CRYING_OBSIDIAN);
                createShaped(RecipeCategory.DECORATIONS, Blocks.RESPAWN_ANCHOR)
                        .input('O', PlusItems.CRYING_OBSIDIAN_SHARD)
                        .input('G', Items.GLOWSTONE_DUST)
                        .pattern("OGO")
                        .pattern("G G")
                        .pattern("OGO")
                        .criterion("has_obsidian_shard", conditionsFromItem(PlusItems.CRYING_OBSIDIAN_SHARD))
                        .offerTo(exporter);
                // planks from lumbers
                // blocks: stairs, slabs, doors, trapdoors, fences, fence gates, pressure plates, buttons, signs.
                createShaped(RecipeCategory.DECORATIONS, Blocks.BARREL)
                        .input('P', ItemTags.PLANKS)
                        .input('L', PlusTagList.Items.LUMBERS)
                        .pattern("PLP")
                        .pattern("P P")
                        .pattern("PLP")
                        .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.CHISELED_BOOKSHELF)
                        .input('#', ItemTags.PLANKS)
                        .input('X', PlusTagList.Items.LUMBERS)
                        .pattern("###")
                        .pattern("XXX")
                        .pattern("###")
                        .criterion("has_book", conditionsFromItem(Items.BOOK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.DECORATIONS, Blocks.GRINDSTONE)
                        .input('I', Items.STICK)
                        .input('-', Blocks.STONE_SLAB)
                        .input('#', PlusTagList.Items.LUMBERS)
                        .pattern("I-I")
                        .pattern("# #")
                        .criterion("has_stone_slab", conditionsFromItem(Blocks.STONE_SLAB))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, Items.BOWL, 2)
                        .input('#', PlusTagList.Items.LUMBERS)
                        .pattern("# #")
                        .pattern(" # ")
                        .criterion("has_brown_mushroom", conditionsFromItem(Blocks.BROWN_MUSHROOM))
                        .criterion("has_red_mushroom", conditionsFromItem(Blocks.RED_MUSHROOM))
                        .criterion("has_beetroot", conditionsFromItem(Items.BEETROOT))
                        .criterion("has_soup", conditionsFromTag(ConventionalItemTags.SOUP_FOODS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, Items.STICK, 4)
                        .input('#', PlusTagList.Items.LUMBERS)
                        .pattern("#")
                        .pattern("#")
                        .group("sticks")
                        .criterion("has_lumbers", conditionsFromTag(PlusTagList.Items.LUMBERS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, Blocks.TRIPWIRE_HOOK, 2)
                        .input('#', PlusTagList.Items.LUMBERS)
                        .input('S', Items.STICK)
                        .input('I', Items.IRON_INGOT)
                        .pattern("I")
                        .pattern("S")
                        .pattern("#")
                        .criterion("has_string", conditionsFromItem(Items.STRING))
                        .offerTo(exporter);
                // cobbles to cobbled stones
                // blocks: stairs, slabs, walls, pressure plates, buttons.
                createShaped(RecipeCategory.REDSTONE, Blocks.DISPENSER)
                        .input('R', Items.REDSTONE)
                        .input('#', ItemTags.STONE_CRAFTING_MATERIALS)
                        .input('X', Items.BOW)
                        .pattern("###")
                        .pattern("#X#")
                        .pattern("#R#")
                        .criterion("has_bow", conditionsFromItem(Items.BOW))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, Blocks.DROPPER)
                        .input('R', Items.REDSTONE)
                        .input('#', ItemTags.STONE_CRAFTING_MATERIALS)
                        .pattern("###")
                        .pattern("# #")
                        .pattern("#R#")
                        .criterion("has_redstone", conditionsFromItem(Items.REDSTONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, Blocks.OBSERVER)
                        .input('Q', Items.QUARTZ)
                        .input('R', Items.REDSTONE)
                        .input('#', ItemTags.STONE_CRAFTING_MATERIALS)
                        .pattern("###")
                        .pattern("RRQ")
                        .pattern("###")
                        .criterion("has_quartz", this.conditionsFromItem(Items.QUARTZ))
                        .offerTo(this.exporter);
                createShaped(RecipeCategory.REDSTONE, Blocks.PISTON)
                        .input('R', Items.REDSTONE)
                        .input('#', ItemTags.STONE_CRAFTING_MATERIALS)
                        .input('T', ItemTags.PLANKS)
                        .input('X', Items.IRON_INGOT)
                        .pattern("TTT")
                        .pattern("#X#")
                        .pattern("#R#")
                        .criterion("has_redstone", conditionsFromItem(Items.REDSTONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, Blocks.DIORITE, 2)
                        .input('Q', Items.QUARTZ)
                        .input('C', PlusItems.COBBLE)
                        .pattern("CQ")
                        .pattern("QC")
                        .criterion("has_quartz", conditionsFromItem(Items.QUARTZ))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BREWING, Blocks.BREWING_STAND)
                        .input('B', Items.BLAZE_ROD)
                        .input('#', PlusTagList.Items.COBBLES)
                        .pattern(" B ")
                        .pattern("###")
                        .criterion("has_blaze_rod", conditionsFromItem(Items.BLAZE_ROD))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, Blocks.LEVER)
                        .input('#', PlusTagList.Items.COBBLES)
                        .input('X', Items.STICK)
                        .pattern("X")
                        .pattern("#")
                        .criterion("has_cobble", conditionsFromTag(PlusTagList.Items.COBBLES))
                        .offerTo(exporter);
            }

            public void offerLumbersRecipe(ItemConvertible output, TagKey<Item> logTag, int count) {
                createShapeless(RecipeCategory.MISC, output, count)
                        .input(logTag)
                        .group("lumbers")
                        .criterion("has_logs", conditionsFromTag(logTag))
                        .offerTo(exporter);
            }
            @Override
            public void offerBedRecipe(ItemConvertible output, ItemConvertible inputWool) {
                createShaped(RecipeCategory.DECORATIONS, output)
                        .input('#', inputWool)
                        .input('X', PlusTagList.Items.LUMBERS)
                        .pattern("###")
                        .pattern("XXX")
                        .group("bed")
                        .criterion(hasItem(inputWool), conditionsFromItem(inputWool))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() { return "Recipe Definitions"; }
}
