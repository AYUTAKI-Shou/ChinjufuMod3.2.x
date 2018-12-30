package com.ayutaki.chinjufumod.init.items.weapons;

import com.ayutaki.chinjufumod.init.ASDecoModWoods;
import com.ayutaki.chinjufumod.init.ChinjufuModWeapons;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemSwordSakura extends ItemSword {

	@SuppressWarnings("unused")
	private final float attackDamage;
	@SuppressWarnings("unused")
	private final Item.ToolMaterial material;

	public ItemSwordSakura(ToolMaterial material) {
		super(material);
		/** WOOD(0, 59, 2.0F, 0.0F, 15), **/
		this.material = material;
		this.maxStackSize = 1;
		this.setMaxDamage(59);
		this.attackDamage = 3.0F + 0.0F;
	}

	/* レシピから作った際、ブーツにエンチャント付与するパターン
	 * 1.11以降はNBTTagCompoundが不要か？ */
	@Override
	public void onCreated(ItemStack itemstack, World world, EntityPlayer entity) {
		super.onCreated(itemstack, world, entity);

		if(this == ChinjufuModWeapons.SWORD_sakura) {
			itemstack.addEnchantment(Enchantments.FIRE_ASPECT, 2);
		}

		else { }
	}

	/* 金床で修理可能 */
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return (repair.getItem() == Item.getItemFromBlock(ASDecoModWoods.SAKURA_planks));
	}

}
