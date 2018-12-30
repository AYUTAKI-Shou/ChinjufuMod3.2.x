package com.ayutaki.chinjufumod.init.tatami;

import java.util.List;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.init.ChinjufuModTabs;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockTatami_Y_Slab extends BlockFacingSapo {

	/*** 設置時の省力化のため仕様変更 ***/
	public static final PropertyEnum<BlockTatami_Y_Slab.EnumHalf> HALF =
			PropertyEnum.<BlockTatami_Y_Slab.EnumHalf>create("half", BlockTatami_Y_Slab.EnumHalf.class);
	protected static final AxisAlignedBB AABB_BOTTOM_HALF = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
	protected static final AxisAlignedBB AABB_TOP_HALF = new AxisAlignedBB(0.0D, 0.5D, 0.0D, 1.0D, 1.0D, 1.0D);

	public BlockTatami_Y_Slab(String unlocalizedName) {
		super(Material.WOOD);

		this.setRegistryName(unlocalizedName);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);

		this.setHardness(0.5F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.PLANT);

		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH)
				.withProperty(HALF, BlockTatami_Y_Slab.EnumHalf.BOTTOM));

	}

	/* TOP、BOTTOMに応じた当たり判定 */
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return state.getValue(HALF) == BlockTatami_Y_Slab.EnumHalf.TOP ? AABB_TOP_HALF : AABB_BOTTOM_HALF;
	}

	/* getOppositeでプレイヤーの向きを取得 */
	public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing,
			float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {

		IBlockState iblockstate = super.getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer);
		iblockstate = iblockstate.withProperty(FACING, placer.getHorizontalFacing());

		return facing != EnumFacing.DOWN && (facing == EnumFacing.UP || (double)hitY <= 0.5D) ? iblockstate
				.withProperty(HALF, BlockTatami_Y_Slab.EnumHalf.BOTTOM) : iblockstate.withProperty(HALF, BlockTatami_Y_Slab.EnumHalf.TOP);
	}

	/* ItemStackのmetadataからIBlockStateを生成。設置時に呼ばれる */
	public IBlockState getStateFromMeta(int meta) {
		IBlockState iblockstate = this.getDefaultState()
				.withProperty(HALF, (meta & 4) > 0 ? BlockTatami_Y_Slab.EnumHalf.TOP : BlockTatami_Y_Slab.EnumHalf.BOTTOM);

		iblockstate = iblockstate.withProperty(FACING, EnumFacing.getFront(5 - (meta & 3)));
		return iblockstate;
	}

	/* IBlockStateからItemStackのmetadataを生成。ドロップ時とテクスチャ・モデル参照時に呼ばれる */
	public int getMetaFromState(IBlockState state) {

		int i = 0;

		if (state.getValue(HALF) == BlockTatami_Y_Slab.EnumHalf.TOP) {
			i |= 4;
		}

		i = i | 5 - ((EnumFacing)state.getValue(FACING)).getIndex();
		return i;
	}

	/* 初期BlockStateContainerの生成 */
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { FACING, HALF });
	}

	public static enum EnumHalf implements IStringSerializable {
		TOP("top"),
		BOTTOM("bottom");

		private final String name;

		private EnumHalf(String name) {
			this.name = name;
		}

		public String toString() {
			return this.name;
		}

		public String getName() {
			return this.name;
		}
	}

	/* ドロップ管理 */
	protected boolean canSilkHarvest() {
		return false;
	}

	/* 描画 */
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.tile.block_tatami.name", meta));
	}

}
