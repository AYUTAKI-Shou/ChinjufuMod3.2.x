package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.blocks.BlockKayaTaba_Roof;
import com.ayutaki.chinjufumod.init.blocks.BlockKayaTaba_Roof_cor;
import com.ayutaki.chinjufumod.init.blocks.BlockKusaTaba;
import com.ayutaki.chinjufumod.init.blocks.BlockKusaTaba_Roof;
import com.ayutaki.chinjufumod.init.blocks.BlockKusaTaba_Roof_cor;
import com.ayutaki.chinjufumod.init.blocks.BlockKusaTaba_Stairs;
import com.ayutaki.chinjufumod.init.blocks.BlockWaraTaba_Roof;
import com.ayutaki.chinjufumod.init.blocks.BlockWaraTaba_Roof_cor;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudoB_CL_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudoB_CL_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudoB_CL_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudoB_CR_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudoB_CR_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudoB_CR_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudoB_OL_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudoB_OL_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudoB_OL_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudoB_OR_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudoB_OR_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudoB_OR_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudo_CL_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudo_CL_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudo_CL_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudo_CR_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudo_CR_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudo_CR_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudo_OL_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudo_OL_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudo_OL_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudo_OR_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudo_OR_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockGarasudo_OR_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiA_CL_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiA_CL_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiA_CL_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiA_CR_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiA_CR_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiA_CR_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiA_OL_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiA_OL_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiA_OL_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiA_OR_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiA_OR_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiA_OR_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiH_CL_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiH_CL_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiH_CL_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiH_OL_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiH_OL_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiH_OL_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiH_OR_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiH_OR_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockShoujiH_OR_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockShouji_CL_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockShouji_CL_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockShouji_CL_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockShouji_CR_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockShouji_CR_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockShouji_CR_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockShouji_OL_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockShouji_OL_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockShouji_OL_saku;
import com.ayutaki.chinjufumod.init.fusuma.BlockShouji_OR_ich;
import com.ayutaki.chinjufumod.init.fusuma.BlockShouji_OR_kae;
import com.ayutaki.chinjufumod.init.fusuma.BlockShouji_OR_saku;
import com.ayutaki.chinjufumod.init.garden.BlockLongIchoh;
import com.ayutaki.chinjufumod.init.garden.BlockLongKaede;
import com.ayutaki.chinjufumod.init.garden.BlockLongOakkare;
import com.ayutaki.chinjufumod.init.garden.BlockLongSakura;
import com.ayutaki.chinjufumod.init.garden.BlockLowTree;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_black;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_blue;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_brown;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_cyan;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_dirt;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_gray;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_green;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_lightb;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_lightg;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_lime;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_magenta;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_orange;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_pink;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_purple;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_red;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_white;
import com.ayutaki.chinjufumod.init.kamoi.BlockKamoi_yellow;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_ich;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_ich_1;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_kae;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_kae_1;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_saku;
import com.ayutaki.chinjufumod.init.ranma.BlockKanki_saku_1;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_ich;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_ich_1;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_kae;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_kae_1;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_saku;
import com.ayutaki.chinjufumod.init.ranma.BlockKoushi_saku_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_ich;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_ich_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_kae;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_kae_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_saku;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaB_saku_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_ich;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_ich_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_kae;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_kae_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_saku;
import com.ayutaki.chinjufumod.init.ranma.BlockRanmaC_saku_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_ich;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_ich_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_kae;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_kae_1;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_saku;
import com.ayutaki.chinjufumod.init.ranma.BlockRanma_saku_1;
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

public class ChinjufuModSeasons2 {

	public static Block KUSATABA, KUSATABA_STAIRS, WARATABA, WARATABA_STAIRS, KAYATABA, KAYATABA_STAIRS;
	public static Block KUSATABA_RF, WARATABA_RF, KAYATABA_RF;
	public static Block KUSATABA_RF_COR, WARATABA_RF_COR, KAYATABA_RF_COR;

	public static Block SAKURA_top, SAKURA_bot, KAEDE_top, KAEDE_bot, ICHOH_top, ICHOH_bot, OAKKARE_top, OAKKARE_bot;

	public static Block SAKURA_low, KAEDE_low, ICHOH_low, OAKKARE_low;

	public static Block SHOUJI_CL_saku, SHOUJI_CL_kae, SHOUJI_CL_ich;
	public static Block SHOUJI_OL_saku, SHOUJI_OL_kae, SHOUJI_OL_ich;
	public static Block SHOUJI_CR_saku, SHOUJI_CR_kae, SHOUJI_CR_ich;
	public static Block SHOUJI_OR_saku, SHOUJI_OR_kae, SHOUJI_OR_ich;

	public static Block SHOUJIA_CL_saku, SHOUJIA_CL_kae, SHOUJIA_CL_ich;
	public static Block SHOUJIA_OL_saku, SHOUJIA_OL_kae, SHOUJIA_OL_ich;
	public static Block SHOUJIA_CR_saku, SHOUJIA_CR_kae, SHOUJIA_CR_ich;
	public static Block SHOUJIA_OR_saku, SHOUJIA_OR_kae, SHOUJIA_OR_ich;

