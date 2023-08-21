package net.wixter2.wixterus.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wixter2.wixterus.WixterusMod;
import net.wixter2.wixterus.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS , WixterusMod.MOD_ID);
    public static final RegistryObject<Block> WIXTERUS_BLOCK = registerBlock("wixterus_block" , () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)
            .strength(6f , 7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_WIXTERUS_ORE = registerBlock("deepslate_wixterus_ore" , () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)
            .requiresCorrectToolForDrops(), UniformInt.of(6,19)));
    public static final RegistryObject<Block> WIXTERUS_ORE = registerBlock("wixterus_ore" , () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).requiresCorrectToolForDrops()
            , UniformInt.of(6,19)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
