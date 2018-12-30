package com.ayutaki.chinjufumod.init.items.armor;

import java.util.List;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.init.ChinjufuModArmor;
import com.ayutaki.chinjufumod.init.ChinjufuModArmorMaterial;
import com.ayutaki.chinjufumod.init.ChinjufuModBlocks;
import com.ayutaki.chinjufumod.init.items.armor.model.ModelSenkanBody;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemToneArmor_kai extends ItemArmor {

	public ItemToneArmor_kai(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(ChinjufuModArmorMaterial.TONE, renderIndexIn, equipmentSlotIn);

	}

	/* 水上航行 */
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {

		if(this != ChinjufuModArmor.TONE_BOOTS_KAI) {}

			int x = (int) player.posX;
			int y = (int) player.posY;
			int z = (int) player.posZ;

		if(this == ChinjufuModArmor.TONE_BOOTS_KAI) {

			for(int i = -1; i <= 1; i++)
			for(int j = -1; j <= 1; j++)
			for(int k = -2; k <= 0; k++)

			if (world.getBlockState(new BlockPos(x - i, y - 1.0D, z -j)).getBlock() == Blocks.WATER){

				if (world.getBlockState(new BlockPos(x - i, y, z -j)).getBlock() != Blocks.AIR) { }

					else if (world.getBlockState(new BlockPos(x - i, y, z -j)).getBlock() == Blocks.AIR) {
					world.setBlockState(new BlockPos(x - i, y, z -j), ChinjufuModBlocks.WAKE_WATER1.getDefaultState());

				}
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World playerIn, List<String> tooltip, ITooltipFlag advanced) {
		int meta = stack.getMetadata();

		if(this != ChinjufuModArmor.TONE_BOOTS_KAI) {}

		if(this == ChinjufuModArmor.TONE_BOOTS_KAI) {
			tooltip.add(I18n.format("tips.item.item_suijou_boots.name", meta));
		}
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
