package dev.mishauwu27.minecraftplus.init;

import dev.mishauwu27.minecraftplus.MinecraftPlus;
import dev.mishauwu27.minecraftplus.lists.PlusConsumableComponentList;
import dev.mishauwu27.minecraftplus.lists.PlusFoodComponentList;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.function.Function;

public class PlusItems {
    public static final Item OBSIDIAN_SHARD = register("obsidian_shard");
    public static final Item CRYING_OBSIDIAN_SHARD = register("crying_obsidian_shard");
    public static final Item ENCHANTED_GOLDEN_CARROT = register("enchanted_golden_carrot", new Item.Settings()
            .rarity(Rarity.RARE)
            .food(PlusFoodComponentList.ENCHANTED_GOLDEN_CARROT, PlusConsumableComponentList.ENCHANTED_GOLDEN_CARROT)
            .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
    );
    public static final Item GOLDEN_POTATO = register("golden_potato", new Item.Settings().food(PlusFoodComponentList.GOLDEN_POTATO, PlusConsumableComponentList.GOLDEN_POTATO));
    public static final Item GOLDEN_BAKED_POTATO = register("golden_baked_potato", new Item.Settings().food(PlusFoodComponentList.GOLDEN_BAKED_POTATO, PlusConsumableComponentList.GOLDEN_BAKED_POTATO));
    public static final Item ENCHANTED_GOLDEN_BAKED_POTATO = register("enchanted_golden_baked_potato", new Item.Settings()
            .rarity(Rarity.RARE)
            .food(PlusFoodComponentList.GOLDEN_BAKED_POTATO, PlusConsumableComponentList.ENCHANTED_GOLDEN_BAKED_POTATO)
            .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
    );
    public static final Item GOLDEN_POISONOUS_POTATO = register("golden_poisonous_potato", new Item.Settings().food(PlusFoodComponentList.GOLDEN_POISONOUS_POTATO, PlusConsumableComponentList.GOLDEN_POISONOUS_POTATO));
    public static final Item ACACIA_LUMBER = register("acacia_lumber");
    public static final Item BAMBOO_LUMBER = register("bamboo_lumber");
    public static final Item BIRCH_LUMBER = register("birch_lumber");
    public static final Item CHERRY_LUMBER = register("cherry_lumber");
    public static final Item CRIMSON_LUMBER = register("crimson_lumber");
    public static final Item DARK_OAK_LUMBER = register("dark_oak_lumber");
    public static final Item JUNGLE_LUMBER = register("jungle_lumber");
    public static final Item MANGROVE_LUMBER = register("mangrove_lumber");
    public static final Item OAK_LUMBER = register("oak_lumber");
    public static final Item SPRUCE_LUMBER = register("spruce_lumber");
    public static final Item WARPED_LUMBER = register("warped_lumber");
    public static final Item WARPED_WART = register("warped_wart");
    public static final Item CRIMSON_BOAT = register("crimson_boat");
    public static final Item WARPED_BOAT = register("warped_boat");
    public static final Item COBBLE = register("cobble");
    public static final Item DEEPCOBBLE = register("deepcobble");
    public static final Item BLACKCOBBLE = register("blackcobble");

    private static <I extends Item> I registerItem(String path, I item) { return Registry.register(Registries.ITEM, MinecraftPlus.id(path), item); }
    public static Item register(String path) { return registerItem(path, new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, MinecraftPlus.id(path))))); }
    public static Item register(String path, Item.Settings settings) { return registerItem(path, new Item(settings.registryKey(RegistryKey.of(RegistryKeys.ITEM, MinecraftPlus.id(path))))); }

    public static void load() {}
}
