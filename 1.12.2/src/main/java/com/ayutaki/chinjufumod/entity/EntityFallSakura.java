package com.ayutaki.chinjufumod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityFallSakura extends Entity {

	float rx;
	float ry;
	float rz;
	boolean xflg = true;
	boolean yflg = true;
	boolean zflg = true;
	boolean stopFall;
	float particleRed;
	float particleGreen;
	float particleBlue;
	float rad;
	int particleAge;
	int particleMaxAge;

	public EntityFallSakura(World world) {
		super(world);
		this.stopFall = false;
		this.rad = ((float)(this.rad + 0.025D * this.rand.nextFloat()));
		setSize(0.2F, 0.2F);
		this.motionX = ((this.rand.nextFloat() - 0.5D) * 0.1D);
		this.motionY = -0.01D;
		this.motionZ = ((this.rand.nextFloat() - 0.5D) * 0.1D);
		this.particleAge = 0;
		this.particleMaxAge = (this.rand.nextInt(120) + 60);
		this.rx = world.rand.nextFloat();
		this.ry = world.rand.nextFloat();
		this.rz = world.rand.nextFloat();

	}

	public void setPosition(BlockPos pos) {
		setPosition(pos.getX(), pos.getY(), pos.getZ());
	}

	//.sqrt_double
	public void setMotion(double mx, double my, double mz) {

		float randomF = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
		float sq = MathHelper.sqrt(mx * mx + my * my + mz * mz);
		this.motionX = (mx / sq * randomF);
		this.motionY = (my / sq);
		this.motionZ = (mz / sq * randomF);
	}

	public void setStopFall() {
		this.stopFall = true;
		this.particleAge = 0;
		this.rad = 0.002F;
		this.motionX = (this.motionZ = 0.0D);
	}

	public boolean isStopFall() {
		return this.stopFall;
	}

	public void onUpdate() {

		this.prevPosX = this.posX;
		this.prevPosY = this.posY;
		this.prevPosZ = this.posZ;

		if (this.particleAge++ >= this.particleMaxAge) {
			setDead();
		}

		if (!this.stopFall) {
			this.motionY -= 0.004D;
		}
		else if (this.motionY != 0.0D) {
			this.motionY /= 1.2D;
		}

		move(this.motionX, this.motionY, this.motionZ);
		handleWaterMovement();
		this.motionX *= 0.95D;
		this.motionY *= 0.95D;
		this.motionZ *= 0.95D;

		if ((isInWater()) &&
				(!isStopFall())) {
			setStopFall();
		}
		if (this.onGround) {
			this.rad = 1.0E-4F;
		}
	}

	public void move(double par1, double par3, double par5) {
		super.move(null, par1, par3, par5);
	}

	protected void entityInit() {}

	protected void readEntityFromNBT(NBTTagCompound compund) {}

	protected void writeEntityToNBT(NBTTagCompound compound) { }

	public float getRx() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	public float getRy() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	public float getRz() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}
