package com.ayutaki.chinjufumod.main;

import org.apache.logging.log4j.Logger;

import com.ayutaki.chinjufumod.config.CMConfigCore_new;
import com.ayutaki.chinjufumod.entity.EntityAmmunition_KC;
import com.ayutaki.chinjufumod.entity.EntityAmmunition_Medium;
import com.ayutaki.chinjufumod.entity.EntityAmmunition_Small;
import com.ayutaki.chinjufumod.entity.EntityFallIchoh;
import com.ayutaki.chinjufumod.entity.EntityFallKaede;
import com.ayutaki.chinjufumod.entity.EntityFallOakKare;
import com.ayutaki.chinjufumod.entity.EntityFallSakura;
import com.ayutaki.chinjufumod.entity.EntitySittableBlock;
import com.ayutaki.chinjufumod.handlers.BiomeHandler;
import com.ayutaki.chinjufumod.handlers.FuelHandler;
import com.ayutaki.chinjufumod.handlers.OreDictionaryHandler;
import com.ayutaki.chinjufumod.handlers.RecipeHandler;
import com.ayutaki.chinjufumod.handlers.SoundsHandler;
import com.ayutaki.chinjufumod.init.items.kansaiki.entity.EntityJu87;
import com.ayutaki.chinjufumod.init.items.kansaiki.entity.EntityRyusei;
import com.ayutaki.chinjufumod.init.items.kansaiki.entity.EntitySwordfish;
import com.ayutaki.chinjufumod.init.items.kansaiki.entity.EntityTBF;
import com.ayutaki.chinjufumod.init.items.kansaiki.entity.EntityTenzan;
import com.ayutaki.chinjufumod.init.items.kansaiki.entity.EntityType97;
import com.ayutaki.chinjufumod.proxy.CommonProxy;
import com.ayutaki.chinjufumod.tileentity.TileEntityCStove;
import com.ayutaki.chinjufumod.tileentity.TileEntityIrori;
import com.ayutaki.chinjufumod.tileentity.TileEntityKitOven;
import com.ayutaki.chinjufumod.tileentity.TileEntityTansu;
import com.ayutaki.chinjufumod.worldgen.WorldGenCM;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME,
	version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY)
public class ChinjufuMod {

	/* クラス(設計書)をインスタンス(製品)にする Change Class to Instance. */
	@Instance
	public static ChinjufuMod instance;

	/* プロキシの登録 Register Proxy. */
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	/* エラーログの出力 Output Error log. */
	public static Logger logger;

	/* エンティティの登録、コンフィグ読込など
	* Register Entity and Config. */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();

		MinecraftForge.EVENT_BUS.register(new CMConfigCore_new());
		MinecraftForge.EVENT_BUS.register(FuelHandler.class);
		CMConfigCore_new.init(event.getSuggestedConfigurationFile());

		proxy.preInit();
		proxy.registerEntityRender();

		/* EntityRegistry.registerModEntity(registryName,
		 * 		entityClass, entityName, id, mod, trackingRange, updateFrequency, sendsVelocityUpdates); */
		EntityRegistry.registerModEntity(new ResourceLocation("chinjufumod:mountable_block"),
				EntitySittableBlock.class, "MountableBlock", 0, this, 80, 1, false);

		EntityRegistry.registerModEntity(new ResourceLocation("chinjufumod:ammunition_kc"),
				EntityAmmunition_KC.class, "ammunition_kc", 1, this, 64, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("chinjufumod:ammunition_medium"),
				EntityAmmunition_Medium.class, "ammunition_medium", 2, this, 64, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("chinjufumod:ammunition_small"),
				EntityAmmunition_Small.class, "ammunition_small", 3, this, 64, 1, true);

		/* 艦載機 */
		EntityRegistry.registerModEntity(new ResourceLocation("chinjufumod:item_kk_type97kk"),
				EntityType97.class, "type97kk", 4, this, 64, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("chinjufumod:item_kk_tenzan"),
				EntityTenzan.class, "tenzan", 5, this, 64, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("chinjufumod:item_kk_ryusei"),
				EntityRyusei.class, "ryusei", 6, this, 64, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("chinjufumod:item_kk_ju87"),
				EntityJu87.class, "ju87", 7, this, 64, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("chinjufumod:item_kk_tbf"),
				EntityTBF.class, "tbf", 8, this, 64, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("chinjufumod:item_kk_swordfish"),
				EntitySwordfish.class, "swordfish", 9, this, 64, 1, true);

		/* 落葉 */
		EntityRegistry.registerModEntity(new ResourceLocation("chinjufumod:fallsakura"),
				EntityFallSakura.class, "fallsakura", 10, this, 64, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("chinjufumod:fallkaede"),
				EntityFallKaede.class, "fallkaede", 11, this, 64, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("chinjufumod:fallichoh"),
				EntityFallIchoh.class, "fallichoh", 12, this, 64, 1, true);
		EntityRegistry.registerModEntity(new ResourceLocation("chinjufumod:falloakkare"),
				EntityFallOakKare.class, "falloakkare", 13, this, 64, 1, true);

		/* registerTileEntity(Class<? extends TileEntity> tileEntityClass, ResourceLocation key) */
		GameRegistry.registerTileEntity(TileEntityCStove.class, new ResourceLocation("chinjufumod:cstove"));
		GameRegistry.registerTileEntity(TileEntityKitOven.class, new ResourceLocation("chinjufumod:kitoven"));
		GameRegistry.registerTileEntity(TileEntityIrori.class, new ResourceLocation("chinjufumod:irori"));
		GameRegistry.registerTileEntity(TileEntityTansu.class, new ResourceLocation("chinjufumod:tansu"));

	}

	/* レシピ・鉱石などの追加 Register Recipe and Ore. */
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();

		GameRegistry.registerWorldGenerator(new WorldGenCM(), 0);
		OreDictionaryHandler.registerOreDictionary();

		SoundsHandler.registerSounds();

		/* レシピはHandlerを噛ませてmainへ */
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerSmeltingRecipes();

		for (BiomeHandler.ModBiomeEntry biomeEntry : BiomeHandler.biomeEntryList) {
			if (biomeEntry.getWeight() > 0) {
				BiomeManager.addBiome(biomeEntry.getType(), biomeEntry.getEntry());
				BiomeManager.addStrongholdBiome(biomeEntry.getBiome());
			}
		}
	}

	/* 他Modとの連携 Cooperation with other Mod. */
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit();

	}

	@Mod.EventBusSubscriber
	private static class RegistrationHandler {

		@SubscribeEvent
		public static void registerBiomes(RegistryEvent.Register<Biome> event) {
			BiomeHandler.registerBiomes(event);
		}
	}

}
