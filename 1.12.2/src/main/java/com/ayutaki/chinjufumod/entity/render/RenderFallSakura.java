package com.ayutaki.chinjufumod.entity.render;

import org.lwjgl.opengl.GL11;

import com.ayutaki.chinjufumod.entity.EntityFallSakura;
import com.ayutaki.chinjufumod.entity.model.ModelFallSakura;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SuppressWarnings("rawtypes")
@SideOnly(Side.CLIENT)
public class RenderFallSakura extends Render {

	private ModelFallSakura model;

	public RenderFallSakura(RenderManager manager) {
		super(manager);
		this.model = new ModelFallSakura();
	}

	public static final ResourceLocation RESOURCE =
			new ResourceLocation(Reference.MOD_ID, "textures/entity/effect/par_fallsakura.png");

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
			return RESOURCE;
	}

	@SuppressWarnings("unchecked")
	public void renderLeaf(EntityFallSakura entity, double d, double d1, double d2, float f, float f1) {

		GL11.glPushMatrix();
		GL11.glTranslatef((float)d, (float)d1, (float)d2);
		bindEntityTexture(entity);

		GL11.glScalef(0.5F, 0.5F, 0.5F);
		GL11.glRotatef(180.0F, entity.getRx(), entity.getRy(), entity.getRz());

		this.model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
		GL11.glColor3f(1.0F, 1.0F, 1.0F);
		GL11.glPopMatrix();
	}

	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) {
		renderLeaf((EntityFallSakura)entity, d, d1, d2, f, f1);
	}

}
