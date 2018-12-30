package com.ayutaki.chinjufumod.init.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.init.ChinjufuModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockWakeWater1 extends Block {

	public BlockWakeWater1() {
		super(Material.GLASS);

		this.setHardness(0.1F);
		this.setResistance(500.0F);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.00625D, 1.0D);
	}

	/* 時間経過で消える */
	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();

		world.scheduleUpdate(new BlockPos(i, j, k), this, this.tickRate(world));

	}

	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();

		if (true) {
			world.setBlockState(pos, ChinjufuModBlocks.WAKE_WATER2.getDefaultState());
		}

		world.scheduleUpdate(new BlockPos(i, j, k), this, this.tickRate(world));
	}

	@Override
	public int tickRate(World world) {
		/* 0.5秒 */
		return 10;
	}

	/* tick処理で消せなかった時の保険。再ログイン時に消去する */
	public void onChunkLoad(World world, BlockPos pos) {
		world.setBlockState(pos, Blocks.AIR.getDefaultState());
	}

	/* 航跡エフェクト */
	@Override
	public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random) {

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		World par1World = world;
		int par2 = i;
		int par3 = j;
		int par4 = k;
		Random par5Random = random;
		if (true)
			/*la < 4 量*/
			for (int la = 0; la < 10; ++la) {
				/* 1.5F 消える速度？ 0.5D 範囲*/
				double d0 = (double) ((float) par2) + (double) (par5Random.nextFloat() - 1.5F) * 0.4D;
				double d1 = (double) ((float) par3) + (double) (par5Random.nextFloat() - 1.5F) * 0.4D;
				double d2 = (double) ((float) par4) + (double) (par5Random.nextFloat() - 1.5F) * 0.4D;

				par1World.spawnParticle(EnumParticleTypes.CLOUD, d0 + 0.9D, d1 + 0.00D, d2 + 0.9D, 0.0D, 0.0D, 0.0D);
		}
	}

	/*水を汲む邪魔をしないための措置*/
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

		ItemStack itemstack = playerIn.getHeldItem(hand);
		Item item = itemstack.getItem();

		/*水を汲む*/
		if (item == Items.BUCKET) {

				/*指定のアイテムを1個消費*/
				itemstack.shrink(1);
				worldIn.playSound((EntityPlayer)null, pos, SoundEvents.ITEM_BUCKET_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

				if (itemstack.isEmpty()) {
					((EntityPlayer) playerIn).inventory
					.addItemStackToInventory(new ItemStack(Items.WATER_BUCKET));
				}
				else if (!playerIn.inventory.addItemStackToInventory(new ItemStack(Items.WATER_BUCKET))) {
					playerIn.dropItem(new ItemStack(Items.WATER_BUCKET), false);
				}
			return true;
		}

		/*大釜(Cauldron)から引用*/
		else if (item == Items.GLASS_BOTTLE) {

			ItemStack itemstack3 = PotionUtils.addPotionToItemStack(new ItemStack(Items.POTIONITEM), PotionTypes.WATER);
			itemstack.shrink(1);
			worldIn.playSound((EntityPlayer)null, pos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

				if (!playerIn.inventory.addItemStackToInventory(itemstack3)) {
					playerIn.dropItem(itemstack3, false);
				}
				else if (playerIn instanceof EntityPlayerMP) {
					((EntityPlayerMP)playerIn).sendContainerToPlayer(playerIn.inventoryContainer);
				}
			return true;
		}
		return true;
	}

	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Items.AIR;
	}

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
		return BlockRenderLayer.TRANSLUCENT;
	}

	 public SoundType getSoundType(IBlockState state, World world, BlockPos pos, @Nullable Entity entity) {
			return super.getSoundType(state, world, pos, entity);
	 }
}
