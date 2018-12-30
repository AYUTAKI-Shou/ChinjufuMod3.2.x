package com.ayutaki.chinjufumod.init.items.foods;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodWataame_yellow extends ItemFood {

	public ItemFoodWataame_yellow(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);

		this.setAlwaysEdible();
	}

	/* 食べ終わった時の処理 */
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {

		/** ポーションエフェクト の追加 **/
		if (!worldIn.isRemote) {
			/* 1秒＝20 綿菓子は ×50=1000 */
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 1000, 0));
		}

		/** アイテムを返す **/
		if (player == null || !player.capabilities.isCreativeMode) {

			if (stack.isEmpty()) {
				player.inventory.addItemStackToInventory(new ItemStack(Items.STICK));
			}

			else if (!player.inventory.addItemStackToInventory(new ItemStack(Items.STICK))) {
				player.dropItem(new ItemStack(Items.STICK), false);
			}
		}
	}

}
