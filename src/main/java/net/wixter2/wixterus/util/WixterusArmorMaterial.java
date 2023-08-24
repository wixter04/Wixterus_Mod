package net.wixter2.wixterus.util;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.wixter2.wixterus.WixterusMod;

import java.util.function.Supplier;

public class WixterusArmorMaterial implements ArmorMaterial {
    private final int[] durability;
    private final int[] defense;
    private final int enchantingValue;
    private final SoundEvent soundEvent;
    private final Supplier<Ingredient> repairMaterial;
    private  final  String name;
    private final float toughness;
    private final float knockbackResistance;

    public WixterusArmorMaterial(int[] durability, int[] defense, int enchantingValue, SoundEvent equipSound, Supplier<Ingredient> repairMaterial, String name, float toughness, float knockbackResistance) {
        this.durability = durability;
        this.defense = defense;
        this.enchantingValue = enchantingValue;
        soundEvent = equipSound;
        this.repairMaterial = repairMaterial;
        this.name = name;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }


    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return this.durability[pType.ordinal()];
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.defense[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantingValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return WixterusMod.MOD_ID +":" + name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
