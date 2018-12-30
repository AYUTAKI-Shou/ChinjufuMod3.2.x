package com.ayutaki.chinjufumod.init.items.armor.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelRJBody extends ModelBiped {

	private ModelRenderer GISOU1;
	private ModelRenderer GISOU2;
	private ModelRenderer GISOU5;
	private ModelRenderer GISOU6;
	private ModelRenderer GISOU7;

	public ModelRJBody(float scale) {
		super(scale, 0, 64, 120);

		textureWidth = 64;
		textureHeight = 120;

		/* 電探と煙突 */
		this.GISOU1 = new ModelRenderer(this, 0, 71);
		this.GISOU1.addBox(-11.0F, -10.0F, 4.01F, 22, 28, 1);
		this.setRotation(GISOU1, 0F, 0F, 0F);

		/* レギンス用の薄いボディ */
		this.GISOU2 = new ModelRenderer(this, 0, 52);
		this.GISOU2.addBox(-4.5F, -0.5F, -2.5F, 9, 14, 5);
		this.setRotation(GISOU2, 0F, 0F, 0F);

		/* レギンス左足 */
		this.GISOU5= new ModelRenderer(this, 0, 100);
		this.GISOU5.addBox(-2.5F, -1.01F, -2.5F, 5, 8, 5);
		this.setRotation(GISOU5, 0F, 0F, 0F);

		/* レギンス右足 */
		this.GISOU6= new ModelRenderer(this, 0, 100);
		this.GISOU6.mirror = true;
		this.GISOU6.addBox(-2.5F, -1.01F, -2.5F, 5, 8, 5);
		this.setRotation(GISOU6, 0F, 0F, 0F);

		/* 龍驤バイザー */
		this.GISOU7= new ModelRenderer(this, 20, 100);
		this.GISOU7.addBox(-5.0F, -10.0F, -8.1F, 10, 5, 3);
		this.setRotation(GISOU7, 0F, 0F, 0F);

		/* ボディ(＝チェストプレート)の子として位置づける */
		bipedBody.addChild(GISOU1);
		bipedBody.addChild(GISOU2);

		bipedLeftLeg.addChild(GISOU5);
		bipedRightLeg.addChild(GISOU6);
		bipedHead.addChild(GISOU7);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	/* アーマースタンド用の Facing で向きの不一致を防止 */
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount,
			float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {

		if (entityIn instanceof EntityArmorStand) {
			EntityArmorStand entityarmorstand = (EntityArmorStand)entityIn;
			this.bipedHead.rotateAngleX = 0.017453292F * entityarmorstand.getHeadRotation().getX();
			this.bipedHead.rotateAngleY = 0.017453292F * entityarmorstand.getHeadRotation().getY();
			this.bipedHead.rotateAngleZ = 0.017453292F * entityarmorstand.getHeadRotation().getZ();
			this.bipedHead.setRotationPoint(0.0F, 1.0F, 0.0F);
			this.bipedBody.rotateAngleX = 0.017453292F * entityarmorstand.getBodyRotation().getX();
			this.bipedBody.rotateAngleY = 0.017453292F * entityarmorstand.getBodyRotation().getY();
			this.bipedBody.rotateAngleZ = 0.017453292F * entityarmorstand.getBodyRotation().getZ();
			this.bipedLeftArm.rotateAngleX = 0.017453292F * entityarmorstand.getLeftArmRotation().getX();
			this.bipedLeftArm.rotateAngleY = 0.017453292F * entityarmorstand.getLeftArmRotation().getY();
			this.bipedLeftArm.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftArmRotation().getZ();
			this.bipedRightArm.rotateAngleX = 0.017453292F * entityarmorstand.getRightArmRotation().getX();
			this.bipedRightArm.rotateAngleY = 0.017453292F * entityarmorstand.getRightArmRotation().getY();
			this.bipedRightArm.rotateAngleZ = 0.017453292F * entityarmorstand.getRightArmRotation().getZ();
			this.bipedLeftLeg.rotateAngleX = 0.017453292F * entityarmorstand.getLeftLegRotation().getX();
			this.bipedLeftLeg.rotateAngleY = 0.017453292F * entityarmorstand.getLeftLegRotation().getY();
			this.bipedLeftLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftLegRotation().getZ();
			this.bipedLeftLeg.setRotationPoint(1.9F, 11.0F, 0.0F);
			this.bipedRightLeg.rotateAngleX = 0.017453292F * entityarmorstand.getRightLegRotation().getX();
			this.bipedRightLeg.rotateAngleY = 0.017453292F * entityarmorstand.getRightLegRotation().getY();
			this.bipedRightLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getRightLegRotation().getZ();
			this.bipedRightLeg.setRotationPoint(-1.9F, 11.0F, 0.0F);
			copyModelAngles(this.bipedHead, this.bipedHeadwear);
		}
		else super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
