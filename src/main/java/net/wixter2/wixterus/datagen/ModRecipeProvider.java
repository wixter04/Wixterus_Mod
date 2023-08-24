package net.wixter2.wixterus.datagen;


import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.wixter2.wixterus.WixterusMod;
import net.wixter2.wixterus.block.ModBlocks;

public class ModRecipeProvider  extends BlockStateProvider {

    public ModRecipeProvider(PackOutput output,  ExistingFileHelper exFileHelper) {
        super(output, WixterusMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.WIXTERUS_BLOCK);
        blockWithItem(ModBlocks.WIXTERUS_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_WIXTERUS_ORE);
    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get() , cubeAll(blockRegistryObject.get()));
    }
}
