package com.ayutaki.chinjufumod.init.woods;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockSakuraStairs extends BlockStairs {

	public BlockSakuraStairs(String unlocalizedName, IBlockState state) {
		super(state);

		this.setHardness(2.0F);
		this.setResistance(10.0F);

		this.useNeighborBrightness = true;
	}

}