	public static Block SHOUJIH_CL_saku, SHOUJIH_CL_kae, SHOUJIH_CL_ich;
	public static Block SHOUJIH_OL_saku, SHOUJIH_OL_kae, SHOUJIH_OL_ich;
	public static Block SHOUJIH_CR_saku, SHOUJIH_CR_kae, SHOUJIH_CR_ich;
	public static Block SHOUJIH_OR_saku, SHOUJIH_OR_kae, SHOUJIH_OR_ich;

	public static Block GARASUDO_CL_saku, GARASUDO_CL_kae, GARASUDO_CL_ich;
	public static Block GARASUDO_OL_saku, GARASUDO_OL_kae, GARASUDO_OL_ich;
	public static Block GARASUDO_CR_saku, GARASUDO_CR_kae, GARASUDO_CR_ich;
	public static Block GARASUDO_OR_saku, GARASUDO_OR_kae, GARASUDO_OR_ich;

	public static Block GARASUDOB_CL_saku, GARASUDOB_CL_kae, GARASUDOB_CL_ich;
	public static Block GARASUDOB_OL_saku, GARASUDOB_OL_kae, GARASUDOB_OL_ich;
	public static Block GARASUDOB_CR_saku, GARASUDOB_CR_kae, GARASUDOB_CR_ich;
	public static Block GARASUDOB_OR_saku, GARASUDOB_OR_kae, GARASUDOB_OR_ich;

	public static Block RANMA_saku, RANMA_kae, RANMA_ich;
	public static Block RANMA_saku_1, RANMA_kae_1, RANMA_ich_1;

	public static Block RANMAB_saku, RANMAB_kae, RANMAB_ich;
	public static Block RANMAB_saku_1, RANMAB_kae_1, RANMAB_ich_1;

	public static Block RANMAC_saku, RANMAC_kae, RANMAC_ich;
	public static Block RANMAC_saku_1, RANMAC_kae_1, RANMAC_ich_1;

	public static Block KANKI_saku, KANKI_kae, KANKI_ich;
	public static Block KANKI_saku_1, KANKI_kae_1, KANKI_ich_1;

	public static Block KOUSHI_saku, KOUSHI_kae, KOUSHI_ich;
	public static Block KOUSHI_saku_1, KOUSHI_kae_1, KOUSHI_ich_1;

	public static Block KAMOI_dirt_saku, KAMOI_dirt_kae, KAMOI_dirt_ich;

	public static Block KAMOI_black_saku, KAMOI_black_kae, KAMOI_black_ich;
	public static Block KAMOI_blue_saku, KAMOI_blue_kae, KAMOI_blue_ich;
	public static Block KAMOI_brown_saku, KAMOI_brown_kae, KAMOI_brown_ich;
	public static Block KAMOI_cyan_saku, KAMOI_cyan_kae, KAMOI_cyan_ich;
	public static Block KAMOI_gray_saku, KAMOI_gray_kae, KAMOI_gray_ich;
	public static Block KAMOI_green_saku, KAMOI_green_kae, KAMOI_green_ich;
	public static Block KAMOI_lightb_saku, KAMOI_lightb_kae, KAMOI_lightb_ich;
	public static Block KAMOI_lightg_saku, KAMOI_lightg_kae, KAMOI_lightg_ich;
	public static Block KAMOI_lime_saku, KAMOI_lime_kae, KAMOI_lime_ich;
	public static Block KAMOI_magenta_saku, KAMOI_magenta_kae, KAMOI_magenta_ich;
	public static Block KAMOI_orange_saku, KAMOI_orange_kae, KAMOI_orange_ich;
	public static Block KAMOI_pink_saku, KAMOI_pink_kae, KAMOI_pink_ich;
	public static Block KAMOI_purple_saku, KAMOI_purple_kae, KAMOI_purple_ich;
	public static Block KAMOI_red_saku, KAMOI_red_kae, KAMOI_red_ich;
	public static Block KAMOI_white_saku, KAMOI_white_kae, KAMOI_white_ich;
	public static Block KAMOI_yellow_saku, KAMOI_yellow_kae, KAMOI_yellow_ich;


