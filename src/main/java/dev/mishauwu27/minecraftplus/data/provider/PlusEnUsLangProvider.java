package dev.mishauwu27.minecraftplus.data.provider;

import dev.mishauwu27.minecraftplus.init.PlusBlocks;
import dev.mishauwu27.minecraftplus.init.PlusEnchantments;
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
        translationBuilder.add(PlusBlocks.GRASS_SLAB, "Grass Slab");
        translationBuilder.add(PlusBlocks.PODZOL_SLAB, "Podzol Slab");
        translationBuilder.add(PlusBlocks.MYCELIUM_SLAB, "Mycelium Slab");
        //translationBuilder.add(PlusBlocks.DIRT_PATH_SLAB, "Dirt Path Slab");
        translationBuilder.add(PlusBlocks.DIRT_SLAB, "Dirt Slab");
        translationBuilder.add(PlusBlocks.COARSE_DIRT_SLAB, "Coarse Dirt Slab");
        //translationBuilder.add(PlusBlocks.FARMLAND_SLAB, "Farmland Slab");
        translationBuilder.add(PlusBlocks.MUD_SLAB, "Mud Slab");
        translationBuilder.add(PlusBlocks.CLAY_SLAB, "Clay Slab");
        translationBuilder.add(PlusBlocks.GRAVEL_SLAB, "Gravel Slab");
        translationBuilder.add(PlusBlocks.SAND_SLAB, "Sand Slab");
        translationBuilder.add(PlusBlocks.RED_SAND_SLAB, "Red Sand Slab");
        translationBuilder.add(PlusBlocks.ICE_SLAB, "Ice Slab");
        translationBuilder.add(PlusBlocks.PACKED_ICE_SLAB, "Packed Ice Slab");
        translationBuilder.add(PlusBlocks.BLUE_ICE_SLAB, "Blue Ice Slab");
        translationBuilder.add(PlusBlocks.SNOW_SLAB, "Snow Slab");
        translationBuilder.add(PlusBlocks.MOSS_SLAB, "Moss Slab");
        translationBuilder.add(PlusBlocks.DEEPSLATE_SLAB, "Deepslate Slab");
        translationBuilder.add(PlusBlocks.CALCITE_SLAB, "Calcite Slab");
        translationBuilder.add(PlusBlocks.DRIPSTONE_SLAB, "Dripstone Slab");
        translationBuilder.add(PlusBlocks.MAGMA_SLAB, "Magma Slab");
        translationBuilder.add(PlusBlocks.NETHERRACK_SLAB, "Netherrack Slab");
        translationBuilder.add(PlusBlocks.CRIMSON_NYLIUM_SLAB, "Crimson Nylium Slab");
        translationBuilder.add(PlusBlocks.WARPED_NYLIUM_SLAB, "Warped Nylium Slab");
        translationBuilder.add(PlusBlocks.SOUL_SAND_SLAB, "Soul Sand Slab");
        translationBuilder.add(PlusBlocks.SOUL_SOIL_SLAB, "Soul Soil Slab");
        translationBuilder.add(PlusBlocks.BASALT_SLAB, "Basalt Slab");
        translationBuilder.add(PlusBlocks.SMOOTH_BASALT_SLAB, "Smooth Basalt Slab");
        translationBuilder.add(PlusBlocks.END_STONE_SLAB, "Moss Slab");
        translationBuilder.add(PlusBlocks.SCULK_SLAB, "Sculk Slab");
        translationBuilder.add(PlusBlocks.BEDROCK_SLAB, "Moss Slab");

        translationBuilder.addEnchantment(PlusEnchantments.SOUL_ASPECT, "Soul Aspect");
        translationBuilder.addEnchantment(PlusEnchantments.SOUL_FLAME, "Soul Flame");

        translationBuilder.add(PlusItems.OBSIDIAN_SHARD, "Obsidian Shard");
        translationBuilder.add(PlusItems.CRYING_OBSIDIAN_SHARD, "Crying Obsidian Shard");
        translationBuilder.add(PlusItems.ENCHANTED_GOLDEN_CARROT, "Enchanted Golden Carrot");
        translationBuilder.add(PlusItems.GOLDEN_POTATO, "Golden Potato");
        translationBuilder.add(PlusItems.GOLDEN_BAKED_POTATO, "Golden Baked Potato");
        translationBuilder.add(PlusItems.ENCHANTED_GOLDEN_BAKED_POTATO, "Enchanted Golden Baked Potato");
        translationBuilder.add(PlusItems.GOLDEN_POISONOUS_POTATO, "Golden Poisonous Potato");
        translationBuilder.add(PlusItems.ACACIA_LUMBER, "Acacia Lumber");
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
    }
}
