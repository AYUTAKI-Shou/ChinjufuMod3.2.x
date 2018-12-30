package com.ayutaki.chinjufumod.handlers;

import java.util.ArrayList;
import java.util.List;

import com.ayutaki.chinjufumod.config.CMConfigCore_new;
import com.ayutaki.chinjufumod.worldgen.biomegen.BiomeIchoh;
import com.ayutaki.chinjufumod.worldgen.biomegen.BiomeKaede;
import com.ayutaki.chinjufumod.worldgen.biomegen.BiomeSakura;
import com.ayutaki.chinjufumod.worldgen.biomegen.ModBiomeBase;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.event.RegistryEvent;

public class BiomeHandler {

	public static final List<ModBiomeEntry> biomeEntryList = new ArrayList<>();

	public static final BiomeSakura BIOME_SAKURA = new BiomeSakura();
	public static final BiomeKaede BIOME_KAEDE = new BiomeKaede();
	public static final BiomeIchoh BIOME_ICHOH = new BiomeIchoh();

	public static void registerBiomes(RegistryEvent.Register<Biome> event) {

		/* コンフィグで登録するか、しないかを決める*/
		if (CMConfigCore_new.sakuraBiomeRegister == true) {
			event.getRegistry().register(BIOME_SAKURA);
			BiomeManager.addBiome(BiomeManager.BiomeType.WARM,
					new BiomeManager.BiomeEntry(BIOME_SAKURA, CMConfigCore_new.sakuraBiomeChance));
			BiomeManager.addSpawnBiome(BIOME_SAKURA);

		}
		if (CMConfigCore_new.sakuraBiomeRegister != true) { }

		if (CMConfigCore_new.kaedeBiomeRegister == true) {
			event.getRegistry().register(BIOME_KAEDE);
			BiomeManager.addBiome(BiomeManager.BiomeType.COOL,
					new BiomeManager.BiomeEntry(BIOME_KAEDE, CMConfigCore_new.kaedeBiomeChance));
			BiomeManager.addSpawnBiome(BIOME_KAEDE);

		}
		if (CMConfigCore_new.kaedeBiomeRegister != true) { }

		if (CMConfigCore_new.ichohBiomeRegister == true) {
			event.getRegistry().register(BIOME_ICHOH);
			BiomeManager.addBiome(BiomeManager.BiomeType.COOL,
					new BiomeManager.BiomeEntry(BIOME_ICHOH, CMConfigCore_new.ichohBiomeChance));
			BiomeManager.addSpawnBiome(BIOME_ICHOH);

		}
		if (CMConfigCore_new.ichohBiomeRegister != true) { }

	}

	@SuppressWarnings("unused")
	private static void registerBiome(RegistryEvent.Register<Biome> event,
			ModBiomeBase biome, BiomeType type, int weight, BiomeDictionary.Type... biomeDictTypes) {
		event.getRegistry().register(biome);

		// add all biomeDictTypes for said biome
		for (BiomeDictionary.Type biomeDictType : biomeDictTypes) {
			BiomeDictionary.addTypes(biome, biomeDictType);
		}

		// add biome to the biomeEntry list if weight is not 0
		biomeEntryList.add(new ModBiomeEntry(biome, type, weight));
	}

	public static class ModBiomeEntry {

		private final int weight;
		private final Biome biome;
		private final BiomeType type;
		private final BiomeManager.BiomeEntry entry;

		private ModBiomeEntry(ModBiomeBase biome, BiomeType type, int weight) {
			this.type = type;
			this.biome = biome;
			this.weight = weight;
			this.entry = new BiomeManager.BiomeEntry(biome, weight);
		}

		public ModBiomeBase getBiome() {
			return (ModBiomeBase) this.biome;
		}

		public BiomeManager.BiomeEntry getEntry() {
			return this.entry;
		}

		public BiomeType getType() {
			return this.type;
		}

		public int getWeight() {
			return this.weight;
		}
	}

}
