package com.ayutaki.chinjufumod.init.woods;

import java.util.Random;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.entity.EntityFallOakKare;
import com.ayutaki.chinjufumod.init.ASDecoModWoods;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOakKare_leaf extends BlockLeaves {

	public static final PropertyBool DECAYABLE = PropertyBool.create("decayable");
	public static final PropertyBool CHECK_DECAY = PropertyBool.create("check_decay");

	public BlockOakKare_leaf() {
		super();
		setDefaultState(blockState.getBaseState()
				.withProperty(CHECK_DECAY, Boolean.valueOf(true))
				.withProperty(DECAYABLE, Boolean.valueOf(true)));

		this.setSoundType(SoundType.PLANT);
		this.setHardness(0.1F);
		this.setResistance(0.1F);
		this.setLightOpacity(1);
	}

	/* IDが同じで、メタデータ値が異なるブロックのリストを返す */
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		items.add(new ItemStack(this));
	}

	/* シルクタッチを使ったときの処理 */
	@Override
	protected ItemStack getSilkTouchDrop(IBlockState state) {
		return new ItemStack(Item.getItemFromBlock(this));
	}

	/* デフォルトのメタデータ値を呼び出し */
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(DECAYABLE, Boolean.valueOf((meta & 4) == 0))
				.withProperty(CHECK_DECAY, Boolean.valueOf((meta & 8) > 0));
	}

	/* メタデータ値を拾う */
	@Override
	public int getMetaFromState(IBlockState state) {
		int i = 0;

		if (!state.getValue(DECAYABLE).booleanValue()) {
			i |= 4;
		}
		if (state.getValue(CHECK_DECAY).booleanValue()) {
			i |= 8;
		}
		return i;
	}

	/* メタデータ値として CHECK_DECAY, DECAYABLE を設ける */
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {CHECK_DECAY, DECAYABLE});
	}

	/* ドロップアイテムに適用するメタデータ値 */
	@Override
	public int damageDropped(IBlockState state) {
		return 0;
	}

	/* ハサミで回収できるようにする */
	@Override
	public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos,
			IBlockState state, @Nullable TileEntity te, ItemStack stack) {

		if (!worldIn.isRemote && stack.getItem() == Items.SHEARS) {
			player.addStat(StatList.getBlockStats(this));
		}
		else {
			super.harvestBlock(worldIn, player, pos, state, te, stack);
		}

	}

	/* ハサミで回収したときの数？ */
	@Override
	public NonNullList<ItemStack> onSheared(ItemStack item,
			net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
		return NonNullList.withSize(1, new ItemStack(this));
	}

	@Override
	public EnumType getWoodType(int meta) {
		return null;
	}

	/* アイテムドロップ */
	protected int getSaplingDropChance(IBlockState state) {
		return 20;
	}

	@Override
	public java.util.List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {

		java.util.List<ItemStack> stack = new java.util.ArrayList<ItemStack>();
		Random rand = world instanceof World ? ((World)world).rand : new Random();
		int chance = this.getSaplingDropChance(state);

		if (fortune > 0) {

			chance -= 20 << fortune;
			if (chance < 20) chance = 20;
		}

		if (rand.nextInt(chance) == 0)
			stack.add(new ItemStack(ASDecoModWoods.OAKKARE_nae, 1, damageDropped(state)));

		if (rand.nextInt(chance) == 0)
			stack.add(new ItemStack(Blocks.SAPLING, 1, damageDropped(state)));

		if (rand.nextInt(chance) == 0)
			stack.add(new ItemStack(Items.APPLE, 1, damageDropped(state)));

		return stack;
	}

	/* 描画関連 */
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	/* 落葉 */
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random rand) {

		if (rand.nextInt(200) != 0) {
			return;
		}

		if (world.isAirBlock(pos.down())) {
			EntityFallOakKare petal = new EntityFallOakKare(world);
			petal.setPosition(pos.getX() + rand.nextFloat(), pos.getY(), pos.getZ() + rand.nextFloat());

			world.spawnEntity(petal);
		}
	}

	/* プレイヤーが設置したときは消失しない */
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
		if (placer != null) {
			worldIn.setBlockState(pos, state.withProperty(DECAYABLE, Boolean.valueOf(false)), 4);
		}
	}

}
