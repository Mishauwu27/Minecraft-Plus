package dev.mishauwu27.minecraftplus.data.generator;

import dev.mishauwu27.minecraftplus.enchantments.effects.SoulIgniteEnchantmentEffect;
import dev.mishauwu27.minecraftplus.init.PlusEnchantments;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentLevelBasedValue;
import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.item.Item;
import net.minecraft.loot.condition.DamageSourcePropertiesLootCondition;
import net.minecraft.predicate.entity.DamageSourcePredicate;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class PlusEnchantmentGenerator extends FabricDynamicRegistryProvider {
    public PlusEnchantmentGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
        RegistryWrapper<Item> itemLookup = registries.getWrapperOrThrow(RegistryKeys.ITEM);

        register(entries, PlusEnchantments.SOUL_ASPECT, Enchantment.builder(
                Enchantment.definition(
                        itemLookup.getOrThrow(ItemTags.WEAPON_ENCHANTABLE),
                        itemLookup.getOrThrow(ItemTags.SHARP_WEAPON_ENCHANTABLE),
                        1,
                        2,
                        Enchantment.leveledCost(10, 20),
                        Enchantment.leveledCost(60, 20),
                        6,
                        AttributeModifierSlot.MAINHAND
                ))
                .addEffect(EnchantmentEffectComponentTypes.POST_ATTACK,
                        EnchantmentEffectTarget.ATTACKER,
                        EnchantmentEffectTarget.VICTIM,
                        new SoulIgniteEnchantmentEffect(EnchantmentLevelBasedValue.linear(4.0f)),
                        DamageSourcePropertiesLootCondition.builder(DamageSourcePredicate.Builder.create().isDirect(true)))
        );
        register(entries, PlusEnchantments.SOUL_FLAME, Enchantment.builder(
                        Enchantment.definition(
                                itemLookup.getOrThrow(ItemTags.BOW_ENCHANTABLE),
                                1,
                                1,
                                Enchantment.constantCost(20),
                                Enchantment.constantCost(50),
                                6,
                                AttributeModifierSlot.MAINHAND
                        ))
                .addEffect(EnchantmentEffectComponentTypes.PROJECTILE_SPAWNED, new SoulIgniteEnchantmentEffect(EnchantmentLevelBasedValue.constant(100.0F)))
        );
    }

    private static void register(Entries entries, RegistryKey<Enchantment> key, Enchantment.Builder builder, ResourceCondition... resourceConditions) {
        entries.add(key, builder.build(key.getValue()), resourceConditions);
    }

    @Override
    public String getName() {
        return "";
    }
}
