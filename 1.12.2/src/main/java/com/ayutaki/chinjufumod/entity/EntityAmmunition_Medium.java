package com.ayutaki.chinjufumod.entity;

import com.ayutaki.chinjufumod.config.CMConfigCore_new;
import com.ayutaki.chinjufumod.handlers.SoundsHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityAmmunition_Medium extends EntityArrow implements IProjectile {

	public EntityAmmunition_Medium(World worldIn) {
		super(worldIn);
	}

	public EntityAmmunition_Medium(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}

	public EntityAmmunition_Medium(World worldIn, EntityLivingBase shooter) {
		super(worldIn, shooter);
	}

	/* 不可欠なメソッドだが、AIRを呼び出して無効化 */
	@Override
	public ItemStack getArrowStack() {
		return new ItemStack(Items.AIR);
	}

	/* ここから エンティティやブロックに当たった時の処理 */
	public void onUpdate() {
		super.onUpdate();

		/* inGroundを上書きして、地面衝突時の処理を指定 */
		if (this.inGround) {

			/** inGroundで弾エンティティを消す **/
			this.setDead();
		}
	}

	@Override
	public void onHit(RayTraceResult raytraceResultIn) {
		super.onHit(raytraceResultIn);

		Entity entity = raytraceResultIn.entityHit;
		World world = this.world;

		/* 爆発の呼び出し */
		if (true) {

			/** 爆心, 爆心からの座標, 威力, 炎上, ブロック破壊の有無
			 * Hypocenter, Coordinates from the hypocenter, Power, Flame, Destroy the block **/
			CMExplosion explosion = new CMExplosion(world, this, this.posX, this.posY, this.posZ, 1.0F, false, CMConfigCore_new.blastBlockBreak);
			explosion.doExplosionA();
			explosion.doExplosionB(true);

		}

		/* 効果音の上書き */
		if (entity != null) {
			this.playSound(SoundsHandler.AM_IMPACT, 1.5F, 1.0F);
		}
		else {
			this.playSound(SoundsHandler.AM_IMPACT, 1.5F, 1.0F);
		}

	}

	/* エンティティに当たった時、爆発を呼び出して範囲攻撃 */
	@Override
	public void arrowHit(EntityLivingBase living) {
		super.arrowHit(living);
		World world = living.getEntityWorld();

		/* 効果音の呼び出し */
		this.playSound(SoundsHandler.AM_IMPACT, 1.5F, 1.0F);

		/* 爆発の呼び出し */
		if (living != shootingEntity) {

			/** 爆心, 爆心からの座標, 威力, 炎上, ブロック破壊の有無
			 * Hypocenter, Coordinates from the hypocenter, Power, Flame, Destroy the block **/
			CMExplosion explosion = new CMExplosion(world, this, this.posX, this.posY, this.posZ, 1.0F, false, CMConfigCore_new.blastBlockBreak);
			explosion.doExplosionA();
			explosion.doExplosionB(true);

		}
	}
	/**小口径 音1.0-1.2 威力－, 中口径 音1.5-1.0 威力1.0, 大口径 音2.0-0.8 威力1.8**/
}
