package com.ayutaki.chinjufumod.init.items.weapons;

import java.util.List;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.entity.EntityAmmunition_Medium;
import com.ayutaki.chinjufumod.handlers.SoundsHandler;
import com.ayutaki.chinjufumod.init.ChinjufuModWeapons;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemRensouHou203 extends ItemBow {

	public ItemRensouHou203() {
		this.maxStackSize = 1;
		this.setMaxDamage(2500);

		this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter() {

			@SideOnly(Side.CLIENT)
			public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {

				if (entityIn == null) {
					return 0.0F;
				}
				else {
					return entityIn.getActiveItemStack().getItem() != Items.BOW ? 0.0F : (float)(stack.getMaxItemUseDuration() - entityIn.getItemInUseCount()) / 20.0F;
				}
			}
		});

		this.addPropertyOverride(new ResourceLocation("pulling"), new IItemPropertyGetter() {

			@SideOnly(Side.CLIENT)
			public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
				return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F : 0.0F;
			}
		});
	}

	private ItemStack findAmmo(EntityPlayer player) {

		if (this.isArrow(player.getHeldItem(EnumHand.OFF_HAND))) {
			return player.getHeldItem(EnumHand.OFF_HAND);
		}

		else if (this.isArrow(player.getHeldItem(EnumHand.MAIN_HAND))) {
            return player.getHeldItem(EnumHand.MAIN_HAND);
		}
		else {

			for (int i = 0; i < player.inventory.getSizeInventory(); ++i) {
				ItemStack itemstack = player.inventory.getStackInSlot(i);

				if (this.isArrow(itemstack)) {
					return itemstack;
				}
			}
			return ItemStack.EMPTY;
		}
	}

	/* 弾に使うアイテムの新スタンス指定 */
	protected boolean isArrow(ItemStack stack) {
		return stack.getItem() instanceof ItemAmmunition_Medium;
    }

    /**
     * Called when the player stops using an Item (stops holding the right mouse button).
     */
	public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft) {

		if (entityLiving instanceof EntityPlayer) {

			EntityPlayer entityplayer = (EntityPlayer)entityLiving;
			boolean flag = entityplayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantments.INFINITY, stack) > 0;
			ItemStack itemstack = this.findAmmo(entityplayer);

			int i = this.getMaxItemUseDuration(stack) - timeLeft;
			i = net.minecraftforge.event.ForgeEventFactory.onArrowLoose(stack, worldIn, entityplayer, i, !itemstack.isEmpty() || flag);
			if (i < 0) return;

			if (!itemstack.isEmpty() || flag) {

				if (itemstack.isEmpty()) {
					itemstack = new ItemStack(ChinjufuModWeapons.AMMUNITION_MEDIUM);
                }

				float f = getArrowVelocity(i);

				if ((double)f >= 0.1D) {

					boolean flag1 = entityplayer.capabilities.isCreativeMode || (itemstack.getItem() instanceof ItemAmmunition_Medium && ((ItemArrow) itemstack.getItem()).isInfinite(itemstack, stack, entityplayer));

					if (!worldIn.isRemote) {

						/* 弾のインスタンス、発射するエンティティ */
						ItemArrow itemarrow = (ItemArrow)(itemstack.getItem() instanceof ItemAmmunition_Medium ? itemstack.getItem() : ChinjufuModWeapons.AMMUNITION_MEDIUM);
						EntityAmmunition_Medium entityarrow = (EntityAmmunition_Medium) itemarrow.createArrow(worldIn, itemstack, entityplayer);

						/* 弾道計算 */
						entityarrow.shoot(entityplayer, entityplayer.rotationPitch, entityplayer.rotationYaw, 0.0F, f * 3.0F, 1.0F);

						if (f == 1.0F) {
							entityarrow.setIsCritical(true);
						}
						/* 標準で POWER (8.0-2.0)÷2 */
						int j = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER, stack);

						if (j == 0) {
							entityarrow.setDamage(entityarrow.getDamage() + 3.0D);
						}

						if (j > 0) {
							entityarrow.setDamage(entityarrow.getDamage() + 3.0D + (double)j * 0.5D + 0.5D);
						}

						/* 標準で PUNCH I の効果を乗せる */
						int k = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, stack);

						if (k == 0) {
							entityarrow.setKnockbackStrength(1);
						}

						if (k > 0) {
							entityarrow.setKnockbackStrength(k + 1);
						}

						if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAME, stack) > 0) {
							entityarrow.setFire(100);
						}

						stack.damageItem(1, entityplayer);

						if (flag1 || entityplayer.capabilities.isCreativeMode && (itemstack.getItem() == Items.SPECTRAL_ARROW || itemstack.getItem() == Items.TIPPED_ARROW)) {
							entityarrow.pickupStatus = EntityAmmunition_Medium.PickupStatus.CREATIVE_ONLY;
						}

						worldIn.spawnEntity(entityarrow);
					}

					/* 発射時の効果音を変更 */
					worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ,
							SoundsHandler.AM_FIRE, SoundCategory.MASTER, 1.0F, 1.2F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

					if (!flag1 && !entityplayer.capabilities.isCreativeMode) {
						itemstack.shrink(1);

						if (itemstack.isEmpty()) {
							entityplayer.inventory.deleteStack(itemstack);
						}
					}

    				/* 薬莢のドロップ、クリエイティブモードに分岐 */
					if (!worldIn.isRemote) {
						if (!creativeUse(entityplayer)) {
							entityplayer.dropItem(new ItemStack(ChinjufuModWeapons.CARTRIDGE_MEDIUM), false);
							worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ,
									SoundsHandler.AM_CARTRIDGE, SoundCategory.MASTER, 1.0F, 1.2F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
						}
						else if (creativeUse(entityplayer)) {

						}
            		}
					entityplayer.addStat(StatList.getObjectUseStats(this));
				}
			}
		}
	}

	/**
	 * Gets the velocity of the arrow entity from the bow's charge
	 */
	public static float getArrowVelocity(int charge) {

		float f = (float)charge / 20.0F;
		f = (f * f + f * 2.0F) / 3.0F;

		if (f > 1.0F) {
			f = 1.0F;
		}
		return f;
	}

	/* クリエイティブモードで薬莢を出さないための設定 */
	public boolean creativeUse(Entity e) {
		return (e instanceof EntityPlayer && ((EntityPlayer) e).capabilities.isCreativeMode)
				|| !(e instanceof EntityPlayer);
	}

	/* 金床で修理可能 */
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return (repair.getItem() == Items.IRON_INGOT);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.item.item_rensouhou_medium.name", meta));
	}
}
