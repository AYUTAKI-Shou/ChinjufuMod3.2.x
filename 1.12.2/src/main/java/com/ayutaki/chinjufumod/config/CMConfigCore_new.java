package com.ayutaki.chinjufumod.config;

import java.io.File;

import com.ayutaki.chinjufumod.main.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CMConfigCore_new {

	public static Configuration config;

	public static final String GENERAL = "general";

	public static boolean isGeneratorEnabled = false;
	public static int isGeneratorChance = 25;

	public static boolean sakuraBiomeRegister = false;
	public static int sakuraBiomeChance = 10;

	public static boolean kaedeBiomeRegister = false;
	public static int kaedeBiomeChance = 10;

	public static boolean ichohBiomeRegister = false;
	public static int ichohBiomeChance = 10;

	public static boolean blastBlockBreak = false;

	public static void init(File file) {
		if (config == null) {
			config = new Configuration(file);
			loadConfig(false);
		}
	}

	public static void loadConfig(boolean shouldChange) {

		/* General*/
		isGeneratorEnabled = config.getBoolean("enabledGenerator", GENERAL,
				isGeneratorEnabled, "BauxiteOre will be generated when this setting is true.", "config.bauxiteore.enabledGenerator");

		/** config.getInt(name, category, defaultValue, minValue, maxValue, comment, langKey) **/
		isGeneratorChance = config.getInt("generatorChance", GENERAL,
				25, 1, 100, "RedStone Ore=25, Gold Ore=8", "config.bauxiteore.chance");

		/* 桜 */
		sakuraBiomeRegister = config.getBoolean("sakuraBiomeRegister", GENERAL,
				sakuraBiomeRegister, "Register CherryBiome when this setting is true.", "config.cherrybiome.register");

		sakuraBiomeChance = config.getInt("sakuraChanceBiome", GENERAL,
				10, 1, 100, "Common=100, Rare=1", "config.cherrybiome.chance");

		/* 楓 */
		kaedeBiomeRegister = config.getBoolean("kaedeBiomeRegister", GENERAL,
				kaedeBiomeRegister, "Register CherryBiome when this setting is true.", "config.acerbiome.register");

		kaedeBiomeChance = config.getInt("kaedeChanceBiome", GENERAL,
				10, 1, 100, "Common=100, Rare=1", "config.acerbiome.chance");

		/* 銀杏 */
		ichohBiomeRegister = config.getBoolean("ichohBiomeRegister", GENERAL,
				ichohBiomeRegister, "Register GinkgoBiome when this setting is true.", "config.ginkgobiome.register");

		ichohBiomeChance = config.getInt("ichohChanceBiome", GENERAL,
				10, 1, 100, "Common=100, Rare=1", "config.ginkgobiome.chance");

		/* 爆風によるブロック破壊 */
		blastBlockBreak = config.getBoolean("blastBlockBreak", GENERAL,
				blastBlockBreak, "Break blocks with ammunition blast is true.", "config.blastblockbreak.enabled");

		/* 設定内容をコンフィグファイルに保存する*/
		if (config.hasChanged() && shouldChange) { }
		config.save();

	}

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if (eventArgs.getModID().equals(Reference.MOD_ID)) {
			loadConfig(true);
		}
	}

}
