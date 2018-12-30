package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.furnace.BlockCStove_bot;
import com.ayutaki.chinjufumod.init.furnace.BlockCStove_top;
import com.ayutaki.chinjufumod.init.school.BlockBlackBoard;
import com.ayutaki.chinjufumod.init.school.BlockCStove_new;
import com.ayutaki.chinjufumod.init.school.BlockCStove_new_lit;
import com.ayutaki.chinjufumod.init.school.BlockSChimney_joint;
import com.ayutaki.chinjufumod.init.school.BlockSchoolChair;
import com.ayutaki.chinjufumod.init.school.BlockSchoolDesk;
import com.ayutaki.chinjufumod.init.school.BlockStoveChimney;
import com.ayutaki.chinjufumod.init.school.BlockStoveChimney_topk;
import com.ayutaki.chinjufumod.init.school.BlockTeacherDesk;
import com.ayutaki.chinjufumod.init.school.BlockWindow;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OL;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OL_a;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OL_b;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OL_d;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OL_ich;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OL_j;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OL_kae;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OL_s;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OL_saku;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OR;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OR_a;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OR_b;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OR_d;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OR_ich;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OR_j;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OR_kae;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OR_s;
import com.ayutaki.chinjufumod.init.school.BlockWindow_OR_saku;
import com.ayutaki.chinjufumod.init.school.BlockWindow_a;
import com.ayutaki.chinjufumod.init.school.BlockWindow_b;
import com.ayutaki.chinjufumod.init.school.BlockWindow_d;
import com.ayutaki.chinjufumod.init.school.BlockWindow_ich;
import com.ayutaki.chinjufumod.init.school.BlockWindow_j;
import com.ayutaki.chinjufumod.init.school.BlockWindow_kae;
import com.ayutaki.chinjufumod.init.school.BlockWindow_s;
import com.ayutaki.chinjufumod.init.school.BlockWindow_saku;
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

public class ChinjufuModSchool {

	public static Block BLACKBOARD;

	public static Block WINDOW, WINDOW_a, WINDOW_b,
						WINDOW_d, WINDOW_j, WINDOW_s,
						WINDOW_saku, WINDOW_kae, WINDOW_ich;
	public static Block WINDOW_OL, WINDOW_OL_a, WINDOW_OL_b,
						WINDOW_OL_d, WINDOW_OL_j, WINDOW_OL_s,
						WINDOW_OL_saku, WINDOW_OL_kae, WINDOW_OL_ich;
	public static Block WINDOW_OR, WINDOW_OR_a, WINDOW_OR_b,
						WINDOW_OR_d, WINDOW_OR_j, WINDOW_OR_s,
						WINDOW_OR_saku, WINDOW_OR_kae, WINDOW_OR_ich;

	public static Block SCHOOLCHAIR, SCHOOLCHAIR_a, SCHOOLCHAIR_b,
						SCHOOLCHAIR_d, SCHOOLCHAIR_j, SCHOOLCHAIR_s,
						SCHOOLCHAIR_saku, SCHOOLCHAIR_kae, SCHOOLCHAIR_ich;

	public static Block SCHOOLDESK, SCHOOLDESK_a, SCHOOLDESK_b,
						SCHOOLDESK_d, SCHOOLDESK_j, SCHOOLDESK_s,
						SCHOOLDESK_saku, SCHOOLDESK_kae, SCHOOLDESK_ich;

	public static Block TEACHERDESK, TEACHERDESK_a, TEACHERDESK_b,
						TEACHERDESK_d, TEACHERDESK_j, TEACHERDESK_s,
						TEACHERDESK_saku, TEACHERDESK_kae, TEACHERDESK_ich;

	public static Block STOVECHIMNEY;
	public static Block STOVECHIMNEY_joint;
	public static Block STOVECHIMNEY_topk;

	public static Block CSTOVE, LIT_CSTOVE;
	public static Block CSTOVE_top, LIT_CSTOVE_top, CSTOVE_bot;

