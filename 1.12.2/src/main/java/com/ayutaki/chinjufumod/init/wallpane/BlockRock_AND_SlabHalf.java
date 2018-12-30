package com.ayutaki.chinjufumod.init.wallpane;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

public class BlockRock_AND_SlabHalf extends BlockRock_AND_Slab {

	public BlockRock_AND_SlabHalf(String unlocalizedName) {
		super(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_wallpanel);
	}

	@Override
	public boolean isDouble() {
		return false;
	}

}