package com.ayutaki.chinjufumod.handlers;

import com.ayutaki.chinjufumod.init.ASDecoModWoods;
import com.ayutaki.chinjufumod.init.ASDecoModWallPane;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

@SuppressWarnings("deprecation")
public class FuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWoods.SAKURA_log))
			return 200; /* A full item would be 200 ticks */
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWoods.KAEDE_log))
			return 200;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWoods.ICHOH_log))
			return 200;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWoods.SAKURA_planks))
			return 200;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWoods.KAEDE_planks))
			return 200;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWoods.ICHOH_planks))
			return 200;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWoods.SAKURA_stairs))
			return 200;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWoods.KAEDE_stairs))
			return 200;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWoods.ICHOH_stairs))
			return 200;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWoods.SAKURA_SlabHalf))
			return 100;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWoods.KAEDE_SlabHalf))
			return 100;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWoods.ICHOH_SlabHalf))
			return 100;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWoods.SAKURA_PIL))
			return 200;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWoods.KAEDE_PIL))
			return 200;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWoods.ICHOH_PIL))
			return 200;

		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWallPane.PILLAR_aca))
			return 200;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWallPane.PILLAR_bir))
			return 200;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWallPane.PILLAR_doak))
			return 200;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWallPane.PILLAR_jun))
			return 200;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWallPane.PILLAR_oak))
			return 200;
		if (fuel.getItem() == Item.getItemFromBlock(ASDecoModWallPane.PILLAR_spru))
			return 200;

		return 0;
	}

}
