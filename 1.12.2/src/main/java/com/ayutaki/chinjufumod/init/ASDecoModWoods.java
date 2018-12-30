package com.ayutaki.chinjufumod.init;

import java.util.LinkedList;
import java.util.List;

import com.ayutaki.chinjufumod.init.wallpane.BlockPillar_plank_c;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_log;
import com.ayutaki.chinjufumod.init.wallpane.BlockWP_plank;
import com.ayutaki.chinjufumod.init.woods.BlockCMPlanks;
import com.ayutaki.chinjufumod.init.woods.BlockFallCarpet;
import com.ayutaki.chinjufumod.init.woods.BlockFallLeaf;
import com.ayutaki.chinjufumod.init.woods.BlockIchohStairs;
import com.ayutaki.chinjufumod.init.woods.BlockIchoh_SlabDouble;
import com.ayutaki.chinjufumod.init.woods.BlockIchoh_SlabHalf;
import com.ayutaki.chinjufumod.init.woods.BlockIchoh_leaf;
import com.ayutaki.chinjufumod.init.woods.BlockIchoh_log;
import com.ayutaki.chinjufumod.init.woods.BlockIchoh_nae;
import com.ayutaki.chinjufumod.init.woods.BlockKaedeStairs;
import com.ayutaki.chinjufumod.init.woods.BlockKaede_SlabDouble;
import com.ayutaki.chinjufumod.init.woods.BlockKaede_SlabHalf;
import com.ayutaki.chinjufumod.init.woods.BlockKaede_leaf;
import com.ayutaki.chinjufumod.init.woods.BlockKaede_log;
import com.ayutaki.chinjufumod.init.woods.BlockKaede_nae;
import com.ayutaki.chinjufumod.init.woods.BlockOakKare_leaf;
import com.ayutaki.chinjufumod.init.woods.BlockOakKare_nae;
import com.ayutaki.chinjufumod.init.woods.BlockSakuraStairs;
import com.ayutaki.chinjufumod.init.woods.BlockSakura_SlabDouble;
import com.ayutaki.chinjufumod.init.woods.BlockSakura_SlabHalf;
import com.ayutaki.chinjufumod.init.woods.BlockSakura_flow;
import com.ayutaki.chinjufumod.init.woods.BlockSakura_log;
import com.ayutaki.chinjufumod.init.woods.BlockSakura_me;
import com.ayutaki.chinjufumod.init.woods.BlockSakura_nae;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ASDecoModWoods {

	public static Block CHERRY_me;

	public static Block SAKURA_nae, SAKURA_log, SAKURA_flow,
						KAEDE_log, KAEDE_leaf, KAEDE_nae,
						ICHOH_log, ICHOH_leaf, ICHOH_nae, OAKKARE_leaf, OAKKARE_nae, FALL_LEAF;

	public static Block SAKURA_planks, KAEDE_planks, ICHOH_planks;
	public static Block SAKURA_stairs, KAEDE_stairs, ICHOH_stairs;

	public static BlockSakura_SlabHalf SAKURA_SlabHalf;
	public static BlockSakura_SlabDouble SAKURA_SlabDouble;
	public static BlockKaede_SlabHalf KAEDE_SlabHalf;
	public static BlockKaede_SlabDouble KAEDE_SlabDouble;
	public static BlockIchoh_SlabHalf ICHOH_SlabHalf;
	public static BlockIchoh_SlabDouble ICHOH_SlabDouble;

	public static Block SAKURA_PIL, KAEDE_PIL, ICHOH_PIL;
	public static Block WP_LOG_sakura, WP_LOG_kaede, WP_LOG_ichoh;
	public static Block WP_PLANK_sakura, WP_PLANK_kaede, WP_PLANK_ichoh;

	public static Block SAKURA_carpet, KAEDE_carpet, ICHOH_carpet, OCHIBA_carpet;

	public static void init() {

		FALL_LEAF = new BlockFallLeaf().setRegistryName("block_fall_leaf").setUnlocalizedName("block_fall_leaf").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		SAKURA_log = new BlockSakura_log().setRegistryName("block_tree_sakura_log").setUnlocalizedName("block_tree_sakura_log").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAEDE_log = new BlockKaede_log().setRegistryName("block_tree_kaede_log").setUnlocalizedName("block_tree_kaede_log").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		ICHOH_log = new BlockIchoh_log().setRegistryName("block_tree_ichoh_log").setUnlocalizedName("block_tree_ichoh_log").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		SAKURA_planks = new BlockCMPlanks().setRegistryName("block_planks_sakura").setUnlocalizedName("block_planks_sakura").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAEDE_planks = new BlockCMPlanks().setRegistryName("block_planks_kaede").setUnlocalizedName("block_planks_kaede").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		ICHOH_planks = new BlockCMPlanks().setRegistryName("block_planks_ichoh").setUnlocalizedName("block_planks_ichoh").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		SAKURA_stairs = new BlockSakuraStairs("block_stairs_sakura", SAKURA_planks.getDefaultState()).setRegistryName("block_stairs_sakura").setUnlocalizedName("block_stairs_sakura").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAEDE_stairs = new BlockKaedeStairs("block_stairs_kaede", KAEDE_planks.getDefaultState()).setRegistryName("block_stairs_kaede").setUnlocalizedName("block_stairs_kaede").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		ICHOH_stairs = new BlockIchohStairs("block_stairs_ichoh", ICHOH_planks.getDefaultState()).setRegistryName("block_stairs_ichoh").setUnlocalizedName("block_stairs_ichoh").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		SAKURA_SlabHalf = new BlockSakura_SlabHalf("block_slabhalf_sakura");
		SAKURA_SlabDouble = new BlockSakura_SlabDouble("block_slabdouble_sakura");
		KAEDE_SlabHalf = new BlockKaede_SlabHalf("block_slabhalf_kaede");
		KAEDE_SlabDouble = new BlockKaede_SlabDouble("block_slabdouble_kaede");
		ICHOH_SlabHalf = new BlockIchoh_SlabHalf("block_slabhalf_ichoh");
		ICHOH_SlabDouble = new BlockIchoh_SlabDouble("block_slabdouble_ichoh");

		SAKURA_PIL = new BlockPillar_plank_c().setRegistryName("block_pillar_sakura").setUnlocalizedName("block_pillar_sakura").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAEDE_PIL = new BlockPillar_plank_c().setRegistryName("block_pillar_kaede").setUnlocalizedName("block_pillar_kaede").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		ICHOH_PIL = new BlockPillar_plank_c().setRegistryName("block_pillar_ichoh").setUnlocalizedName("block_pillar_ichoh").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		WP_LOG_sakura = new BlockWP_log(Material.WOOD).setRegistryName("block_wp_log_sakura").setUnlocalizedName("block_wp_log_sakura").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		WP_LOG_kaede = new BlockWP_log(Material.WOOD).setRegistryName("block_wp_log_kaede").setUnlocalizedName("block_wp_log_kaede").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		WP_LOG_ichoh = new BlockWP_log(Material.WOOD).setRegistryName("block_wp_log_ichoh").setUnlocalizedName("block_wp_log_ichoh").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		WP_PLANK_sakura = new BlockWP_plank(Material.WOOD).setRegistryName("block_wp_plank_sakura").setUnlocalizedName("block_wp_plank_sakura").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		WP_PLANK_kaede = new BlockWP_plank(Material.WOOD).setRegistryName("block_wp_plank_kaede").setUnlocalizedName("block_wp_plank_kaede").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		WP_PLANK_ichoh = new BlockWP_plank(Material.WOOD).setRegistryName("block_wp_plank_ichoh").setUnlocalizedName("block_wp_plank_ichoh").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		SAKURA_flow = new BlockSakura_flow().setRegistryName("block_tree_sakura_flow").setUnlocalizedName("block_tree_sakura_flow").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAEDE_leaf = new BlockKaede_leaf().setRegistryName("block_tree_kaede_leaf").setUnlocalizedName("block_tree_kaede_leaf").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		ICHOH_leaf = new BlockIchoh_leaf().setRegistryName("block_tree_ichoh_leaf").setUnlocalizedName("block_tree_ichoh_leaf").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		OAKKARE_leaf = new BlockOakKare_leaf().setRegistryName("block_tree_oakkare_leaf").setUnlocalizedName("block_tree_oakkare_leaf").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		SAKURA_carpet = new BlockFallCarpet().setRegistryName("block_carpet_sakura").setUnlocalizedName("block_carpet_sakura").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAEDE_carpet = new BlockFallCarpet().setRegistryName("block_carpet_kaede").setUnlocalizedName("block_carpet_kaede").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		ICHOH_carpet = new BlockFallCarpet().setRegistryName("block_carpet_ichoh").setUnlocalizedName("block_carpet_ichoh").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		OCHIBA_carpet = new BlockFallCarpet().setRegistryName("block_carpet_ochiba").setUnlocalizedName("block_carpet_ochiba").setCreativeTab(ChinjufuModTabs.tab_seasonal);

		CHERRY_me = new BlockSakura_me("block_tree_sakura_me");
		SAKURA_nae = new BlockSakura_nae().setRegistryName("block_tree_sakura_nae").setUnlocalizedName("block_tree_sakura_nae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		KAEDE_nae = new BlockKaede_nae().setRegistryName("block_tree_kaede_nae").setUnlocalizedName("block_tree_kaede_nae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		ICHOH_nae = new BlockIchoh_nae().setRegistryName("block_tree_ichoh_nae").setUnlocalizedName("block_tree_ichoh_nae").setCreativeTab(ChinjufuModTabs.tab_seasonal);
		OAKKARE_nae = new BlockOakKare_nae().setRegistryName("block_tree_oakkare_nae").setUnlocalizedName("block_tree_oakkare_nae").setCreativeTab(ChinjufuModTabs.tab_seasonal);

	}


	public static void register() {

		registerBlock(FALL_LEAF);

		registerBlock(SAKURA_log);
		registerBlock(KAEDE_log);
		registerBlock(ICHOH_log);

		registerBlock(SAKURA_planks);
		registerBlock(KAEDE_planks);
		registerBlock(ICHOH_planks);

		registerBlock(SAKURA_stairs);
		registerBlock(KAEDE_stairs);
		registerBlock(ICHOH_stairs);

		registerBlock(SAKURA_SlabHalf, new ItemSlab(SAKURA_SlabHalf, SAKURA_SlabHalf, SAKURA_SlabDouble));
		registerBlock(SAKURA_SlabDouble);
		registerBlock(KAEDE_SlabHalf, new ItemSlab(KAEDE_SlabHalf, KAEDE_SlabHalf, KAEDE_SlabDouble));
		registerBlock(KAEDE_SlabDouble);
		registerBlock(ICHOH_SlabHalf, new ItemSlab(ICHOH_SlabHalf, ICHOH_SlabHalf, ICHOH_SlabDouble));
		registerBlock(ICHOH_SlabDouble);

		registerBlock(SAKURA_PIL);
		registerBlock(KAEDE_PIL);
		registerBlock(ICHOH_PIL);

		registerBlock(WP_LOG_sakura);
		registerBlock(WP_LOG_kaede);
		registerBlock(WP_LOG_ichoh);

		registerBlock(WP_PLANK_sakura);
		registerBlock(WP_PLANK_kaede);
		registerBlock(WP_PLANK_ichoh);

		registerBlock(SAKURA_flow);
		registerBlock(KAEDE_leaf);
		registerBlock(ICHOH_leaf);
		registerBlock(OAKKARE_leaf);

		registerBlock(SAKURA_carpet);
		registerBlock(KAEDE_carpet);
		registerBlock(ICHOH_carpet);
		registerBlock(OCHIBA_carpet);

		registerBlock(CHERRY_me);
		registerBlock(SAKURA_nae);
		registerBlock(KAEDE_nae);
		registerBlock(ICHOH_nae);
		registerBlock(OAKKARE_nae);

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

		registerRender(FALL_LEAF);

		registerRender(SAKURA_log);
		registerRender(KAEDE_log);
		registerRender(ICHOH_log);

		registerRender(SAKURA_planks);
		registerRender(KAEDE_planks);
		registerRender(ICHOH_planks);

		registerRender(SAKURA_stairs);
		registerRender(KAEDE_stairs);
		registerRender(ICHOH_stairs);

		registerRender(SAKURA_SlabHalf);
		registerRender(KAEDE_SlabHalf);
		registerRender(ICHOH_SlabHalf);

		registerRender(SAKURA_PIL);
		registerRender(KAEDE_PIL);
		registerRender(ICHOH_PIL);

		registerRender(WP_LOG_sakura);
		registerRender(WP_LOG_kaede);
		registerRender(WP_LOG_ichoh);

		registerRender(WP_PLANK_sakura);
		registerRender(WP_PLANK_kaede);
		registerRender(WP_PLANK_ichoh);

		registerRender(SAKURA_flow);
		registerRender(KAEDE_leaf);
		registerRender(ICHOH_leaf);
		registerRender(OAKKARE_leaf);

		registerRender(SAKURA_carpet);
		registerRender(KAEDE_carpet);
		registerRender(ICHOH_carpet);
		registerRender(OCHIBA_carpet);

		registerRender(SAKURA_nae);
		registerRender(KAEDE_nae);
		registerRender(ICHOH_nae);
		registerRender(OAKKARE_nae);


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

			ASDecoModWoods.init();
			ASDecoModWoods.register();
			BLOCKS.stream().forEach(block -> event.getRegistry().register(block));
		}
	}

}
