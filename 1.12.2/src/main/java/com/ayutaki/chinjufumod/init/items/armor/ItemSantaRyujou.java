package com.ayutaki.chinjufumod.init.items.armor;

import com.ayutaki.chinjufumod.init.ChinjufuModArmor;
import com.ayutaki.chinjufumod.init.ChinjufuModArmorMaterial;

import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemSantaRyujou extends ItemArmor {

	public ItemSantaRyujou(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(ChinjufuModArmorMaterial.RYUJOUSANTA, renderIndexIn, equipmentSlotIn);

	}

	/* 金床で修理可能 */
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {

		int k;
		k = repair.getMetadata();

		if(this == ChinjufuModArmor.RYUJOUSANTA_BOOTS) {

			if(k == 15) {
				return (repair.getItem() == Item.getItemFromBlock(Blocks.CARPET)); }

			if(k != 15) { return false;}
		}

		if(k == 14) {
			return (repair.getItem() == Item.getItemFromBlock(Blocks.CARPET)); }

		return false;
	}
}
