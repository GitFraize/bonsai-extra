package ru.vueproject.bonsaiextra;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;

public class CraftingRegisterer {
	public static void register() {
        registerRecipes("orangesoil");
        registerRecipes("redsoil");
        registerRecipes("greensoil");
        registerRecipes("purplesoil");
    }

    private static void registerRecipes(String name) {
        CraftingHelper.register(new ResourceLocation("bonsaiextra", name), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
    }
}
