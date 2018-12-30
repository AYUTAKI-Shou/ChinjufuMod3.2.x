package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.furnitures.BlockAdmiralChair;
import com.ayutaki.chinjufumod.init.furnitures.BlockAndon;
import com.ayutaki.chinjufumod.init.furnitures.BlockCafeChair;
import com.ayutaki.chinjufumod.init.furnitures.BlockDiningChair;
import com.ayutaki.chinjufumod.init.furnitures.BlockDressingTable;
import com.ayutaki.chinjufumod.init.furnitures.BlockLamp;
import com.ayutaki.chinjufumod.init.furnitures.BlockTansu;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_a;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_b;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_d;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_ich;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_j;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_kae;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_s;
import com.ayutaki.chinjufumod.init.furnitures.BlockUnitDesk_saku;
import com.ayutaki.chinjufumod.init.furnitures.BlockZaisu;
import com.ayutaki.chinjufumod.init.furnitures.Lit_Andon;
import com.ayutaki.chinjufumod.init.furnitures.Lit_Lamp;
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

public class ChinjufuModFurnitures {

	public static Block DRESSINGTABLE, DRESSINGTABLE_a, DRESSINGTABLE_b,
						DRESSINGTABLE_d, DRESSINGTABLE_j, DRESSINGTABLE_s,
						DRESSINGTABLE_saku, DRESSINGTABLE_kae, DRESSINGTABLE_ich;

	public static Block CAFECHAIR_black,CAFECHAIR_blue,CAFECHAIR_brown,CAFECHAIR_cyan,
						CAFECHAIR_gray,CAFECHAIR_green,CAFECHAIR_lightb,CAFECHAIR_lightg,
						CAFECHAIR_lime,CAFECHAIR_magenta,CAFECHAIR_orange,CAFECHAIR_pink,
						CAFECHAIR_purple,CAFECHAIR_red,CAFECHAIR_white,CAFECHAIR_yellow;

	public static Block DININGCHAIR, DININGCHAIR_a, DININGCHAIR_b,
						DININGCHAIR_d, DININGCHAIR_j, DININGCHAIR_s,
						DININGCHAIR_saku, DININGCHAIR_kae, DININGCHAIR_ich;

	public static Block UNITDESK, UNITDESK_a, UNITDESK_b, UNITDESK_d, UNITDESK_j, UNITDESK_s,
						UNITDESK_saku, UNITDESK_kae, UNITDESK_ich;

	public static Block ZAISU_black,ZAISU_blue,ZAISU_brown,ZAISU_cyan,
						ZAISU_gray,ZAISU_green,ZAISU_lightb,ZAISU_lightg,
						ZAISU_lime,ZAISU_magenta,ZAISU_orange,ZAISU_pink,
						ZAISU_purple,ZAISU_red,ZAISU_white,ZAISU_yellow;

	public static Block ADMIRALCHAIR, ADMIRALCHAIR_red;

	public static Block TANSU_OAK, TANSU_OAK_OPEN, DOAK_TANSU, SPRUCE_TANSU;
	public static Block LAMP, LIT_LAMP, ANDON, LIT_ANDON;