	public static void init() {
		KUSATABA = new BlockKusaTaba("block_tabakusa");
		WARATABA = new BlockKusaTaba("block_tabawara");
		KAYATABA = new BlockKusaTaba("block_tabakaya");

		KUSATABA_RF = new BlockKusaTaba_Roof("block_tabakusa_roof");
		WARATABA_RF = new BlockWaraTaba_Roof("block_tabawara_roof");
		KAYATABA_RF = new BlockKayaTaba_Roof("block_tabakaya_roof");
		KUSATABA_RF_COR = new BlockKusaTaba_Roof_cor("block_tabakusa_roof_cor");
		WARATABA_RF_COR = new BlockWaraTaba_Roof_cor("block_tabawara_roof_cor");
		KAYATABA_RF_COR = new BlockKayaTaba_Roof_cor("block_tabakaya_roof_cor");

		KUSATABA_STAIRS = new BlockKusaTaba_Stairs("block_tabakusa_stairs", KUSATABA.getDefaultState());
		WARATABA_STAIRS = new BlockKusaTaba_Stairs("block_tabawara_stairs", WARATABA.getDefaultState());
		KAYATABA_STAIRS = new BlockKusaTaba_Stairs("block_tabakaya_stairs", KAYATABA.getDefaultState());

		SAKURA_top = new BlockLongSakura(Material.WOOD, true).setRegistryName("block_longsakura_top").setUnlocalizedName("block_longsakura_top");
		SAKURA_bot = new BlockLongSakura(Material.WOOD, false).setRegistryName("block_longsakura_bot").setUnlocalizedName("block_longsakura_bot").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAEDE_top = new BlockLongKaede(Material.WOOD, true).setRegistryName("block_longkaede_top").setUnlocalizedName("block_longkaede_top");
		KAEDE_bot = new BlockLongKaede(Material.WOOD, false).setRegistryName("block_longkaede_bot").setUnlocalizedName("block_longkaede_bot").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		ICHOH_top = new BlockLongIchoh(Material.WOOD, true).setRegistryName("block_longichoh_top").setUnlocalizedName("block_longichoh_top");
		ICHOH_bot = new BlockLongIchoh(Material.WOOD, false).setRegistryName("block_longichoh_bot").setUnlocalizedName("block_longichoh_bot").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		OAKKARE_top = new BlockLongOakkare(Material.WOOD, true).setRegistryName("block_longoakkare_top").setUnlocalizedName("block_longoakkare_top");
		OAKKARE_bot = new BlockLongOakkare(Material.WOOD, false).setRegistryName("block_longoakkare_bot").setUnlocalizedName("block_longoakkare_bot").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		SAKURA_low = new BlockLowTree().setRegistryName("block_low_sakura").setUnlocalizedName("block_low_sakura").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAEDE_low = new BlockLowTree().setRegistryName("block_low_kaede").setUnlocalizedName("block_low_kaede").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		ICHOH_low = new BlockLowTree().setRegistryName("block_low_ichoh").setUnlocalizedName("block_low_ichoh").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		OAKKARE_low = new BlockLowTree().setRegistryName("block_low_oakkare").setUnlocalizedName("block_low_oakkare").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		SHOUJI_CL_saku = new BlockShouji_CL_saku(Material.WOOD, "block_shouji_cl_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SHOUJI_OL_saku = new BlockShouji_OL_saku(Material.WOOD, "block_shouji_ol_saku");
		SHOUJI_CR_saku = new BlockShouji_CR_saku(Material.WOOD, "block_shouji_cr_saku");
		SHOUJI_OR_saku = new BlockShouji_OR_saku(Material.WOOD, "block_shouji_or_saku");
		SHOUJI_CL_kae = new BlockShouji_CL_kae(Material.WOOD, "block_shouji_cl_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SHOUJI_OL_kae = new BlockShouji_OL_kae(Material.WOOD, "block_shouji_ol_kae");
		SHOUJI_CR_kae = new BlockShouji_CR_kae(Material.WOOD, "block_shouji_cr_kae");
		SHOUJI_OR_kae = new BlockShouji_OR_kae(Material.WOOD, "block_shouji_or_kae");
		SHOUJI_CL_ich = new BlockShouji_CL_ich(Material.WOOD, "block_shouji_cl_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SHOUJI_OL_ich = new BlockShouji_OL_ich(Material.WOOD, "block_shouji_ol_ich");
		SHOUJI_CR_ich = new BlockShouji_CR_ich(Material.WOOD, "block_shouji_cr_ich");
		SHOUJI_OR_ich = new BlockShouji_OR_ich(Material.WOOD, "block_shouji_or_ich");

		SHOUJIA_CL_saku = new BlockShoujiA_CL_saku(Material.WOOD, "block_shoujia_cl_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SHOUJIA_OL_saku = new BlockShoujiA_OL_saku(Material.WOOD, "block_shoujia_ol_saku");
		SHOUJIA_CR_saku = new BlockShoujiA_CR_saku(Material.WOOD, "block_shoujia_cr_saku");
		SHOUJIA_OR_saku = new BlockShoujiA_OR_saku(Material.WOOD, "block_shoujia_or_saku");
		SHOUJIA_CL_kae = new BlockShoujiA_CL_kae(Material.WOOD, "block_shoujia_cl_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SHOUJIA_OL_kae = new BlockShoujiA_OL_kae(Material.WOOD, "block_shoujia_ol_kae");
		SHOUJIA_CR_kae = new BlockShoujiA_CR_kae(Material.WOOD, "block_shoujia_cr_kae");
		SHOUJIA_OR_kae = new BlockShoujiA_OR_kae(Material.WOOD, "block_shoujia_or_kae");
		SHOUJIA_CL_ich = new BlockShoujiA_CL_ich(Material.WOOD, "block_shoujia_cl_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SHOUJIA_OL_ich = new BlockShoujiA_OL_ich(Material.WOOD, "block_shoujia_ol_ich");
		SHOUJIA_CR_ich = new BlockShoujiA_CR_ich(Material.WOOD, "block_shoujia_cr_ich");
		SHOUJIA_OR_ich = new BlockShoujiA_OR_ich(Material.WOOD, "block_shoujia_or_ich");

		SHOUJIH_CL_saku = new BlockShoujiH_CL_saku(Material.WOOD, "block_shoujih_cl_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SHOUJIH_OL_saku = new BlockShoujiH_OL_saku(Material.WOOD, "block_shoujih_ol_saku");
		SHOUJIH_OR_saku = new BlockShoujiH_OR_saku(Material.WOOD, "block_shoujih_or_saku");
		SHOUJIH_CL_kae = new BlockShoujiH_CL_kae(Material.WOOD, "block_shoujih_cl_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SHOUJIH_OL_kae = new BlockShoujiH_OL_kae(Material.WOOD, "block_shoujih_ol_kae");
		SHOUJIH_OR_kae = new BlockShoujiH_OR_kae(Material.WOOD, "block_shoujih_or_kae");
		SHOUJIH_CL_ich = new BlockShoujiH_CL_ich(Material.WOOD, "block_shoujih_cl_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SHOUJIH_OL_ich = new BlockShoujiH_OL_ich(Material.WOOD, "block_shoujih_ol_ich");
		SHOUJIH_OR_ich = new BlockShoujiH_OR_ich(Material.WOOD, "block_shoujih_or_ich");

		GARASUDO_CL_saku = new BlockGarasudo_CL_saku(Material.WOOD, "block_garasudo_cl_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		GARASUDO_OL_saku = new BlockGarasudo_OL_saku(Material.WOOD, "block_garasudo_ol_saku");
		GARASUDO_CR_saku = new BlockGarasudo_CR_saku(Material.WOOD, "block_garasudo_cr_saku");
		GARASUDO_OR_saku = new BlockGarasudo_OR_saku(Material.WOOD, "block_garasudo_or_saku");
		GARASUDO_CL_kae = new BlockGarasudo_CL_kae(Material.WOOD, "block_garasudo_cl_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		GARASUDO_OL_kae = new BlockGarasudo_OL_kae(Material.WOOD, "block_garasudo_ol_kae");
		GARASUDO_CR_kae = new BlockGarasudo_CR_kae(Material.WOOD, "block_garasudo_cr_kae");
		GARASUDO_OR_kae = new BlockGarasudo_OR_kae(Material.WOOD, "block_garasudo_or_kae");
		GARASUDO_CL_ich = new BlockGarasudo_CL_ich(Material.WOOD, "block_garasudo_cl_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		GARASUDO_OL_ich = new BlockGarasudo_OL_ich(Material.WOOD, "block_garasudo_ol_ich");
		GARASUDO_CR_ich = new BlockGarasudo_CR_ich(Material.WOOD, "block_garasudo_cr_ich");
		GARASUDO_OR_ich = new BlockGarasudo_OR_ich(Material.WOOD, "block_garasudo_or_ich");

		GARASUDOB_CL_saku = new BlockGarasudoB_CL_saku(Material.WOOD, "block_garasudob_cl_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		GARASUDOB_OL_saku = new BlockGarasudoB_OL_saku(Material.WOOD, "block_garasudob_ol_saku");
		GARASUDOB_CR_saku = new BlockGarasudoB_CR_saku(Material.WOOD, "block_garasudob_cr_saku");
		GARASUDOB_OR_saku = new BlockGarasudoB_OR_saku(Material.WOOD, "block_garasudob_or_saku");
		GARASUDOB_CL_kae = new BlockGarasudoB_CL_kae(Material.WOOD, "block_garasudob_cl_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		GARASUDOB_OL_kae = new BlockGarasudoB_OL_kae(Material.WOOD, "block_garasudob_ol_kae");
		GARASUDOB_CR_kae = new BlockGarasudoB_CR_kae(Material.WOOD, "block_garasudob_cr_kae");
		GARASUDOB_OR_kae = new BlockGarasudoB_OR_kae(Material.WOOD, "block_garasudob_or_kae");
		GARASUDOB_CL_ich = new BlockGarasudoB_CL_ich(Material.WOOD, "block_garasudob_cl_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		GARASUDOB_OL_ich = new BlockGarasudoB_OL_ich(Material.WOOD, "block_garasudob_ol_ich");
		GARASUDOB_CR_ich = new BlockGarasudoB_CR_ich(Material.WOOD, "block_garasudob_cr_ich");
		GARASUDOB_OR_ich = new BlockGarasudoB_OR_ich(Material.WOOD, "block_garasudob_or_ich");

		RANMA_saku = new BlockRanma_saku(Material.WOOD, "block_ranma_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		RANMA_kae = new BlockRanma_kae(Material.WOOD, "block_ranma_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		RANMA_ich = new BlockRanma_ich(Material.WOOD, "block_ranma_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		RANMA_saku_1 = new BlockRanma_saku_1(Material.WOOD, "block_ranma_saku_1");
		RANMA_kae_1 = new BlockRanma_kae_1(Material.WOOD, "block_ranma_kae_1");
		RANMA_ich_1 = new BlockRanma_ich_1(Material.WOOD, "block_ranma_ich_1");

		RANMAB_saku = new BlockRanmaB_saku(Material.WOOD, "block_ranmab_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		RANMAB_kae = new BlockRanmaB_kae(Material.WOOD, "block_ranmab_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		RANMAB_ich = new BlockRanmaB_ich(Material.WOOD, "block_ranmab_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		RANMAB_saku_1 = new BlockRanmaB_saku_1(Material.WOOD, "block_ranmab_saku_1");
		RANMAB_kae_1 = new BlockRanmaB_kae_1(Material.WOOD, "block_ranmab_kae_1");
		RANMAB_ich_1 = new BlockRanmaB_ich_1(Material.WOOD, "block_ranmab_ich_1");

		RANMAC_saku = new BlockRanmaC_saku(Material.WOOD, "block_ranmac_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		RANMAC_kae = new BlockRanmaC_kae(Material.WOOD, "block_ranmac_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		RANMAC_ich = new BlockRanmaC_ich(Material.WOOD, "block_ranmac_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		RANMAC_saku_1 = new BlockRanmaC_saku_1(Material.WOOD, "block_ranmac_saku_1");
		RANMAC_kae_1 = new BlockRanmaC_kae_1(Material.WOOD, "block_ranmac_kae_1");
		RANMAC_ich_1 = new BlockRanmaC_ich_1(Material.WOOD, "block_ranmac_ich_1");

		KANKI_saku = new BlockKanki_saku(Material.WOOD, "block_kanki_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KANKI_kae = new BlockKanki_kae(Material.WOOD, "block_kanki_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KANKI_ich = new BlockKanki_ich(Material.WOOD, "block_kanki_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KANKI_saku_1 = new BlockKanki_saku_1(Material.WOOD, "block_kanki_saku_1");
		KANKI_kae_1 = new BlockKanki_kae_1(Material.WOOD, "block_kanki_kae_1");
		KANKI_ich_1 = new BlockKanki_ich_1(Material.WOOD, "block_kanki_ich_1");

		KOUSHI_saku = new BlockKoushi_saku(Material.WOOD, "block_koushi_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KOUSHI_kae = new BlockKoushi_kae(Material.WOOD, "block_koushi_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KOUSHI_ich = new BlockKoushi_ich(Material.WOOD, "block_koushi_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KOUSHI_saku_1 = new BlockKoushi_saku_1(Material.WOOD, "block_koushi_saku_1");
		KOUSHI_kae_1 = new BlockKoushi_kae_1(Material.WOOD, "block_koushi_kae_1");
		KOUSHI_ich_1 = new BlockKoushi_ich_1(Material.WOOD, "block_koushi_ich_1");

		KAMOI_dirt_saku = new BlockKamoi_dirt(Material.WOOD, "block_ka_dirt_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_dirt_kae = new BlockKamoi_dirt(Material.WOOD, "block_ka_dirt_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_dirt_ich = new BlockKamoi_dirt(Material.WOOD, "block_ka_dirt_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		KAMOI_black_saku = new BlockKamoi_black(Material.WOOD, "block_ka_black_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_black_kae = new BlockKamoi_black(Material.WOOD, "block_ka_black_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_black_ich = new BlockKamoi_black(Material.WOOD, "block_ka_black_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_blue_saku = new BlockKamoi_blue(Material.WOOD, "block_ka_blue_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_blue_kae = new BlockKamoi_blue(Material.WOOD, "block_ka_blue_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_blue_ich = new BlockKamoi_blue(Material.WOOD, "block_ka_blue_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_brown_saku = new BlockKamoi_brown(Material.WOOD, "block_ka_brown_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_brown_kae = new BlockKamoi_brown(Material.WOOD, "block_ka_brown_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_brown_ich = new BlockKamoi_brown(Material.WOOD, "block_ka_brown_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_cyan_saku = new BlockKamoi_cyan(Material.WOOD, "block_ka_cyan_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_cyan_kae = new BlockKamoi_cyan(Material.WOOD, "block_ka_cyan_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_cyan_ich = new BlockKamoi_cyan(Material.WOOD, "block_ka_cyan_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_gray_saku = new BlockKamoi_gray(Material.WOOD, "block_ka_gray_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_gray_kae = new BlockKamoi_gray(Material.WOOD, "block_ka_gray_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_gray_ich = new BlockKamoi_gray(Material.WOOD, "block_ka_gray_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_green_saku = new BlockKamoi_green(Material.WOOD, "block_ka_green_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_green_kae = new BlockKamoi_green(Material.WOOD, "block_ka_green_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_green_ich = new BlockKamoi_green(Material.WOOD, "block_ka_green_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_lightb_saku = new BlockKamoi_lightb(Material.WOOD, "block_ka_lightb_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_lightb_kae = new BlockKamoi_lightb(Material.WOOD, "block_ka_lightb_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_lightb_ich = new BlockKamoi_lightb(Material.WOOD, "block_ka_lightb_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_lightg_saku = new BlockKamoi_lightg(Material.WOOD, "block_ka_lightg_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_lightg_kae = new BlockKamoi_lightg(Material.WOOD, "block_ka_lightg_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_lightg_ich = new BlockKamoi_lightg(Material.WOOD, "block_ka_lightg_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_lime_saku = new BlockKamoi_lime(Material.WOOD, "block_ka_lime_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_lime_kae = new BlockKamoi_lime(Material.WOOD, "block_ka_lime_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_lime_ich = new BlockKamoi_lime(Material.WOOD, "block_ka_lime_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_magenta_saku = new BlockKamoi_magenta(Material.WOOD, "block_ka_magenta_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_magenta_kae = new BlockKamoi_magenta(Material.WOOD, "block_ka_magenta_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_magenta_ich = new BlockKamoi_magenta(Material.WOOD, "block_ka_magenta_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_orange_saku = new BlockKamoi_orange(Material.WOOD, "block_ka_orange_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_orange_kae = new BlockKamoi_orange(Material.WOOD, "block_ka_orange_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_orange_ich = new BlockKamoi_orange(Material.WOOD, "block_ka_orange_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_pink_saku = new BlockKamoi_pink(Material.WOOD, "block_ka_pink_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_pink_kae = new BlockKamoi_pink(Material.WOOD, "block_ka_pink_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_pink_ich = new BlockKamoi_pink(Material.WOOD, "block_ka_pink_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_purple_saku = new BlockKamoi_purple(Material.WOOD, "block_ka_purple_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_purple_kae = new BlockKamoi_purple(Material.WOOD, "block_ka_purple_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_purple_ich = new BlockKamoi_purple(Material.WOOD, "block_ka_purple_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_red_saku = new BlockKamoi_red(Material.WOOD, "block_ka_red_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_red_kae = new BlockKamoi_red(Material.WOOD, "block_ka_red_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_red_ich = new BlockKamoi_red(Material.WOOD, "block_ka_red_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_white_saku = new BlockKamoi_white(Material.WOOD, "block_ka_white_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_white_kae = new BlockKamoi_white(Material.WOOD, "block_ka_white_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_white_ich = new BlockKamoi_white(Material.WOOD, "block_ka_white_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_yellow_saku = new BlockKamoi_yellow(Material.WOOD, "block_ka_yellow_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_yellow_kae = new BlockKamoi_yellow(Material.WOOD, "block_ka_yellow_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAMOI_yellow_ich = new BlockKamoi_yellow(Material.WOOD, "block_ka_yellow_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);



	}


	public static void register() {
		registerBlock(KUSATABA);
		registerBlock(WARATABA);
		registerBlock(KAYATABA);
		registerBlock(KUSATABA_RF);
		registerBlock(WARATABA_RF);
		registerBlock(KAYATABA_RF);
		registerBlock(KUSATABA_RF_COR);
		registerBlock(WARATABA_RF_COR);
		registerBlock(KAYATABA_RF_COR);
		registerBlock(KUSATABA_STAIRS);
		registerBlock(WARATABA_STAIRS);
		registerBlock(KAYATABA_STAIRS);

		registerBlock(SAKURA_top);
		registerBlock(SAKURA_bot);
		registerBlock(KAEDE_top);
		registerBlock(KAEDE_bot);
		registerBlock(ICHOH_top);
		registerBlock(ICHOH_bot);
		registerBlock(OAKKARE_top);
		registerBlock(OAKKARE_bot);

		registerBlock(SAKURA_low);
		registerBlock(KAEDE_low);
		registerBlock(ICHOH_low);
		registerBlock(OAKKARE_low);

		registerBlock(SHOUJI_CL_saku);
		registerBlock(SHOUJI_OL_saku);
		registerBlock(SHOUJI_CR_saku);
		registerBlock(SHOUJI_OR_saku);
		registerBlock(SHOUJI_CL_kae);
		registerBlock(SHOUJI_OL_kae);
		registerBlock(SHOUJI_CR_kae);
		registerBlock(SHOUJI_OR_kae);
		registerBlock(SHOUJI_CL_ich);
		registerBlock(SHOUJI_OL_ich);
		registerBlock(SHOUJI_CR_ich);
		registerBlock(SHOUJI_OR_ich);

		registerBlock(SHOUJIA_CL_saku);
		registerBlock(SHOUJIA_OL_saku);
		registerBlock(SHOUJIA_CR_saku);
		registerBlock(SHOUJIA_OR_saku);
		registerBlock(SHOUJIA_CL_kae);
		registerBlock(SHOUJIA_OL_kae);
		registerBlock(SHOUJIA_CR_kae);
		registerBlock(SHOUJIA_OR_kae);
		registerBlock(SHOUJIA_CL_ich);
		registerBlock(SHOUJIA_OL_ich);
		registerBlock(SHOUJIA_CR_ich);
		registerBlock(SHOUJIA_OR_ich);

		registerBlock(SHOUJIH_CL_saku);
		registerBlock(SHOUJIH_OL_saku);
		registerBlock(SHOUJIH_OR_saku);
		registerBlock(SHOUJIH_CL_kae);
		registerBlock(SHOUJIH_OL_kae);
		registerBlock(SHOUJIH_OR_kae);
		registerBlock(SHOUJIH_CL_ich);
		registerBlock(SHOUJIH_OL_ich);
		registerBlock(SHOUJIH_OR_ich);

		registerBlock(GARASUDO_CL_saku);
		registerBlock(GARASUDO_OL_saku);
		registerBlock(GARASUDO_CR_saku);
		registerBlock(GARASUDO_OR_saku);
		registerBlock(GARASUDO_CL_kae);
		registerBlock(GARASUDO_OL_kae);
		registerBlock(GARASUDO_CR_kae);
		registerBlock(GARASUDO_OR_kae);
		registerBlock(GARASUDO_CL_ich);
		registerBlock(GARASUDO_OL_ich);
		registerBlock(GARASUDO_CR_ich);
		registerBlock(GARASUDO_OR_ich);

		registerBlock(GARASUDOB_CL_saku);
		registerBlock(GARASUDOB_OL_saku);
		registerBlock(GARASUDOB_CR_saku);
		registerBlock(GARASUDOB_OR_saku);
		registerBlock(GARASUDOB_CL_kae);
		registerBlock(GARASUDOB_OL_kae);
		registerBlock(GARASUDOB_CR_kae);
		registerBlock(GARASUDOB_OR_kae);
		registerBlock(GARASUDOB_CL_ich);
		registerBlock(GARASUDOB_OL_ich);
		registerBlock(GARASUDOB_CR_ich);
		registerBlock(GARASUDOB_OR_ich);

		registerBlock(RANMA_saku);
		registerBlock(RANMA_kae);
		registerBlock(RANMA_ich);
		registerBlock(RANMA_saku_1);
		registerBlock(RANMA_kae_1);
		registerBlock(RANMA_ich_1);

		registerBlock(RANMAB_saku);
		registerBlock(RANMAB_kae);
		registerBlock(RANMAB_ich);
		registerBlock(RANMAB_saku_1);
		registerBlock(RANMAB_kae_1);
		registerBlock(RANMAB_ich_1);

		registerBlock(RANMAC_saku);
		registerBlock(RANMAC_kae);
		registerBlock(RANMAC_ich);
		registerBlock(RANMAC_saku_1);
		registerBlock(RANMAC_kae_1);
		registerBlock(RANMAC_ich_1);

		registerBlock(KANKI_saku);
		registerBlock(KANKI_kae);
		registerBlock(KANKI_ich);
		registerBlock(KANKI_saku_1);
		registerBlock(KANKI_kae_1);
		registerBlock(KANKI_ich_1);

		registerBlock(KOUSHI_saku);
		registerBlock(KOUSHI_kae);
		registerBlock(KOUSHI_ich);
		registerBlock(KOUSHI_saku_1);
		registerBlock(KOUSHI_kae_1);
		registerBlock(KOUSHI_ich_1);

		registerBlock(KAMOI_dirt_saku);
		registerBlock(KAMOI_dirt_kae);
		registerBlock(KAMOI_dirt_ich);

		registerBlock(KAMOI_black_saku);
		registerBlock(KAMOI_black_kae);
		registerBlock(KAMOI_black_ich);
		registerBlock(KAMOI_blue_saku);
		registerBlock(KAMOI_blue_kae);
		registerBlock(KAMOI_blue_ich);
		registerBlock(KAMOI_brown_saku);
		registerBlock(KAMOI_brown_kae);
		registerBlock(KAMOI_brown_ich);
		registerBlock(KAMOI_cyan_saku);
		registerBlock(KAMOI_cyan_kae);
		registerBlock(KAMOI_cyan_ich);
		registerBlock(KAMOI_gray_saku);
		registerBlock(KAMOI_gray_kae);
		registerBlock(KAMOI_gray_ich);
		registerBlock(KAMOI_green_saku);
		registerBlock(KAMOI_green_kae);
		registerBlock(KAMOI_green_ich);
		registerBlock(KAMOI_lightb_saku);
		registerBlock(KAMOI_lightb_kae);
		registerBlock(KAMOI_lightb_ich);
		registerBlock(KAMOI_lightg_saku);
		registerBlock(KAMOI_lightg_kae);
		registerBlock(KAMOI_lightg_ich);
		registerBlock(KAMOI_lime_saku);
		registerBlock(KAMOI_lime_kae);
		registerBlock(KAMOI_lime_ich);
		registerBlock(KAMOI_magenta_saku);
		registerBlock(KAMOI_magenta_kae);
		registerBlock(KAMOI_magenta_ich);
		registerBlock(KAMOI_orange_saku);
		registerBlock(KAMOI_orange_kae);
		registerBlock(KAMOI_orange_ich);
		registerBlock(KAMOI_pink_saku);
		registerBlock(KAMOI_pink_kae);
		registerBlock(KAMOI_pink_ich);
		registerBlock(KAMOI_purple_saku);
		registerBlock(KAMOI_purple_kae);
		registerBlock(KAMOI_purple_ich);
		registerBlock(KAMOI_red_saku);
		registerBlock(KAMOI_red_kae);
		registerBlock(KAMOI_red_ich);
		registerBlock(KAMOI_white_saku);
		registerBlock(KAMOI_white_kae);
		registerBlock(KAMOI_white_ich);
		registerBlock(KAMOI_yellow_saku);
		registerBlock(KAMOI_yellow_kae);
		registerBlock(KAMOI_yellow_ich);

	}

	public static void registerBlock(Block block) {
		registerBlock(block, new ItemBlock(block));
	}

	public static void registerBlock(Block block, ItemBlock item) {
		RegistrationHandler.BLOCKS.add(block);
		item.setRegistryName(block.getRegistryName());
		ChinjufuModItems.RegistrationHandler.ITEMS.add(item);
	}


	public static void registerRenders() {
		registerRender(KUSATABA);
		registerRender(WARATABA);
		registerRender(KAYATABA);
		registerRender(KUSATABA_RF);
		registerRender(WARATABA_RF);
		registerRender(KAYATABA_RF);
		registerRender(KUSATABA_STAIRS);
		registerRender(WARATABA_STAIRS);
		registerRender(KAYATABA_STAIRS);

		registerRender(SAKURA_bot);
		registerRender(KAEDE_bot);
		registerRender(ICHOH_bot);
		registerRender(OAKKARE_bot);

		registerRender(SAKURA_low);
		registerRender(KAEDE_low);
		registerRender(ICHOH_low);
		registerRender(OAKKARE_low);

		registerRender(SHOUJI_CL_saku);
		registerRender(SHOUJI_CL_kae);
		registerRender(SHOUJI_CL_ich);

		registerRender(SHOUJIA_CL_saku);
		registerRender(SHOUJIA_CL_kae);
		registerRender(SHOUJIA_CL_ich);

		registerRender(SHOUJIH_CL_saku);
		registerRender(SHOUJIH_CL_kae);
		registerRender(SHOUJIH_CL_ich);

		registerRender(GARASUDO_CL_saku);
		registerRender(GARASUDO_CL_kae);
		registerRender(GARASUDO_CL_ich);

		registerRender(GARASUDOB_CL_saku);
		registerRender(GARASUDOB_CL_kae);
		registerRender(GARASUDOB_CL_ich);

		registerRender(RANMA_saku);
		registerRender(RANMA_kae);
		registerRender(RANMA_ich);
		registerRender(RANMAB_saku);
		registerRender(RANMAB_kae);
		registerRender(RANMAB_ich);
		registerRender(RANMAC_saku);
		registerRender(RANMAC_kae);
		registerRender(RANMAC_ich);
		registerRender(KANKI_saku);
		registerRender(KANKI_kae);
		registerRender(KANKI_ich);
		registerRender(KOUSHI_saku);
		registerRender(KOUSHI_kae);
		registerRender(KOUSHI_ich);

		registerRender(KAMOI_dirt_saku);
		registerRender(KAMOI_dirt_kae);
		registerRender(KAMOI_dirt_ich);

		registerRender(KAMOI_black_saku);
		registerRender(KAMOI_black_kae);
		registerRender(KAMOI_black_ich);
		registerRender(KAMOI_blue_saku);
		registerRender(KAMOI_blue_kae);
		registerRender(KAMOI_blue_ich);
		registerRender(KAMOI_brown_saku);
		registerRender(KAMOI_brown_kae);
		registerRender(KAMOI_brown_ich);
		registerRender(KAMOI_cyan_saku);
		registerRender(KAMOI_cyan_kae);
		registerRender(KAMOI_cyan_ich);
		registerRender(KAMOI_gray_saku);
		registerRender(KAMOI_gray_kae);
		registerRender(KAMOI_gray_ich);
		registerRender(KAMOI_green_saku);
		registerRender(KAMOI_green_kae);
		registerRender(KAMOI_green_ich);
		registerRender(KAMOI_lightb_saku);
		registerRender(KAMOI_lightb_kae);
		registerRender(KAMOI_lightb_ich);
		registerRender(KAMOI_lightg_saku);
		registerRender(KAMOI_lightg_kae);
		registerRender(KAMOI_lightg_ich);
		registerRender(KAMOI_lime_saku);
		registerRender(KAMOI_lime_kae);
		registerRender(KAMOI_lime_ich);
		registerRender(KAMOI_magenta_saku);
		registerRender(KAMOI_magenta_kae);
		registerRender(KAMOI_magenta_ich);
		registerRender(KAMOI_orange_saku);
		registerRender(KAMOI_orange_kae);
		registerRender(KAMOI_orange_ich);
		registerRender(KAMOI_pink_saku);
		registerRender(KAMOI_pink_kae);
		registerRender(KAMOI_pink_ich);
		registerRender(KAMOI_purple_saku);
		registerRender(KAMOI_purple_kae);
		registerRender(KAMOI_purple_ich);
		registerRender(KAMOI_red_saku);
		registerRender(KAMOI_red_kae);
		registerRender(KAMOI_red_ich);
		registerRender(KAMOI_white_saku);
		registerRender(KAMOI_white_kae);
		registerRender(KAMOI_white_ich);
		registerRender(KAMOI_yellow_saku);
		registerRender(KAMOI_yellow_kae);
		registerRender(KAMOI_yellow_ich);



	}


	@SideOnly(Side.CLIENT)
	private static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(),"inventory"));
	}

	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class RegistrationHandler {

		public static final List<Block> BLOCKS = new LinkedList<>();

		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Block> event) {

			ChinjufuModSeasons2.init();
			ChinjufuModSeasons2.register();
			BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
		}
	}

}
