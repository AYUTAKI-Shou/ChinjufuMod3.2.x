package com.ayutaki.chinjufumod.init.items.kansaiki;

import java.util.List;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.handlers.SoundsHandler;
import com.ayutaki.chinjufumod.init.ChinjufuModItems;
import com.ayutaki.chinjufumod.init.items.kansaiki.entity.EntityJu87;
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

public class ItemJu87 extends ExtendedItem {

	protected final MaterialDefinition materialDefinition;
	protected final boolean unbreakable;

	public ItemJu87(ToolMaterial material) {
		this(material, false);
	}

	public ItemJu87(ToolMaterial material, boolean unbreakable) {
		super();
		this.unbreakable = unbreakable;
		setMaxStackSize(1);
		materialDefinition = MaterialManager.getMaterialDefinition(material);

		/* harvestLevel,maxUses,efficiency,damageVsEntity,enchantability
		WOOD   (0,   59,  2.0F, 0.0F, 15),
		STONE  (1,  131,  4.0F, 1.0F,  5)...100,
		IRON   (2,  250,  6.0F, 2.0F, 14)...200,
		DIAMOND(3, 1561,  8.0F, 3.0F, 10)...300,
		GOLD   (0,   32, 12.0F, 0.0F, 22); */
		//setMaxDamage((int) (materialDefinition.getMaxUses() * 0.8f));
		//setUnlocalizedName(materialDefinition.getPrefixedName("boomerang"));
		setMaxDamage(1200);
	}

	/**
	 * this is weak melee combat damage! for ranged combat damage, see
	 * {@link EntityJu87#getImpactDamage}
	 */
	@Override
	public float getHitDamage() {

		return Math.max(1f, 8.0f);
	}

	/* エンチャント */
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
					EntityJu87 kansaiki = new EntityJu87(worldIn, playerIn, throwStack);
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
