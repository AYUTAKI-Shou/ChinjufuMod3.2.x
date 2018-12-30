package com.ayutaki.chinjufumod.worldgen.biomegen;

import java.util.Random;

import com.ayutaki.chinjufumod.init.woods.treegen.WorldGenTreeSakura;

import net.minecraft.block.BlockFlower;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenTrees;

public class BiomeSakura extends ModBiomeBase {

	public BiomeSakura() {
		super(new BiomeProperties("Sakura")
				.setBaseHeight(0.125F).setHeightVariation(0.3F).setTemperature(0.8F).setRainfall(0.3F));
		this.setRegistryName("biome_sakura");
		this.decorator.treesPerChunk = 10;
		this.decorator.grassPerChunk = 2;
		this.decorator.generateFalls = false;

		this.topBlock = Blocks.GRASS.getDefaultState();
		this.fillerBlock = Blocks.DIRT.getDefaultState();

		this.setSpawnables();

	}

	/* 生やす木の設定 オークに桜をまぜる */
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
		return (WorldGenAbstractTree)(rand.nextInt(20) == 0 ? new WorldGenTreeSakura(false) : new WorldGenTrees(false));
	}

	/* 草花の設定 */
	public BlockFlower.EnumFlowerType pickRandomFlower(Random rand, BlockPos pos) {
			return super.pickRandomFlower(rand, pos);
	}

	/* ソンビなどのスポーン */
	private void setSpawnables() {
		spawnableCreatureList.clear();
		spawnableMonsterList.clear();
		spawnableWaterCreatureList.clear();
		spawnableCaveCreatureList.clear();

		/** 春のイメージの動物を集める **/
		spawnableCreatureList.add(new Biome.SpawnListEntry(EntityChicken.class, 10, 4, 4));
		spawnableCreatureList.add(new Biome.SpawnListEntry(EntitySheep.class, 12, 4, 4));
		spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));

		/** 櫻の樹の下には、に合わせてアンデッドを集める **/
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySpider.class, 100, 4, 4));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityZombie.class, 95, 4, 4));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityZombieVillager.class, 5, 1, 1));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySkeleton.class, 100, 4, 4));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityCreeper.class, 100, 4, 4));

		spawnableWaterCreatureList.add(new Biome.SpawnListEntry(EntitySquid.class, 10, 4, 4));
		spawnableCaveCreatureList.add(new Biome.SpawnListEntry(EntityBat.class, 10, 8, 8));
	}

	public Class <? extends Biome > getBiomeClass() {
		return BiomeSakura.class;
	}

}