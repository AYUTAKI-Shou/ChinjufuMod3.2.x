package com.ayutaki.chinjufumod.init.blocks;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockKusaTaba_Stairs extends BlockStairs {

	public BlockKusaTaba_Stairs(String unlocalizedName, IBlockState state) {
		super(state);

		this.setRegistryName(unlocalizedName);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_seasonal);

		this.setHardness(0.5F);
		this.setResistance(5.0F);

		this.useNeighborBrightness = true;
	}

}
