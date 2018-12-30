package com.ayutaki.chinjufumod.init.items.armor;

import com.ayutaki.chinjufumod.init.ChinjufuModArmorMaterial;
import com.ayutaki.chinjufumod.init.items.armor.model.ModelSenkanBody;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemKongouArmor extends ItemArmor {

	public ItemKongouArmor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(ChinjufuModArmorMaterial.KONGOU, renderIndexIn, equipmentSlotIn);

	}

	/* アーマーモデル */
	@Override
	@SideOnly(Side.CLIENT) /* ←サーバーで処理されないように、Side.CLIENTを入れる */
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {

		if(!itemStack.isEmpty()) {

			if(itemStack.getItem() instanceof ItemArmor) {

				ModelSenkanBody armorModel = new ModelSenkanBody(1.0f);
				ModelSenkanBody armorModelLegs = new ModelSenkanBody(0.5f);

				armorModel.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				armorModel.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				armorModel.bipedBody.showModel = (armorSlot == EntityEquipmentSlot.CHEST) || (armorSlot == EntityEquipmentSlot.CHEST);
				armorModel.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				armorModel.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				armorModelLegs.bipedRightLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS) || (armorSlot == EntityEquipmentSlot.FEET);
				armorModelLegs.bipedLeftLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS) || (armorSlot == EntityEquipmentSlot.FEET);

				armorModel.isSneak = _default.isSneak;
				armorModel.isRiding = _default.isRiding;
				armorModel.isChild = _default.isChild;
				armorModel.rightArmPose = _default.rightArmPose;
				armorModel.leftArmPose = _default.leftArmPose;

				armorModelLegs.isSneak = _default.isSneak;
				armorModelLegs.isRiding = _default.isRiding;
				armorModelLegs.isChild = _default.isChild;
				armorModelLegs.rightArmPose = _default.rightArmPose;
				armorModelLegs.leftArmPose = _default.leftArmPose;

				return armorModel;
			}
		}
		return null;
	}

	/* 金床で修理可能 */
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return (repair.getItem() == Items.IRON_INGOT);
	}

}
