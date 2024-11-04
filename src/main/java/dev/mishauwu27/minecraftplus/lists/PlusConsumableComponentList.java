package dev.mishauwu27.minecraftplus.lists;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

import java.util.List;

import static net.minecraft.component.type.ConsumableComponents.food;

public class PlusConsumableComponentList {
    public static final ConsumableComponent ENCHANTED_GOLDEN_CARROT = food().consumeEffect(new ApplyEffectsConsumeEffect(List.of(
            new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0),
            new StatusEffectInstance(StatusEffects.SATURATION, 12, 0)
    ))).build();
    public static final ConsumableComponent GOLDEN_POTATO = food().consumeEffect(new ApplyEffectsConsumeEffect(List.of(
            new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0),
            new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 0)
    ))).build();
    public static final ConsumableComponent GOLDEN_BAKED_POTATO = food().consumeEffect(new ApplyEffectsConsumeEffect(List.of(
            new StatusEffectInstance(StatusEffects.STRENGTH, 600, 0),
            new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0),
            new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 0)
    ))).build();
    public static final ConsumableComponent ENCHANTED_GOLDEN_BAKED_POTATO = food().consumeEffect(new ApplyEffectsConsumeEffect(List.of(
            new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 2),
            new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 1),
            new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 1),
            new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 0)
    ))).build();
    public static final ConsumableComponent GOLDEN_POISONOUS_POTATO = food().consumeEffect(new ApplyEffectsConsumeEffect(List.of(new StatusEffectInstance(StatusEffects.POISON, 300, 9)))).build();
}
