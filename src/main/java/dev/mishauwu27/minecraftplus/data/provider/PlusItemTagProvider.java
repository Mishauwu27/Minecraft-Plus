package dev.mishauwu27.minecraftplus.data.provider;

import dev.mishauwu27.minecraftplus.init.PlusItems;
import dev.mishauwu27.minecraftplus.lists.PlusTagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class PlusItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public PlusItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) { super(output, completableFuture); }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(PlusTagList.Items.LUMBERS)
                .add(PlusItems.OAK_LUMBER)
                .add(PlusItems.SPRUCE_LUMBER)
                .add(PlusItems.BIRCH_LUMBER)
                .add(PlusItems.JUNGLE_LUMBER)
                .add(PlusItems.ACACIA_LUMBER)
                .add(PlusItems.DARK_OAK_LUMBER)
                .add(PlusItems.CRIMSON_LUMBER)
                .add(PlusItems.WARPED_LUMBER)
                .add(PlusItems.MANGROVE_LUMBER)
                .add(PlusItems.BAMBOO_LUMBER)
                .add(PlusItems.CHERRY_LUMBER);
        getOrCreateTagBuilder(PlusTagList.Items.COBBLES)
                .add(PlusItems.COBBLE)
                .add(PlusItems.DEEPCOBBLE)
                .add(PlusItems.BLACKCOBBLE);

        getOrCreateTagBuilder(ItemTags.WOODEN_TOOL_MATERIALS).addTag(PlusTagList.Items.LUMBERS).setReplace(true);
        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS).addTag(PlusTagList.Items.COBBLES).setReplace(true);

    }
}