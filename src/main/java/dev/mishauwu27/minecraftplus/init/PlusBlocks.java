package dev.mishauwu27.minecraftplus.init;

import dev.mishauwu27.minecraftplus.MinecraftPlus;
import dev.mishauwu27.minecraftplus.lists.PlusBlockList;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class PlusBlocks {
    public static final Block NETHER_IRON_ORE = registerWithItem("nether_iron_ore", PlusBlockList.NETHER_IRON_ORE);

    public static <B extends Block> B register(String name, B block) {
        return Registry.register(Registries.BLOCK, MinecraftPlus.id(name), block);
    }

    public static <BI extends Block> BI registerWithItem(String name, BI block, Item.Settings settings) {
        BI registered = register(name, block);
        PlusItems.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <BI extends Block> BI registerWithItem(String name, BI block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    public static void load() {}
}
