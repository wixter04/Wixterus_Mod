package net.wixter2.wixterus.event;

import ca.weblite.objc.Proxy;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.fml.common.Mod;
import net.wixter2.wixterus.WixterusMod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.wixter2.wixterus.block.ModBlocks;
import net.wixter2.wixterus.item.ModItems;

import java.util.List;

@Mod.EventBusSubscriber(modid = WixterusMod.MOD_ID)
public class ModEvent {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == VillagerProfession.ARMORER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 14 ),
                    new ItemStack(ModItems.WIXTERUS_CHESTPLATE.get(), 1),
                    2, 25, 0.065f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 12 ),
                    new ItemStack(ModItems.WIXTERUS_LEGGINGS.get(), 1),
                    2, 24, 0.065f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 12 ),
                    new ItemStack(ModItems.WIXTERUS_LEGGINGS.get(), 1),
                    2, 24, 0.065f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 14 ),
                    new ItemStack(ModItems.WIXTERUS_CHESTPLATE.get(), 1),
                    2, 25, 0.065f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 10 ),
                    new ItemStack(ModItems.WIXTERUS_BOOTS.get(), 1),
                    4, 8, 0.065f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 12 ),
                    new ItemStack(ModItems.WIXTERUS_HELMET.get(), 1),
                    4, 8, 0.065f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 7 ),
                    new ItemStack(ModItems.WIXTERUS_BOOTS.get(), 1),
                    2, 19, 0.065f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 9 ),
                    new ItemStack(ModItems.WIXTERUS_HELMET.get(), 1),
                    2, 20, 0.065f));
        }
        if(event.getType() == VillagerProfession.WEAPONSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5 ),
                    new ItemStack(ModItems.WIXTERUS_BLADE.get(), 1),
                    4, 10, 0.065f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 3 ),
                    new ItemStack(ModItems.WIXTERUS_BLADE.get(), 1),
                    4, 10, 0.065f));
        }
        if(event.getType() == VillagerProfession.TOOLSMITH) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5 ),
                    new ItemStack(ModItems.WIXTERUS_AXE.get(), 1),
                    3, 13, 0.065f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2 ),
                    new ItemStack(ModItems.WIXTERUS_SHOVEL.get(), 1),
                    3, 13, 0.065f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 4 ),
                    new ItemStack(ModItems.WIXTERUS_AXE.get(), 1),
                    3, 13, 0.065f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 1 ),
                    new ItemStack(ModItems.WIXTERUS_SHOVEL.get(), 1),
                    3, 13, 0.065f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5 ),
                    new ItemStack(ModItems.WIXTERUS_PICKAXE.get(), 1),
                    3, 13, 0.065f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 4 ),
                    new ItemStack(ModItems.WIXTERUS_PICKAXE.get(), 1),
                    3, 13, 0.065f));


        }

    }
}

