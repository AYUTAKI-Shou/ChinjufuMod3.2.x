package com.ayutaki.chinjufumod.init.items.kansaiki.render;

import org.lwjgl.opengl.GL11;

import com.ayutaki.chinjufumod.init.items.kansaiki.entity.EntityType97;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderType97 extends Type97Render<EntityType97> {

	public RenderType97(RenderManager renderManager) {
		super(renderManager, new ModelType97(), 90);
	}

	public static final ResourceLocation RESOURCE =
			new ResourceLocation(Reference.MOD_ID, "textures/entity/projectiles/type97kk.png");

	@Override
	protected ResourceLocation getEntityTexture(EntityType97 entity) {
			return RESOURCE;
	}

	@Override
	public void renderEntityModel(EntityType97 theEntity, double x, double y, double z, float yaw,
			float partialTick) {
		GL11.glPushMatrix();
		bindTexture(getEntityTexture(theEntity));
		GL11.glTranslated(x, y, z);
		GL11.glScalef(scale, scale, scale);

		/* 発艦と旗艦の角度調整、-90 → +130 */
		GL11.glRotatef(
				(theEntity.prevRotationYaw + (theEntity.rotationYaw - theEntity.prevRotationYaw) * partialTick) + 130F,
				0.0F, 1.0F, 0.0F);
		model.render(theEntity, (float) x, (float) y, (float) z, yaw, partialTick, 0.0475F);
		GL11.glPopMatrix();
	}

}
