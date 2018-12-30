package com.ayutaki.chinjufumod.proxy;

import com.ayutaki.chinjufumod.entity.EntityAmmunition_KC;
import com.ayutaki.chinjufumod.entity.EntityAmmunition_Medium;
import com.ayutaki.chinjufumod.entity.EntityAmmunition_Small;
import com.ayutaki.chinjufumod.entity.EntityFallIchoh;
import com.ayutaki.chinjufumod.entity.EntityFallKaede;
import com.ayutaki.chinjufumod.entity.EntityFallOakKare;
import com.ayutaki.chinjufumod.entity.EntityFallSakura;
import com.ayutaki.chinjufumod.entity.render.RenderAmmunition_KC;
import com.ayutaki.chinjufumod.entity.render.RenderAmmunition_Medium;
import com.ayutaki.chinjufumod.entity.render.RenderAmmunition_Small;
import com.ayutaki.chinjufumod.entity.render.RenderFallIchoh;
import com.ayutaki.chinjufumod.entity.render.RenderFallKaede;
import com.ayutaki.chinjufumod.entity.render.RenderFallOakKare;
import com.ayutaki.chinjufumod.entity.render.RenderFallSakura;
import com.ayutaki.chinjufumod.init.ASDecoModFusuma;
import com.ayutaki.chinjufumod.init.ASDecoModGarden;
import com.ayutaki.chinjufumod.init.ASDecoModHakkou;
import com.ayutaki.chinjufumod.init.ASDecoModKamoi;
import com.ayutaki.chinjufumod.init.ASDecoModKawara;
import com.ayutaki.chinjufumod.init.ASDecoModKitchen;
import com.ayutaki.chinjufumod.init.ASDecoModNamako;
import com.ayutaki.chinjufumod.init.ASDecoModNoren;
import com.ayutaki.chinjufumod.init.ASDecoModPantry;
import com.ayutaki.chinjufumod.init.ASDecoModPlaster;
import com.ayutaki.chinjufumod.init.ASDecoModRanma;
import com.ayutaki.chinjufumod.init.ASDecoModTatami;
import com.ayutaki.chinjufumod.init.ASDecoModWallPane;
import com.ayutaki.chinjufumod.init.ASDecoModWallPane2;
import com.ayutaki.chinjufumod.init.ASDecoModWoods;
import com.ayutaki.chinjufumod.init.ChinjufuModArmor;
import com.ayutaki.chinjufumod.init.ChinjufuModBlocks;
import com.ayutaki.chinjufumod.init.ChinjufuModFoodBlocks;
import com.ayutaki.chinjufumod.init.ChinjufuModFurnitures;
import com.ayutaki.chinjufumod.init.ChinjufuModHarbor;
import com.ayutaki.chinjufumod.init.ChinjufuModItemFoods;
import com.ayutaki.chinjufumod.init.ChinjufuModItems;
import com.ayutaki.chinjufumod.init.ChinjufuModMamiya;
import com.ayutaki.chinjufumod.init.ChinjufuModSchool;
import com.ayutaki.chinjufumod.init.ChinjufuModSeasons;
import com.ayutaki.chinjufumod.init.ChinjufuModSeasons2;
import com.ayutaki.chinjufumod.init.ChinjufuModWeapons;
import com.ayutaki.chinjufumod.init.LetterTrays;
import com.ayutaki.chinjufumod.init.TTimeItems;
import com.ayutaki.chinjufumod.init.TTimePlants;
import com.ayutaki.chinjufumod.init.items.kansaiki.entity.EntityJu87;
import com.ayutaki.chinjufumod.init.items.kansaiki.entity.EntityRyusei;
import com.ayutaki.chinjufumod.init.items.kansaiki.entity.EntitySwordfish;
import com.ayutaki.chinjufumod.init.items.kansaiki.entity.EntityTBF;
import com.ayutaki.chinjufumod.init.items.kansaiki.entity.EntityTenzan;
import com.ayutaki.chinjufumod.init.items.kansaiki.entity.EntityType97;
import com.ayutaki.chinjufumod.init.items.kansaiki.render.RenderJu87;
import com.ayutaki.chinjufumod.init.items.kansaiki.render.RenderRyusei;
import com.ayutaki.chinjufumod.init.items.kansaiki.render.RenderSwordfish;
import com.ayutaki.chinjufumod.init.items.kansaiki.render.RenderTBF;
import com.ayutaki.chinjufumod.init.items.kansaiki.render.RenderTenzan;
import com.ayutaki.chinjufumod.init.items.kansaiki.render.RenderType97;
import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

