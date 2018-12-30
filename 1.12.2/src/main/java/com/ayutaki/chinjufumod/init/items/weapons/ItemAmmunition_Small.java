package com.ayutaki.chinjufumod.init.items.weapons;

import com.ayutaki.chinjufumod.entity.EntityAmmunition_Small;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAmmunition_Small extends ItemArrow {

	public ItemAmmunition_Small() {
		super();
	}

	public EntityArrow createArrow(World world, ItemStack itemstack, EntityLivingBase shooter) {
		return new EntityAmmunition_Small(world, shooter);
	}

}
