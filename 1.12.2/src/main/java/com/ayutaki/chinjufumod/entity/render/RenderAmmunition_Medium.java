package com.ayutaki.chinjufumod.entity.render;

import com.ayutaki.chinjufumod.entity.EntityAmmunition_Medium;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderAmmunition_Medium extends RenderArrow<EntityAmmunition_Medium> {

	public static final ResourceLocation RESOURCE = new ResourceLocation("chinjufumod:textures/entity/projectiles/ammunition_entity.png");

	public RenderAmmunition_Medium(RenderManager renderManagerIn) {
        super(renderManagerIn);
    }

	@Override
    protected ResourceLocation getEntityTexture(EntityAmmunition_Medium entity) {
		return RESOURCE;
	}

}