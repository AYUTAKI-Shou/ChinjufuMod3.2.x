package com.ayutaki.chinjufumod.init.woods;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockIchoh_SlabHalf extends BlockIchoh_Slab {

	public BlockIchoh_SlabHalf(String unlocalizedName) {
		super(unlocalizedName);
		setCreativeTab(ChinjufuModTabs.tab_seasonal);
	}

	@Override
	public boolean isDouble() {
		return false;
	}

}