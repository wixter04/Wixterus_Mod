package net.wixter2.wixterus.datagen;

import net.minecraft.ResourceLocationException;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.wixter2.wixterus.WixterusMod;
import net.wixter2.wixterus.block.ModBlocks;
import net.wixter2.wixterus.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, WixterusMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
    this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(ModBlocks.WIXTERUS_ORE.get()).addTag(Tags.Blocks.ORES)
            .add(ModBlocks.DEEPSLATE_WIXTERUS_ORE.get()).addTag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE);


    }
}
