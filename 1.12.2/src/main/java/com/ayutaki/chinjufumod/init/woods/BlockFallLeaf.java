package com.ayutaki.chinjufumod.init.woods;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.init.ASDecoModWoods;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFallLeaf extends Block {

	public BlockFallLeaf() {
		super(Material.GROUND);

		this.setSoundType(SoundType.PLANT);
		this.setHardness(1.0F);
		this.setResistance(5.0F);

		this.setTickRandomly(true);

	}

	/* 時間経過による隣接ブロックへの侵食 */
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {

		if (!worldIn.isRemote) {

			/** pos.upが暗いと土ブロックになる **/
			if (worldIn.getLightFromNeighbors(pos.up()) < 4 && worldIn.getBlockState(pos.up()).getLightOpacity(worldIn, pos.up()) > 2) {
				worldIn.setBlockState(pos, Blocks.DIRT.getDefaultState());
			}

			else {

				if (worldIn.getLightFromNeighbors(pos.up()) >= 9) {

					for (int i = 0; i < 4; ++i) {
						BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);

						if (blockpos.getY() >= 0 && blockpos.getY() < 256 && !worldIn.isBlockLoaded(blockpos)) {
							return;
						}

						IBlockState iblockstate = worldIn.getBlockState(blockpos.up());
						IBlockState iblockstate1 = worldIn.getBlockState(blockpos);

						/** 付近の土ブロックを落ち葉ブロックに変える **/
						if (iblockstate1.getBlock() == Blocks.DIRT && iblockstate1.getValue(BlockDirt.VARIANT) == BlockDirt.DirtType.DIRT && worldIn.getLightFromNeighbors(blockpos.up()) >= 4 && iblockstate.getLightOpacity(worldIn, pos.up()) <= 2) {
							worldIn.setBlockState(blockpos, ASDecoModWoods.FALL_LEAF.getDefaultState());
						}
					}
				}
			}
		}
	}

	/* ドロップアイテムは DIRT */
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(Blocks.DIRT);
	}

	/* バイオーム生成時に、木や草が生えるようにする */
	@Override
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos,
			EnumFacing direction, net.minecraftforge.common.IPlantable plantable) {
		return true;
	}

	@Override
	public void onPlantGrow(IBlockState state, World world, BlockPos pos, BlockPos source) { }

	/* シャベルでGRASS_PATH */
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing,
			float hitX, float hitY, float hitZ) {

		ItemStack itemstack = playerIn.getHeldItem(hand);
		Item item = itemstack.getItem();

		/** && かつ  || または **/
		if (item == Items.DIAMOND_SHOVEL || item == Items.GOLDEN_SHOVEL || item == Items.IRON_SHOVEL || item == Items
				.STONE_SHOVEL || item == Items.WOODEN_SHOVEL) {

			((EntityLivingBase) playerIn).playSound(SoundEvents.ITEM_SHOVEL_FLATTEN, 1F, 1F);
			return worldIn.setBlockState(pos,Blocks.GRASS_PATH.getDefaultState());
	 	}

		else if (itemstack.isEmpty()){

			((EntityLivingBase) playerIn).playSound(SoundEvents.BLOCK_GRASS_HIT, 1F, 1F);
			return worldIn.setBlockState(pos,Blocks.DIRT.getDefaultState());
	 	}

		/** モンスターわきのためにfalse **/
		return false;
	}

	/* モンスターをSpawnするようにする */
	@Override
	public boolean canCreatureSpawn(IBlockState state, IBlockAccess world, BlockPos pos,
			net.minecraft.entity.EntityLiving.SpawnPlacementType type) {
		return true;
	}

	/* 描画関連 */
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.tile.block_fall_leaf.name", meta));
	}

}
