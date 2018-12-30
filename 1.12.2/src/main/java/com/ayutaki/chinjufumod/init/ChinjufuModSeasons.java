package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.foodblock.BlockIcecream_kara;
import com.ayutaki.chinjufumod.init.seasons.BlockAkuNabe_boil;
import com.ayutaki.chinjufumod.init.seasons.BlockAkuNabe_boil2cold;
import com.ayutaki.chinjufumod.init.seasons.BlockChabudai;
import com.ayutaki.chinjufumod.init.seasons.BlockChabudai_aca;
import com.ayutaki.chinjufumod.init.seasons.BlockChabudai_bir;
import com.ayutaki.chinjufumod.init.seasons.BlockChabudai_doak;
import com.ayutaki.chinjufumod.init.seasons.BlockChabudai_ich;
import com.ayutaki.chinjufumod.init.seasons.BlockChabudai_jun;
import com.ayutaki.chinjufumod.init.seasons.BlockChabudai_kae;
import com.ayutaki.chinjufumod.init.seasons.BlockChabudai_saku;
import com.ayutaki.chinjufumod.init.seasons.BlockChabudai_spru;
import com.ayutaki.chinjufumod.init.seasons.BlockHinadan;
import com.ayutaki.chinjufumod.init.seasons.BlockHinakazari;
import com.ayutaki.chinjufumod.init.seasons.BlockKadomatsu;
import com.ayutaki.chinjufumod.init.seasons.BlockKagamiMochi;
import com.ayutaki.chinjufumod.init.seasons.BlockKakigouriGreen_1;
import com.ayutaki.chinjufumod.init.seasons.BlockKakigouriGreen_2;
import com.ayutaki.chinjufumod.init.seasons.BlockKakigouriGreen_3;
import com.ayutaki.chinjufumod.init.seasons.BlockKakigouriPink_1;
import com.ayutaki.chinjufumod.init.seasons.BlockKakigouriPink_2;
import com.ayutaki.chinjufumod.init.seasons.BlockKakigouriPink_3;
import com.ayutaki.chinjufumod.init.seasons.BlockKakigouriRed_1;
import com.ayutaki.chinjufumod.init.seasons.BlockKakigouriRed_2;
import com.ayutaki.chinjufumod.init.seasons.BlockKakigouriRed_3;
import com.ayutaki.chinjufumod.init.seasons.BlockKakigouriYellow_1;
import com.ayutaki.chinjufumod.init.seasons.BlockKakigouriYellow_2;
import com.ayutaki.chinjufumod.init.seasons.BlockKakigouriYellow_3;
import com.ayutaki.chinjufumod.init.seasons.BlockKakigouri_1;
import com.ayutaki.chinjufumod.init.seasons.BlockKakigouri_2;
import com.ayutaki.chinjufumod.init.seasons.BlockKakigouri_3;
import com.ayutaki.chinjufumod.init.seasons.BlockKotatsu;
import com.ayutaki.chinjufumod.init.seasons.BlockKotatsu_aca;
import com.ayutaki.chinjufumod.init.seasons.BlockKotatsu_bir;
import com.ayutaki.chinjufumod.init.seasons.BlockKotatsu_doak;
import com.ayutaki.chinjufumod.init.seasons.BlockKotatsu_ich;
import com.ayutaki.chinjufumod.init.seasons.BlockKotatsu_jun;
import com.ayutaki.chinjufumod.init.seasons.BlockKotatsu_kae;
import com.ayutaki.chinjufumod.init.seasons.BlockKotatsu_saku;
import com.ayutaki.chinjufumod.init.seasons.BlockKotatsu_spru;
import com.ayutaki.chinjufumod.init.seasons.BlockKourihata;
import com.ayutaki.chinjufumod.init.seasons.BlockOriitoNabe_boil;
import com.ayutaki.chinjufumod.init.seasons.BlockOriitoNabe_boil2cold;
import com.ayutaki.chinjufumod.init.seasons.BlockOriitoNabe_full;
import com.ayutaki.chinjufumod.init.seasons.BlockOriitoNabe_full2cold;
import com.ayutaki.chinjufumod.init.seasons.BlockPresent;
import com.ayutaki.chinjufumod.init.seasons.BlockShimenawa;
import com.ayutaki.chinjufumod.init.seasons.BlockUchiwa;
import com.ayutaki.chinjufumod.init.seasons.BlockWataame;
import com.ayutaki.chinjufumod.init.seasons.BlockXmasTree;
import com.ayutaki.chinjufumod.init.seasons.BlockYunomi;
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

