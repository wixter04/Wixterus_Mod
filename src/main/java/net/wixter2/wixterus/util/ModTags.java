package net.wixter2.wixterus.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.wixter2.wixterus.WixterusMod;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEED_WIXTERUS_TOOL = tag();



        private static TagKey<Block>tag() {
            return BlockTags.create(new ResourceLocation(WixterusMod.MOD_ID  , "need_wixterus_tool"));
        }
    }

    public static  class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(WixterusMod.MOD_ID, name));
        }
    }


}
