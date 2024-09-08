package dev.mishauwu27.minecraftplus.init;

import com.mojang.serialization.MapCodec;
import dev.mishauwu27.minecraftplus.MinecraftPlus;
import dev.mishauwu27.minecraftplus.enchantment.effects.SoulIgniteEnchantmentEffect;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class PlusEnchantments {
    public static final RegistryKey<Enchantment> SOUL_ASPECT = RegistryKey.of(RegistryKeys.ENCHANTMENT, MinecraftPlus.id("soul_aspect"));
    public static final RegistryKey<Enchantment> SOUL_FLAME = RegistryKey.of(RegistryKeys.ENCHANTMENT, MinecraftPlus.id("soul_flame"));

    public static final MapCodec<SoulIgniteEnchantmentEffect> SOUL_IGNITE = register("soul_ignite", SoulIgniteEnchantmentEffect.CODEC);

    private static <E extends EnchantmentEntityEffect>MapCodec<E> register(String name, MapCodec<E> codec) {
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, MinecraftPlus.id(name), codec);
    }

    public static void load() {}
}
