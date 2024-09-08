package dev.mishauwu27.minecraftplus.init;

import dev.mishauwu27.minecraftplus.MinecraftPlus;
import dev.mishauwu27.minecraftplus.lists.PlusBlockList;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class PlusBlocks {
    public static final Block NETHER_IRON_ORE = registerWithItem("nether_iron_ore", PlusBlockList.NETHER_IRON_ORE);
    public static final Block GRASS_SLAB = registerWithItem("grass_slab", PlusBlockList.GRASS_SLAB);
    public static final Block PODZOL_SLAB = registerWithItem("podzol_slab", PlusBlockList.PODZOL_SLAB);
    public static final Block MYCELIUM_SLAB = registerWithItem("mycelium_slab", PlusBlockList.MYCELIUM_SLAB);
    public static final Block DIRT_PATH_SLAB = registerWithItem("dirt_path_slab", PlusBlockList.DIRT_PATH_SLAB);
    public static final Block DIRT_SLAB = registerWithItem("dirt_slab", PlusBlockList.DIRT_SLAB);
    public static final Block COARSE_DIRT_SLAB = registerWithItem("coarse_dirt_slab", PlusBlockList.COARSE_DIRT_SLAB);
    public static final Block FARMLAND_SLAB = registerWithItem("farmland_slab", PlusBlockList.FARMLAND_SLAB);
    public static final Block MUD_SLAB = registerWithItem("mud_slab", PlusBlockList.MUD_SLAB);
    public static final Block CLAY_SLAB = registerWithItem("clay_slab", PlusBlockList.CLAY_SLAB);
    public static final Block GRAVEL_SLAB = registerWithItem("gravel_slab", PlusBlockList.GRAVEL_SLAB);
    public static final Block SAND_SLAB = registerWithItem("sand_slab", PlusBlockList.SAND_SLAB);
    public static final Block RED_SAND_SLAB = registerWithItem("red_sand_slab", PlusBlockList.RED_SAND_SLAB);
    public static final Block ICE_SLAB = registerWithItem("ice_slab", PlusBlockList.ICE_SLAB);
    public static final Block PACKED_ICE_SLAB = registerWithItem("packed_ice_slab", PlusBlockList.PACKED_ICE_SLAB);
    public static final Block BLUE_ICE_SLAB = registerWithItem("blue_ice_slab", PlusBlockList.BLUE_ICE_SLAB);
    public static final Block SNOW_SLAB = registerWithItem("snow_slab", PlusBlockList.SNOW_SLAB);
    public static final Block MOSS_SLAB = registerWithItem("moss_slab", PlusBlockList.MOSS_SLAB);
    public static final Block DEEPSLATE_SLAB = registerWithItem("deepslate_slab", PlusBlockList.DEEPSLATE_SLAB);
    public static final Block CALCITE_SLAB = registerWithItem("calcite_slab", PlusBlockList.CALCITE_SLAB);
    public static final Block DRIPSTONE_SLAB = registerWithItem("dripstone_slab", PlusBlockList.DRIPSTONE_SLAB);
    public static final Block MAGMA_SLAB = registerWithItem("magma_slab", PlusBlockList.MAGMA_SLAB);
    public static final Block NETHERRACK_SLAB = registerWithItem("netherrack_slab", PlusBlockList.NETHERRACK_SLAB);
    public static final Block CRIMSON_NYLIUM_SLAB = registerWithItem("crimson_nylium_slab", PlusBlockList.CRIMSON_NYLIUM_SLAB);
    public static final Block WARPED_NYLIUM_SLAB = registerWithItem("warped_nylium_slab", PlusBlockList.WARPED_NYLIUM_SLAB);
    public static final Block SOUL_SAND_SLAB = registerWithItem("soul_sand_slab", PlusBlockList.SOUL_SAND_SLAB);
    public static final Block SOUL_SOIL_SLAB = registerWithItem("soul_soil_slab", PlusBlockList.SOUL_SOIL_SLAB);
    public static final Block BASALT_SLAB = registerWithItem("basalt_slab", PlusBlockList.BASALT_SLAB);
    public static final Block SMOOTH_BASALT_SLAB = registerWithItem("smooth_basalt_slab", PlusBlockList.SMOOTH_BASALT_SLAB);
    public static final Block END_STONE_SLAB = registerWithItem("end_stone_slab", PlusBlockList.END_STONE_SLAB);
    public static final Block SCULK_SLAB = registerWithItem("sculk_slab", PlusBlockList.SCULK_SLAB);
    public static final Block BEDROCK_SLAB = registerWithItem("bedrock_slab", PlusBlockList.BEDROCK_SLAB);

    public static <B extends Block> B register(String name, B block) {
        return Registry.register(Registries.BLOCK, MinecraftPlus.id(name), block);
    }

    public static <BI extends Block> BI registerWithItem(String name, BI block, Item.Settings settings) {
        BI registered = register(name, block);
        PlusItems.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <BI extends Block> BI registerWithItem(String name, BI block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    public static void load() {}
}
