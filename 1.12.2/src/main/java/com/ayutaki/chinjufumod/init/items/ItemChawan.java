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

/* 茶碗は、Minecraftのアイテムを拡張したクラス
* ItemChawan is a class that extends Item of Minecraft. */
public class ItemChawan extends Item {

	public ItemChawan() {
		super();

	}

	/* Tipsの追加 Add tips. */
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World playerIn,
			List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.item.item_food_chawan.name", meta));
	}
}
