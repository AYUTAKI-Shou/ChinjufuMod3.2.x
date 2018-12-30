package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModWoods;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingChinjufuWood {

	public CraftingChinjufuWood() {
		register();
	}

	public static void register() {

		/* GameRegistry.addShapedRecipe(name, group, output, params); */
		/* オーク材にする */
		GameRegistry.addShapedRecipe(new ResourceLocation("sakura_to_oak"),
				new ResourceLocation("chinjufumod"),
				new ItemStack(Blocks.PLANKS, 1, 0), new Object[]{
						"X",
						'X', ASDecoModWoods.SAKURA_planks
		});

		GameRegistry.addShapedRecipe(new ResourceLocation("ichoh_to_oak"),
				new ResourceLocation("chinjufumod"),
				new ItemStack(Blocks.PLANKS, 1, 0), new Object[]{
						"X",
						'X', ASDecoModWoods.ICHOH_planks
		});

		GameRegistry.addShapedRecipe(new ResourceLocation("kaede_to_oak"),
				new ResourceLocation("chinjufumod"),
				new ItemStack(Blocks.PLANKS, 1, 0), new Object[]{
						"X",
						'X', ASDecoModWoods.KAEDE_planks
		});
	}

}
