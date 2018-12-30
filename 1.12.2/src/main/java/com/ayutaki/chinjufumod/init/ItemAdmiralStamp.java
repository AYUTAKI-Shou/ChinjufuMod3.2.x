package com.ayutaki.chinjufumod.init.items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemAdmiralStamp extends Item {

	public ItemAdmiralStamp() {
		super();

		/** アイテムのスタック数 **/
		this.setMaxStackSize(1);

		/** アイテムの耐久値 **/
		this.setMaxDamage(15);
	}

	/* 耐久値を持たせるために ContainerItemStack を呼び出す
	 * Call ContainerItemStack to have damage value. */
	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}

	/* クラフト後の処理 Processing after craft */
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {

		/** 残り耐久値とダメージが一致したときは、アイテムが消える
		 *  Remaining durable value and damage are equal, the item disappears. **/
		if (itemStack.getMaxDamage() == itemStack.getItemDamage()) {
			return ItemStack.EMPTY;
		}

		/** それ以外は、ダメージを与えたアイテムを返す
		 * Otherwise, return items that damaged **/
		else {
			ItemStack newItemStack = itemStack.copy();
			newItemStack.setItemDamage(itemStack.getItemDamage() + 1);
			return newItemStack;
		}
	}

	/* Tipsの追加 Add tips. */
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World playerIn,
			List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.item.item_admiral_stamp.name", meta));
	}
}
