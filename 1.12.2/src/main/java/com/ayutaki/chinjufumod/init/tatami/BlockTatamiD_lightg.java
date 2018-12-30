package com.ayutaki.chinjufumod.init.tatami;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.init.ASDecoModTatami;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockTatamiD_lightg extends BlockFacingSapo {

	public BlockTatamiD_lightg(String unlocalizedName) {
		super(Material.WOOD);

		this.setRegistryName(unlocalizedName);
		this.setUnlocalizedName(unlocalizedName);

		this.setHardness(0.5F);
		this.setResistance(5.0F);
		this.setSoundType(SoundType.PLANT);

	}

	/*ドロップ指定、ピックアップ指定*/
	public boolean canSilkHarvest(World world, EntityPlayer player, int x, int y, int z, int metadata) {
	    return false;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return new ItemStack(ASDecoModTatami.TATAMI_H_lightg).getItem();
	}

	@Override
	public int quantityDropped(Random random) {
        return 2;
    }

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(ASDecoModTatami.TATAMI_D_lightg);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.tile.block_tatamid.name", meta));
	}

}
