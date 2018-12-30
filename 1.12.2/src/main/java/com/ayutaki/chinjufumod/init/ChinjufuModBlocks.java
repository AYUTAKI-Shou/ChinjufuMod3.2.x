package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.blocks.BlockAdmiralStamp;
import com.ayutaki.chinjufumod.init.blocks.BlockAlumiBlock;
import com.ayutaki.chinjufumod.init.blocks.BlockAmmunitionBox;
import com.ayutaki.chinjufumod.init.blocks.BlockBauxiteBox;
import com.ayutaki.chinjufumod.init.blocks.BlockBauxiteOre;
import com.ayutaki.chinjufumod.init.blocks.BlockEmptyBox;
import com.ayutaki.chinjufumod.init.blocks.BlockOilDrum;
import com.ayutaki.chinjufumod.init.blocks.BlockSteelBlock;
import com.ayutaki.chinjufumod.init.blocks.BlockWakeWater1;
import com.ayutaki.chinjufumod.init.blocks.BlockWakeWater2;
import com.ayutaki.chinjufumod.init.blocks.BlockWakeWater3;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ChinjufuModBlocks {

	/* 追加するブロックの宣言 Declare blocks to add. */
	public static Block BAUXITE_ORE;
	public static Block EMPTY_BOX;
	public static Block OIL_DRUM;
	public static Block AMMUNITION_BOX, BAUXITE_BOX;
	public static Block STEEL_BLOCK, ALUMI_BLOCK;

	public static Block B_ADMIRAL_STAMP;

	public static Block WAKE_WATER1, WAKE_WATER2, WAKE_WATER3;

	/* ブロックのインスタンスを生成 Instantiate blocks. */
	public static void init() {
		BAUXITE_ORE = new BlockBauxiteOre().setRegistryName("block_bauxite_ore")
				.setUnlocalizedName("block_bauxite_ore").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		EMPTY_BOX = new BlockEmptyBox().setRegistryName("block_empty_box")
				.setUnlocalizedName("block_empty_box").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		OIL_DRUM = new BlockOilDrum().setRegistryName("block_fuel_can").setUnlocalizedName("block_fuel_can").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		AMMUNITION_BOX = new BlockAmmunitionBox().setRegistryName("block_ammunition_box").setUnlocalizedName("block_ammunition_box").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		BAUXITE_BOX = new BlockBauxiteBox().setRegistryName("block_bauxite_box").setUnlocalizedName("block_bauxite_box").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		STEEL_BLOCK = new BlockSteelBlock().setRegistryName("block_steel_block")
				.setUnlocalizedName("block_steel_block").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		ALUMI_BLOCK = new BlockAlumiBlock().setRegistryName("block_alumi_block").setUnlocalizedName("block_alumi_block").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		B_ADMIRAL_STAMP = new BlockAdmiralStamp(Material.WOOD).setRegistryName("block_stamp_block")
				.setUnlocalizedName("block_stamp_block").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		WAKE_WATER1 = new BlockWakeWater1().setRegistryName("block_wake_water1").setUnlocalizedName("block_wake_water1");
		WAKE_WATER2 = new BlockWakeWater2().setRegistryName("block_wake_water2").setUnlocalizedName("block_wake_water2");
		WAKE_WATER3 = new BlockWakeWater3().setRegistryName("block_wake_water3").setUnlocalizedName("block_wake_water3");


	}


	/* ブロックを登録する、ここから Register Blocks. From here. ↓*/
	public static void register() {
		registerBlock(BAUXITE_ORE);
		registerBlock(EMPTY_BOX);
		registerBlock(OIL_DRUM);
		registerBlock(AMMUNITION_BOX);
		registerBlock(BAUXITE_BOX);
		registerBlock(STEEL_BLOCK);
		registerBlock(ALUMI_BLOCK);

		registerBlock(B_ADMIRAL_STAMP);

		registerBlock(WAKE_WATER1);
		registerBlock(WAKE_WATER2);
		registerBlock(WAKE_WATER3);


	}

	/** ブロックの登録 Register Blocks. **/
	public static void registerBlock(Block block) {
		registerBlock(block, new ItemBlock(block));
	}

	/** アイテムブロックの登録 Register ItemBlocks. **/
	public static void registerBlock(Block block, ItemBlock item) {
		RegistrationHandler.BLOCKS.add(block);
		item.setRegistryName(block.getRegistryName());
		ChinjufuModItems.RegistrationHandler.ITEMS.add(item);
	}
	/*ここまで So far↑ */


	/* ドロップ時やインベントリにおける、アイテムブロックの描画を登録。ここから↓
	* Register rendering of ItemBlocks in drop and inventory. From here↓*/
	public static void registerRenders() {
		registerRender(BAUXITE_ORE);
		registerRender(EMPTY_BOX);
		registerRender(OIL_DRUM);
		registerRender(AMMUNITION_BOX);
		registerRender(BAUXITE_BOX);
		registerRender(STEEL_BLOCK);
		registerRender(ALUMI_BLOCK);

		registerRender(B_ADMIRAL_STAMP);


	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(),"inventory"));
	}
	/*ここまで So far↑ */


    /* ------------------------------------------------------------------------
     * ここから From here. ↓ */

	/* ブロックの登録を行う【内部クラス】
	 * Register blocks 【Inner Class】 */
	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class RegistrationHandler {

		public static final List<Block> BLOCKS = new LinkedList<>();

		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Block> event) {

			ChinjufuModBlocks.init();
			ChinjufuModBlocks.register();
			BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
		}
	}
    /*ここまで So far↑
     * ------------------------------------------------------------------------ */

}
