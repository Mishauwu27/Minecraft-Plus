package dev.mishauwu27.minecraftplus.data.provider;

import dev.mishauwu27.minecraftplus.init.PlusBlocks;
import dev.mishauwu27.minecraftplus.init.PlusItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class PlusEnUsLangProvider extends FabricLanguageProvider {
    public PlusEnUsLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(PlusBlocks.NETHER_IRON_ORE, "Nether Iron Ore");

        translationBuilder.add(PlusItems.CRYING_OBSIDIAN_SHARD, "Crying Obsidian Shard");
        translationBuilder.add(PlusItems.ENCHANTED_GOLDEN_BAKED_POTATO, "Enchanted Golden Baked Potato");
        translationBuilder.add(PlusItems.ENCHANTED_GOLDEN_CARROT, "Enchanted Golden Carrot");
        translationBuilder.add(PlusItems.GOLDEN_BAKED_POTATO, "Golden Baked Potato");
        translationBuilder.add(PlusItems.GOLDEN_POISONOUS_POTATO, "Golden Poisonous Potato");
        translationBuilder.add(PlusItems.GOLDEN_POTATO, "Golden Potato");
        translationBuilder.add(PlusItems.OBSIDIAN_SHARD, "Obsidian Shard");
    }
}
