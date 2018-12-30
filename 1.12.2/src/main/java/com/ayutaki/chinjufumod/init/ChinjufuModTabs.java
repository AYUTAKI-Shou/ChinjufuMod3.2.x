package com.ayutaki.chinjufumod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ChinjufuModTabs {

	/*金剛*/
	public static final CreativeTabs tab_chinjufumod = new CreativeTabs("tab_chinjufumod") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ChinjufuModItems.EMBLEM_C);
		}
	};

	/*金剛*/
	public static final CreativeTabs tab_teatime = new CreativeTabs("tab_teatime") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(ChinjufuModFoodBlocks.TEACUP_1));
		}
	};

	/*金剛*/
	public static final CreativeTabs tab_seasonal = new CreativeTabs("tab_seasonal") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ChinjufuModArmor.HAMAKAZEYKT_CHESTPLATE);
		}
	};

	/*金剛*/
	public static final CreativeTabs tab_cmarmor = new CreativeTabs("tab_cmarmor") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ChinjufuModArmor.FUBUKI_CHESTPLATE);
		}
	};

	/*扶桑*/
	public static final CreativeTabs tab_cmodwadeco = new CreativeTabs("tab_cmodwadeco") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(ASDecoModFusuma.FUSUMAB_CL_cyan));
		}
	};

	/*扶桑*/
	public static final CreativeTabs tab_cmodwablock = new CreativeTabs("tab_cmodwablock") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(ASDecoModKawara.KAWARA_gray));
		}
	};

	/*扶桑*/
	public static final CreativeTabs tab_wallpanel = new CreativeTabs("tab_wallpanel") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Item.getItemFromBlock(ASDecoModWallPane.WP_STONE_graB));
		}
	};



}
