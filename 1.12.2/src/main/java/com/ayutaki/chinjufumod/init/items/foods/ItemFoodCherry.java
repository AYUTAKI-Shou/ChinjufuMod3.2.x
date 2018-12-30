package com.ayutaki.chinjufumod.init.items.foods;

import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFoodCherry extends ItemFood {

	public ItemFoodCherry(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);

		this.setAlwaysEdible();
	}

	/* 食べ終わった時の処理 */
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {

		/** アイテムを返す **/
		if (player == null || !player.capabilities.isCreativeMode) {

			if (stack.isEmpty()) {
				player.inventory.addItemStackToInventory(new ItemStack(TTimeItems.SEEDS_CHERRY));
			}

			else if (!player.inventory.addItemStackToInventory(new ItemStack(TTimeItems.SEEDS_CHERRY))) {
				player.dropItem(new ItemStack(TTimeItems.SEEDS_CHERRY), false);
			}
		}
	}

}
