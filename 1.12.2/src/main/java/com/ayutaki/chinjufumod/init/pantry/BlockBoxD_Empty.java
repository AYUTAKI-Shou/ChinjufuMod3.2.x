package com.ayutaki.chinjufumod.init.pantry;

import com.ayutaki.chinjufumod.init.ASDecoModPantry;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockBoxD_Empty extends BlockBox_Empty {

	public BlockBoxD_Empty(String unlocalizedName) {
		super(unlocalizedName);
	}

	@Override
	public boolean isDouble() {
		return true;
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world,
			BlockPos pos, EntityPlayer player) {
		return new ItemStack(ASDecoModPantry.BOX_H_EMPTY);
	}

}
