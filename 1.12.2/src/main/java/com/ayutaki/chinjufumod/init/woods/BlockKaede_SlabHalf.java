package com.ayutaki.chinjufumod.init.woods;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockKaede_SlabHalf extends BlockKaede_Slab {

	public BlockKaede_SlabHalf(String unlocalizedName) {
		super(unlocalizedName);
		setCreativeTab(ChinjufuModTabs.tab_seasonal);
	}

	@Override
	public boolean isDouble() {
		return false;
	}

}