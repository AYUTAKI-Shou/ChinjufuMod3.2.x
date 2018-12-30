package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.items.armor.ItemAkagiArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemAkagiArmor_kai;
import com.ayutaki.chinjufumod.init.items.armor.ItemFubukiArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemFubukiArmor_kai;
import com.ayutaki.chinjufumod.init.items.armor.ItemKagaArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemKagaArmor_kai;
import com.ayutaki.chinjufumod.init.items.armor.ItemKasumiArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemKasumiArmor_kai;
import com.ayutaki.chinjufumod.init.items.armor.ItemKongouArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemKongouArmor_kai;
import com.ayutaki.chinjufumod.init.items.armor.ItemMogamiArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemMogamiArmor_kai;
import com.ayutaki.chinjufumod.init.items.armor.ItemRyujouArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemRyujouArmor_kai;
import com.ayutaki.chinjufumod.init.items.armor.ItemSantaAkashi;
import com.ayutaki.chinjufumod.init.items.armor.ItemSantaKumano;
import com.ayutaki.chinjufumod.init.items.armor.ItemSantaRyujou;
import com.ayutaki.chinjufumod.init.items.armor.ItemSantaSuzuya;
import com.ayutaki.chinjufumod.init.items.armor.ItemSantaTeitoku;
import com.ayutaki.chinjufumod.init.items.armor.ItemSendaiArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemSendaiArmor_kai;
import com.ayutaki.chinjufumod.init.items.armor.ItemShigureArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemShigureArmor_kai;
import com.ayutaki.chinjufumod.init.items.armor.ItemShiratsuyuArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemShiratsuyuArmor_kai;
import com.ayutaki.chinjufumod.init.items.armor.ItemToneArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemToneArmor_kai;
import com.ayutaki.chinjufumod.init.items.armor.ItemYkt_Hamakaze;
import com.ayutaki.chinjufumod.init.items.armor.ItemYkt_Ikaduchi;
import com.ayutaki.chinjufumod.init.items.armor.ItemYkt_Inaduma;
import com.ayutaki.chinjufumod.init.items.armor.ItemYkt_Kawakaze;
import com.ayutaki.chinjufumod.init.items.armor.ItemYkt_Oboro;
import com.ayutaki.chinjufumod.init.items.armor.ItemYkt_Teitoku;
import com.ayutaki.chinjufumod.init.items.armor.ItemYkt_TeitokuB;
import com.ayutaki.chinjufumod.init.items.armor.ItemYkt_Urakaze;
import com.ayutaki.chinjufumod.init.items.armor.ItemYuraArmor;
import com.ayutaki.chinjufumod.init.items.armor.ItemYuraArmor_kai;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChinjufuModArmor {

	public static Item FUBUKI_HELMET, FUBUKI_CHESTPLATE, FUBUKI_LEGGINGS, FUBUKI_BOOTS, FUBUKI_BOOTS_KAI;
	public static Item KASUMI_HELMET, KASUMI_CHESTPLATE, KASUMI_LEGGINGS, KASUMI_BOOTS, KASUMI_BOOTS_KAI;
	public static Item SHIGURE_HELMET, SHIGURE_CHESTPLATE, SHIGURE_LEGGINGS, SHIGURE_BOOTS, SHIGURE_BOOTS_KAI;
	public static Item SHIRATSUYU_HELMET, SHIRATSUYU_CHESTPLATE, SHIRATSUYU_LEGGINGS, SHIRATSUYU_BOOTS, SHIRATSUYU_BOOTS_KAI;

	public static Item AKASHISANTA_HELMET, AKASHISANTA_CHESTPLATE, AKASHISANTA_LEGGINGS, AKASHISANTA_BOOTS;
	public static Item KUMANOSANTA_HELMET, KUMANOSANTA_CHESTPLATE, KUMANOSANTA_LEGGINGS, KUMANOSANTA_BOOTS;
	public static Item SUZUYASANTA_HELMET, SUZUYASANTA_CHESTPLATE, SUZUYASANTA_LEGGINGS, SUZUYASANTA_BOOTS;
	public static Item RYUJOUSANTA_HELMET, RYUJOUSANTA_CHESTPLATE, RYUJOUSANTA_LEGGINGS, RYUJOUSANTA_BOOTS;
	public static Item TEITOKUSANTA_HELMET, TEITOKUSANTA_CHESTPLATE, TEITOKUSANTA_LEGGINGS, TEITOKUSANTA_BOOTS;

	public static Item SENDAI_HELMET, SENDAI_CHESTPLATE, SENDAI_LEGGINGS, SENDAI_BOOTS, SENDAI_BOOTS_KAI;
	public static Item YURA_HELMET, YURA_CHESTPLATE, YURA_LEGGINGS, YURA_BOOTS, YURA_BOOTS_KAI;
	public static Item MOGAMI_HELMET, MOGAMI_CHESTPLATE, MOGAMI_LEGGINGS, MOGAMI_BOOTS, MOGAMI_BOOTS_KAI;
	public static Item TONE_HELMET, TONE_CHESTPLATE, TONE_LEGGINGS, TONE_BOOTS, TONE_BOOTS_KAI;

	public static Item KONGOU_HELMET, KONGOU_CHESTPLATE, KONGOU_LEGGINGS, KONGOU_BOOTS, KONGOU_BOOTS_KAI;
	public static Item RJ_HELMET, RJ_CHESTPLATE, RJ_LEGGINGS, RJ_BOOTS, RJ_BOOTS_KAI;
	public static Item AKAGI_HELMET, AKAGI_CHESTPLATE, AKAGI_LEGGINGS, AKAGI_BOOTS, AKAGI_BOOTS_KAI;
	public static Item KAGA_HELMET, KAGA_CHESTPLATE, KAGA_LEGGINGS, KAGA_BOOTS, KAGA_BOOTS_KAI;

	public static Item YKTD_BOOTS, YKTO_BOOTS;
	public static Item IKADUCHIYKT_HELMET, IKADUCHIYKT_CHESTPLATE, IKADUCHIYKT_LEGGINGS;
	public static Item INADUMAYKT_HELMET, INADUMAYKT_CHESTPLATE, INADUMAYKT_LEGGINGS;
	public static Item HAMAKAZEYKT_HELMET, HAMAKAZEYKT_CHESTPLATE, HAMAKAZEYKT_LEGGINGS;
	public static Item URAKAZEYKT_HELMET, URAKAZEYKT_CHESTPLATE, URAKAZEYKT_LEGGINGS;
	public static Item KAWAKAZEYKT_HELMET, KAWAKAZEYKT_CHESTPLATE, KAWAKAZEYKT_LEGGINGS;
	public static Item OBOROYKT_HELMET, OBOROYKT_CHESTPLATE, OBOROYKT_LEGGINGS;
	public static Item TTOKUYKT_CHESTPLATE, TTOKUYKT_LEGGINGS, TTOKUYKTB_CHESTPLATE, TTOKUYKTB_LEGGINGS;

	public static void init() {
		/* 駆逐艦 */
		FUBUKI_HELMET = new ItemFubukiArmor(1, EntityEquipmentSlot.HEAD).setRegistryName("item_fubuki_helmet").setUnlocalizedName("item_fubuki_helmet").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		FUBUKI_CHESTPLATE = new ItemFubukiArmor(1,EntityEquipmentSlot.CHEST).setRegistryName("item_fubuki_chestplate").setUnlocalizedName("item_fubuki_chestplate").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		FUBUKI_LEGGINGS = new ItemFubukiArmor(2, EntityEquipmentSlot.LEGS).setRegistryName("item_fubuki_leggings").setUnlocalizedName("item_fubuki_leggings").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		FUBUKI_BOOTS = new ItemFubukiArmor(1,EntityEquipmentSlot.FEET).setRegistryName("item_fubuki_boots").setUnlocalizedName("item_fubuki_boots").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		FUBUKI_BOOTS_KAI = new ItemFubukiArmor_kai(1,EntityEquipmentSlot.FEET).setRegistryName("item_fubuki_bootskai").setUnlocalizedName("item_fubuki_bootskai").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

		KASUMI_HELMET = new ItemKasumiArmor(1, EntityEquipmentSlot.HEAD).setRegistryName("item_kasumi_helmet").setUnlocalizedName("item_kasumi_helmet").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		KASUMI_CHESTPLATE = new ItemKasumiArmor(1,EntityEquipmentSlot.CHEST).setRegistryName("item_kasumi_chestplate").setUnlocalizedName("item_kasumi_chestplate").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		KASUMI_LEGGINGS = new ItemKasumiArmor(2, EntityEquipmentSlot.LEGS).setRegistryName("item_kasumi_leggings").setUnlocalizedName("item_kasumi_leggings").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		KASUMI_BOOTS = new ItemKasumiArmor(1,EntityEquipmentSlot.FEET).setRegistryName("item_kasumi_boots").setUnlocalizedName("item_kasumi_boots").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		KASUMI_BOOTS_KAI = new ItemKasumiArmor_kai(1,EntityEquipmentSlot.FEET).setRegistryName("item_kasumi_bootskai").setUnlocalizedName("item_kasumi_bootskai").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

		SHIGURE_HELMET = new ItemShigureArmor(1, EntityEquipmentSlot.HEAD).setRegistryName("item_shigure_helmet").setUnlocalizedName("item_shigure_helmet").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		SHIGURE_CHESTPLATE = new ItemShigureArmor(1,EntityEquipmentSlot.CHEST).setRegistryName("item_shigure_chestplate").setUnlocalizedName("item_shigure_chestplate").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		SHIGURE_LEGGINGS = new ItemShigureArmor(2, EntityEquipmentSlot.LEGS).setRegistryName("item_shigure_leggings").setUnlocalizedName("item_shigure_leggings").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		SHIGURE_BOOTS = new ItemShigureArmor(1,EntityEquipmentSlot.FEET).setRegistryName("item_shigure_boots").setUnlocalizedName("item_shigure_boots").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		SHIGURE_BOOTS_KAI = new ItemShigureArmor_kai(1,EntityEquipmentSlot.FEET).setRegistryName("item_shigure_bootskai").setUnlocalizedName("item_shigure_bootskai").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

		SHIRATSUYU_HELMET = new ItemShiratsuyuArmor(1, EntityEquipmentSlot.HEAD).setRegistryName("item_shiratsuyu_helmet").setUnlocalizedName("item_shiratsuyu_helmet").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		SHIRATSUYU_CHESTPLATE = new ItemShiratsuyuArmor(1,EntityEquipmentSlot.CHEST).setRegistryName("item_shiratsuyu_chestplate").setUnlocalizedName("item_shiratsuyu_chestplate").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		SHIRATSUYU_LEGGINGS = new ItemShiratsuyuArmor(2, EntityEquipmentSlot.LEGS).setRegistryName("item_shiratsuyu_leggings").setUnlocalizedName("item_shiratsuyu_leggings").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		SHIRATSUYU_BOOTS = new ItemShiratsuyuArmor(1,EntityEquipmentSlot.FEET).setRegistryName("item_shiratsuyu_boots").setUnlocalizedName("item_shiratsuyu_boots").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		SHIRATSUYU_BOOTS_KAI = new ItemShiratsuyuArmor_kai(1,EntityEquipmentSlot.FEET).setRegistryName("item_shiratsuyu_bootskai").setUnlocalizedName("item_shiratsuyu_bootskai").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

		/* サンタコス */
		AKASHISANTA_HELMET = new ItemSantaAkashi(1, EntityEquipmentSlot.HEAD).setRegistryName("item_santaakashi_helmet").setUnlocalizedName("item_santaakashi_helmet").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		AKASHISANTA_CHESTPLATE = new ItemSantaAkashi(1,EntityEquipmentSlot.CHEST).setRegistryName("item_santaakashi_chestplate").setUnlocalizedName("item_santaakashi_chestplate").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		AKASHISANTA_LEGGINGS = new ItemSantaAkashi(2, EntityEquipmentSlot.LEGS).setRegistryName("item_santaakashi_leggings").setUnlocalizedName("item_santaakashi_leggings").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		AKASHISANTA_BOOTS = new ItemSantaAkashi(1,EntityEquipmentSlot.FEET).setRegistryName("item_santaakashi_boots").setUnlocalizedName("item_santaakashi_boots").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		KUMANOSANTA_HELMET = new ItemSantaKumano(1, EntityEquipmentSlot.HEAD).setRegistryName("item_santakumano_helmet").setUnlocalizedName("item_santakumano_helmet").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KUMANOSANTA_CHESTPLATE = new ItemSantaKumano(1,EntityEquipmentSlot.CHEST).setRegistryName("item_santakumano_chestplate").setUnlocalizedName("item_santakumano_chestplate").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KUMANOSANTA_LEGGINGS = new ItemSantaKumano(2, EntityEquipmentSlot.LEGS).setRegistryName("item_santakumano_leggings").setUnlocalizedName("item_santakumano_leggings").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KUMANOSANTA_BOOTS = new ItemSantaKumano(1,EntityEquipmentSlot.FEET).setRegistryName("item_santakumano_boots").setUnlocalizedName("item_santakumano_boots").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		SUZUYASANTA_HELMET = new ItemSantaSuzuya(1, EntityEquipmentSlot.HEAD).setRegistryName("item_santasuzuya_helmet").setUnlocalizedName("item_santasuzuya_helmet").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SUZUYASANTA_CHESTPLATE = new ItemSantaSuzuya(1,EntityEquipmentSlot.CHEST).setRegistryName("item_santasuzuya_chestplate").setUnlocalizedName("item_santasuzuya_chestplate").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SUZUYASANTA_LEGGINGS = new ItemSantaSuzuya(2, EntityEquipmentSlot.LEGS).setRegistryName("item_santasuzuya_leggings").setUnlocalizedName("item_santasuzuya_leggings").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SUZUYASANTA_BOOTS = new ItemSantaSuzuya(1,EntityEquipmentSlot.FEET).setRegistryName("item_santasuzuya_boots").setUnlocalizedName("item_santasuzuya_boots").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		RYUJOUSANTA_HELMET = new ItemSantaRyujou(1, EntityEquipmentSlot.HEAD).setRegistryName("item_santaryujou_helmet").setUnlocalizedName("item_santaryujou_helmet").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		RYUJOUSANTA_CHESTPLATE = new ItemSantaRyujou(1,EntityEquipmentSlot.CHEST).setRegistryName("item_santaryujou_chestplate").setUnlocalizedName("item_santaryujou_chestplate").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		RYUJOUSANTA_LEGGINGS = new ItemSantaRyujou(2, EntityEquipmentSlot.LEGS).setRegistryName("item_santaryujou_leggings").setUnlocalizedName("item_santaryujou_leggings").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		RYUJOUSANTA_BOOTS = new ItemSantaRyujou(1,EntityEquipmentSlot.FEET).setRegistryName("item_santaryujou_boots").setUnlocalizedName("item_santaryujou_boots").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		TEITOKUSANTA_HELMET = new ItemSantaTeitoku(1, EntityEquipmentSlot.HEAD).setRegistryName("item_santattk_helmet").setUnlocalizedName("item_santattk_helmet").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		TEITOKUSANTA_CHESTPLATE = new ItemSantaTeitoku(1,EntityEquipmentSlot.CHEST).setRegistryName("item_santattk_chestplate").setUnlocalizedName("item_santattk_chestplate").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		TEITOKUSANTA_LEGGINGS = new ItemSantaTeitoku(2, EntityEquipmentSlot.LEGS).setRegistryName("item_santattk_leggings").setUnlocalizedName("item_santattk_leggings").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		TEITOKUSANTA_BOOTS = new ItemSantaTeitoku(1,EntityEquipmentSlot.FEET).setRegistryName("item_santattk_boots").setUnlocalizedName("item_santattk_boots").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		/* 軽巡洋艦 */
		SENDAI_HELMET = new ItemSendaiArmor(1, EntityEquipmentSlot.HEAD).setRegistryName("item_sendai_helmet").setUnlocalizedName("item_sendai_helmet").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		SENDAI_CHESTPLATE = new ItemSendaiArmor(1,EntityEquipmentSlot.CHEST).setRegistryName("item_sendai_chestplate").setUnlocalizedName("item_sendai_chestplate").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		SENDAI_LEGGINGS = new ItemSendaiArmor(2, EntityEquipmentSlot.LEGS).setRegistryName("item_sendai_leggings").setUnlocalizedName("item_sendai_leggings").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		SENDAI_BOOTS = new ItemSendaiArmor(1,EntityEquipmentSlot.FEET).setRegistryName("item_sendai_boots").setUnlocalizedName("item_sendai_boots").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		SENDAI_BOOTS_KAI = new ItemSendaiArmor_kai(1,EntityEquipmentSlot.FEET).setRegistryName("item_sendai_bootskai").setUnlocalizedName("item_sendai_bootskai").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

		YURA_HELMET = new ItemYuraArmor(1, EntityEquipmentSlot.HEAD).setRegistryName("item_yura_helmet").setUnlocalizedName("item_yura_helmet").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		YURA_CHESTPLATE = new ItemYuraArmor(1,EntityEquipmentSlot.CHEST).setRegistryName("item_yura_chestplate").setUnlocalizedName("item_yura_chestplate").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		YURA_LEGGINGS = new ItemYuraArmor(2, EntityEquipmentSlot.LEGS).setRegistryName("item_yura_leggings").setUnlocalizedName("item_yura_leggings").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		YURA_BOOTS = new ItemYuraArmor(1,EntityEquipmentSlot.FEET).setRegistryName("item_yura_boots").setUnlocalizedName("item_yura_boots").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		YURA_BOOTS_KAI = new ItemYuraArmor_kai(1,EntityEquipmentSlot.FEET).setRegistryName("item_yura_bootskai").setUnlocalizedName("item_yura_bootskai").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

		/* 重巡洋艦 */
		MOGAMI_HELMET = new ItemMogamiArmor(1, EntityEquipmentSlot.HEAD).setRegistryName("item_mogami_helmet").setUnlocalizedName("item_mogami_helmet").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		MOGAMI_CHESTPLATE = new ItemMogamiArmor(1,EntityEquipmentSlot.CHEST).setRegistryName("item_mogami_chestplate").setUnlocalizedName("item_mogami_chestplate").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		MOGAMI_LEGGINGS = new ItemMogamiArmor(2, EntityEquipmentSlot.LEGS).setRegistryName("item_mogami_leggings").setUnlocalizedName("item_mogami_leggings").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		MOGAMI_BOOTS = new ItemMogamiArmor(1,EntityEquipmentSlot.FEET).setRegistryName("item_mogami_boots").setUnlocalizedName("item_mogami_boots").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		MOGAMI_BOOTS_KAI = new ItemMogamiArmor_kai(1,EntityEquipmentSlot.FEET).setRegistryName("item_mogami_bootskai").setUnlocalizedName("item_mogami_bootskai").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

		TONE_HELMET = new ItemToneArmor(1, EntityEquipmentSlot.HEAD).setRegistryName("item_tone_helmet").setUnlocalizedName("item_tone_helmet").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		TONE_CHESTPLATE = new ItemToneArmor(1,EntityEquipmentSlot.CHEST).setRegistryName("item_tone_chestplate").setUnlocalizedName("item_tone_chestplate").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		TONE_LEGGINGS = new ItemToneArmor(2, EntityEquipmentSlot.LEGS).setRegistryName("item_tone_leggings").setUnlocalizedName("item_tone_leggings").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		TONE_BOOTS = new ItemToneArmor(1,EntityEquipmentSlot.FEET).setRegistryName("item_tone_boots").setUnlocalizedName("item_tone_boots").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		TONE_BOOTS_KAI = new ItemToneArmor_kai(1,EntityEquipmentSlot.FEET).setRegistryName("item_tone_bootskai").setUnlocalizedName("item_tone_bootskai").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

		/* 戦艦 */
		KONGOU_HELMET = new ItemKongouArmor(1, EntityEquipmentSlot.HEAD).setRegistryName("item_kongou_helmet").setUnlocalizedName("item_kongou_helmet").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		KONGOU_CHESTPLATE = new ItemKongouArmor(1,EntityEquipmentSlot.CHEST).setRegistryName("item_kongou_chestplate").setUnlocalizedName("item_kongou_chestplate").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		KONGOU_LEGGINGS = new ItemKongouArmor(2, EntityEquipmentSlot.LEGS).setRegistryName("item_kongou_leggings").setUnlocalizedName("item_kongou_leggings").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		KONGOU_BOOTS = new ItemKongouArmor(1,EntityEquipmentSlot.FEET).setRegistryName("item_kongou_boots").setUnlocalizedName("item_kongou_boots").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		KONGOU_BOOTS_KAI = new ItemKongouArmor_kai(1,EntityEquipmentSlot.FEET).setRegistryName("item_kongou_bootskai").setUnlocalizedName("item_kongou_bootskai").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

		/* 空母 */
		RJ_HELMET = new ItemRyujouArmor(1, EntityEquipmentSlot.HEAD).setRegistryName("item_ryujou_helmet").setUnlocalizedName("item_ryujou_helmet").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		RJ_CHESTPLATE = new ItemRyujouArmor(1,EntityEquipmentSlot.CHEST).setRegistryName("item_ryujou_chestplate").setUnlocalizedName("item_ryujou_chestplate").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		RJ_LEGGINGS = new ItemRyujouArmor(2, EntityEquipmentSlot.LEGS).setRegistryName("item_ryujou_leggings").setUnlocalizedName("item_ryujou_leggings").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		RJ_BOOTS = new ItemRyujouArmor(1,EntityEquipmentSlot.FEET).setRegistryName("item_ryujou_boots").setUnlocalizedName("item_ryujou_boots").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		RJ_BOOTS_KAI = new ItemRyujouArmor_kai(1,EntityEquipmentSlot.FEET).setRegistryName("item_ryujou_bootskai").setUnlocalizedName("item_ryujou_bootskai").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

		AKAGI_HELMET = new ItemAkagiArmor(1, EntityEquipmentSlot.HEAD).setRegistryName("item_akagi_helmet").setUnlocalizedName("item_akagi_helmet").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		AKAGI_CHESTPLATE = new ItemAkagiArmor(1,EntityEquipmentSlot.CHEST).setRegistryName("item_akagi_chestplate").setUnlocalizedName("item_akagi_chestplate").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		AKAGI_LEGGINGS = new ItemAkagiArmor(2, EntityEquipmentSlot.LEGS).setRegistryName("item_akagi_leggings").setUnlocalizedName("item_akagi_leggings").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		AKAGI_BOOTS = new ItemAkagiArmor(1,EntityEquipmentSlot.FEET).setRegistryName("item_akagi_boots").setUnlocalizedName("item_akagi_boots").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		AKAGI_BOOTS_KAI = new ItemAkagiArmor_kai(1,EntityEquipmentSlot.FEET).setRegistryName("item_akagi_bootskai").setUnlocalizedName("item_akagi_bootskai").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

		KAGA_HELMET = new ItemKagaArmor(1, EntityEquipmentSlot.HEAD).setRegistryName("item_kaga_helmet").setUnlocalizedName("item_kaga_helmet").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		KAGA_CHESTPLATE = new ItemKagaArmor(1,EntityEquipmentSlot.CHEST).setRegistryName("item_kaga_chestplate").setUnlocalizedName("item_kaga_chestplate").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		KAGA_LEGGINGS = new ItemKagaArmor(2, EntityEquipmentSlot.LEGS).setRegistryName("item_kaga_leggings").setUnlocalizedName("item_kaga_leggings").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		KAGA_BOOTS = new ItemKagaArmor(1,EntityEquipmentSlot.FEET).setRegistryName("item_kaga_boots").setUnlocalizedName("item_kaga_boots").setCreativeTab(ChinjufuModTabs.tab_cmarmor);
		KAGA_BOOTS_KAI = new ItemKagaArmor_kai(1,EntityEquipmentSlot.FEET).setRegistryName("item_kaga_bootskai").setUnlocalizedName("item_kaga_bootskai").setCreativeTab(ChinjufuModTabs.tab_cmarmor);

		/* 浴衣 */
		YKTD_BOOTS = new ItemYkt_Ikaduchi(1,EntityEquipmentSlot.FEET).setRegistryName("item_ykt_getadoak").setUnlocalizedName("item_ykt_getadoak").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		YKTO_BOOTS = new ItemYkt_Teitoku(1,EntityEquipmentSlot.FEET).setRegistryName("item_ykt_getaoak").setUnlocalizedName("item_ykt_getaoak").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		IKADUCHIYKT_HELMET = new ItemYkt_Ikaduchi(1, EntityEquipmentSlot.HEAD).setRegistryName("item_ykt_ikaduchi_kazari").setUnlocalizedName("item_ykt_ikaduchi_kazari").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		IKADUCHIYKT_CHESTPLATE = new ItemYkt_Ikaduchi(1,EntityEquipmentSlot.CHEST).setRegistryName("item_ykt_ikaduchi_mini").setUnlocalizedName("item_ykt_ikaduchi_mini").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		IKADUCHIYKT_LEGGINGS = new ItemYkt_Ikaduchi(2, EntityEquipmentSlot.LEGS).setRegistryName("item_ykt_ikaduchi_long").setUnlocalizedName("item_ykt_ikaduchi_long").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		INADUMAYKT_HELMET = new ItemYkt_Inaduma(1, EntityEquipmentSlot.HEAD).setRegistryName("item_ykt_inaduma_kazari").setUnlocalizedName("item_ykt_inaduma_kazari").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		INADUMAYKT_CHESTPLATE = new ItemYkt_Inaduma(1,EntityEquipmentSlot.CHEST).setRegistryName("item_ykt_inaduma_mini").setUnlocalizedName("item_ykt_inaduma_mini").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		INADUMAYKT_LEGGINGS = new ItemYkt_Inaduma(2, EntityEquipmentSlot.LEGS).setRegistryName("item_ykt_inaduma_long").setUnlocalizedName("item_ykt_inaduma_long").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		HAMAKAZEYKT_HELMET = new ItemYkt_Hamakaze(1, EntityEquipmentSlot.HEAD).setRegistryName("item_ykt_hamakaze_kazari").setUnlocalizedName("item_ykt_hamakaze_kazari").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		HAMAKAZEYKT_CHESTPLATE = new ItemYkt_Hamakaze(1,EntityEquipmentSlot.CHEST).setRegistryName("item_ykt_hamakaze_mini").setUnlocalizedName("item_ykt_hamakaze_mini").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		HAMAKAZEYKT_LEGGINGS = new ItemYkt_Hamakaze(2, EntityEquipmentSlot.LEGS).setRegistryName("item_ykt_hamakaze_long").setUnlocalizedName("item_ykt_hamakaze_long").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		URAKAZEYKT_HELMET = new ItemYkt_Urakaze(1, EntityEquipmentSlot.HEAD).setRegistryName("item_ykt_urakaze_kazari").setUnlocalizedName("item_ykt_urakaze_kazari").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		URAKAZEYKT_CHESTPLATE = new ItemYkt_Urakaze(1,EntityEquipmentSlot.CHEST).setRegistryName("item_ykt_urakaze_mini").setUnlocalizedName("item_ykt_urakaze_mini").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		URAKAZEYKT_LEGGINGS = new ItemYkt_Urakaze(2, EntityEquipmentSlot.LEGS).setRegistryName("item_ykt_urakaze_long").setUnlocalizedName("item_ykt_urakaze_long").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		KAWAKAZEYKT_HELMET = new ItemYkt_Kawakaze(1, EntityEquipmentSlot.HEAD).setRegistryName("item_ykt_kawakaze_kazari").setUnlocalizedName("item_ykt_kawakaze_kazari").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAWAKAZEYKT_CHESTPLATE = new ItemYkt_Kawakaze(1,EntityEquipmentSlot.CHEST).setRegistryName("item_ykt_kawakaze_mini").setUnlocalizedName("item_ykt_kawakaze_mini").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAWAKAZEYKT_LEGGINGS = new ItemYkt_Kawakaze(2, EntityEquipmentSlot.LEGS).setRegistryName("item_ykt_kawakaze_long").setUnlocalizedName("item_ykt_kawakaze_long").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		OBOROYKT_HELMET = new ItemYkt_Oboro(1, EntityEquipmentSlot.HEAD).setRegistryName("item_ykt_oboro_kazari").setUnlocalizedName("item_ykt_oboro_kazari").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		OBOROYKT_CHESTPLATE = new ItemYkt_Oboro(1,EntityEquipmentSlot.CHEST).setRegistryName("item_ykt_oboro_mini").setUnlocalizedName("item_ykt_oboro_mini").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		OBOROYKT_LEGGINGS = new ItemYkt_Oboro(2, EntityEquipmentSlot.LEGS).setRegistryName("item_ykt_oboro_long").setUnlocalizedName("item_ykt_oboro_long").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		TTOKUYKT_CHESTPLATE = new ItemYkt_Teitoku(1,EntityEquipmentSlot.CHEST).setRegistryName("item_ykt_ttoku_mini").setUnlocalizedName("item_ykt_ttoku_mini").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		TTOKUYKT_LEGGINGS = new ItemYkt_Teitoku(2, EntityEquipmentSlot.LEGS).setRegistryName("item_ykt_ttoku_long").setUnlocalizedName("item_ykt_ttoku_long").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		TTOKUYKTB_CHESTPLATE = new ItemYkt_TeitokuB(1,EntityEquipmentSlot.CHEST).setRegistryName("item_ykt_ttokub_mini").setUnlocalizedName("item_ykt_ttokub_mini").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		TTOKUYKTB_LEGGINGS = new ItemYkt_TeitokuB(2, EntityEquipmentSlot.LEGS).setRegistryName("item_ykt_ttokub_long").setUnlocalizedName("item_ykt_ttokub_long").setCreativeTab(ChinjufuModTabs.tab_seasonal);

	}

	public static void register() {

		registerItem(FUBUKI_HELMET);
		registerItem(FUBUKI_CHESTPLATE);
		registerItem(FUBUKI_LEGGINGS);
		registerItem(FUBUKI_BOOTS);
		registerItem(FUBUKI_BOOTS_KAI);
		registerItem(KASUMI_HELMET);
		registerItem(KASUMI_CHESTPLATE);
		registerItem(KASUMI_LEGGINGS);
		registerItem(KASUMI_BOOTS);
		registerItem(KASUMI_BOOTS_KAI);
		registerItem(SHIGURE_HELMET);
		registerItem(SHIGURE_CHESTPLATE);
		registerItem(SHIGURE_LEGGINGS);
		registerItem(SHIGURE_BOOTS);
		registerItem(SHIGURE_BOOTS_KAI);
		registerItem(SHIRATSUYU_HELMET);
		registerItem(SHIRATSUYU_CHESTPLATE);
		registerItem(SHIRATSUYU_LEGGINGS);
		registerItem(SHIRATSUYU_BOOTS);
		registerItem(SHIRATSUYU_BOOTS_KAI);

		registerItem(AKASHISANTA_HELMET);
		registerItem(AKASHISANTA_CHESTPLATE);
		registerItem(AKASHISANTA_LEGGINGS);
		registerItem(AKASHISANTA_BOOTS);
		registerItem(KUMANOSANTA_HELMET);
		registerItem(KUMANOSANTA_CHESTPLATE);
		registerItem(KUMANOSANTA_LEGGINGS);
		registerItem(KUMANOSANTA_BOOTS);
		registerItem(SUZUYASANTA_HELMET);
		registerItem(SUZUYASANTA_CHESTPLATE);
		registerItem(SUZUYASANTA_LEGGINGS);
		registerItem(SUZUYASANTA_BOOTS);
		registerItem(RYUJOUSANTA_HELMET);
		registerItem(RYUJOUSANTA_CHESTPLATE);
		registerItem(RYUJOUSANTA_LEGGINGS);
		registerItem(RYUJOUSANTA_BOOTS);
		registerItem(TEITOKUSANTA_HELMET);
		registerItem(TEITOKUSANTA_CHESTPLATE);
		registerItem(TEITOKUSANTA_LEGGINGS);
		registerItem(TEITOKUSANTA_BOOTS);

		registerItem(SENDAI_HELMET);
		registerItem(SENDAI_CHESTPLATE);
		registerItem(SENDAI_LEGGINGS);
		registerItem(SENDAI_BOOTS);
		registerItem(SENDAI_BOOTS_KAI);
		registerItem(YURA_HELMET);
		registerItem(YURA_CHESTPLATE);
		registerItem(YURA_LEGGINGS);
		registerItem(YURA_BOOTS);
		registerItem(YURA_BOOTS_KAI);
		registerItem(MOGAMI_HELMET);
		registerItem(MOGAMI_CHESTPLATE);
		registerItem(MOGAMI_LEGGINGS);
		registerItem(MOGAMI_BOOTS);
		registerItem(MOGAMI_BOOTS_KAI);
		registerItem(TONE_HELMET);
		registerItem(TONE_CHESTPLATE);
		registerItem(TONE_LEGGINGS);
		registerItem(TONE_BOOTS);
		registerItem(TONE_BOOTS_KAI);

		registerItem(KONGOU_HELMET);
		registerItem(KONGOU_CHESTPLATE);
		registerItem(KONGOU_LEGGINGS);
		registerItem(KONGOU_BOOTS);
		registerItem(KONGOU_BOOTS_KAI);

		registerItem(RJ_HELMET);
		registerItem(RJ_CHESTPLATE);
		registerItem(RJ_LEGGINGS);
		registerItem(RJ_BOOTS);
		registerItem(RJ_BOOTS_KAI);
		registerItem(AKAGI_HELMET);
		registerItem(AKAGI_CHESTPLATE);
		registerItem(AKAGI_LEGGINGS);
		registerItem(AKAGI_BOOTS);
		registerItem(AKAGI_BOOTS_KAI);
		registerItem(KAGA_HELMET);
		registerItem(KAGA_CHESTPLATE);
		registerItem(KAGA_LEGGINGS);
		registerItem(KAGA_BOOTS);
		registerItem(KAGA_BOOTS_KAI);

		registerItem(YKTD_BOOTS);
		registerItem(YKTO_BOOTS);
		registerItem(IKADUCHIYKT_HELMET);
		registerItem(IKADUCHIYKT_CHESTPLATE);
		registerItem(IKADUCHIYKT_LEGGINGS);
		registerItem(INADUMAYKT_HELMET);
		registerItem(INADUMAYKT_CHESTPLATE);
		registerItem(INADUMAYKT_LEGGINGS);

		registerItem(HAMAKAZEYKT_HELMET);
		registerItem(HAMAKAZEYKT_CHESTPLATE);
		registerItem(HAMAKAZEYKT_LEGGINGS);
		registerItem(URAKAZEYKT_HELMET);
		registerItem(URAKAZEYKT_CHESTPLATE);
		registerItem(URAKAZEYKT_LEGGINGS);
		registerItem(KAWAKAZEYKT_HELMET);
		registerItem(KAWAKAZEYKT_CHESTPLATE);
		registerItem(KAWAKAZEYKT_LEGGINGS);
		registerItem(OBOROYKT_HELMET);
		registerItem(OBOROYKT_CHESTPLATE);
		registerItem(OBOROYKT_LEGGINGS);

		registerItem(TTOKUYKT_CHESTPLATE);
		registerItem(TTOKUYKT_LEGGINGS);
		registerItem(TTOKUYKTB_CHESTPLATE);
		registerItem(TTOKUYKTB_LEGGINGS);

	}

	public static void registerItem(Item item) {
		RegistrationHandler.ITEMS.add(item);
	}


	public static void registerRenders() {

		registerRender(FUBUKI_HELMET);
		registerRender(FUBUKI_CHESTPLATE);
		registerRender(FUBUKI_LEGGINGS);
		registerRender(FUBUKI_BOOTS);
		registerRender(FUBUKI_BOOTS_KAI);
		registerRender(KASUMI_HELMET);
		registerRender(KASUMI_CHESTPLATE);
		registerRender(KASUMI_LEGGINGS);
		registerRender(KASUMI_BOOTS);
		registerRender(KASUMI_BOOTS_KAI);
		registerRender(SHIGURE_HELMET);
		registerRender(SHIGURE_CHESTPLATE);
		registerRender(SHIGURE_LEGGINGS);
		registerRender(SHIGURE_BOOTS);
		registerRender(SHIGURE_BOOTS_KAI);
		registerRender(SHIRATSUYU_HELMET);
		registerRender(SHIRATSUYU_CHESTPLATE);
		registerRender(SHIRATSUYU_LEGGINGS);
		registerRender(SHIRATSUYU_BOOTS);
		registerRender(SHIRATSUYU_BOOTS_KAI);

		registerRender(AKASHISANTA_HELMET);
		registerRender(AKASHISANTA_CHESTPLATE);
		registerRender(AKASHISANTA_LEGGINGS);
		registerRender(AKASHISANTA_BOOTS);
		registerRender(KUMANOSANTA_HELMET);
		registerRender(KUMANOSANTA_CHESTPLATE);
		registerRender(KUMANOSANTA_LEGGINGS);
		registerRender(KUMANOSANTA_BOOTS);
		registerRender(SUZUYASANTA_HELMET);
		registerRender(SUZUYASANTA_CHESTPLATE);
		registerRender(SUZUYASANTA_LEGGINGS);
		registerRender(SUZUYASANTA_BOOTS);
		registerRender(RYUJOUSANTA_HELMET);
		registerRender(RYUJOUSANTA_CHESTPLATE);
		registerRender(RYUJOUSANTA_LEGGINGS);
		registerRender(RYUJOUSANTA_BOOTS);
		registerRender(TEITOKUSANTA_HELMET);
		registerRender(TEITOKUSANTA_CHESTPLATE);
		registerRender(TEITOKUSANTA_LEGGINGS);
		registerRender(TEITOKUSANTA_BOOTS);

		registerRender(SENDAI_HELMET);
		registerRender(SENDAI_CHESTPLATE);
		registerRender(SENDAI_LEGGINGS);
		registerRender(SENDAI_BOOTS);
		registerRender(SENDAI_BOOTS_KAI);
		registerRender(YURA_HELMET);
		registerRender(YURA_CHESTPLATE);
		registerRender(YURA_LEGGINGS);
		registerRender(YURA_BOOTS);
		registerRender(YURA_BOOTS_KAI);

		registerRender(MOGAMI_HELMET);
		registerRender(MOGAMI_CHESTPLATE);
		registerRender(MOGAMI_LEGGINGS);
		registerRender(MOGAMI_BOOTS);
		registerRender(MOGAMI_BOOTS_KAI);
		registerRender(TONE_HELMET);
		registerRender(TONE_CHESTPLATE);
		registerRender(TONE_LEGGINGS);
		registerRender(TONE_BOOTS);
		registerRender(TONE_BOOTS_KAI);

		registerRender(KONGOU_HELMET);
		registerRender(KONGOU_CHESTPLATE);
		registerRender(KONGOU_LEGGINGS);
		registerRender(KONGOU_BOOTS);
		registerRender(KONGOU_BOOTS_KAI);

		registerRender(RJ_HELMET);
		registerRender(RJ_CHESTPLATE);
		registerRender(RJ_LEGGINGS);
		registerRender(RJ_BOOTS);
		registerRender(RJ_BOOTS_KAI);
		registerRender(AKAGI_HELMET);
		registerRender(AKAGI_CHESTPLATE);
		registerRender(AKAGI_LEGGINGS);
		registerRender(AKAGI_BOOTS);
		registerRender(AKAGI_BOOTS_KAI);
		registerRender(KAGA_HELMET);
		registerRender(KAGA_CHESTPLATE);
		registerRender(KAGA_LEGGINGS);
		registerRender(KAGA_BOOTS);
		registerRender(KAGA_BOOTS_KAI);

		registerRender(YKTD_BOOTS);
		registerRender(YKTO_BOOTS);

		registerRender(IKADUCHIYKT_HELMET);
		registerRender(IKADUCHIYKT_CHESTPLATE);
		registerRender(IKADUCHIYKT_LEGGINGS);
		registerRender(INADUMAYKT_HELMET);
		registerRender(INADUMAYKT_CHESTPLATE);
		registerRender(INADUMAYKT_LEGGINGS);

		registerRender(HAMAKAZEYKT_HELMET);
		registerRender(HAMAKAZEYKT_CHESTPLATE);
		registerRender(HAMAKAZEYKT_LEGGINGS);
		registerRender(URAKAZEYKT_HELMET);
		registerRender(URAKAZEYKT_CHESTPLATE);
		registerRender(URAKAZEYKT_LEGGINGS);
		registerRender(KAWAKAZEYKT_HELMET);
		registerRender(KAWAKAZEYKT_CHESTPLATE);
		registerRender(KAWAKAZEYKT_LEGGINGS);
		registerRender(OBOROYKT_HELMET);
		registerRender(OBOROYKT_CHESTPLATE);
		registerRender(OBOROYKT_LEGGINGS);
		registerRender(TTOKUYKT_CHESTPLATE);
		registerRender(TTOKUYKT_LEGGINGS);
		registerRender(TTOKUYKTB_CHESTPLATE);
		registerRender(TTOKUYKTB_LEGGINGS);

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

			ChinjufuModArmor.init();
			ChinjufuModArmor.register();
			ITEMS.stream().forEach(item -> event.getRegistry().register(item));
		}
	}
}
