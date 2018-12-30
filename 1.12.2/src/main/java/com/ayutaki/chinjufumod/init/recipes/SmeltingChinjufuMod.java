package com.ayutaki.chinjufumod.init.recipes;

import com.ayutaki.chinjufumod.init.ASDecoModHakkou;
import com.ayutaki.chinjufumod.init.ASDecoModKawara;
import com.ayutaki.chinjufumod.init.ASDecoModWallPane;
import com.ayutaki.chinjufumod.init.ASDecoModWoods;
import com.ayutaki.chinjufumod.init.ChinjufuModFoodBlocks;
import com.ayutaki.chinjufumod.init.ChinjufuModItemFoods;
import com.ayutaki.chinjufumod.init.ChinjufuModItems;
import com.ayutaki.chinjufumod.init.ChinjufuModSeasons2;
import com.ayutaki.chinjufumod.init.TTimeItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingChinjufuMod {

	public SmeltingChinjufuMod() {
		register();
	}

	public static void register() {

		/*ひび入り安山岩レンガ*/
		GameRegistry.addSmelting(ASDecoModWallPane.BRICK_AND, new ItemStack(ASDecoModWallPane.BRICK_AND_CR, 1), 0.5F);

		/*ひび入り閃緑岩レンガ*/
		GameRegistry.addSmelting(ASDecoModWallPane.BRICK_DIO, new ItemStack(ASDecoModWallPane.BRICK_DIO_CR, 1), 0.5F);

		/*ひび入り花崗岩レンガ*/
		GameRegistry.addSmelting(ASDecoModWallPane.BRICK_GRA, new ItemStack(ASDecoModWallPane.BRICK_GRA_CR, 1), 0.5F);

		/*瓦(黒)*/
		GameRegistry.addSmelting(ChinjufuModItems.CLAYKAWARA, new ItemStack(ASDecoModKawara.KAWARA_black, 1), 0.5F);

		/*アルミニウム精錬 素材→精錬結果*/
		GameRegistry.addSmelting(ChinjufuModItems.BAUXITE, new ItemStack(ChinjufuModItems.ALUMINUM, 1), 1.0F);

		/*マッチ*/
		GameRegistry.addSmelting(TTimeItems.Item_MATCH, new ItemStack(Items.DYE, 1, 15), 1.0F);

		/*生酒の火入れ*/
		GameRegistry.addSmelting(ASDecoModHakkou.NAMASAKEBOT_full, new ItemStack(ASDecoModHakkou.SHINSAKEBOT_1, 1), 0.5F);

		/*湯呑み*/
		GameRegistry.addSmelting(TTimeItems.CLAY_YUNOMI, new ItemStack(TTimeItems.Item_YUNOMI, 1), 0.5F);

		/*急須*/
		GameRegistry.addSmelting(TTimeItems.CLAY_KYUSU, new ItemStack(ChinjufuModFoodBlocks.KYUSU_kara, 1), 0.5F);

		/*ティーカップ*/
		GameRegistry.addSmelting(TTimeItems.CLAY_TCUP, new ItemStack(TTimeItems.Item_TCUP, 1), 0.5F);

		/*ティーポット*/
		GameRegistry.addSmelting(TTimeItems.CLAY_TPOT, new ItemStack(ChinjufuModFoodBlocks.TEAPOT_kara, 1), 0.5F);

		/*皿*/
		GameRegistry.addSmelting(TTimeItems.CLAY_SARA, new ItemStack(TTimeItems.Item_SARA, 1), 0.5F);

		/*茶碗*/
		GameRegistry.addSmelting(TTimeItems.CLAY_CHAWAN, new ItemStack(TTimeItems.Item_CHAWAN, 1), 0.5F);

		/*鍋*/
		GameRegistry.addSmelting(TTimeItems.CLAY_NABE, new ItemStack(ChinjufuModFoodBlocks.NABE_kara, 1), 0.5F);

		/*呑水*/
		GameRegistry.addSmelting(TTimeItems.CLAY_TONSUI, new ItemStack(TTimeItems.Item_TONSUI, 1), 0.5F);

		/*テーブルロール*/
		GameRegistry.addSmelting(TTimeItems.KIJI_BUN, new ItemStack(ChinjufuModItemFoods.BUN, 1), 0.5F);

		/*スコーン*/
		GameRegistry.addSmelting(TTimeItems.KIJI_SCONE, new ItemStack(ChinjufuModItemFoods.SCONE, 1), 0.5F);

		/*せんべい*/
		GameRegistry.addSmelting(TTimeItems.KIJI_SENBEI, new ItemStack(ChinjufuModItemFoods.SENBEI, 1), 0.5F);

		/*焼きとうもろこし*/
		GameRegistry.addSmelting(ChinjufuModItemFoods.FOOD_CORN, new ItemStack(ChinjufuModItemFoods.FOOD_CORN_B, 1), 0.5F);

		/* 新原木から木炭 */
		GameRegistry.addSmelting(ASDecoModWoods.SAKURA_log, new ItemStack(Items.COAL, 1, 1), 0.5F);
		GameRegistry.addSmelting(ASDecoModWoods.KAEDE_log, new ItemStack(Items.COAL, 1, 1), 0.5F);
		GameRegistry.addSmelting(ASDecoModWoods.ICHOH_log, new ItemStack(Items.COAL, 1, 1), 0.5F);

		/* 藁灰 */
		GameRegistry.addSmelting(ChinjufuModSeasons2.WARATABA, new ItemStack(ChinjufuModItems.WARAHAI), 0.1F);
		GameRegistry.addSmelting(Blocks.HAY_BLOCK, new ItemStack(ChinjufuModItems.WARAHAI), 0.1F);

		/* ピザ */
		GameRegistry.addSmelting(TTimeItems.PIZZA_nama, new ItemStack(ChinjufuModFoodBlocks.PIZZA_1), 0.1F);
	}
}
