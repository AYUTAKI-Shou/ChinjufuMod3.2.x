package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.lettertrays.BlockFudeDesk_c;
import com.ayutaki.chinjufumod.init.lettertrays.BlockFudeTray_c;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLetterDesk_c;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLetterTray_c;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLowDesk;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLowDesk_aca;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLowDesk_bir;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLowDesk_doak;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLowDesk_ich;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLowDesk_jun;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLowDesk_kae;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLowDesk_saku;
import com.ayutaki.chinjufumod.init.lettertrays.BlockLowDesk_spru;
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

public class LetterTrays {

	public static Block LOWDESK, LOWDESK_a, LOWDESK_b,
						LOWDESK_d, LOWDESK_j, LOWDESK_s,
						LOWDESK_saku, LOWDESK_kae, LOWDESK_ich;

	public static Block FUDE_TRAY;

	public static Block FUDE_DESK_a, FUDE_DESK_b, FUDE_DESK_d,
						FUDE_DESK_j, FUDE_DESK_o, FUDE_DESK_s,
						FUDE_DESK_saku, FUDE_DESK_kae, FUDE_DESK_ich;

	public static Block LETTER_TRAY;

	public static Block LETTER_DESK_a, LETTER_DESK_b, LETTER_DESK_d,
						LETTER_DESK_j, LETTER_DESK_o, LETTER_DESK_s,
						LETTER_DESK_saku, LETTER_DESK_kae, LETTER_DESK_ich;

	public static void init() {
		//ブロックのインスタンス生成
		LOWDESK = new BlockLowDesk(Material.WOOD).setRegistryName("block_lowdesk").setUnlocalizedName("block_lowdesk").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LOWDESK_a = new BlockLowDesk_aca(Material.WOOD).setRegistryName("block_lowdesk_a").setUnlocalizedName("block_lowdesk_a").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LOWDESK_b = new BlockLowDesk_bir(Material.WOOD).setRegistryName("block_lowdesk_b").setUnlocalizedName("block_lowdesk_b").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LOWDESK_d = new BlockLowDesk_doak(Material.WOOD).setRegistryName("block_lowdesk_d").setUnlocalizedName("block_lowdesk_d").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LOWDESK_j = new BlockLowDesk_jun(Material.WOOD).setRegistryName("block_lowdesk_j").setUnlocalizedName("block_lowdesk_j").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LOWDESK_s = new BlockLowDesk_spru(Material.WOOD).setRegistryName("block_lowdesk_s").setUnlocalizedName("block_lowdesk_s").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LOWDESK_saku = new BlockLowDesk_saku(Material.WOOD).setRegistryName("block_lowdesk_saku").setUnlocalizedName("block_lowdesk_saku").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LOWDESK_kae = new BlockLowDesk_kae(Material.WOOD).setRegistryName("block_lowdesk_kae").setUnlocalizedName("block_lowdesk_kae").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LOWDESK_ich = new BlockLowDesk_ich(Material.WOOD).setRegistryName("block_lowdesk_ich").setUnlocalizedName("block_lowdesk_ich").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		FUDE_TRAY = new BlockFudeTray_c().setRegistryName("block_fudetray_c").setUnlocalizedName("block_fudetray_c").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		FUDE_DESK_o = new BlockFudeDesk_c().setRegistryName("block_fudedesk_oc").setUnlocalizedName("block_fudedesk_oc").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		FUDE_DESK_a = new BlockFudeDesk_c().setRegistryName("block_fudedesk_ac").setUnlocalizedName("block_fudedesk_ac").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		FUDE_DESK_b = new BlockFudeDesk_c().setRegistryName("block_fudedesk_bc").setUnlocalizedName("block_fudedesk_bc").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		FUDE_DESK_d = new BlockFudeDesk_c().setRegistryName("block_fudedesk_dc").setUnlocalizedName("block_fudedesk_dc").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		FUDE_DESK_j = new BlockFudeDesk_c().setRegistryName("block_fudedesk_jc").setUnlocalizedName("block_fudedesk_jc").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		FUDE_DESK_s = new BlockFudeDesk_c().setRegistryName("block_fudedesk_sc").setUnlocalizedName("block_fudedesk_sc").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		FUDE_DESK_saku = new BlockFudeDesk_c().setRegistryName("block_fudedesk_saku").setUnlocalizedName("block_fudedesk_saku").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		FUDE_DESK_kae = new BlockFudeDesk_c().setRegistryName("block_fudedesk_kae").setUnlocalizedName("block_fudedesk_kae").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		FUDE_DESK_ich = new BlockFudeDesk_c().setRegistryName("block_fudedesk_ich").setUnlocalizedName("block_fudedesk_ich").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		LETTER_TRAY = new BlockLetterTray_c().setRegistryName("block_lettertray_c").setUnlocalizedName("block_lettertray_c").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		LETTER_DESK_o = new BlockLetterDesk_c().setRegistryName("block_letterdesk_oc").setUnlocalizedName("block_letterdesk_oc").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LETTER_DESK_a = new BlockLetterDesk_c().setRegistryName("block_letterdesk_ac").setUnlocalizedName("block_letterdesk_ac").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LETTER_DESK_b = new BlockLetterDesk_c().setRegistryName("block_letterdesk_bc").setUnlocalizedName("block_letterdesk_bc").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LETTER_DESK_d = new BlockLetterDesk_c().setRegistryName("block_letterdesk_dc").setUnlocalizedName("block_letterdesk_dc").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LETTER_DESK_j = new BlockLetterDesk_c().setRegistryName("block_letterdesk_jc").setUnlocalizedName("block_letterdesk_jc").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LETTER_DESK_s = new BlockLetterDesk_c().setRegistryName("block_letterdesk_sc").setUnlocalizedName("block_letterdesk_sc").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LETTER_DESK_saku = new BlockLetterDesk_c().setRegistryName("block_letterdesk_saku").setUnlocalizedName("block_letterdesk_saku").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LETTER_DESK_kae = new BlockLetterDesk_c().setRegistryName("block_letterdesk_kae").setUnlocalizedName("block_letterdesk_kae").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LETTER_DESK_ich = new BlockLetterDesk_c().setRegistryName("block_letterdesk_ich").setUnlocalizedName("block_letterdesk_ich").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

	}


