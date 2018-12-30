package com.ayutaki.chinjufumod.init.items.kansaiki.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTenzan extends ModelBase {

	public ModelRenderer tile1;
	public ModelRenderer tile2;
	public ModelRenderer tile3;
	public ModelRenderer tile4;
	public ModelRenderer tile5;
	public ModelRenderer tile6;

	public ModelTenzan() {
		super();

			/*翼*/
    		tile1 = new ModelRenderer(this, 0, 0);
    		tile1.addBox( 0.0F, 1.25F, 18.0F, 16, 0, 3);
    		tile1.setRotationPoint(0.0F, 0.0F, 0.0F);
    		tile1.mirror = false;
    		setRotateAngle(tile1, 0F, 0F, 0F);
    		/*機体*/
    		tile2 = new ModelRenderer(this, 0, 4);
    		tile2.addBox( 7.5F, 1.0F, 16.5F, 1, 1, 12);
    		tile2.setRotationPoint(0.0F, 0.0F, 0.0F);
    		tile2.mirror = false;
    		setRotateAngle(tile2, 0F, 0F, 0F);
    		/*垂直尾翼*/
    		tile3 = new ModelRenderer(this, 40, 2);
    		tile3.addBox( 8.0F, 1.75F, 25.5F, 0, 2, 2);
    		tile3.setRotationPoint(0.0F, 0.0F, 0.0F);
    		tile3.mirror = false;
    		setRotateAngle(tile3, 0F, 0F, 0F);
    		/*尾翼*/
    		tile4 = new ModelRenderer(this, 40, 0);
    		tile4.addBox( 5.0F, 2.0F, 25.5F, 6, 0, 2);
    		tile4.setRotationPoint(0.0F, 0.0F, 0.0F);
    		tile4.mirror = false;
    		setRotateAngle(tile4, 0F, 0F, 0F);
    		/*プロペラ*/
    		tile5 = new ModelRenderer(this, 40, 8);
    		tile5.addBox( 7.0F, 0.5F, 16.0F, 2, 2, 0);
    		tile5.setRotationPoint(0.0F, 0.0F, 0.0F);
    		tile5.mirror = false;
    		setRotateAngle(tile5, 0F, 0F, 0F);
    		/*コクピット*/
    		tile6 = new ModelRenderer(this, 40, 4);
    		tile6.addBox( 7.5F, 1.5F, 18.0F, 1, 1, 3);
    		tile6.setRotationPoint(0.0F, 0.0F, 0.0F);
    		tile6.mirror = false;
    		setRotateAngle(tile6, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		tile1.render(f5);
		tile2.render(f5);
		tile3.render(f5);
		tile4.render(f5);
		tile5.render(f5);
		tile6.render(f5);
	}

	/*@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		tile6.render(f5);
		tile2.render(f5);
		tile1.render(f5);
		GlStateManager.pushMatrix();
		GlStateManager.translate(tile4.offsetX, tile4.offsetY, tile4.offsetZ);
		GlStateManager.translate(tile4.rotationPointX * f5, tile4.rotationPointY * f5, tile4.rotationPointZ * f5);
		GlStateManager.scale(1.0D, 0.1D, 1.0D);
		GlStateManager.translate(-tile4.offsetX, -tile4.offsetY, -tile4.offsetZ);
		GlStateManager.translate(-tile4.rotationPointX * f5, -tile4.rotationPointY * f5, -tile4.rotationPointZ * f5);
		tile4.render(f5);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(tile3.offsetX, tile3.offsetY, tile3.offsetZ);
		GlStateManager.translate(tile3.rotationPointX * f5, tile3.rotationPointY * f5, tile3.rotationPointZ * f5);
		GlStateManager.scale(1.0D, 0.1D, 1.0D);
		GlStateManager.translate(-tile3.offsetX, -tile3.offsetY, -tile3.offsetZ);
		GlStateManager.translate(-tile3.rotationPointX * f5, -tile3.rotationPointY * f5, -tile3.rotationPointZ * f5);
		tile3.render(f5);
		GlStateManager.popMatrix();
		tile5.render(f5);
	}*/

	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
