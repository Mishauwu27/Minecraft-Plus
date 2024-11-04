package dev.mishauwu27.minecraftplus.data.provider;

import dev.mishauwu27.minecraftplus.init.PlusItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class PlusEnUsLangProvider extends FabricLanguageProvider {
    public PlusEnUsLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) { super(dataOutput, registryLookup); }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(PlusItems.OBSIDIAN_SHARD, "Obsidian Shard");
        translationBuilder.add(PlusItems.CRYING_OBSIDIAN_SHARD, "Crying Obsidian Shard");
        translationBuilder.add(PlusItems.ENCHANTED_GOLDEN_CARROT, "Enchanted Golden Carrot");
        translationBuilder.add(PlusItems.GOLDEN_POTATO, "Golden Potato");
        translationBuilder.add(PlusItems.GOLDEN_BAKED_POTATO, "Golden Baked Potato");
        translationBuilder.add(PlusItems.ENCHANTED_GOLDEN_BAKED_POTATO, "Enchanted Golden Baked Potato");
        translationBuilder.add(PlusItems.GOLDEN_POISONOUS_POTATO, "Golden Poisonous Potato");
        translationBuilder.add(PlusItems.ACACIA_LUMBER, "Acacia Lumber");
        translationBuilder.add(PlusItems.BAMBOO_LUMBER, "Bamboo Lumber");
        translationBuilder.add(PlusItems.BIRCH_LUMBER, "Birch Lumber");
        translationBuilder.add(PlusItems.CHERRY_LUMBER, "Cherry Lumber");
        translationBuilder.add(PlusItems.CRIMSON_LUMBER, "Crimson Lumber");
        translationBuilder.add(PlusItems.DARK_OAK_LUMBER, "Dark Oak Lumber");
        translationBuilder.add(PlusItems.JUNGLE_LUMBER, "Jungle Lumber");
        translationBuilder.add(PlusItems.MANGROVE_LUMBER, "Mangrove Lumber");
        translationBuilder.add(PlusItems.OAK_LUMBER, "Oak Lumber");
        translationBuilder.add(PlusItems.SPRUCE_LUMBER, "Spruce Lumber");
        translationBuilder.add(PlusItems.WARPED_LUMBER, "Warped Lumber");
        translationBuilder.add(PlusItems.WARPED_WART, "Warped Wart");
        translationBuilder.add(PlusItems.COBBLE, "Cobble");
        translationBuilder.add(PlusItems.DEEPCOBBLE, "Deepcobble");
        translationBuilder.add(PlusItems.BLACKCOBBLE, "Blackcobble");
    }
}