/* クライアントプロキシはコモンプロキシを拡張するクラス
* Client proxy is a class that extends common proxy. */
public class ClientProxy  extends CommonProxy {

	public static boolean rendering = false;
	public static Entity renderEntity = null;
	public static Entity backupEntity = null;

	/* エンティティの登録、コンフィグ読込など
	* Register Entity and Config. */
	@Override
	public void preInit() { }

	/* レシピ・鉱石などの追加 Register Recipe and Ore. */
	@Override
	public void init() { }

	/* 他Modとの連携 Cooperation with other Mod. */
	@Override
	public void postInit() { }

	/* シングルプレイかどうか Single play or not? */
	@Override
	public boolean isSinglePlayer() {
		return Minecraft.getMinecraft().isSingleplayer();
	}

	/* サーバープレイかどうか Sever play or not? */
	@Override
	public boolean isDedicatedServer() {
		return false;
	}

	@Override
	public ModelBiped getArmorModel(int id) {
		return null;
	}

	/* エンティティのレンダリング */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void registerEntityRender() {

		RenderingRegistry.registerEntityRenderingHandler(EntityAmmunition_KC.class, new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				 return new RenderAmmunition_KC(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityAmmunition_Medium.class, new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				 return new RenderAmmunition_Medium(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityAmmunition_Small.class, new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				 return new RenderAmmunition_Small(manager);
			}
		});

		/* 艦載機 */
		RenderingRegistry.registerEntityRenderingHandler(EntityType97.class, new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				 return new RenderType97(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityTenzan.class, new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				 return new RenderTenzan(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityRyusei.class, new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				 return new RenderRyusei(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityJu87.class, new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				 return new RenderJu87(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityTBF.class, new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				 return new RenderTBF(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntitySwordfish.class, new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				 return new RenderSwordfish(manager);
			}
		});

		/* 落葉 */
		RenderingRegistry.registerEntityRenderingHandler(EntityFallSakura.class, new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				 return new RenderFallSakura(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFallKaede.class, new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				 return new RenderFallKaede(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFallIchoh.class, new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				 return new RenderFallIchoh(manager);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFallOakKare.class, new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				 return new RenderFallOakKare(manager);
			}
		});
	}

    /* ------------------------------------------------------------------------
     * ここから From here. ↓ */

	/* ドロップ時やインベントリにおける、アイテムやアイテムブロックの描画を登録する【内部クラス】
	 * Register rendering of Items and ItemBlocks in drop and inventory. 【Inner Classs】 */
	@Mod.EventBusSubscriber(modid = Reference.MOD_ID, value = Side.CLIENT)
	public static class RegistrationHandler {

		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event) {
			ChinjufuModBlocks.registerRenders();
			ChinjufuModItems.registerRenders();
			ChinjufuModWeapons.registerRenders();
			ChinjufuModArmor.registerRenders();

			ChinjufuModFurnitures.registerRenders();
			ChinjufuModMamiya.registerRenders();
			ChinjufuModSchool.registerRenders();
			ChinjufuModSeasons.registerRenders();
			ChinjufuModHarbor.registerRenders();
			LetterTrays.registerRenders();
			ASDecoModWallPane.registerRenders();
			ASDecoModWallPane2.registerRenders();

			ASDecoModFusuma.registerRenders();
			ASDecoModKawara.registerRenders();
			ASDecoModNamako.registerRenders();
			ASDecoModPlaster.registerRenders();
			ASDecoModTatami.registerRenders();
			ASDecoModRanma.registerRenders();
			ASDecoModKamoi.registerRenders();
			ASDecoModNoren.registerRenders();

			ChinjufuModItemFoods.registerRenders();
			ChinjufuModFoodBlocks.registerRenders();
			ASDecoModPantry.registerRenders();
			ASDecoModKitchen.registerRenders();
			ASDecoModHakkou.registerRenders();
			ASDecoModWoods.registerRenders();

			/*作物を先読み、種を後読みにしないとクラッシュ*/
			TTimePlants.registerRenders();
			TTimeItems.registerRenders();

			ASDecoModGarden.registerRenders();
			ChinjufuModSeasons2.registerRenders();

		}
	}
    /*ここまで So far↑
     * ------------------------------------------------------------------------ */

}
