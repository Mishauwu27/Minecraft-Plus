package dev.mishauwu27.minecraftplus;

import dev.mishauwu27.minecraftplus.init.PlusBlocks;
import dev.mishauwu27.minecraftplus.init.PlusEnchantments;
import dev.mishauwu27.minecraftplus.init.PlusItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftPlus implements ModInitializer {
	public static final String MOD_ID = "minecraft-plus";
    public static final Logger LOGGER = LoggerFactory.getLogger("Minecraft+");

	@Override
	public void onInitialize() {
		PlusItems.load();
		PlusBlocks.load();
		PlusEnchantments.load();

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
			entries.addBefore(Items.NETHER_GOLD_ORE, PlusBlocks.NETHER_IRON_ORE);
			entries.addAfter(Items.GRASS_BLOCK, PlusBlocks.GRASS_SLAB);
			entries.addAfter(Items.PODZOL, PlusBlocks.PODZOL_SLAB);
			entries.addAfter(Items.MYCELIUM, PlusBlocks.MYCELIUM_SLAB);
			//entries.addAfter(Items.DIRT_PATH, PlusBlocks.DIRT_PATH_SLAB);
			entries.addAfter(Items.DIRT, PlusBlocks.DIRT_SLAB);
			entries.addAfter(Items.COARSE_DIRT, PlusBlocks.COARSE_DIRT_SLAB);
			//entries.addAfter(Items.FARMLAND, PlusBlocks.FARMLAND_SLAB);
			entries.addAfter(Items.MUD, PlusBlocks.MUD_SLAB);
			entries.addAfter(Items.CLAY, PlusBlocks.CLAY_SLAB);
			entries.addAfter(Items.GRAVEL, PlusBlocks.GRAVEL_SLAB);
			entries.addAfter(Items.SAND, PlusBlocks.SAND_SLAB);
			entries.addAfter(Items.RED_SAND, PlusBlocks.RED_SAND_SLAB);
			entries.addAfter(Items.ICE, PlusBlocks.ICE_SLAB);
			entries.addAfter(Items.PACKED_ICE, PlusBlocks.PACKED_ICE_SLAB);
			entries.addAfter(Items.BLUE_ICE, PlusBlocks.BLUE_ICE_SLAB);
			entries.addAfter(Items.SNOW_BLOCK, PlusBlocks.SNOW_SLAB);
			entries.addAfter(Items.MOSS_BLOCK, PlusBlocks.MOSS_SLAB);
			entries.addAfter(Items.STONE, Items.STONE_SLAB);
			entries.addAfter(Items.DEEPSLATE, PlusBlocks.DEEPSLATE_SLAB);
			entries.addAfter(Items.GRANITE, Items.GRANITE_SLAB);
			entries.addAfter(Items.DIORITE, Items.DIORITE_SLAB);
			entries.addAfter(Items.ANDESITE, Items.ANDESITE_SLAB);
			entries.addAfter(Items.CALCITE, PlusBlocks.CALCITE_SLAB);
			entries.addAfter(Items.TUFF, Items.TUFF_SLAB);
			entries.addAfter(Items.DRIPSTONE_BLOCK, PlusBlocks.DRIPSTONE_SLAB);
			entries.addAfter(Items.MAGMA_BLOCK, PlusBlocks.MAGMA_SLAB);
			entries.addAfter(Items.NETHERRACK, PlusBlocks.NETHERRACK_SLAB);
			entries.addAfter(Items.CRIMSON_NYLIUM, PlusBlocks.CRIMSON_NYLIUM_SLAB);
			entries.addAfter(Items.WARPED_NYLIUM, PlusBlocks.WARPED_NYLIUM_SLAB);
			entries.addAfter(Items.SOUL_SAND, PlusBlocks.SOUL_SAND_SLAB);
			entries.addAfter(Items.SOUL_SOIL, PlusBlocks.SOUL_SOIL_SLAB);
			entries.addAfter(Items.BASALT, PlusBlocks.BASALT_SLAB);
			entries.addAfter(Items.SMOOTH_BASALT, PlusBlocks.SMOOTH_BASALT_SLAB);
			entries.addAfter(Items.END_STONE, PlusBlocks.END_STONE_SLAB);
			entries.addAfter(Items.SCULK, PlusBlocks.SCULK_SLAB);
			entries.addAfter(Items.BEDROCK, PlusBlocks.BEDROCK_SLAB);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.addAfter(Items.GOLDEN_CARROT, PlusItems.ENCHANTED_GOLDEN_CARROT);
			entries.addAfter(Items.POISONOUS_POTATO, PlusItems.GOLDEN_POTATO);
			entries.addAfter(PlusItems.GOLDEN_POTATO, PlusItems.GOLDEN_BAKED_POTATO);
			entries.addAfter(PlusItems.GOLDEN_BAKED_POTATO, PlusItems.ENCHANTED_GOLDEN_BAKED_POTATO);
			entries.addAfter(PlusItems.ENCHANTED_GOLDEN_BAKED_POTATO, PlusItems.GOLDEN_POISONOUS_POTATO);
		});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addAfter(Items.FLINT, PlusItems.OBSIDIAN_SHARD);
			entries.addAfter(PlusItems.OBSIDIAN_SHARD, PlusItems.CRYING_OBSIDIAN_SHARD);
			entries.addBefore(Items.STICK, PlusItems.OAK_LUMBER);
			entries.addAfter(PlusItems.OAK_LUMBER, PlusItems.SPRUCE_LUMBER);
			entries.addAfter(PlusItems.SPRUCE_LUMBER, PlusItems.BIRCH_LUMBER);
			entries.addAfter(PlusItems.BIRCH_LUMBER, PlusItems.JUNGLE_LUMBER);
			entries.addAfter(PlusItems.JUNGLE_LUMBER, PlusItems.ACACIA_LUMBER);
			entries.addAfter(PlusItems.ACACIA_LUMBER, PlusItems.DARK_OAK_LUMBER);
			entries.addAfter(PlusItems.DARK_OAK_LUMBER, PlusItems.MANGROVE_LUMBER);
			entries.addAfter(PlusItems.MANGROVE_LUMBER, PlusItems.CHERRY_LUMBER);
			entries.addAfter(PlusItems.CHERRY_LUMBER, PlusItems.CRIMSON_LUMBER);
			entries.addAfter(PlusItems.CRIMSON_LUMBER, PlusItems.WARPED_LUMBER);
			entries.addBefore(Items.FLINT, PlusItems.COBBLE);
			entries.addAfter(PlusItems.COBBLE, PlusItems.DEEPCOBBLE);
		});
	}

	public static Identifier id(String path) {
		return Identifier.of("minecraft", path);
	}

	public static Identifier idPlus(String path) { return Identifier.of(MOD_ID, path); }
}
