package com.ayutaki.chinjufumod.init.furnitures;

import com.ayutaki.chinjufumod.tileentity.TileEntityTansu;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ILockableContainer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockTansu extends BlockContainer {

	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	public BlockTansu() {
		super(Material.WOOD);
		this.setHardness(1.0F);
		this.setResistance(10.0F);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));

		this.setSoundType(SoundType.WOOD);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return true;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return true;
	}

	/* チェストに使うRenderType */
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {}

	/* チェストとの隣接 */
	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		return true;
	}

	/* TileEntityを返す */
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityTansu();
	}

	/* 右クリックをした時の処理 */
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

		ILockableContainer ilockablecontainer = (TileEntityTansu)worldIn.getTileEntity(pos);

		EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);
		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();

		switch (enumfacing) {

			case EAST:
				if (worldIn.getBlockState(new BlockPos(i + 1, j, k)).getBlock() == Blocks.AIR) {
					playerIn.displayGUIChest(ilockablecontainer);
				}
				else {
					return true;
				}

			case NORTH:
			default:
				if (worldIn.getBlockState(new BlockPos(i, j, k - 1)).getBlock() == Blocks.AIR) {
					playerIn.displayGUIChest(ilockablecontainer);
				}
				else {
					return true;
				}

			case SOUTH:
				if (worldIn.getBlockState(new BlockPos(i, j, k + 1)).getBlock() == Blocks.AIR) {
					playerIn.displayGUIChest(ilockablecontainer);
				}
				else {
					return true;
				}

			case WEST:
				if (worldIn.getBlockState(new BlockPos(i - 1, j, k)).getBlock() == Blocks.AIR) {
					playerIn.displayGUIChest(ilockablecontainer);
				}
				else {
					return true;
				}
		}
		return true;
	}

	@Override
	public boolean hasComparatorInputOverride(IBlockState state) {
		return true;
	}

	/* チェストを壊した時の処理 */
	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasCustomBreakingProgress(IBlockState state) {
		return true;
	}

	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		TileEntity tileentity = worldIn.getTileEntity(pos);

		if (tileentity instanceof IInventory) {
			InventoryHelper.dropInventoryItems(worldIn, pos, (IInventory)tileentity);
			worldIn.updateComparatorOutputLevel(pos, this);
		}
		super.breakBlock(worldIn, pos, state);
	}

	/*getOppositeでプレイヤーの向きを取得*/
	@Override
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}

	/*IBlockStateからItemStackのmetadataを生成。ドロップ時とテクスチャ・モデル参照時に呼ばれる。*/
	@Override
	public int getMetaFromState(IBlockState state) {
		return ((EnumFacing) state.getValue(FACING)).getHorizontalIndex();
	}

	/*ItemStackのmetadataからIBlockStateを生成。設置時に呼ばれる。*/
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
	}

	/*初期BlockStateContainerの生成。*/
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { FACING });
	}
}
