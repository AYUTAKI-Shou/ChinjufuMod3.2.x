package com.ayutaki.chinjufumod.init.woods;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockIchohStairs extends BlockStairs {

	public BlockIchohStairs(String unlocalizedName, IBlockState state) {
		super(state);

		this.setHardness(2.0F);
		this.setResistance(10.0F);

		this.useNeighborBrightness = true;
	}

}
