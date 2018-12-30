package com.ayutaki.chinjufumod.handlers;

import com.ayutaki.chinjufumod.init.recipes.CraftingChinjufuMod;
import com.ayutaki.chinjufumod.init.recipes.CraftingChinjufuWood;
import com.ayutaki.chinjufumod.init.recipes.SmeltingChinjufuMod;

public class RecipeHandler {

	/* 作業台レシピの登録 Register craft recipe.*/
	public static void registerCraftingRecipes() {

		CraftingChinjufuMod.register();
		CraftingChinjufuWood.register();
	}


	/* かまどレシピの登録 Register smelting recipe.*/
	public static void registerSmeltingRecipes() {

		SmeltingChinjufuMod.register();
	}

}
