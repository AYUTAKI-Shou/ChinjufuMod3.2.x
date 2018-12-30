package com.ayutaki.chinjufumod.init.woods;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockSakura_SlabHalf extends BlockSakura_Slab {

	public BlockSakura_SlabHalf(String unlocalizedName) {
		super(unlocalizedName);
		setCreativeTab(ChinjufuModTabs.tab_seasonal);
	}

	@Override
	public boolean isDouble() {
		return false;
	}

}