package net.wixter2.wixterus.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.wixter2.wixterus.WixterusMod;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, WixterusMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
