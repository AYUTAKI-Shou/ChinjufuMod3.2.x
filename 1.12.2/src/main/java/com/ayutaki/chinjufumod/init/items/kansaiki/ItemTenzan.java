package com.ayutaki.chinjufumod.init.items.kansaiki;

import java.util.List;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.handlers.SoundsHandler;
import com.ayutaki.chinjufumod.init.ChinjufuModItems;
import com.ayutaki.chinjufumod.init.items.kansaiki.entity.EntityTenzan;
import com.ayutaki.chinjufumod.init.items.kansaiki.etc.KansaikiHelpers;
import com.ayutaki.chinjufumod.init.items.kansaiki.material.MaterialDefinition;
import com.ayutaki.chinjufumod.init.items.kansaiki.material.MaterialManager;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemTenzan extends ExtendedItem {

	protected final MaterialDefinition materialDefinition;
	protected final boolean unbreakable;

	public ItemTenzan(ToolMaterial material) {
		this(material, false);
	}

	public ItemTenzan(ToolMaterial material, boolean unbreakable) {
		super();
		this.unbreakable = unbreakable;
		setMaxStackSize(1);
		materialDefinition = MaterialManager.getMaterialDefinition(material);
		setMaxDamage(1500);
	}

	/**
	 * this is weak melee combat damage! for ranged combat damage, see
	 * {@link EntityTenzan#getImpactDamage}
	 */
	@Override
	public float getHitDamage() {

		return Math.max(1f, (6.0f));
	}

	@Override
	public int getItemEnchantability(ItemStack stack) {
		return materialDefinition.getEnchantability();
	}

	public ToolMaterial getMaterial() {
		return materialDefinition.getMaterial();
	}

	public MaterialDefinition getMaterialDefinition() {
		return materialDefinition;
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		if (stack.getItem().isDamageable())
			stack.damageItem(1, attacker);
		return true;
	}

	@Override
	public boolean isDamageable() {
		return !unbreakable;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand hand) {

		if (hand == EnumHand.MAIN_HAND) {

			ItemStack throwStack = playerIn.getHeldItemMainhand().copy();
			if (playerIn.capabilities.isCreativeMode || KansaikiHelpers.consumeInventoryItem(playerIn, this)) {

				worldIn.playSound(null, playerIn.posX, playerIn.posY, playerIn.posZ,
						SoundsHandler.KK_PROPELLER, SoundCategory.MASTER, 1.0F, 1.0F);

				if (!worldIn.isRemote) {
					EntityTenzan kansaiki = new EntityTenzan(worldIn, playerIn, throwStack);
					worldIn.spawnEntity(kansaiki);
				}
			}
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItemMainhand());
		}
		return new ActionResult<ItemStack>(EnumActionResult.FAIL, playerIn.getHeldItemOffhand());
	}

	/* 金床で修理可能 */
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return (repair.getItem() == ChinjufuModItems.ALUMINUM);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.item.item_kk.name", meta));
	}
}
