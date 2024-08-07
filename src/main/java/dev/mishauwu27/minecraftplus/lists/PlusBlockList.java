package dev.mishauwu27.minecraftplus.lists;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class PlusBlockList {
    public static final Block NETHER_IRON_ORE = new ExperienceDroppingBlock(
            UniformIntProvider.create(0, 1),
            AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5F, 6.0F)
    );
}