	public static void init() {
		//ブロックのインスタンス生成

		BLACKBOARD = new BlockBlackBoard(Material.WOOD).setRegistryName("block_blackboard").setUnlocalizedName("block_blackboard").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		WINDOW = new BlockWindow(Material.WOOD).setRegistryName("block_window_cl").setUnlocalizedName("block_window_cl").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		WINDOW_OL = new BlockWindow_OL(Material.WOOD, "block_window_ol");
		WINDOW_OR = new BlockWindow_OR(Material.WOOD, "block_window_or");
		WINDOW_a = new BlockWindow_a(Material.WOOD).setRegistryName("block_window_cl_a").setUnlocalizedName("block_window_cl_a").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		WINDOW_OL_a = new BlockWindow_OL_a(Material.WOOD, "block_window_ol_a");
		WINDOW_OR_a = new BlockWindow_OR_a(Material.WOOD, "block_window_or_a");
		WINDOW_b = new BlockWindow_b(Material.WOOD).setRegistryName("block_window_cl_b").setUnlocalizedName("block_window_cl_b").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		WINDOW_OL_b = new BlockWindow_OL_b(Material.WOOD, "block_window_ol_b");
		WINDOW_OR_b = new BlockWindow_OR_b(Material.WOOD, "block_window_or_b");
		WINDOW_d = new BlockWindow_d(Material.WOOD).setRegistryName("block_window_cl_d").setUnlocalizedName("block_window_cl_d").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		WINDOW_OL_d = new BlockWindow_OL_d(Material.WOOD, "block_window_ol_d");
		WINDOW_OR_d = new BlockWindow_OR_d(Material.WOOD, "block_window_or_d");
		WINDOW_j = new BlockWindow_j(Material.WOOD).setRegistryName("block_window_cl_j").setUnlocalizedName("block_window_cl_j").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		WINDOW_OL_j = new BlockWindow_OL_j(Material.WOOD, "block_window_ol_j");
		WINDOW_OR_j = new BlockWindow_OR_j(Material.WOOD, "block_window_or_j");
		WINDOW_s = new BlockWindow_s(Material.WOOD).setRegistryName("block_window_cl_s").setUnlocalizedName("block_window_cl_s").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		WINDOW_OL_s = new BlockWindow_OL_s(Material.WOOD, "block_window_ol_s");
		WINDOW_OR_s = new BlockWindow_OR_s(Material.WOOD, "block_window_or_s");

		WINDOW_saku = new BlockWindow_saku(Material.WOOD).setRegistryName("block_window_cl_saku").setUnlocalizedName("block_window_cl_saku").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		WINDOW_OL_saku = new BlockWindow_OL_saku(Material.WOOD, "block_window_ol_saku");
		WINDOW_OR_saku = new BlockWindow_OR_saku(Material.WOOD, "block_window_or_saku");
		WINDOW_kae = new BlockWindow_kae(Material.WOOD).setRegistryName("block_window_cl_kae").setUnlocalizedName("block_window_cl_kae").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		WINDOW_OL_kae = new BlockWindow_OL_kae(Material.WOOD, "block_window_ol_kae");
		WINDOW_OR_kae = new BlockWindow_OR_kae(Material.WOOD, "block_window_or_kae");
		WINDOW_ich = new BlockWindow_ich(Material.WOOD).setRegistryName("block_window_cl_ich").setUnlocalizedName("block_window_cl_ich").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		WINDOW_OL_ich = new BlockWindow_OL_ich(Material.WOOD, "block_window_ol_ich");
		WINDOW_OR_ich = new BlockWindow_OR_ich(Material.WOOD, "block_window_or_ich");

		SCHOOLCHAIR = new BlockSchoolChair(Material.WOOD).setRegistryName("block_schoolchair").setUnlocalizedName("block_schoolchair").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SCHOOLCHAIR_a = new BlockSchoolChair(Material.WOOD).setRegistryName("block_schoolchair_a").setUnlocalizedName("block_schoolchair_a").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SCHOOLCHAIR_b = new BlockSchoolChair(Material.WOOD).setRegistryName("block_schoolchair_b").setUnlocalizedName("block_schoolchair_b").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SCHOOLCHAIR_d = new BlockSchoolChair(Material.WOOD).setRegistryName("block_schoolchair_d").setUnlocalizedName("block_schoolchair_d").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SCHOOLCHAIR_j = new BlockSchoolChair(Material.WOOD).setRegistryName("block_schoolchair_j").setUnlocalizedName("block_schoolchair_j").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SCHOOLCHAIR_s = new BlockSchoolChair(Material.WOOD).setRegistryName("block_schoolchair_s").setUnlocalizedName("block_schoolchair_s").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SCHOOLCHAIR_saku = new BlockSchoolChair(Material.WOOD).setRegistryName("block_schoolchair_saku").setUnlocalizedName("block_schoolchair_saku").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SCHOOLCHAIR_kae = new BlockSchoolChair(Material.WOOD).setRegistryName("block_schoolchair_kae").setUnlocalizedName("block_schoolchair_kae").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SCHOOLCHAIR_ich = new BlockSchoolChair(Material.WOOD).setRegistryName("block_schoolchair_ich").setUnlocalizedName("block_schoolchair_ich").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		SCHOOLDESK = new BlockSchoolDesk().setRegistryName("block_schooldesk").setUnlocalizedName("block_schooldesk").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SCHOOLDESK_a = new BlockSchoolDesk().setRegistryName("block_schooldesk_a").setUnlocalizedName("block_schooldesk_a").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SCHOOLDESK_b = new BlockSchoolDesk().setRegistryName("block_schooldesk_b").setUnlocalizedName("block_schooldesk_b").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SCHOOLDESK_d = new BlockSchoolDesk().setRegistryName("block_schooldesk_d").setUnlocalizedName("block_schooldesk_d").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SCHOOLDESK_j = new BlockSchoolDesk().setRegistryName("block_schooldesk_j").setUnlocalizedName("block_schooldesk_j").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SCHOOLDESK_s = new BlockSchoolDesk().setRegistryName("block_schooldesk_s").setUnlocalizedName("block_schooldesk_s").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SCHOOLDESK_saku = new BlockSchoolDesk().setRegistryName("block_schooldesk_saku").setUnlocalizedName("block_schooldesk_saku").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SCHOOLDESK_kae = new BlockSchoolDesk().setRegistryName("block_schooldesk_kae").setUnlocalizedName("block_schooldesk_kae").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		SCHOOLDESK_ich = new BlockSchoolDesk().setRegistryName("block_schooldesk_ich").setUnlocalizedName("block_schooldesk_ich").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		TEACHERDESK = new BlockTeacherDesk().setRegistryName("block_teacherdesk").setUnlocalizedName("block_teacherdesk").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TEACHERDESK_a = new BlockTeacherDesk().setRegistryName("block_teacherdesk_a").setUnlocalizedName("block_teacherdesk_a").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TEACHERDESK_b = new BlockTeacherDesk().setRegistryName("block_teacherdesk_b").setUnlocalizedName("block_teacherdesk_b").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TEACHERDESK_d = new BlockTeacherDesk().setRegistryName("block_teacherdesk_d").setUnlocalizedName("block_teacherdesk_d").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TEACHERDESK_j = new BlockTeacherDesk().setRegistryName("block_teacherdesk_j").setUnlocalizedName("block_teacherdesk_j").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TEACHERDESK_s = new BlockTeacherDesk().setRegistryName("block_teacherdesk_s").setUnlocalizedName("block_teacherdesk_s").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TEACHERDESK_saku = new BlockTeacherDesk().setRegistryName("block_teacherdesk_saku").setUnlocalizedName("block_teacherdesk_saku").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TEACHERDESK_kae = new BlockTeacherDesk().setRegistryName("block_teacherdesk_kae").setUnlocalizedName("block_teacherdesk_kae").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		TEACHERDESK_ich = new BlockTeacherDesk().setRegistryName("block_teacherdesk_ich").setUnlocalizedName("block_teacherdesk_ich").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		STOVECHIMNEY = new BlockStoveChimney(Material.WOOD).setRegistryName("block_stovechimney").setUnlocalizedName("block_stovechimney").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		STOVECHIMNEY_joint = new BlockSChimney_joint().setRegistryName("block_schimney_joint").setUnlocalizedName("block_schimney_joint").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		STOVECHIMNEY_topk = new BlockStoveChimney_topk(Material.WOOD).setRegistryName("block_stovechimney_topk").setUnlocalizedName("block_stovechimney_topk").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

		CSTOVE = new BlockCStove_new().setRegistryName("block_cstove_new").setUnlocalizedName("block_cstove_new");
		LIT_CSTOVE = new BlockCStove_new_lit().setRegistryName("lit_block_cstove_new").setUnlocalizedName("lit_block_cstove_new");

		CSTOVE_top = new BlockCStove_top(false, "block_cstove_top").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);
		LIT_CSTOVE_top = new BlockCStove_top(true, "lit_block_cstove_top").setHardness(1.0F).setResistance(10.0F);
		CSTOVE_bot = new BlockCStove_bot().setRegistryName("block_cstove_bot").setUnlocalizedName("block_cstove_bot").setCreativeTab(ChinjufuModTabs.tab_chinjufumod);

	}


	public static void register() {
		//ブロックを登録
		registerBlock(BLACKBOARD);

		registerBlock(WINDOW);
		registerBlock(WINDOW_OL);
		registerBlock(WINDOW_OR);
		registerBlock(WINDOW_a);
		registerBlock(WINDOW_OL_a);
		registerBlock(WINDOW_OR_a);
		registerBlock(WINDOW_b);
		registerBlock(WINDOW_OL_b);
		registerBlock(WINDOW_OR_b);
		registerBlock(WINDOW_d);
		registerBlock(WINDOW_OL_d);
		registerBlock(WINDOW_OR_d);
		registerBlock(WINDOW_j);
		registerBlock(WINDOW_OL_j);
		registerBlock(WINDOW_OR_j);
		registerBlock(WINDOW_s);
		registerBlock(WINDOW_OL_s);
		registerBlock(WINDOW_OR_s);
		registerBlock(WINDOW_saku);
		registerBlock(WINDOW_OL_saku);
		registerBlock(WINDOW_OR_saku);
		registerBlock(WINDOW_kae);
		registerBlock(WINDOW_OL_kae);
		registerBlock(WINDOW_OR_kae);
		registerBlock(WINDOW_ich);
		registerBlock(WINDOW_OL_ich);
		registerBlock(WINDOW_OR_ich);

		registerBlock(SCHOOLCHAIR);
		registerBlock(SCHOOLCHAIR_a);
		registerBlock(SCHOOLCHAIR_b);
		registerBlock(SCHOOLCHAIR_d);
		registerBlock(SCHOOLCHAIR_j);
		registerBlock(SCHOOLCHAIR_s);
		registerBlock(SCHOOLCHAIR_saku);
		registerBlock(SCHOOLCHAIR_kae);
		registerBlock(SCHOOLCHAIR_ich);

		registerBlock(SCHOOLDESK);
		registerBlock(SCHOOLDESK_a);
		registerBlock(SCHOOLDESK_b);
		registerBlock(SCHOOLDESK_d);
		registerBlock(SCHOOLDESK_j);
		registerBlock(SCHOOLDESK_s);
		registerBlock(SCHOOLDESK_saku);
		registerBlock(SCHOOLDESK_kae);
		registerBlock(SCHOOLDESK_ich);

		registerBlock(TEACHERDESK);
		registerBlock(TEACHERDESK_a);
		registerBlock(TEACHERDESK_b);
		registerBlock(TEACHERDESK_d);
		registerBlock(TEACHERDESK_j);
		registerBlock(TEACHERDESK_s);
		registerBlock(TEACHERDESK_saku);
		registerBlock(TEACHERDESK_kae);
		registerBlock(TEACHERDESK_ich);

		registerBlock(STOVECHIMNEY);
		registerBlock(STOVECHIMNEY_joint);
		registerBlock(STOVECHIMNEY_topk);

		registerBlock(CSTOVE);
		registerBlock(LIT_CSTOVE);

		registerBlock(CSTOVE_top);
		registerBlock(LIT_CSTOVE_top);
		registerBlock(CSTOVE_bot);

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
		registerRender(BLACKBOARD);

		registerRender(WINDOW);
		registerRender(WINDOW_a);
		registerRender(WINDOW_b);
		registerRender(WINDOW_d);
		registerRender(WINDOW_j);
		registerRender(WINDOW_s);
		registerRender(WINDOW_saku);
		registerRender(WINDOW_kae);
		registerRender(WINDOW_ich);

		registerRender(SCHOOLCHAIR);
		registerRender(SCHOOLCHAIR_a);
		registerRender(SCHOOLCHAIR_b);
		registerRender(SCHOOLCHAIR_d);
		registerRender(SCHOOLCHAIR_j);
		registerRender(SCHOOLCHAIR_s);
		registerRender(SCHOOLCHAIR_saku);
		registerRender(SCHOOLCHAIR_kae);
		registerRender(SCHOOLCHAIR_ich);

		registerRender(SCHOOLDESK);
		registerRender(SCHOOLDESK_a);
		registerRender(SCHOOLDESK_b);
		registerRender(SCHOOLDESK_d);
		registerRender(SCHOOLDESK_j);
		registerRender(SCHOOLDESK_s);
		registerRender(SCHOOLDESK_saku);
		registerRender(SCHOOLDESK_kae);
		registerRender(SCHOOLDESK_ich);

		registerRender(TEACHERDESK);
		registerRender(TEACHERDESK_a);
		registerRender(TEACHERDESK_b);
		registerRender(TEACHERDESK_d);
		registerRender(TEACHERDESK_j);
		registerRender(TEACHERDESK_s);
		registerRender(TEACHERDESK_saku);
		registerRender(TEACHERDESK_kae);
		registerRender(TEACHERDESK_ich);

		registerRender(STOVECHIMNEY);
		registerRender(STOVECHIMNEY_joint);
		registerRender(STOVECHIMNEY_topk);

		registerRender(CSTOVE);

		registerRender(CSTOVE_top);
		registerRender(CSTOVE_bot);

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

			ChinjufuModSchool.init();
			ChinjufuModSchool.register();
			BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
		}
	}

}
