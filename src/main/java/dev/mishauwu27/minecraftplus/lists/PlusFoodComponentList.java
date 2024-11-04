package dev.mishauwu27.minecraftplus.lists;

import net.minecraft.component.type.FoodComponent;

public class PlusFoodComponentList {
    public static final FoodComponent ENCHANTED_GOLDEN_CARROT = new FoodComponent.Builder().nutrition(8).saturationModifier(1.2F).alwaysEdible().build();
    public static final FoodComponent GOLDEN_POTATO = new FoodComponent.Builder().nutrition(2).saturationModifier(1.2F).alwaysEdible().build();
    public static final FoodComponent GOLDEN_BAKED_POTATO = new FoodComponent.Builder().nutrition(6).saturationModifier(1.2F).alwaysEdible().build();
    public static final FoodComponent GOLDEN_POISONOUS_POTATO = new FoodComponent.Builder().nutrition(3).saturationModifier(1.2F).alwaysEdible().build();
}
