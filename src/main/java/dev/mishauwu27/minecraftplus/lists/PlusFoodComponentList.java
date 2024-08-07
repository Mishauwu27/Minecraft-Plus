package dev.mishauwu27.minecraftplus.lists;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class PlusFoodComponentList {
    public static final FoodComponent ENCHANTED_GOLDEN_BAKED_POTATO = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 2), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 2), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 2), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 2), 1F)
            .alwaysEdible()
            .build();
    public static final FoodComponent ENCHANTED_GOLDEN_CARROT = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 1F)
            .alwaysEdible()
            .build();
    public static final FoodComponent GOLDEN_BAKED_POTATO = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600, 0), 1F)
            .alwaysEdible()
            .build();
    public static final FoodComponent GOLDEN_POISONOUS_POTATO = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 300, 9), 1F)
            .alwaysEdible()
            .build();
    public static final FoodComponent GOLDEN_POTATO = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 0), 1F)
            .alwaysEdible()
            .build();
}
