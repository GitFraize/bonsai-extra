package ru.vueproject.bonsaiextra;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.*;

public class BlockRegisterer {
    public static Block redSoil = new SoilBlock("redsoil");
    public static Block orangeSoil = new SoilBlock("orangesoil");
    public static Block greenSoil = new SoilBlock("greensoil");
    public static Block purpleSoil = new SoilBlock("purplesoil");

    public static void register() {
        setRegister(redSoil);
        setRegister(orangeSoil);
        setRegister(greenSoil);
        setRegister(purpleSoil);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        setRender(redSoil);
        setRender(orangeSoil);
        setRender(greenSoil);
        setRender(purpleSoil);
    }

    private static void setRegister(Block block) {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Block block) {
    	Minecraft
    	.getMinecraft()
    	.getRenderItem()
    	.getItemModelMesher()
    	.register(Item.getItemFromBlock(block), 0, 
    			new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
