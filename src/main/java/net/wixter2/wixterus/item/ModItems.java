package net.wixter2.wixterus.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wixter2.wixterus.WixterusMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WixterusMod.MOD_ID);

    public static  final RegistryObject<Item> WIXTERUS = ITEMS.register("wixterus",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_WIXTERUS = ITEMS.register("raw_wixterus",
            ()-> new Item(new Item.Properties()));








    public  static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
