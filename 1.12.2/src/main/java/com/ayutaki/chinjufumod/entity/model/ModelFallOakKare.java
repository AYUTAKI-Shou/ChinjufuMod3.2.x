package com.ayutaki.chinjufumod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFallOakKare extends ModelBase {

	public int textureWidth = 16;
	public int textureHeight = 16;
	public final ModelRenderer[] box = new ModelRenderer[9];

	public ModelFallOakKare() {

	int x = 0;
	int y = 0;

		for (int i = 0; i < this.box.length; i++) {
			this.box[i] = new ModelRenderer(this, x, y);
			this.box[i].addBox(0.0F, -0.13F, 0.0F, 2, 0, 4);

			if (x < 60) {
				x += 10;
			}
			else {
				x = 0;
				y += 5;
			}
		}
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for (int i = 0; i < this.box.length; i++) {
		this.box[i].render(f5);
		}
	}

}
