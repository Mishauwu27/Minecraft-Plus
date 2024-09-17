package dev.mishauwu27.minecraftplus.init;

import dev.mishauwu27.minecraftplus.MinecraftPlus;
import dev.mishauwu27.minecraftplus.lists.PlusFoodComponentList;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;

public class PlusItems {
    public static final Item OBSIDIAN_SHARD = register("obsidian_shard", new Item(new Item.Settings()));
    public static final Item CRYING_OBSIDIAN_SHARD = register("crying_obsidian_shard", new Item(new Item.Settings()));
    public static final Item ENCHANTED_GOLDEN_CARROT = register("enchanted_golden_carrot", new Item(new Item.Settings().rarity(Rarity.EPIC).food(PlusFoodComponentList.ENCHANTED_GOLDEN_CARROT).component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final Item GOLDEN_POTATO = register("golden_potato", new Item(new Item.Settings().rarity(Rarity.RARE).food(PlusFoodComponentList.GOLDEN_POTATO)));
    public static final Item GOLDEN_BAKED_POTATO = register("golden_baked_potato", new Item(new Item.Settings().rarity(Rarity.RARE).food(PlusFoodComponentList.GOLDEN_BAKED_POTATO)));
    public static final Item ENCHANTED_GOLDEN_BAKED_POTATO = register("enchanted_golden_baked_potato", new Item(new Item.Settings().rarity(Rarity.EPIC).food(PlusFoodComponentList.ENCHANTED_GOLDEN_BAKED_POTATO).component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final Item GOLDEN_POISONOUS_POTATO = register("golden_poisonous_potato", new Item(new Item.Settings().rarity(Rarity.RARE).food(PlusFoodComponentList.GOLDEN_POISONOUS_POTATO)));
    public static final Item ACACIA_LUMBER = register("acacia_lumber", new Item(new Item.Settings()));
    public static final Item BAMBOO_LUMBER = register("bamboo_lumber", new Item(new Item.Settings()));
    public static final Item BIRCH_LUMBER = register("birch_lumber", new Item(new Item.Settings()));
    public static final Item CHERRY_LUMBER = register("cherry_lumber", new Item(new Item.Settings()));
    public static final Item CRIMSON_LUMBER = register("crimson_lumber", new Item(new Item.Settings()));
    public static final Item DARK_OAK_LUMBER = register("dark_oak_lumber", new Item(new Item.Settings()));
    public static final Item JUNGLE_LUMBER = register("jungle_lumber", new Item(new Item.Settings()));
    public static final Item MANGROVE_LUMBER = register("mangrove_lumber", new Item(new Item.Settings()));
    public static final Item OAK_LUMBER = register("oak_lumber", new Item(new Item.Settings()));
    public static final Item SPRUCE_LUMBER = register("spruce_lumber", new Item(new Item.Settings()));
    public static final Item WARPED_LUMBER = register("warped_lumber", new Item(new Item.Settings()));
    public static final Item WARPED_WART = register("warped_wart", new Item(new Item.Settings()));
    public static final Item COBBLE = register("cobble", new Item(new Item.Settings()));
    public static final Item DEEPCOBBLE = register("deepcobble", new Item(new Item.Settings()));
    public static final Item GRANIBBLE = register("granibble", new Item(new Item.Settings()));
    public static final Item DIOBBLE = register("diobble", new Item(new Item.Settings()));
    public static final Item ANDESIBBLE = register("andesibble", new Item(new Item.Settings()));
    public static final Item CALC = register("calc", new Item(new Item.Settings()));
    public static final Item TUFFLE = register("tuffle", new Item(new Item.Settings()));
    public static final Item BLACKCOBBLE = register("blackcobble", new Item(new Item.Settings()));
    public static final Item BASALT_COBBLE = register("basalt_cobble", new Item(new Item.Settings()));
    public static final Item END_COBBLE = register("end_cobble", new Item(new Item.Settings()));

    public static <I extends Item> I register(String name, I item) {
        return Registry.register(Registries.ITEM, MinecraftPlus.id(name), item);
    }

    public static void load() {}
}
