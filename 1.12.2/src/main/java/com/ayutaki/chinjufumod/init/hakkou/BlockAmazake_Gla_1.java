package com.ayutaki.chinjufumod.init.hakkou;

import com.ayutaki.chinjufumod.handlers.SoundsHandler;
import com.ayutaki.chinjufumod.init.ASDecoModHakkou;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockAmazake_Gla_1 extends Block {

	public BlockAmazake_Gla_1() {
		super(Material.WOOD);

		/*湯呑み*/
		this.setSoundType(SoundType.STONE);
		this.setHardness(1.0F);
		this.setResistance(1.0F);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing,
			float hitX, float hitY, float hitZ) {

		ItemStack itemstack = playerIn.getHeldItem(hand);

		/*素手での時だけ飲むようにする*/
		if (!itemstack.isEmpty()) {
			return true;
		}

		else if (itemstack.isEmpty()) {
			/* 1秒＝20 酒は ×60=1200 */
			((EntityLivingBase) playerIn).addPotionEffect(new PotionEffect(MobEffects.HASTE, 1000, 0));

			worldIn.playSound(null, pos, SoundsHandler.GOKU, SoundCategory.PLAYERS, 1.0F, 1.0F);
			return worldIn.setBlockState(pos, ASDecoModHakkou.AMAZAKEGLA_2.getDefaultState());
		}
		return true;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(0.4375D, 0.0D, 0.4375D, 0.5625D, 0.15625D, 0.5625D);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
	    return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
	    return false;
	}

}
