package net.wixter2.wixterus.block;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.wixter2.wixterus.WixterusMod;

import javax.swing.*;

public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS , WixterusMod.MOD_ID);
    public  static  void  register(IEventBus eventBus ){
        BLOCKS.register(eventBus);
    }
}
