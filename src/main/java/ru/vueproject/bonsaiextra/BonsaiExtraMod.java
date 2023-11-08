package ru.vueproject.bonsaiextra;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.*;

@Mod(
	modid = "bonsaiextra", 
	name = "Bonsai Extra",
	version = "1.0",
	acceptedMinecraftVersions = "[1.12.2]",
	modLanguage = "java")
public class BonsaiExtraMod {
	public static final CreativeTabs CTAB = new CreativeTabs("bonsaiextra") {
	    @Override
	    public ItemStack getTabIconItem() {
	        return new ItemStack(new ItemBlock(BlockRegisterer.purpleSoil));
	    }
	};
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Какой-то код
		BlockRegisterer.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // Какой-то код
    	BlockRegisterer.registerRender();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // Какой-то код
    }
}
