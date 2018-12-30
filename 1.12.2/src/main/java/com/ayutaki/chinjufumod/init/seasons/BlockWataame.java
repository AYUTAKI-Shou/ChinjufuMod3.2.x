package com.ayutaki.chinjufumod.init.seasons;

import java.util.List;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.util.CollisionHelper;
import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockWataame extends Block {

	public static final PropertyDirection FACING = PropertyDirection.create("facing", new Predicate<EnumFacing>() {

		public boolean apply(@Nullable EnumFacing p_apply_1_) {
			return p_apply_1_ != EnumFacing.DOWN;
		}
	});

	private static final AxisAlignedBB TORCH_NORTH_AABB = CollisionHelper.getBlockBounds(EnumFacing.NORTH, 0.1875D, 0.0D, 0.1875D, 0.8125D, 0.875D, 0.8125D);
	private static final AxisAlignedBB TORCH_EAST_AABB = CollisionHelper.getBlockBounds(EnumFacing.EAST, 0.1875D, 0.0D, 0.1875D, 0.8125D, 0.875D, 0.8125D);
	private static final AxisAlignedBB TORCH_SOUTH_AABB = CollisionHelper.getBlockBounds(EnumFacing.SOUTH, 0.1875D, 0.0D, 0.1875D, 0.8125D, 0.875D, 0.8125D);
	private static final AxisAlignedBB TORCH_WEST_AABB = CollisionHelper.getBlockBounds(EnumFacing.WEST, 0.1875D, 0.0D, 0.1875D, 0.8125D, 0.875D, 0.8125D);
	protected static final AxisAlignedBB STANDING_AABB = new AxisAlignedBB(0.1875D, 0.125D, 0.1875D, 0.8125D, 1.0D, 0.8125D);

	public BlockWataame() {
		super(Material.WOOD);

		this.setSoundType(SoundType.WOOD);
		this.setHardness(1.0F);
		this.setResistance(5.0F);

		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP));
	}

	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {

		switch ((EnumFacing)state.getValue(FACING)) {
			case EAST:
				return TORCH_EAST_AABB;
			case WEST:
				return TORCH_WEST_AABB;
			case SOUTH:
				return TORCH_SOUTH_AABB;
			case NORTH:
				return TORCH_NORTH_AABB;
			default:
				return STANDING_AABB;
		}
	}

	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	public boolean isFullCube(IBlockState state) {
		return false;
	}

	private boolean canPlaceOn(World worldIn, BlockPos pos) {
		IBlockState state = worldIn.getBlockState(pos);
		return state.getBlock().canPlaceTorchOnTop(state, worldIn, pos);
	}

	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {

		for (EnumFacing enumfacing : FACING.getAllowedValues()) {

			if (this.canPlaceAt(worldIn, pos, enumfacing)) {
				return true;
			}
		}
		return false;
	}

	private boolean canPlaceAt(World worldIn, BlockPos pos, EnumFacing facing) {

		BlockPos blockpos = pos.offset(facing.getOpposite());
		IBlockState iblockstate = worldIn.getBlockState(blockpos);
		Block block = iblockstate.getBlock();
		BlockFaceShape blockfaceshape = iblockstate.getBlockFaceShape(worldIn, blockpos, facing);

		if (facing.equals(EnumFacing.UP) && this.canPlaceOn(worldIn, blockpos)) {
			return true;
		}

		else if (facing != EnumFacing.UP && facing != EnumFacing.DOWN) {
			return !isExceptBlockForAttachWithPiston(block) && blockfaceshape == BlockFaceShape.SOLID;
		}

		else {
			return false;
		}
	}

	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing,
			float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {

		if (this.canPlaceAt(worldIn, pos, facing)) {
			return this.getDefaultState().withProperty(FACING, facing);
		}

		else {

			for (EnumFacing enumfacing : EnumFacing.Plane.HORIZONTAL) {

				if (this.canPlaceAt(worldIn, pos, enumfacing)) {
					return this.getDefaultState().withProperty(FACING, enumfacing);
				}
			}
			return this.getDefaultState();
		}
	}


	public IBlockState getStateFromMeta(int meta) {
		IBlockState iblockstate = this.getDefaultState();

		switch (meta) {
			case 1:
				iblockstate = iblockstate.withProperty(FACING, EnumFacing.EAST);
				break;
			case 2:
				iblockstate = iblockstate.withProperty(FACING, EnumFacing.WEST);
				break;
			case 3:
				iblockstate = iblockstate.withProperty(FACING, EnumFacing.SOUTH);
				break;
			case 4:
				iblockstate = iblockstate.withProperty(FACING, EnumFacing.NORTH);
				break;
			case 5:
			default:
				iblockstate = iblockstate.withProperty(FACING, EnumFacing.UP);
		}
		return iblockstate;
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	public int getMetaFromState(IBlockState state) {
		int i = 0;

		switch ((EnumFacing)state.getValue(FACING)) {
			case EAST:
				i = i | 1;
				break;
			case WEST:
				i = i | 2;
				break;
			case SOUTH:
				i = i | 3;
				break;
			case NORTH:
				i = i | 4;
				break;
			case DOWN:
			case UP:
			default:
				i = i | 5;
		}
		return i;
	}

	public IBlockState withRotation(IBlockState state, Rotation rot) {
		return state.withProperty(FACING, rot.rotate((EnumFacing)state.getValue(FACING)));
	}

	public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
		return state.withRotation(mirrorIn.toRotation((EnumFacing)state.getValue(FACING)));
	}

	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {FACING});
	}

	public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
		return BlockFaceShape.UNDEFINED;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.tile.block_wataame.name", meta));
	}

}
