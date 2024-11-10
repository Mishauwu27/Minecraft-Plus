package dev.mishauwu27.minecraftplus.lists;

import net.fabricmc.fabric.impl.tag.convention.v2.TagRegistration;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;

@SuppressWarnings("UnstableApiUsage")
public class PlusTagList {
    public static class Items {
        public static final TagKey<Item> LUMBERS = TagRegistration.ITEM_TAG.registerC("lumbers");
        public static final TagKey<Item> COBBLES = TagRegistration.ITEM_TAG.registerC("cobbles");
    }
}
