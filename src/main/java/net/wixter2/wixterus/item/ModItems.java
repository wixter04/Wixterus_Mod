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

    public  static  final RegistryObject<SwordItem> WIXTERUS_BLADE = ITEMS.register("wixterus_blade",
            () -> new SwordItem(WixterusModTier.WIXTERUS, 9 , -2.3f, new Item.Properties()));
    public  static  final RegistryObject<SwordItem> WIXTERUS_SWORD = ITEMS.register("wixterus_sword",
            () -> new SwordItem(WixterusModTier.WIXTERUS, 1, -2.4f, new Item.Properties()));

    public static final RegistryObject<PickaxeItem> WIXTERUS_PICKAXE = ITEMS.register("wixterus_pickaxe",
            () -> new PickaxeItem(WixterusModTier.WIXTERUS, 6 , -2.8f,new Item.Properties().defaultDurability(2789)));



    public  static  final RegistryObject<ShovelItem> WIXTERUS_SHOVEL = ITEMS.register("wixterus_shovel" ,
            () -> new ShovelItem(WixterusModTier.WIXTERUS, 7 , -3 , new Item.Properties().defaultDurability(1946)));


    public static final RegistryObject<AxeItem> WIXTERUS_AXE = ITEMS.register("wixterus_axe",
            () -> new AxeItem(WixterusModTier.WIXTERUS,11,-3,new Item.Properties().defaultDurability(2249)));




    public  static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
