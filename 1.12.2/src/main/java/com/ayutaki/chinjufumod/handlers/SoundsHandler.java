package com.ayutaki.chinjufumod.handlers;

import com.ayutaki.chinjufumod.main.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {

	public static SoundEvent AM_CARTRIDGE, AM_FIRE, AM_IMPACT;
	public static SoundEvent KK_ATACK, KK_BREAK, KK_IMPACT, KK_PROPELLER, KK_STOP;
	public static SoundEvent WATER_WAKE, WATER_SPLASH;
	public static SoundEvent JUU, GUTSUGUTSU, TEA, SAKE, PAKU, GOKU,
											WATER_START, WATER_STOP, KITCHEN_CUT;
	public static SoundEvent TANSU_OPEN, TANSU_CLOSE, WINDOW_OPEN, WINDOW_CLOSE,
											FUSUMA, FUSUMA_SHORT, HIKIDO, KINUZURE, SIT_CHAIR;

	public static void registerSounds() {
		AM_CARTRIDGE = registerSound("am_cartridge");
		AM_FIRE = registerSound("am_fire");
		AM_IMPACT = registerSound("am_impact");

		KK_ATACK = registerSound("kk_atack");
		KK_BREAK = registerSound("kk_break");
		KK_IMPACT = registerSound("kk_impact");
		KK_PROPELLER = registerSound("kk_propeller");
		KK_STOP = registerSound("kk_stop");

		WATER_WAKE = registerSound("wake_water");
		WATER_SPLASH = registerSound("water_splash");

		JUU = registerSound("juu");
		GUTSUGUTSU = registerSound("gutsugutsu");
		TEA = registerSound("tea");
		SAKE = registerSound("sake");
		PAKU = registerSound("paku");
		GOKU = registerSound("goku");
		WATER_START = registerSound("water_start");
		WATER_STOP = registerSound("water_stop");
		KITCHEN_CUT = registerSound("kitchen_cut");

		TANSU_OPEN = registerSound("tansu_open");
		TANSU_CLOSE = registerSound("tansu_close");

		WINDOW_OPEN = registerSound("window_open");
		WINDOW_CLOSE = registerSound("window_close");
		FUSUMA = registerSound("fusuma");
		FUSUMA_SHORT = registerSound("fusuma_short");
		HIKIDO = registerSound("hikido");
		KINUZURE = registerSound("kinuzure");
		SIT_CHAIR = registerSound("sit_chair");

	}

	private static SoundEvent registerSound(String name) {

		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}

}