	public static void register() {
		//ブロックを登録
		registerBlock(LOWDESK);
		registerBlock(LOWDESK_a);
		registerBlock(LOWDESK_b);
		registerBlock(LOWDESK_d);
		registerBlock(LOWDESK_j);
		registerBlock(LOWDESK_s);
		registerBlock(LOWDESK_saku);
		registerBlock(LOWDESK_kae);
		registerBlock(LOWDESK_ich);

		registerBlock(FUDE_TRAY);
		registerBlock(FUDE_DESK_o);
		registerBlock(FUDE_DESK_a);
		registerBlock(FUDE_DESK_b);
		registerBlock(FUDE_DESK_d);
		registerBlock(FUDE_DESK_j);
		registerBlock(FUDE_DESK_s);
		registerBlock(FUDE_DESK_saku);
		registerBlock(FUDE_DESK_kae);
		registerBlock(FUDE_DESK_ich);

		registerBlock(LETTER_TRAY);
		registerBlock(LETTER_DESK_o);
		registerBlock(LETTER_DESK_a);
		registerBlock(LETTER_DESK_b);
		registerBlock(LETTER_DESK_d);
		registerBlock(LETTER_DESK_j);
		registerBlock(LETTER_DESK_s);
		registerBlock(LETTER_DESK_saku);
		registerBlock(LETTER_DESK_kae);
		registerBlock(LETTER_DESK_ich);

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
		//ブロックのモデルを登録
		registerRender(LOWDESK);
		registerRender(LOWDESK_a);
		registerRender(LOWDESK_b);
		registerRender(LOWDESK_d);
		registerRender(LOWDESK_j);
		registerRender(LOWDESK_s);
		registerRender(LOWDESK_saku);
		registerRender(LOWDESK_kae);
		registerRender(LOWDESK_ich);

		registerRender(FUDE_TRAY);
		registerRender(FUDE_DESK_o);
		registerRender(FUDE_DESK_a);
		registerRender(FUDE_DESK_b);
		registerRender(FUDE_DESK_d);
		registerRender(FUDE_DESK_j);
		registerRender(FUDE_DESK_s);
		registerRender(FUDE_DESK_saku);
		registerRender(FUDE_DESK_kae);
		registerRender(FUDE_DESK_ich);

		registerRender(LETTER_TRAY);
		registerRender(LETTER_DESK_o);
		registerRender(LETTER_DESK_a);
		registerRender(LETTER_DESK_b);
		registerRender(LETTER_DESK_d);
		registerRender(LETTER_DESK_j);
		registerRender(LETTER_DESK_s);
		registerRender(LETTER_DESK_saku);
		registerRender(LETTER_DESK_kae);
		registerRender(LETTER_DESK_ich);

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

			LetterTrays.init();
			LetterTrays.register();
			BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
		}
	}

}
