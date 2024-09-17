package dev.mishauwu27.minecraftplus.data.provider;

import dev.mishauwu27.minecraftplus.init.PlusBlocks;
import dev.mishauwu27.minecraftplus.init.PlusItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamily;

public class PlusModelProvider extends FabricModelProvider {
    public PlusModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        var dirtFamily = new BlockFamily.Builder(Blocks.DIRT).slab(PlusBlocks.DIRT_SLAB).build();
        var coarseDirtFamily = new BlockFamily.Builder(Blocks.COARSE_DIRT).slab(PlusBlocks.COARSE_DIRT_SLAB).build();
        var mudFamily = new BlockFamily.Builder(Blocks.MUD).slab(PlusBlocks.MUD_SLAB).build();
        var clayFamily = new BlockFamily.Builder(Blocks.CLAY).slab(PlusBlocks.CLAY_SLAB).build();
        var gravelFamily = new BlockFamily.Builder(Blocks.GRAVEL).slab(PlusBlocks.GRAVEL_SLAB).build();
        var sandFamily = new BlockFamily.Builder(Blocks.SAND).slab(PlusBlocks.SAND_SLAB).build();
        var redSandFamily = new BlockFamily.Builder(Blocks.RED_SAND).slab(PlusBlocks.RED_SAND_SLAB).build();
        var iceFamily = new BlockFamily.Builder(Blocks.ICE).slab(PlusBlocks.ICE_SLAB).build();
        var packedIceFamily = new BlockFamily.Builder(Blocks.PACKED_ICE).slab(PlusBlocks.PACKED_ICE_SLAB).build();
        var blueIceFamily = new BlockFamily.Builder(Blocks.BLUE_ICE).slab(PlusBlocks.BLUE_ICE_SLAB).build();
        var mossFamily = new BlockFamily.Builder(Blocks.MOSS_BLOCK).slab(PlusBlocks.MOSS_SLAB).build();
        var calciteFamily = new BlockFamily.Builder(Blocks.CALCITE).slab(PlusBlocks.CALCITE_SLAB).build();
        var dripstoneFamily = new BlockFamily.Builder(Blocks.DRIPSTONE_BLOCK).slab(PlusBlocks.DRIPSTONE_SLAB).build();
        var soulSandFamily = new BlockFamily.Builder(Blocks.SOUL_SAND).slab(PlusBlocks.SOUL_SAND_SLAB).build();
        var soulSoilFamily = new BlockFamily.Builder(Blocks.SOUL_SOIL).slab(PlusBlocks.SOUL_SOIL_SLAB).build();
        var netherrackFamily = new BlockFamily.Builder(Blocks.NETHERRACK).slab(PlusBlocks.NETHERRACK_SLAB).build();
        var smoothBasaltFamily = new BlockFamily.Builder(Blocks.SMOOTH_BASALT).slab(PlusBlocks.SMOOTH_BASALT_SLAB).build();
        var endStoneFamily = new BlockFamily.Builder(Blocks.END_STONE).slab(PlusBlocks.END_STONE_SLAB).build();
        var sculkFamily = new BlockFamily.Builder(Blocks.SCULK).slab(PlusBlocks.SCULK_SLAB).build();

        blockStateModelGenerator.registerCubeAllModelTexturePool(dirtFamily.getBaseBlock())
                .family(dirtFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(coarseDirtFamily.getBaseBlock())
                .family(coarseDirtFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(mudFamily.getBaseBlock())
                .family(mudFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(clayFamily.getBaseBlock())
                .family(clayFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(gravelFamily.getBaseBlock())
                .family(gravelFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(sandFamily.getBaseBlock())
                .family(sandFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(redSandFamily.getBaseBlock())
                .family(redSandFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(iceFamily.getBaseBlock())
                .family(iceFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(packedIceFamily.getBaseBlock())
                .family(packedIceFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(blueIceFamily.getBaseBlock())
                .family(blueIceFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(mossFamily.getBaseBlock())
                .family(mossFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(calciteFamily.getBaseBlock())
                .family(calciteFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(dripstoneFamily.getBaseBlock())
                .family(dripstoneFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(netherrackFamily.getBaseBlock())
                .family(netherrackFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(soulSandFamily.getBaseBlock())
                .family(soulSandFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(soulSoilFamily.getBaseBlock())
                .family(soulSoilFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(smoothBasaltFamily.getBaseBlock())
                .family(smoothBasaltFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(endStoneFamily.getBaseBlock())
                .family(endStoneFamily);
        blockStateModelGenerator.registerCubeAllModelTexturePool(sculkFamily.getBaseBlock())
                .family(sculkFamily);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(PlusItems.OBSIDIAN_SHARD, Models.GENERATED);
        itemModelGenerator.register(PlusItems.CRYING_OBSIDIAN_SHARD, Models.GENERATED);
        itemModelGenerator.register(PlusItems.GOLDEN_POTATO, Models.GENERATED);
        itemModelGenerator.register(PlusItems.GOLDEN_BAKED_POTATO, Models.GENERATED);
        itemModelGenerator.register(PlusItems.GOLDEN_POISONOUS_POTATO, Models.GENERATED);
        itemModelGenerator.register(PlusItems.ACACIA_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.BAMBOO_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.BIRCH_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.CHERRY_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.CRIMSON_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.DARK_OAK_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.JUNGLE_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.MANGROVE_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.OAK_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.SPRUCE_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.WARPED_LUMBER, Models.GENERATED);
        itemModelGenerator.register(PlusItems.WARPED_WART, Models.GENERATED);
        itemModelGenerator.register(PlusItems.COBBLE, Models.GENERATED);
        itemModelGenerator.register(PlusItems.DEEPCOBBLE, Models.GENERATED);
    }
}
