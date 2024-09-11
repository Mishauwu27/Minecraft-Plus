package dev.mishauwu27.minecraftplus.lists;

import dev.mishauwu27.minecraftplus.block.*;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.util.ColorCode;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class PlusBlockList {
    public static final Block NETHER_IRON_ORE = new ExperienceDroppingPillarBlock(UniformIntProvider.create(0, 2),
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(5.0F, 4.2F)
                    //.sounds(PlusBlockSoundGroup.NETHER_IRON_ORE)
    );
    public static final Block GRASS_SLAB = new GrassSlabBlock(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK));
    public static final Block PODZOL_SLAB = new SnowySlabBlock(AbstractBlock.Settings.copy(Blocks.PODZOL));
    public static final Block MYCELIUM_SLAB = new MyceliumSlabBlock(AbstractBlock.Settings.copy(Blocks.MYCELIUM));
    //public static final Block DIRT_PATH_SLAB = new DirtPathSlabBlock(AbstractBlock.Settings.copy(Blocks.DIRT_PATH));
    public static final Block DIRT_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIRT));
    public static final Block COARSE_DIRT_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT));
    //public static final Block FARMLAND_SLAB = new FarmlandSlabBlock(AbstractBlock.Settings.copy(Blocks.FARMLAND));
    public static final Block MUD_SLAB = new MudSlabBlock(AbstractBlock.Settings.copy(Blocks.MUD));
    public static final Block CLAY_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.CLAY));
    public static final Block GRAVEL_SLAB = new ColoredFallingSlabBlock(new ColorCode(-8356741), AbstractBlock.Settings.copy(Blocks.GRAVEL) );
    public static final Block SAND_SLAB = new ColoredFallingSlabBlock(new ColorCode(14406560), AbstractBlock.Settings.copy(Blocks.SAND) );
    public static final Block RED_SAND_SLAB = new ColoredFallingSlabBlock(new ColorCode(11098145), AbstractBlock.Settings.copy(Blocks.RED_SAND) );
    public static final Block ICE_SLAB = new IceSlabBlock(AbstractBlock.Settings.copy(Blocks.ICE));
    public static final Block PACKED_ICE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.PACKED_ICE));
    public static final Block BLUE_ICE_SLAB = new TranslucentSlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ICE));
    public static final Block SNOW_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK));
    public static final Block MOSS_SLAB = new MossSlabBlock(AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK));
    public static final Block DEEPSLATE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE));
    public static final Block CALCITE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.CALCITE));
    public static final Block DRIPSTONE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK));
    public static final Block MAGMA_SLAB = new MagmaSlabBlock(AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK));
    public static final Block NETHERRACK_SLAB = new NetherrackSlabBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK));
    public static final Block CRIMSON_NYLIUM_SLAB = new NyliumSlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM));
    public static final Block WARPED_NYLIUM_SLAB = new NyliumSlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM));
    public static final Block SOUL_SAND_SLAB = new SoulSandSlabBlock(AbstractBlock.Settings.copy(Blocks.SOUL_SAND));
    public static final Block SOUL_SOIL_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.SOUL_SOIL));
    public static final Block BASALT_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.BASALT));
    public static final Block SMOOTH_BASALT_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT));
    public static final Block END_STONE_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE));
    public static final Block SCULK_SLAB = new SculkSlabBlock(AbstractBlock.Settings.copy(Blocks.SCULK));
    public static final Block BEDROCK_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK));
}
