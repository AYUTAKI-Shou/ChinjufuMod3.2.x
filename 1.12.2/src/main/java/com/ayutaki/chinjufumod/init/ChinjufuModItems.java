package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.items.ItemAdmiralStamp;
import com.ayutaki.chinjufumod.init.items.ItemClayKawara;
import com.ayutaki.chinjufumod.init.items.ItemSlakedlime;
import com.ayutaki.chinjufumod.init.items.ItemSumi;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChinjufuModItems {

	public static Item EMBLEM_C;
	public static Item ADMIRAL_STAMP, WORK_ORDER;
	public static Item BAUXITE, ALUMINUM;
	public static Item SUMI;

	public static Item SHOUSEKKAI, CLAYKAWARA;
	public static Item ORIITO, TANMONO, WARAHAI;

	/* アイテムのインスタンスを生成 Instantiate an item. */
	public static void init() {
		EMBLEM_C = new Item().setRegistryName("item_emblem_c").setUnlocalizedName("item_emblem_c");
		ADMIRAL_STAMP = new ItemAdmiralStamp().setRegistryName("item_admiralstamp").setUnlocalizedName("item_admiral_stamp").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		WORK_ORDER = new Item().setRegistryName("item_workorder").setUnlocalizedName("item_work_order").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		BAUXITE = new Item().setRegistryName("item_bauxite").setUnlocalizedName("item_bauxite").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		ALUMINUM = new Item().setRegistryName("item_ingot_alumi").setUnlocalizedName("item_ingot_alumi").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SUMI = new ItemSumi().setRegistryName("item_sumi_c").setUnlocalizedName("item_sumi_c").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		SHOUSEKKAI = new ItemSlakedlime().setRegistryName("item_shousekkai_c").setUnlocalizedName("item_shousekkai_c").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);
		CLAYKAWARA = new ItemClayKawara().setRegistryName("item_claykawara").setUnlocalizedName("item_claykawara").setCreativeTab(ChinjufuModTabs.tab_cmodwablock);

		WARAHAI = new Item().setRegistryName("item_warahai").setUnlocalizedName("item_warahai").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		ORIITO = new Item().setRegistryName("item_oriito").setUnlocalizedName("item_oriito").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		TANMONO = new Item().setRegistryName("item_tanmono").setUnlocalizedName("item_tanmono").setCreativeTab(ChinjufuModTabs.tab_seasonal);

	}


	/* アイテムを登録する、ここから Register Items. From here. ↓*/
	public static void register() {
		registerItem(EMBLEM_C);
		registerItem(ADMIRAL_STAMP);
		registerItem(WORK_ORDER);
		registerItem(BAUXITE);
		registerItem(ALUMINUM);
		registerItem(SUMI);

		registerItem(SHOUSEKKAI);
		registerItem(CLAYKAWARA);

		registerItem(WARAHAI);
		registerItem(ORIITO);
		registerItem(TANMONO);

	}

	public static void registerItem(Item item) {
		RegistrationHandler.ITEMS.add(item);
	}
	/*ここまで So far↑ */


	/* ドロップ時やインベントリにおける、アイテムやアイテムブロックの描画を登録。ここから↓
	* Register rendering of Items and ItemBlocks in drop and inventory. From here↓*/
	public static void registerRenders() {
		registerRender(EMBLEM_C);
		registerRender(ADMIRAL_STAMP);
		registerRender(WORK_ORDER);
		registerRender(BAUXITE);
		registerRender(ALUMINUM);
		registerRender(SUMI);

		registerRender(SHOUSEKKAI);
		registerRender(CLAYKAWARA);

		registerRender(WARAHAI);
		registerRender(ORIITO);
		registerRender(TANMONO);

	}

	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}
	/*ここまで So far↑ */



    /* ------------------------------------------------------------------------
     * ここから From here. ↓ */

	/* アイテムやアイテムブロックを登録する【内部クラス】
	* Register Items and ItemBlocks. 【Inner Classs】 */
	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class RegistrationHandler {

		public static final List<Item> ITEMS = new LinkedList<>();

		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {

			ChinjufuModItems.init();
			ChinjufuModItems.register();
			ITEMS.stream().forEach(item -> event.getRegistry().register(item));
		}
	}
    /*ここまで So far↑
     * ------------------------------------------------------------------------ */

}
