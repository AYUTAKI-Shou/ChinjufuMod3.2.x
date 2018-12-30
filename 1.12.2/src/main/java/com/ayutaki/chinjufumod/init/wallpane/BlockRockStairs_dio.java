package com.ayutaki.chinjufumod.init.wallpane;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockRockStairs_dio extends BlockStairs {

	public BlockRockStairs_dio(String unlocalizedName, IBlockState state) {
		super(state);

		this.setHardness(2.0F);
		this.setResistance(10.0F);

		this.useNeighborBrightness = true;
	}

}
