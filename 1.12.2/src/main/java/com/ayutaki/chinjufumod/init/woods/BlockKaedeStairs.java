package com.ayutaki.chinjufumod.init.woods;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockKaedeStairs extends BlockStairs {

	public BlockKaedeStairs(String unlocalizedName, IBlockState state) {
		super(state);

		this.setHardness(2.0F);
		this.setResistance(10.0F);

		this.useNeighborBrightness = true;
	}

}