	public static void init() {

		DRESSINGTABLE = new BlockDressingTable().setRegistryName("block_dressingtable").setUnlocalizedName("block_dressingtable").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DRESSINGTABLE_a = new BlockDressingTable().setRegistryName("block_dressingtable_a").setUnlocalizedName("block_dressingtable_a").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DRESSINGTABLE_b = new BlockDressingTable().setRegistryName("block_dressingtable_b").setUnlocalizedName("block_dressingtable_b").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DRESSINGTABLE_d = new BlockDressingTable().setRegistryName("block_dressingtable_d").setUnlocalizedName("block_dressingtable_d").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DRESSINGTABLE_j = new BlockDressingTable().setRegistryName("block_dressingtable_j").setUnlocalizedName("block_dressingtable_j").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DRESSINGTABLE_s = new BlockDressingTable().setRegistryName("block_dressingtable_s").setUnlocalizedName("block_dressingtable_s").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DRESSINGTABLE_saku = new BlockDressingTable().setRegistryName("block_dressingtable_saku").setUnlocalizedName("block_dressingtable_saku").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DRESSINGTABLE_kae = new BlockDressingTable().setRegistryName("block_dressingtable_kae").setUnlocalizedName("block_dressingtable_kae").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DRESSINGTABLE_ich = new BlockDressingTable().setRegistryName("block_dressingtable_ich").setUnlocalizedName("block_dressingtable_ich").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		CAFECHAIR_black = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_black").setUnlocalizedName("block_cafechair_black").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_blue = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_blue").setUnlocalizedName("block_cafechair_blue").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_brown = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_brown").setUnlocalizedName("block_cafechair_brown").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_cyan = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_cyan").setUnlocalizedName("block_cafechair_cyan").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_gray = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_gray").setUnlocalizedName("block_cafechair_gray").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_green = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_green").setUnlocalizedName("block_cafechair_green").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_lightb = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_lightb").setUnlocalizedName("block_cafechair_lightb").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_lightg = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_lightg").setUnlocalizedName("block_cafechair_lightg").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_lime = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_lime").setUnlocalizedName("block_cafechair_lime").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_magenta = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_magenta").setUnlocalizedName("block_cafechair_magenta").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_orange = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_orange").setUnlocalizedName("block_cafechair_orange").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_pink = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_pink").setUnlocalizedName("block_cafechair_pink").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_purple = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_purple").setUnlocalizedName("block_cafechair_purple").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_red = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_red").setUnlocalizedName("block_cafechair_red").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_white = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_white").setUnlocalizedName("block_cafechair_white").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		CAFECHAIR_yellow = new BlockCafeChair(Material.WOOD).setRegistryName("block_cafechair_yellow").setUnlocalizedName("block_cafechair_yellow").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		DININGCHAIR = new BlockDiningChair(Material.WOOD).setRegistryName("block_diningchair").setUnlocalizedName("block_diningchair").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DININGCHAIR_a = new BlockDiningChair(Material.WOOD).setRegistryName("block_diningchair_a").setUnlocalizedName("block_diningchair_a").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DININGCHAIR_b = new BlockDiningChair(Material.WOOD).setRegistryName("block_diningchair_b").setUnlocalizedName("block_diningchair_b").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DININGCHAIR_d = new BlockDiningChair(Material.WOOD).setRegistryName("block_diningchair_d").setUnlocalizedName("block_diningchair_d").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DININGCHAIR_j = new BlockDiningChair(Material.WOOD).setRegistryName("block_diningchair_j").setUnlocalizedName("block_diningchair_j").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DININGCHAIR_s = new BlockDiningChair(Material.WOOD).setRegistryName("block_diningchair_s").setUnlocalizedName("block_diningchair_s").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DININGCHAIR_saku = new BlockDiningChair(Material.WOOD).setRegistryName("block_diningchair_saku").setUnlocalizedName("block_diningchair_saku").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DININGCHAIR_kae = new BlockDiningChair(Material.WOOD).setRegistryName("block_diningchair_kae").setUnlocalizedName("block_diningchair_kae").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DININGCHAIR_ich = new BlockDiningChair(Material.WOOD).setRegistryName("block_diningchair_ich").setUnlocalizedName("block_diningchair_ich").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		UNITDESK = new BlockUnitDesk(Material.WOOD).setRegistryName("block_unitdesk").setUnlocalizedName("block_unitdesk").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		UNITDESK_a = new BlockUnitDesk_a(Material.WOOD).setRegistryName("block_unitdesk_a").setUnlocalizedName("block_unitdesk_a").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		UNITDESK_b = new BlockUnitDesk_b(Material.WOOD).setRegistryName("block_unitdesk_b").setUnlocalizedName("block_unitdesk_b").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		UNITDESK_d = new BlockUnitDesk_d(Material.WOOD).setRegistryName("block_unitdesk_d").setUnlocalizedName("block_unitdesk_d").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		UNITDESK_j = new BlockUnitDesk_j(Material.WOOD).setRegistryName("block_unitdesk_j").setUnlocalizedName("block_unitdesk_j").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		UNITDESK_s = new BlockUnitDesk_s(Material.WOOD).setRegistryName("block_unitdesk_s").setUnlocalizedName("block_unitdesk_s").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		UNITDESK_saku = new BlockUnitDesk_saku(Material.WOOD).setRegistryName("block_unitdesk_saku").setUnlocalizedName("block_unitdesk_saku").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		UNITDESK_kae = new BlockUnitDesk_kae(Material.WOOD).setRegistryName("block_unitdesk_kae").setUnlocalizedName("block_unitdesk_kae").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		UNITDESK_ich = new BlockUnitDesk_ich(Material.WOOD).setRegistryName("block_unitdesk_ich").setUnlocalizedName("block_unitdesk_ich").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		ZAISU_black = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_black").setUnlocalizedName("block_zaisu_black").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_blue = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_blue").setUnlocalizedName("block_zaisu_blue").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_brown = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_brown").setUnlocalizedName("block_zaisu_brown").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_cyan = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_cyan").setUnlocalizedName("block_zaisu_cyan").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_gray = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_gray").setUnlocalizedName("block_zaisu_gray").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_green = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_green").setUnlocalizedName("block_zaisu_green").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_lightb = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_lightb").setUnlocalizedName("block_zaisu_lightb").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_lightg = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_lightg").setUnlocalizedName("block_zaisu_lightg").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_lime = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_lime").setUnlocalizedName("block_zaisu_lime").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_magenta = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_magenta").setUnlocalizedName("block_zaisu_magenta").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_orange = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_orange").setUnlocalizedName("block_zaisu_orange").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_pink = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_pink").setUnlocalizedName("block_zaisu_pink").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_purple = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_purple").setUnlocalizedName("block_zaisu_purple").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_red = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_red").setUnlocalizedName("block_zaisu_red").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_white = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_white").setUnlocalizedName("block_zaisu_white").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		ZAISU_yellow = new BlockZaisu(Material.WOOD).setRegistryName("block_zaisu_yellow").setUnlocalizedName("block_zaisu_yellow").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);

		ADMIRALCHAIR = new BlockAdmiralChair(Material.WOOD).setRegistryName("block_admiralchair").setUnlocalizedName("block_admiralchair").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		ADMIRALCHAIR_red = new BlockAdmiralChair(Material.WOOD).setRegistryName("block_admiralchair_red").setUnlocalizedName("block_admiralchair_red").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		TANSU_OAK = new BlockTansu().setRegistryName("block_tansu_oak").setUnlocalizedName("block_tansu_oak").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		DOAK_TANSU = new BlockTansu().setRegistryName("block_tansu_doak").setUnlocalizedName("block_tansu_doak").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SPRUCE_TANSU = new BlockTansu().setRegistryName("block_tansu_spruce").setUnlocalizedName("block_tansu_spruce").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		LAMP = new BlockLamp().setRegistryName("block_lamp").setUnlocalizedName("block_lamp").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LIT_LAMP = new Lit_Lamp().setRegistryName("lit_lamp").setUnlocalizedName("lit_lamp");
		ANDON= new BlockAndon().setRegistryName("block_andon").setUnlocalizedName("block_andon").setCreativeTab(ChinjufuModTabs.tab_cmodwadeco);
		LIT_ANDON = new Lit_Andon().setRegistryName("lit_andon").setUnlocalizedName("lit_andon");

	}


	public static void register() {

		registerBlock(DRESSINGTABLE);
		registerBlock(DRESSINGTABLE_a);
		registerBlock(DRESSINGTABLE_b);
		registerBlock(DRESSINGTABLE_d);
		registerBlock(DRESSINGTABLE_j);
		registerBlock(DRESSINGTABLE_s);
		registerBlock(DRESSINGTABLE_saku);
		registerBlock(DRESSINGTABLE_kae);
		registerBlock(DRESSINGTABLE_ich);

		registerBlock(CAFECHAIR_black);
		registerBlock(CAFECHAIR_blue);
		registerBlock(CAFECHAIR_brown);
		registerBlock(CAFECHAIR_cyan);
		registerBlock(CAFECHAIR_gray);
		registerBlock(CAFECHAIR_green);
		registerBlock(CAFECHAIR_lightb);
		registerBlock(CAFECHAIR_lightg);
		registerBlock(CAFECHAIR_lime);
		registerBlock(CAFECHAIR_magenta);
		registerBlock(CAFECHAIR_orange);
		registerBlock(CAFECHAIR_pink);
		registerBlock(CAFECHAIR_purple);
		registerBlock(CAFECHAIR_red);
		registerBlock(CAFECHAIR_white);
		registerBlock(CAFECHAIR_yellow);

		registerBlock(DININGCHAIR);
		registerBlock(DININGCHAIR_a);
		registerBlock(DININGCHAIR_b);
		registerBlock(DININGCHAIR_d);
		registerBlock(DININGCHAIR_j);
		registerBlock(DININGCHAIR_s);
		registerBlock(DININGCHAIR_saku);
		registerBlock(DININGCHAIR_kae);
		registerBlock(DININGCHAIR_ich);

		registerBlock(UNITDESK);
		registerBlock(UNITDESK_a);
		registerBlock(UNITDESK_b);
		registerBlock(UNITDESK_d);
		registerBlock(UNITDESK_j);
		registerBlock(UNITDESK_s);
		registerBlock(UNITDESK_saku);
		registerBlock(UNITDESK_kae);
		registerBlock(UNITDESK_ich);

		registerBlock(ZAISU_black);
		registerBlock(ZAISU_blue);
		registerBlock(ZAISU_brown);
		registerBlock(ZAISU_cyan);
		registerBlock(ZAISU_gray);
		registerBlock(ZAISU_green);
		registerBlock(ZAISU_lightb);
		registerBlock(ZAISU_lightg);
		registerBlock(ZAISU_lime);
		registerBlock(ZAISU_magenta);
		registerBlock(ZAISU_orange);
		registerBlock(ZAISU_pink);
		registerBlock(ZAISU_purple);
		registerBlock(ZAISU_red);
		registerBlock(ZAISU_white);
		registerBlock(ZAISU_yellow);

		registerBlock(ADMIRALCHAIR);
		registerBlock(ADMIRALCHAIR_red);

		registerBlock(TANSU_OAK);
		registerBlock(DOAK_TANSU);
		registerBlock(SPRUCE_TANSU);

		registerBlock(LAMP);
		registerBlock(LIT_LAMP);
		registerBlock(ANDON);
		registerBlock(LIT_ANDON);

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

		registerRender(DRESSINGTABLE);
		registerRender(DRESSINGTABLE_a);
		registerRender(DRESSINGTABLE_b);
		registerRender(DRESSINGTABLE_d);
		registerRender(DRESSINGTABLE_j);
		registerRender(DRESSINGTABLE_s);
		registerRender(DRESSINGTABLE_saku);
		registerRender(DRESSINGTABLE_kae);
		registerRender(DRESSINGTABLE_ich);

		registerRender(CAFECHAIR_black);
		registerRender(CAFECHAIR_blue);
		registerRender(CAFECHAIR_brown);
		registerRender(CAFECHAIR_cyan);
		registerRender(CAFECHAIR_gray);
		registerRender(CAFECHAIR_green);
		registerRender(CAFECHAIR_lightb);
		registerRender(CAFECHAIR_lightg);
		registerRender(CAFECHAIR_lime);
		registerRender(CAFECHAIR_magenta);
		registerRender(CAFECHAIR_orange);
		registerRender(CAFECHAIR_pink);
		registerRender(CAFECHAIR_purple);
		registerRender(CAFECHAIR_red);
		registerRender(CAFECHAIR_white);
		registerRender(CAFECHAIR_yellow);

		registerRender(DININGCHAIR);
		registerRender(DININGCHAIR_a);
		registerRender(DININGCHAIR_b);
		registerRender(DININGCHAIR_d);
		registerRender(DININGCHAIR_j);
		registerRender(DININGCHAIR_s);
		registerRender(DININGCHAIR_saku);
		registerRender(DININGCHAIR_kae);
		registerRender(DININGCHAIR_ich);

		registerRender(UNITDESK);
		registerRender(UNITDESK_a);
		registerRender(UNITDESK_b);
		registerRender(UNITDESK_d);
		registerRender(UNITDESK_j);
		registerRender(UNITDESK_s);
		registerRender(UNITDESK_saku);
		registerRender(UNITDESK_kae);
		registerRender(UNITDESK_ich);

		registerRender(ZAISU_black);
		registerRender(ZAISU_blue);
		registerRender(ZAISU_brown);
		registerRender(ZAISU_cyan);
		registerRender(ZAISU_gray);
		registerRender(ZAISU_green);
		registerRender(ZAISU_lightb);
		registerRender(ZAISU_lightg);
		registerRender(ZAISU_lime);
		registerRender(ZAISU_magenta);
		registerRender(ZAISU_orange);
		registerRender(ZAISU_pink);
		registerRender(ZAISU_purple);
		registerRender(ZAISU_red);
		registerRender(ZAISU_white);
		registerRender(ZAISU_yellow);

		registerRender(ADMIRALCHAIR);
		registerRender(ADMIRALCHAIR_red);

		registerRender(TANSU_OAK);
		registerRender(DOAK_TANSU);
		registerRender(SPRUCE_TANSU);

		registerRender(LAMP);
		registerRender(ANDON);

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

			ChinjufuModFurnitures.init();
			ChinjufuModFurnitures.register();
			BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
		}
	}
}
