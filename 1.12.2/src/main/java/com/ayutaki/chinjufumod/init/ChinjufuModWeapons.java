package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.items.kansaiki.ItemJu87;
import com.ayutaki.chinjufumod.init.items.kansaiki.ItemRyusei;
import com.ayutaki.chinjufumod.init.items.kansaiki.ItemSwordfish;
import com.ayutaki.chinjufumod.init.items.kansaiki.ItemTBF;
import com.ayutaki.chinjufumod.init.items.kansaiki.ItemTenzan;
import com.ayutaki.chinjufumod.init.items.kansaiki.ItemType97;
import com.ayutaki.chinjufumod.init.items.weapons.ItemAmmunition_KC;
import com.ayutaki.chinjufumod.init.items.weapons.ItemAmmunition_Medium;
import com.ayutaki.chinjufumod.init.items.weapons.ItemAmmunition_Small;
import com.ayutaki.chinjufumod.init.items.weapons.ItemKoukakuHou100;
import com.ayutaki.chinjufumod.init.items.weapons.ItemRensouHou127;
import com.ayutaki.chinjufumod.init.items.weapons.ItemRensouHou155;
import com.ayutaki.chinjufumod.init.items.weapons.ItemRensouHou203;
import com.ayutaki.chinjufumod.init.items.weapons.ItemRensouHou203SKC34;
import com.ayutaki.chinjufumod.init.items.weapons.ItemRensouHou356;
import com.ayutaki.chinjufumod.init.items.weapons.ItemRensouHou356S3;
import com.ayutaki.chinjufumod.init.items.weapons.ItemRensouHou380;
import com.ayutaki.chinjufumod.init.items.weapons.ItemShigureHou;
import com.ayutaki.chinjufumod.init.items.weapons.ItemSwordIchoh;
import com.ayutaki.chinjufumod.init.items.weapons.ItemSwordKaede;
import com.ayutaki.chinjufumod.init.items.weapons.ItemSwordSakura;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChinjufuModWeapons {

	public static Item AMMUNITION_KC, AMMUNITION_MEDIUM, AMMUNITION_SMALL;
	public static Item CARTRIDGE_KC, CARTRIDGE_MEDIUM, CARTRIDGE_SMALL;

	public static Item RENSOUHOU_127, SHIGUREHOU, KOUKAKUHOU_100;
	public static Item RENSOUHOU_155, RENSOUHOU_203, RENSOUHOU_SKC, RENSOUHOU_356, RENSOUHOU_356S3, RENSOUHOU_380;

	public static Item TYPE97KK, TENZAN, RYUSEI, JU87, TBF, SWORDFISH;

	public static Item SWORD_sakura, SWORD_ichoh, SWORD_kaede;

	public static void init() {

		AMMUNITION_KC = new ItemAmmunition_KC().setRegistryName("item_ammunition_kc").setUnlocalizedName("item_ammunition_kc").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		AMMUNITION_MEDIUM = new ItemAmmunition_Medium().setRegistryName("item_ammunition_medium").setUnlocalizedName("item_ammunition_medium").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		AMMUNITION_SMALL = new ItemAmmunition_Small().setRegistryName("item_ammunition_small").setUnlocalizedName("item_ammunition_small").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

		CARTRIDGE_KC = new Item().setRegistryName("item_cartridge_kc").setUnlocalizedName("item_cartridge_kc");
		CARTRIDGE_MEDIUM = new Item().setRegistryName("item_cartridge_medium").setUnlocalizedName("item_cartridge_medium");
		CARTRIDGE_SMALL = new Item().setRegistryName("item_cartridge_small").setUnlocalizedName("item_cartridge_small");

		RENSOUHOU_127 = new ItemRensouHou127().setRegistryName("item_rensouhou127").setUnlocalizedName("item_rensouhou127").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		SHIGUREHOU = new ItemShigureHou().setRegistryName("item_shigurehou").setUnlocalizedName("item_shigurehou").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		KOUKAKUHOU_100 = new ItemKoukakuHou100().setRegistryName("item_koukakuhou100").setUnlocalizedName("item_koukakuhou100").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

		RENSOUHOU_155 = new ItemRensouHou155().setRegistryName("item_rensouhou155").setUnlocalizedName("item_rensouhou155").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		RENSOUHOU_203 = new ItemRensouHou203().setRegistryName("item_rensouhou203").setUnlocalizedName("item_rensouhou203").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		RENSOUHOU_SKC = new ItemRensouHou203SKC34().setRegistryName("item_rensouhou203_skc34").setUnlocalizedName("item_rensouhou203_skc34").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		RENSOUHOU_356 = new ItemRensouHou356().setRegistryName("item_rensouhou356").setUnlocalizedName("item_rensouhou356").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		RENSOUHOU_356S3 = new ItemRensouHou356S3().setRegistryName("item_rensouhou356_s3").setUnlocalizedName("item_rensouhou356_s3").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		RENSOUHOU_380 = new ItemRensouHou380().setRegistryName("item_rensouhou380").setUnlocalizedName("item_rensouhou380").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

		TYPE97KK = new ItemType97(ToolMaterial.STONE).setRegistryName("item_kk_type97").setUnlocalizedName("item_kk_type97").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		TENZAN = new ItemTenzan(ToolMaterial.IRON).setRegistryName("item_kk_tenzan").setUnlocalizedName("item_kk_tenzan").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		RYUSEI = new ItemRyusei(ToolMaterial.DIAMOND).setRegistryName("item_kk_ryusei").setUnlocalizedName("item_kk_ryusei").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		JU87 = new ItemJu87(ToolMaterial.IRON).setRegistryName("item_kk_ju87").setUnlocalizedName("item_kk_ju87").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		TBF = new ItemTBF(ToolMaterial.IRON).setRegistryName("item_kk_tbf").setUnlocalizedName("item_kk_tbf").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		SWORDFISH = new ItemSwordfish(ToolMaterial.STONE).setRegistryName("item_kk_swordfish").setUnlocalizedName("item_kk_swordfish").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

		SWORD_sakura = new ItemSwordSakura(ToolMaterial.WOOD).setRegistryName("item_sword_sakura").setUnlocalizedName("item_sword_sakura").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		SWORD_ichoh = new ItemSwordIchoh(ToolMaterial.WOOD).setRegistryName("item_sword_ichoh").setUnlocalizedName("item_sword_ichoh").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		SWORD_kaede = new ItemSwordKaede(ToolMaterial.WOOD).setRegistryName("item_sword_kaede").setUnlocalizedName("item_sword_kaede").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

	}

	public static void register() {

		registerItem(AMMUNITION_KC);
		registerItem(AMMUNITION_MEDIUM);
		registerItem(AMMUNITION_SMALL);
		registerItem(CARTRIDGE_KC);
		registerItem(CARTRIDGE_MEDIUM);
		registerItem(CARTRIDGE_SMALL);

		registerItem(RENSOUHOU_127);
		registerItem(SHIGUREHOU);
		registerItem(KOUKAKUHOU_100);

		registerItem(RENSOUHOU_155);
		registerItem(RENSOUHOU_203);
		registerItem(RENSOUHOU_SKC);
		registerItem(RENSOUHOU_356);
		registerItem(RENSOUHOU_356S3);
		registerItem(RENSOUHOU_380);

		registerItem(TYPE97KK);
		registerItem(TENZAN);
		registerItem(RYUSEI);
		registerItem(JU87);
		registerItem(TBF);
		registerItem(SWORDFISH);

		registerItem(SWORD_sakura);
		registerItem(SWORD_ichoh);
		registerItem(SWORD_kaede);

	}

	public static void registerItem(Item item) {
		RegistrationHandler.ITEMS.add(item);
	}

	public static void registerRenders() {

		registerRender(AMMUNITION_KC);
		registerRender(AMMUNITION_MEDIUM);
		registerRender(AMMUNITION_SMALL);
		registerRender(CARTRIDGE_KC);
		registerRender(CARTRIDGE_MEDIUM);
		registerRender(CARTRIDGE_SMALL);

		registerRender(RENSOUHOU_127);
		registerRender(SHIGUREHOU);
		registerRender(KOUKAKUHOU_100);

		registerRender(RENSOUHOU_155);
		registerRender(RENSOUHOU_203);
		registerRender(RENSOUHOU_SKC);
		registerRender(RENSOUHOU_356);
		registerRender(RENSOUHOU_356S3);
		registerRender(RENSOUHOU_380);

		registerRender(TYPE97KK);
		registerRender(TENZAN);
		registerRender(RYUSEI);
		registerRender(JU87);
		registerRender(TBF);
		registerRender(SWORDFISH);

		registerRender(SWORD_sakura);
		registerRender(SWORD_ichoh);
		registerRender(SWORD_kaede);

	}

	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}

	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class RegistrationHandler {

		public static final List<Item> ITEMS = new LinkedList<>();

		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {

			ChinjufuModWeapons.init();
			ChinjufuModWeapons.register();
			ITEMS.stream().forEach(item -> event.getRegistry().register(item));
		}
	}
}
