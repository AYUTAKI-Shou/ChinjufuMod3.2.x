package com.ayutaki.chinjufumod.init.items.kansaiki.entity;

import com.ayutaki.chinjufumod.handlers.SoundsHandler;
import com.ayutaki.chinjufumod.init.items.kansaiki.ItemType97;
import com.ayutaki.chinjufumod.init.items.kansaiki.etc.CompoundTags;
import com.ayutaki.chinjufumod.init.items.kansaiki.material.MaterialDefinition;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class EntityType97 extends KansaikiThrowable {

	public static final DataParameter<Float> THROWER_X = EntityDataManager.<Float>createKey(EntityType97.class,
			DataSerializers.FLOAT);
	public static final DataParameter<Float> THROWER_Y = EntityDataManager.<Float>createKey(EntityType97.class,
			DataSerializers.FLOAT);
	public static final DataParameter<Float> THROWER_Z = EntityDataManager.<Float>createKey(EntityType97.class,
			DataSerializers.FLOAT);
	public static final DataParameter<Float> YAW = EntityDataManager.<Float>createKey(EntityType97.class,
			DataSerializers.FLOAT);
	public static final DataParameter<ItemStack> STACK = EntityDataManager.<ItemStack>createKey(EntityType97.class,
			DataSerializers.ITEM_STACK);

	public EntityType97(World worldIn) {
		super(worldIn, "kansaiki");
	}

	public EntityType97(World worldIn, EntityLivingBase thrower, ItemStack stack) {
		super(worldIn, thrower, stack, "kansaiki");
		setItemStack(stack);
		setCoords(thrower.posX, thrower.posY + thrower.getEyeHeight(), thrower.posZ);
		setInited();
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		dataManager.register(STACK, ItemStack.EMPTY);
		dataManager.register(YAW, 0F);
		dataManager.register(THROWER_X, 0F);
		dataManager.register(THROWER_Y, 0F);
		dataManager.register(THROWER_Z, 0F);
		rotationYaw = dataManager.get(YAW);
	}

	@Override
	protected float getGravityVelocity() {
		return 0f;
	}

	/* 艦これの 火力＋雷装または爆装 の数値を使う */
	@Override
	protected float getImpactDamage(Entity target) {
		return 5.0F;
	}

	public ItemStack getItemStack() {
		return dataManager.get(STACK);
	}

	public MaterialDefinition getMaterialDefinition() {
		MaterialDefinition md;
		try {
			md = ((ItemType97) getItemStack().getItem()).getMaterialDefinition();
		} catch (NullPointerException e) {
			md = null;
		} catch (ClassCastException e) {
			md = null;
		}
		return md;
	}

	public double getPosX() {
		return dataManager.get(THROWER_X);
	}

	public double getPosY() {
		return dataManager.get(THROWER_Y);
	}

	public double getPosZ() {
		return dataManager.get(THROWER_Z);
	}

	/* 未帰還機が余りに多いため、ブロックは貫通させる
	@Override
	protected boolean onBlockHit(BlockPos blockPos) {

		ブロックに当たるとアイテムへ戻る
		if (!world.isRemote) {
			if (getItemStack().getMaxDamage() - getItemStack().getItemDamage() > 0 && !creativeUse()) {
				entityDropItem(getItemStack(), 0.5f);
				world.playSound(null, posX, posY, posZ, SoundsHandler.KK_STOP, SoundCategory.MASTER, 2.0F, 1.0F);
			}

			else if (getItemStack().getMaxDamage() - getItemStack().getItemDamage() <= 0) {
				world.playSound(null, posX, posY, posZ, SoundsHandler.KK_BREAK, SoundCategory.MASTER, 2.0F, 1.0F);
			}

			else if (creativeUse()) {
				world.playSound(null, posX, posY, posZ, SoundsHandler.KK_STOP, SoundCategory.MASTER, 2.0F, 1.0F);
			}
		}
		return true;
	} */

	@Override
	protected boolean onEntityHit(Entity hitEntity) {

		/* 投げた本人の手元に戻ってきた */
		if (hitEntity == getThrower()) {

			ItemStack stack = getItemStack();
			EntityPlayer p = (EntityPlayer) hitEntity;
			if (stack.getMaxDamage() - stack.getItemDamage() > 0 && !creativeUse()) {
				p.inventory.addItemStackToInventory(stack);
				world.playSound(null, posX, posY, posZ, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.MASTER, 0.5F, 0.7F);
			}

			else if (getItemStack().getMaxDamage() - getItemStack().getItemDamage() <= 0) {
				world.playSound(null, posX, posY, posZ, SoundsHandler.KK_BREAK, SoundCategory.MASTER, 2.0F, 1.0F);
			}
			return true;
		}

		/* 村人に当たるとアイテムへ戻る */
		else if (hitEntity instanceof EntityVillager) {

			if (!world.isRemote) {
				if (getItemStack().getMaxDamage() - getItemStack().getItemDamage() > 0 && !creativeUse()) {
					entityDropItem(getItemStack(), 0.5f);
					world.playSound(null, posX, posY, posZ, SoundsHandler.KK_STOP, SoundCategory.MASTER, 2.0F, 1.0F);
				}

				else if (getItemStack().getMaxDamage() - getItemStack().getItemDamage() <= 0) {
					world.playSound(null, posX, posY, posZ, SoundsHandler.KK_BREAK, SoundCategory.MASTER, 2.0F, 1.0F);
				}
				setDead();
			}
			return true;
		}

		/* 馬に当たるとアイテムへ戻る */
		else if (hitEntity instanceof EntityHorse) {

			if (!world.isRemote) {
				if (getItemStack().getMaxDamage() - getItemStack().getItemDamage() > 0 && !creativeUse()) {
					entityDropItem(getItemStack(), 0.5f);
					world.playSound(null, posX, posY, posZ, SoundsHandler.KK_STOP, SoundCategory.MASTER, 2.0F, 1.0F);
				}

				else if (getItemStack().getMaxDamage() - getItemStack().getItemDamage() <= 0) {
					world.playSound(null, posX, posY, posZ, SoundsHandler.KK_BREAK, SoundCategory.MASTER, 2.0F, 1.0F);
				}
				setDead();
			}
			return true;
		}

		/* 犬、なつく動物に当たるとアイテムへ戻る */
		else if (hitEntity instanceof EntityTameable) {

			if (!world.isRemote) {
				if (getItemStack().getMaxDamage() - getItemStack().getItemDamage() > 0 && !creativeUse()) {
					entityDropItem(getItemStack(), 0.5f);
					world.playSound(null, posX, posY, posZ, SoundsHandler.KK_STOP, SoundCategory.MASTER, 2.0F, 1.0F);
				}

				else if (getItemStack().getMaxDamage() - getItemStack().getItemDamage() <= 0) {
					world.playSound(null, posX, posY, posZ, SoundsHandler.KK_BREAK, SoundCategory.MASTER, 2.0F, 1.0F);
				}
				setDead();
			}
			return true;
		}

		/* その他のエンティティへはダメージを与える */
		else {

			ItemStack stack = getItemStack();

			int j = EnchantmentHelper.getEnchantmentLevel(Enchantments.SHARPNESS, stack);

			/* j=0、エンチャント無し */
			if (j == 0) {
				hitEntity.attackEntityFrom(causeImpactDamage(hitEntity, getThrower()), getImpactDamage(hitEntity));
			}

			/* SHARPNESS を改装と考えて用意 */
			if (j > 0) {
				hitEntity.attackEntityFrom(causeImpactDamage(hitEntity, getThrower()), (float) (getImpactDamage(hitEntity) + j * 0.5D + 0.5D));
			}

			world.playSound(null, posX, posY, posZ, SoundsHandler.KK_ATACK, SoundCategory.MASTER, 2.0F, 1.0F);

			/* ダメージ蓄積で壊れる */
			if (stack.getItem().isDamageable() && stack.attemptDamageItem(1, rand, null)) {
				world.playSound(null, posX, posY, posZ, SoundsHandler.KK_BREAK, SoundCategory.MASTER, 2.0F, 1.0F);
				return true;
			}

			else {
				setItemStack(stack);
			}
		}
		return false;
	}

	@Override
	public void onUpdated() {

		if (getThrower() != null && CompoundTags.giveCompound(getItemStack()).getBoolean(CompoundTags.ENCHANTED)) {
			setCoords(getThrower().posX, getThrower().posY + getThrower().getEyeHeight(), getThrower().posZ);
		}

		double dx = this.posX - getPosX();
		double dy = this.posY - getPosY();
		double dz = this.posZ - getPosZ();

		double d = Math.sqrt(dx * dx + dy * dy + dz * dz);

		dx /= d;
		dy /= d;
		dz /= d;

		/* 飛距離の調整、数字が大きいほど短い 0.05 → 0.04 */
		motionX -= (0.04D * dx);
		motionY -= (0.04D * dy);
		motionZ -= (0.04D * dz);

		/* 水没時にアイテムに戻る */
		if (isInWater()) {
			if (!world.isRemote) {
				if (getItemStack().getMaxDamage() - getItemStack().getItemDamage() > 0 && !creativeUse()) {
					entityDropItem(getItemStack(), 0.5f);
					world.playSound(null, posX, posY, posZ, SoundsHandler.WATER_SPLASH, SoundCategory.MASTER, 2.0F, 1.0F);

				} else if (getItemStack().getMaxDamage() - getItemStack().getItemDamage() <= 0) {
					world.playSound(null, posX, posY, posZ, SoundsHandler.KK_BREAK, SoundCategory.MASTER, 2.0F, 1.0F);
				}
				setDead();
			}
		}

		/* 投げた後、アイテムに戻るまでの時間 103 → 123 */
		if (ticksExisted >= 123) {
			if (CompoundTags.giveCompound(getItemStack()).getBoolean(CompoundTags.ENCHANTED)) {
				if (onEntityHit(getThrower()))
					setDead();
			}

			else {
				if (!world.isRemote) {
					if (getItemStack().getMaxDamage() - getItemStack().getItemDamage() > 0 && !creativeUse()) {
						entityDropItem(getItemStack(), 0.5f);
						world.playSound(null, posX, posY, posZ, SoundsHandler.KK_STOP, SoundCategory.MASTER, 2.0F, 1.0F);
					}

					else if (getItemStack().getMaxDamage() - getItemStack().getItemDamage() <= 0) {
						world.playSound(null, posX, posY, posZ, SoundsHandler.KK_BREAK, SoundCategory.MASTER, 2.0F, 1.0F);
					}
					setDead();
				}
			}
		}

		/* 回転回数の調整 ×0.2Fを×2Fへ */
		rotationYaw = prevRotationYaw + (rotationYaw - prevRotationYaw) * 2F;
		rotationYaw += 20;
		setRotation(rotationYaw, rotationPitch);
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound tagCompund) {
		super.readEntityFromNBT(tagCompund);
		setItemStack(new ItemStack(tagCompund.getCompoundTag("item")));
		setCoords(tagCompund.getDouble("playerX"), tagCompund.getDouble("playerY"), tagCompund.getDouble("playerZ"));
		dataManager.set(YAW, tagCompund.getFloat("yawreforged"));
	}

	public void setCoords(double playerX, double playerY, double playerZ) {
		dataManager.set(THROWER_X, (float) playerX);
		dataManager.set(THROWER_Y, (float) playerY);
		dataManager.set(THROWER_Z, (float) playerZ);
	}

	public void setItemStack(ItemStack stack) {
		if (stack == null || stack.isEmpty() || !(stack.getItem() instanceof ItemType97)) {
			throw new IllegalArgumentException("Invalid Itemstack!");
		}
		dataManager.set(STACK, stack);
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound tagCompound) {

		super.writeEntityToNBT(tagCompound);

		tagCompound.setDouble("playerX", getPosX());
		tagCompound.setDouble("playerY", getPosY());
		tagCompound.setDouble("playerZ", getPosZ());
		tagCompound.setDouble("yawreforged", dataManager.get(YAW));

		if (getItemStack() != null && !getItemStack().isEmpty()) {
			tagCompound.setTag("item", getItemStack().writeToNBT(new NBTTagCompound()));
		}
	}

}
