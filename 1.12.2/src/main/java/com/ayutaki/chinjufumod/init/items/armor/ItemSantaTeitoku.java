package com.ayutaki.chinjufumod.init.items.armor;

import com.ayutaki.chinjufumod.init.ChinjufuModArmor;
import com.ayutaki.chinjufumod.init.ChinjufuModArmorMaterial;

import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemSantaTeitoku extends ItemArmor {

	public ItemSantaTeitoku(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(ChinjufuModArmorMaterial.TEITOKUSANTA, renderIndexIn, equipmentSlotIn);

	}

	/* 金床で修理可能 */
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {

		int k;
		k = repair.getMetadata();

		if(this == ChinjufuModArmor.TEITOKUSANTA_BOOTS) {

			if(k == 15) {
				return (repair.getItem() == Item.getItemFromBlock(Blocks.CARPET)); }

			if(k != 15) { return false;}
		}

		if(k == 14) {
			return (repair.getItem() == Item.getItemFromBlock(Blocks.CARPET)); }

		return false;
	}
}
