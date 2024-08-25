package dev.mishauwu27.minecraftplus.lists;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class PlusBlockList {
    public static final Block NETHER_IRON_ORE = new PillarBlock(
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(5.0F, 4.2F)
                    //.sounds(PlusBlockSoundGroup.NETHER_IRON_ORE)
    );
}
