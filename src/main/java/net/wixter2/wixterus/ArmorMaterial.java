package net.wixter2.wixterus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;
import net.wixter2.wixterus.item.ModItems;
import net.wixter2.wixterus.util.WixterusArmorMaterial;

public class ArmorMaterial {
    public static final WixterusArmorMaterial WIXTERUS_ARMOR_MATERIAL = new WixterusArmorMaterial(
    new int[]{ 500 , 753 , 613 ,526 },
            new int[] { 4 , 10 , 7 , 4 },
            19,
            SoundEvents.AMETHYST_BLOCK_PLACE,
            () -> Ingredient.of(ModItems.WIXTERUS::get),
            "wixterus",
            4f,
            1.5f
    );
}
