package dev.mishauwu27.minecraftplus.init;

import dev.mishauwu27.minecraftplus.MinecraftPlus;
import dev.mishauwu27.minecraftplus.lists.PlusFoodComponentList;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class PlusItems {
    public static final Item ENCHANTED_GOLDEN_BAKED_POTATO = register("enchanted_golden_baked_potato", new Item(new Item.Settings().food(PlusFoodComponentList.ENCHANTED_GOLDEN_BAKED_POTATO)));
    public static final Item ENCHANTED_GOLDEN_CARROT = register("enchanted_golden_carrot", new Item(new Item.Settings().food(PlusFoodComponentList.ENCHANTED_GOLDEN_CARROT)));
    public static final Item GOLDEN_BAKED_POTATO = register("golden_baked_potato", new Item(new Item.Settings().food(PlusFoodComponentList.GOLDEN_BAKED_POTATO)));
    public static final Item GOLDEN_POISONOUS_POTATO = register("golden_poisonous_potato", new Item(new Item.Settings().food(PlusFoodComponentList.GOLDEN_POISONOUS_POTATO)));
    public static final Item GOLDEN_POTATO = register("golden_potato", new Item(new Item.Settings().food(PlusFoodComponentList.GOLDEN_POTATO)));
    public static final Item OBSIDIAN_SHARD = register("obsidian_shard", new Item(new Item.Settings()));

    public static <I extends Item> I register(String name, I item) {
        return Registry.register(Registries.ITEM, MinecraftPlus.id(name), item);
    }

    public static void load() {}
}
