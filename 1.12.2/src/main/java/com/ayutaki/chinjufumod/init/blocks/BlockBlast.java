package com.ayutaki.chinjufumod.init.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBlast extends Block {

	public BlockBlast() {
		super(Material.ROCK);
        this.setTickRandomly(true);
		this.setHardness(0.1F);
		this.setResistance(10.0F);

	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);
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
	    super.updateTick(world, pos, state, random);

		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();

		if (true) {
			world.setBlockState(pos, Blocks.AIR.getDefaultState());
		}

		world.scheduleUpdate(new BlockPos(i, j, k), this, this.tickRate(world));
	}

	@Override
	public int tickRate(World world) {
		return 5;
	}

	/* tick処理で消せなかった時の保険。再ログイン時に消去する */
	public void onChunkLoad(World world, BlockPos pos) {
		world.setBlockState(pos, Blocks.AIR.getDefaultState());
	}

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Items.AIR;
    }

	/* 針で受けるダメージ値 */
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
        entityIn.attackEntityFrom(DamageSource.CACTUS, 7.0F);
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
		return BlockRenderLayer.CUTOUT;
	}

}
