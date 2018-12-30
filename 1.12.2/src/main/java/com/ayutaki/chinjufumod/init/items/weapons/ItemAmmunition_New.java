package com.ayutaki.chinjufumod.init.items.weapons;

import com.ayutaki.chinjufumod.init.items.kansaiki.ExtendedItem;

public class ItemAmmunition_New extends ExtendedItem {

	public ItemAmmunition_New() {
		super();
		setMaxStackSize(64);
		setUnlocalizedName("ammo_new");
	}

	@Override
	public boolean isWeapon() {
		return false;
	}

}
