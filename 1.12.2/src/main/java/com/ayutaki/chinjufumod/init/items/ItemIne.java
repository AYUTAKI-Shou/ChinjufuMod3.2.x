package com.ayutaki.chinjufumod.init.items;

import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.item.Item;

public class ItemIne extends Item {

	public ItemIne() {
		super();

        this.setMaxStackSize(64);
        this.setContainerItem(TTimeItems.INEWARA);
	}

}