public class ChinjufuModSeasons {

	public static Block KAGAMIMOCHI, SHIMENAWA, KADOMATSU;

	public static Block HINAKAZARI, HINADAN;

	public static Block YUNOMI;

	public static Block CHABUDAI, CHABUDAI_aca, CHABUDAI_bir,
						CHABUDAI_doak, CHABUDAI_jun, CHABUDAI_spru,
						CHABUDAI_saku, CHABUDAI_kae, CHABUDAI_ich;

	public static Block KOTATSU, KOTATSU_aca, KOTATSU_bir,
						KOTATSU_doak, KOTATSU_jun, KOTATSU_spru,
						KOTATSU_saku, KOTATSU_kae, KOTATSU_ich;

	public static Block XMASTREE, XMASTREE_W;

	public static Block PRESENT_Apple, PRESENT_Book, PRESENT_Diamond, PRESENT_Lapis, PRESENT_Blaze;

	public static Block UCHIWA_black, UCHIWA_blue, UCHIWA_brown, UCHIWA_cyan, UCHIWA_gray, UCHIWA_green, UCHIWA_lightb, UCHIWA_lightg,
						UCHIWA_lime, UCHIWA_magenta, UCHIWA_orange, UCHIWA_pink, UCHIWA_purple, UCHIWA_red, UCHIWA_white, UCHIWA_yellow;

	public static Block WATAGASHI_block, WATAGASHI_pink, WATAGASHI_red, WATAGASHI_yellow, WATAGASHI_green;

	public static Block KAKIGOURI_kara, KAKIGOURI_block1, KAKIGOURI_block2, KAKIGOURI_block3,
						KAKIGOURI_pink1, KAKIGOURI_pink2, KAKIGOURI_pink3,
						KAKIGOURI_red1, KAKIGOURI_red2, KAKIGOURI_red3,
						KAKIGOURI_yellow1, KAKIGOURI_yellow2, KAKIGOURI_yellow3,
						KAKIGOURI_green1, KAKIGOURI_green2, KAKIGOURI_green3, KAKIGOURI_hata;

	public static Block AKUNABE_boil, AKUNABE_boil2cold,
						ORIITONABE_full, ORIITONABE_full2cold, ORIITONABE_boil, ORIITONABE_boil2cold;

