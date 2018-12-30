package com.ayutaki.chinjufumod.init.wallpane;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockRockStairs_and extends BlockStairs {

	public BlockRockStairs_and(String unlocalizedName, IBlockState state) {
		super(state);

		this.setHardness(2.0F);
		this.setResistance(10.0F);

		this.useNeighborBrightness = true;
	}

}
