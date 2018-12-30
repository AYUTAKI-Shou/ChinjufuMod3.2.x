package com.ayutaki.chinjufumod.entity;

import com.ayutaki.chinjufumod.handlers.SoundsHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityAmmunition_Small extends EntityArrow implements IProjectile {

	public EntityAmmunition_Small(World worldIn) {
		super(worldIn);
	}

	public EntityAmmunition_Small(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}

	public EntityAmmunition_Small(World worldIn, EntityLivingBase shooter) {
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

		/* 爆発の呼び出し */


		/* 効果音の上書き */
		if (entity != null) {
			this.playSound(SoundsHandler.AM_IMPACT, 1.0F, 1.2F);
		}
		else {
			this.playSound(SoundsHandler.AM_IMPACT, 1.0F, 1.2F);
		}

	}

	/* エンティティに当たった時、爆発を呼び出して範囲攻撃 */
	@Override
	public void arrowHit(EntityLivingBase living) {
		super.arrowHit(living);

		/* 効果音の呼び出し */
		this.playSound(SoundsHandler.AM_IMPACT, 1.0F, 1.2F);

		/* 爆発の呼び出し */


	}
/**小口径 音1.0-1.2 威力－, 中口径 音1.5-1.0 威力1.0, 大口径 音2.0-0.8 威力1.8**/
}
