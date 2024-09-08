package dev.mishauwu27.minecraftplus.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;

public class ExperienceDroppingPillarBlock extends PillarBlock {
    public static final MapCodec<ExperienceDroppingPillarBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                    IntProvider.createValidatingCodec(0, 10).fieldOf("experience").forGetter(block -> block.experienceDropped),
                    createSettingsCodec()
            ).apply(instance, ExperienceDroppingPillarBlock::new)
    );
    private final IntProvider experienceDropped;

    public ExperienceDroppingPillarBlock(IntProvider experienceDropped, AbstractBlock.Settings settings) {
        super(settings);
        this.experienceDropped = experienceDropped;
    }

    @Override
    public MapCodec<? extends ExperienceDroppingPillarBlock> getCodec() { return CODEC; }

    @Override
    protected void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack tool, boolean dropExperience) {
        super.onStacksDropped(state, world, pos, tool, dropExperience);
        if (dropExperience) {
            this.dropExperienceWhenMined(world, pos, tool, this.experienceDropped);
        }
    }
}
