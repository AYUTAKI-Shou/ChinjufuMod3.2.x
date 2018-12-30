package com.ayutaki.chinjufumod.init.blocks;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockKusaTaba extends BlockFacingSapo {

	public static final PropertyInteger COR = PropertyInteger.create("cor", 1, 2);

	public BlockKusaTaba(String unlocalizedName) {
		super(Material.PLANTS);

		this.setRegistryName(unlocalizedName);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_seasonal);

		this.setHardness(0.5F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.PLANT);

		setDefaultState(this.blockState.getBaseState()
				.withProperty(FACING, EnumFacing.NORTH)
				.withProperty(COR, Integer.valueOf(1)));
	}

	/* ブロック遷移 */
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

		ItemStack itemstack = playerIn.getHeldItem(hand);

		if (playerIn.isSneaking()) {

			if (!itemstack.isEmpty()) {
				return false;
			}

			else {
				worldIn.playSound(null, pos, SoundEvents.BLOCK_GRASS_PLACE, SoundCategory.BLOCKS, 1.0F, 0.8F);
				worldIn.setBlockState(pos, state.cycleProperty(COR), 2);
				return true;
			}

		}
		return false;
	}

	protected int getLog(IBlockState state) {
		return ((Integer)state.getValue(COR)).intValue() * 2;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta))
				.withProperty(COR, Integer.valueOf(1 + (meta >> 2)));
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		int i = 0;
		i = i | ((EnumFacing)state.getValue(FACING)).getHorizontalIndex();
		i = i | ((Integer)state.getValue(COR)).intValue() - 1 << 2;
		return i;
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { FACING, COR });
	}


}