	public static void init() {

		KAGAMIMOCHI = new BlockKagamiMochi().setRegistryName("block_kagamimochi").setUnlocalizedName("block_kagamimochi").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		SHIMENAWA = new BlockShimenawa(Material.WOOD).setRegistryName("block_shimenawa").setUnlocalizedName("block_shimenawa").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KADOMATSU = new BlockKadomatsu().setRegistryName("block_kadomatsu").setUnlocalizedName("block_kadomatsu").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		HINAKAZARI = new BlockHinakazari(Material.WOOD).setRegistryName("block_hinakazari").setUnlocalizedName("block_hinakazari").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		HINADAN = new BlockHinadan(Material.WOOD).setRegistryName("block_hinadan").setUnlocalizedName("block_hinadan").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		YUNOMI = new BlockYunomi(Material.WOOD).setRegistryName("block_yunomi").setUnlocalizedName("block_yunomi");

		CHABUDAI = new BlockChabudai(Material.WOOD).setRegistryName("block_chabudai").setUnlocalizedName("block_chabudai").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		CHABUDAI_aca = new BlockChabudai_aca(Material.WOOD).setRegistryName("block_chabudai_aca").setUnlocalizedName("block_chabudai_aca").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		CHABUDAI_bir = new BlockChabudai_bir(Material.WOOD).setRegistryName("block_chabudai_bir").setUnlocalizedName("block_chabudai_bir").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		CHABUDAI_doak = new BlockChabudai_doak(Material.WOOD).setRegistryName("block_chabudai_doak").setUnlocalizedName("block_chabudai_doak").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		CHABUDAI_jun = new BlockChabudai_jun(Material.WOOD).setRegistryName("block_chabudai_jun").setUnlocalizedName("block_chabudai_jun").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		CHABUDAI_spru = new BlockChabudai_spru(Material.WOOD).setRegistryName("block_chabudai_spru").setUnlocalizedName("block_chabudai_spru").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		CHABUDAI_saku = new BlockChabudai_saku(Material.WOOD).setRegistryName("block_chabudai_saku").setUnlocalizedName("block_chabudai_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		CHABUDAI_kae = new BlockChabudai_kae(Material.WOOD).setRegistryName("block_chabudai_kae").setUnlocalizedName("block_chabudai_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		CHABUDAI_ich = new BlockChabudai_ich(Material.WOOD).setRegistryName("block_chabudai_ich").setUnlocalizedName("block_chabudai_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		KOTATSU = new BlockKotatsu(Material.WOOD).setRegistryName("block_kotatsu").setUnlocalizedName("block_kotatsu").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KOTATSU_aca = new BlockKotatsu_aca(Material.WOOD).setRegistryName("block_kotatsu_aca").setUnlocalizedName("block_kotatsu_aca").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KOTATSU_bir = new BlockKotatsu_bir(Material.WOOD).setRegistryName("block_kotatsu_bir").setUnlocalizedName("block_kotatsu_bir").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KOTATSU_doak = new BlockKotatsu_doak(Material.WOOD).setRegistryName("block_kotatsu_doak").setUnlocalizedName("block_kotatsu_doak").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KOTATSU_jun = new BlockKotatsu_jun(Material.WOOD).setRegistryName("block_kotatsu_jun").setUnlocalizedName("block_kotatsu_jun").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KOTATSU_spru = new BlockKotatsu_spru(Material.WOOD).setRegistryName("block_kotatsu_spru").setUnlocalizedName("block_kotatsu_spru").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KOTATSU_saku = new BlockKotatsu_saku(Material.WOOD).setRegistryName("block_kotatsu_saku").setUnlocalizedName("block_kotatsu_saku").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KOTATSU_kae = new BlockKotatsu_kae(Material.WOOD).setRegistryName("block_kotatsu_kae").setUnlocalizedName("block_kotatsu_kae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KOTATSU_ich = new BlockKotatsu_ich(Material.WOOD).setRegistryName("block_kotatsu_ich").setUnlocalizedName("block_kotatsu_ich").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		XMASTREE = new BlockXmasTree().setRegistryName("block_xmastree").setUnlocalizedName("block_xmastree").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		XMASTREE_W = new BlockXmasTree().setRegistryName("block_xmastree_w").setUnlocalizedName("block_xmastree_w").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		PRESENT_Apple = new BlockPresent().setRegistryName("block_present_app").setUnlocalizedName("block_present_app").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		PRESENT_Book = new BlockPresent().setRegistryName("block_present_bok").setUnlocalizedName("block_present_bok").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		PRESENT_Diamond = new BlockPresent().setRegistryName("block_present_dia").setUnlocalizedName("block_present_dia").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		PRESENT_Lapis = new BlockPresent().setRegistryName("block_present_lap").setUnlocalizedName("block_present_lap").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		PRESENT_Blaze = new BlockPresent().setRegistryName("block_present_bla").setUnlocalizedName("block_present_bla").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		UCHIWA_black = new BlockUchiwa(Material.WOOD).setRegistryName("block_uchiwa_black").setUnlocalizedName("block_uchiwa_black").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		UCHIWA_blue = new BlockUchiwa(Material.WOOD).setRegistryName("block_uchiwa_blue").setUnlocalizedName("block_uchiwa_blue").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		UCHIWA_brown = new BlockUchiwa(Material.WOOD).setRegistryName("block_uchiwa_brown").setUnlocalizedName("block_uchiwa_brown").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		UCHIWA_cyan = new BlockUchiwa(Material.WOOD).setRegistryName("block_uchiwa_cyan").setUnlocalizedName("block_uchiwa_cyan").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		UCHIWA_gray = new BlockUchiwa(Material.WOOD).setRegistryName("block_uchiwa_gray").setUnlocalizedName("block_uchiwa_gray").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		UCHIWA_green = new BlockUchiwa(Material.WOOD).setRegistryName("block_uchiwa_green").setUnlocalizedName("block_uchiwa_green").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		UCHIWA_lightb = new BlockUchiwa(Material.WOOD).setRegistryName("block_uchiwa_lightb").setUnlocalizedName("block_uchiwa_lightb").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		UCHIWA_lightg = new BlockUchiwa(Material.WOOD).setRegistryName("block_uchiwa_lightg").setUnlocalizedName("block_uchiwa_lightg").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		UCHIWA_lime = new BlockUchiwa(Material.WOOD).setRegistryName("block_uchiwa_lime").setUnlocalizedName("block_uchiwa_lime").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		UCHIWA_magenta = new BlockUchiwa(Material.WOOD).setRegistryName("block_uchiwa_magenta").setUnlocalizedName("block_uchiwa_magenta").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		UCHIWA_orange = new BlockUchiwa(Material.WOOD).setRegistryName("block_uchiwa_orange").setUnlocalizedName("block_uchiwa_orange").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		UCHIWA_pink = new BlockUchiwa(Material.WOOD).setRegistryName("block_uchiwa_pink").setUnlocalizedName("block_uchiwa_pink").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		UCHIWA_purple = new BlockUchiwa(Material.WOOD).setRegistryName("block_uchiwa_purple").setUnlocalizedName("block_uchiwa_purple").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		UCHIWA_red = new BlockUchiwa(Material.WOOD).setRegistryName("block_uchiwa_red").setUnlocalizedName("block_uchiwa_red").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		UCHIWA_white = new BlockUchiwa(Material.WOOD).setRegistryName("block_uchiwa_white").setUnlocalizedName("block_uchiwa_white").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		UCHIWA_yellow = new BlockUchiwa(Material.WOOD).setRegistryName("block_uchiwa_yellow").setUnlocalizedName("block_uchiwa_yellow").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		WATAGASHI_block = new BlockWataame().setRegistryName("block_watagashi").setUnlocalizedName("block_watagashi").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		WATAGASHI_pink = new BlockWataame().setRegistryName("block_watagashi_pink").setUnlocalizedName("block_watagashi_pink").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		WATAGASHI_red = new BlockWataame().setRegistryName("block_watagashi_red").setUnlocalizedName("block_watagashi_red").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		WATAGASHI_yellow = new BlockWataame().setRegistryName("block_watagashi_yellow").setUnlocalizedName("block_watagashi_yellow").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		WATAGASHI_green = new BlockWataame().setRegistryName("block_watagashi_green").setUnlocalizedName("block_watagashi_green").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		KAKIGOURI_kara = new BlockIcecream_kara().setRegistryName("block_kakigouri_kara").setUnlocalizedName("block_kakigouri_kara");
		KAKIGOURI_block1 = new BlockKakigouri_1().setRegistryName("block_kakigouri_block1").setUnlocalizedName("block_kakigouri_block1").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAKIGOURI_block2 = new BlockKakigouri_2().setRegistryName("block_kakigouri_block2").setUnlocalizedName("block_kakigouri_block2");
		KAKIGOURI_block3 = new BlockKakigouri_3().setRegistryName("block_kakigouri_block3").setUnlocalizedName("block_kakigouri_block3");
		KAKIGOURI_pink1 = new BlockKakigouriPink_1().setRegistryName("block_kakigouri_pink1").setUnlocalizedName("block_kakigouri_pink1").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAKIGOURI_pink2 = new BlockKakigouriPink_2().setRegistryName("block_kakigouri_pink2").setUnlocalizedName("block_kakigouri_pink2");
		KAKIGOURI_pink3 = new BlockKakigouriPink_3().setRegistryName("block_kakigouri_pink3").setUnlocalizedName("block_kakigouri_pink3");
		KAKIGOURI_red1 = new BlockKakigouriRed_1().setRegistryName("block_kakigouri_red1").setUnlocalizedName("block_kakigouri_red1").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAKIGOURI_red2 = new BlockKakigouriRed_2().setRegistryName("block_kakigouri_red2").setUnlocalizedName("block_kakigouri_red2");
		KAKIGOURI_red3 = new BlockKakigouriRed_3().setRegistryName("block_kakigouri_red3").setUnlocalizedName("block_kakigouri_red3");
		KAKIGOURI_yellow1 = new BlockKakigouriYellow_1().setRegistryName("block_kakigouri_yellow1").setUnlocalizedName("block_kakigouri_yellow1").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAKIGOURI_yellow2 = new BlockKakigouriYellow_2().setRegistryName("block_kakigouri_yellow2").setUnlocalizedName("block_kakigouri_yellow2");
		KAKIGOURI_yellow3 = new BlockKakigouriYellow_3().setRegistryName("block_kakigouri_yellow3").setUnlocalizedName("block_kakigouri_yellow3");
		KAKIGOURI_green1 = new BlockKakigouriGreen_1().setRegistryName("block_kakigouri_green1").setUnlocalizedName("block_kakigouri_green1").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAKIGOURI_green2 = new BlockKakigouriGreen_2().setRegistryName("block_kakigouri_green2").setUnlocalizedName("block_kakigouri_green2");
		KAKIGOURI_green3 = new BlockKakigouriGreen_3().setRegistryName("block_kakigouri_green3").setUnlocalizedName("block_kakigouri_green3");
		KAKIGOURI_hata = new BlockKourihata(Material.WOOD).setRegistryName("block_kakigouri_hata").setUnlocalizedName("block_kakigouri_hata").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		AKUNABE_boil = new BlockAkuNabe_boil().setRegistryName("block_nabeaku_b").setUnlocalizedName("block_nabeaku_b");
		AKUNABE_boil2cold = new BlockAkuNabe_boil2cold().setRegistryName("block_nabeaku_bc").setUnlocalizedName("block_nabeaku_bc").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		ORIITONABE_full = new BlockOriitoNabe_full().setRegistryName("block_nabeoriito_f").setUnlocalizedName("block_nabeoriito_f");
		ORIITONABE_full2cold = new BlockOriitoNabe_full2cold().setRegistryName("block_nabeoriito_fc").setUnlocalizedName("block_nabeoriito_fc");
		ORIITONABE_boil = new BlockOriitoNabe_boil().setRegistryName("block_nabeoriito_b").setUnlocalizedName("block_nabeoriito_b");
		ORIITONABE_boil2cold = new BlockOriitoNabe_boil2cold().setRegistryName("block_nabeoriito_bc").setUnlocalizedName("block_nabeoriito_bc");

	}


	public static void register() {

		registerBlock(KAGAMIMOCHI);
		registerBlock(SHIMENAWA);
		registerBlock(KADOMATSU);

		registerBlock(HINAKAZARI);
		registerBlock(HINADAN);

		registerBlock(YUNOMI);

		registerBlock(CHABUDAI);
		registerBlock(CHABUDAI_aca);
		registerBlock(CHABUDAI_bir);
		registerBlock(CHABUDAI_doak);
		registerBlock(CHABUDAI_jun);
		registerBlock(CHABUDAI_spru);
		registerBlock(CHABUDAI_saku);
		registerBlock(CHABUDAI_kae);
		registerBlock(CHABUDAI_ich);

		registerBlock(KOTATSU);
		registerBlock(KOTATSU_aca);
		registerBlock(KOTATSU_bir);
		registerBlock(KOTATSU_doak);
		registerBlock(KOTATSU_jun);
		registerBlock(KOTATSU_spru);
		registerBlock(KOTATSU_saku);
		registerBlock(KOTATSU_kae);
		registerBlock(KOTATSU_ich);

		registerBlock(XMASTREE);
		registerBlock(XMASTREE_W);

		registerBlock(PRESENT_Apple);
		registerBlock(PRESENT_Book);
		registerBlock(PRESENT_Diamond);
		registerBlock(PRESENT_Lapis);
		registerBlock(PRESENT_Blaze);

		registerBlock(UCHIWA_black);
		registerBlock(UCHIWA_blue);
		registerBlock(UCHIWA_brown);
		registerBlock(UCHIWA_cyan);
		registerBlock(UCHIWA_gray);
		registerBlock(UCHIWA_green);
		registerBlock(UCHIWA_lightb);
		registerBlock(UCHIWA_lightg);
		registerBlock(UCHIWA_lime);
		registerBlock(UCHIWA_magenta);
		registerBlock(UCHIWA_orange);
		registerBlock(UCHIWA_pink);
		registerBlock(UCHIWA_purple);
		registerBlock(UCHIWA_red);
		registerBlock(UCHIWA_white);
		registerBlock(UCHIWA_yellow);

		registerBlock(WATAGASHI_block);
		registerBlock(WATAGASHI_pink);
		registerBlock(WATAGASHI_red);
		registerBlock(WATAGASHI_yellow);
		registerBlock(WATAGASHI_green);

		registerBlock(KAKIGOURI_kara);
		registerBlock(KAKIGOURI_block1);
		registerBlock(KAKIGOURI_block2);
		registerBlock(KAKIGOURI_block3);
		registerBlock(KAKIGOURI_pink1);
		registerBlock(KAKIGOURI_pink2);
		registerBlock(KAKIGOURI_pink3);
		registerBlock(KAKIGOURI_red1);
		registerBlock(KAKIGOURI_red2);
		registerBlock(KAKIGOURI_red3);
		registerBlock(KAKIGOURI_yellow1);
		registerBlock(KAKIGOURI_yellow2);
		registerBlock(KAKIGOURI_yellow3);
		registerBlock(KAKIGOURI_green1);
		registerBlock(KAKIGOURI_green2);
		registerBlock(KAKIGOURI_green3);
		registerBlock(KAKIGOURI_hata);

		registerBlock(AKUNABE_boil);
		registerBlock(AKUNABE_boil2cold);
		registerBlock(ORIITONABE_full);
		registerBlock(ORIITONABE_full2cold);
		registerBlock(ORIITONABE_boil);
		registerBlock(ORIITONABE_boil2cold);

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

		registerRender(KAGAMIMOCHI);
		registerRender(SHIMENAWA);
		registerRender(KADOMATSU);

		registerRender(HINAKAZARI);
		registerRender(HINADAN);

		registerRender(YUNOMI);

		registerRender(CHABUDAI);
		registerRender(CHABUDAI_aca);
		registerRender(CHABUDAI_bir);
		registerRender(CHABUDAI_doak);
		registerRender(CHABUDAI_jun);
		registerRender(CHABUDAI_spru);
		registerRender(CHABUDAI_saku);
		registerRender(CHABUDAI_kae);
		registerRender(CHABUDAI_ich);

		registerRender(KOTATSU);
		registerRender(KOTATSU_aca);
		registerRender(KOTATSU_bir);
		registerRender(KOTATSU_doak);
		registerRender(KOTATSU_jun);
		registerRender(KOTATSU_spru);
		registerRender(KOTATSU_saku);
		registerRender(KOTATSU_kae);
		registerRender(KOTATSU_ich);

		registerRender(XMASTREE);
		registerRender(XMASTREE_W);

		registerRender(PRESENT_Apple);
		registerRender(PRESENT_Book);
		registerRender(PRESENT_Diamond);
		registerRender(PRESENT_Lapis);
		registerRender(PRESENT_Blaze);

		registerRender(UCHIWA_black);
		registerRender(UCHIWA_blue);
		registerRender(UCHIWA_brown);
		registerRender(UCHIWA_cyan);
		registerRender(UCHIWA_gray);
		registerRender(UCHIWA_green);
		registerRender(UCHIWA_lightb);
		registerRender(UCHIWA_lightg);
		registerRender(UCHIWA_lime);
		registerRender(UCHIWA_magenta);
		registerRender(UCHIWA_orange);
		registerRender(UCHIWA_pink);
		registerRender(UCHIWA_purple);
		registerRender(UCHIWA_red);
		registerRender(UCHIWA_white);
		registerRender(UCHIWA_yellow);

		registerRender(WATAGASHI_block);
		registerRender(WATAGASHI_pink);
		registerRender(WATAGASHI_red);
		registerRender(WATAGASHI_yellow);
		registerRender(WATAGASHI_green);

		registerRender(KAKIGOURI_block1);
		registerRender(KAKIGOURI_pink1);
		registerRender(KAKIGOURI_red1);
		registerRender(KAKIGOURI_yellow1);
		registerRender(KAKIGOURI_green1);
		registerRender(KAKIGOURI_hata);

		registerRender(AKUNABE_boil2cold);

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

			ChinjufuModSeasons.init();
			ChinjufuModSeasons.register();
			BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
		}
	}

}
