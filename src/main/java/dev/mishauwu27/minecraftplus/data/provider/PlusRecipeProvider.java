package dev.mishauwu27.minecraftplus.data.provider;

import dev.mishauwu27.minecraftplus.init.PlusItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class PlusRecipeProvider extends FabricRecipeProvider {
    public PlusRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) { super(output, registriesFuture); }

    // add lumbers again

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.DECORATIONS, Blocks.ENDER_CHEST)
                        .input('#', PlusItems.OBSIDIAN_SHARD)
                        .input('X', Items.ENDER_EYE)
                        .pattern("###")
                        .pattern("#X#")
                        .pattern("###")
                        .criterion("has_ender_eye", conditionsFromItem(Items.ENDER_EYE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.DECORATIONS, Blocks.RESPAWN_ANCHOR)
                        .input('#', PlusItems.CRYING_OBSIDIAN_SHARD)
                        .input('X', Items.GLOWSTONE_DUST)
                        .pattern("#X#")
                        .pattern("X X")
                        .pattern("#X#")
                        .criterion("has_obsidian_shard", conditionsFromItem(PlusItems.CRYING_OBSIDIAN_SHARD))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() { return "Recipe Definitions"; }
}
