package com.ayutaki.chinjufumod.worldgen.biomegen;

import java.util.Random;

import com.ayutaki.chinjufumod.init.ASDecoModWoods;
import com.ayutaki.chinjufumod.init.woods.treegen.WorldGenTreeKaede;
import com.ayutaki.chinjufumod.init.woods.treegen.WorldGenTreeOakKare;

import net.minecraft.block.BlockFlower;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class BiomeKaede extends ModBiomeBase {

	public BiomeKaede() {
		super(new BiomeProperties("Kaede")
				.setBaseHeight(0.125F).setHeightVariation(0.3F).setTemperature(0.5F).setRainfall(0.3F));
		this.setRegistryName("biome_kaede");
		this.decorator.treesPerChunk = 15;
		this.decorator.grassPerChunk = 1;
		this.decorator.generateFalls = false;

		this.setSpawnables();

	}

	/* 土壌の変更 */
	public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
		this.topBlock = ASDecoModWoods.FALL_LEAF.getDefaultState();
		this.fillerBlock = Blocks.DIRT.getDefaultState();
		this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
	}

	/* 生やす木の設定 楓と枯れ木をまぜる */
    @Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
		return (WorldGenAbstractTree)(rand.nextInt(5) == 0 ? new WorldGenTreeKaede(false) : new WorldGenTreeOakKare(false));
    }

	/* 草花の設定 */
    @Override
	public BlockFlower.EnumFlowerType pickRandomFlower(Random rand, BlockPos pos) {
		return super.pickRandomFlower(rand, pos);
	}

	/* ソンビなどのスポーン */
	private void setSpawnables() {
		spawnableCreatureList.clear();
		spawnableMonsterList.clear();
		spawnableWaterCreatureList.clear();
		spawnableCaveCreatureList.clear();

		/** 桜と銀杏から外れた動物を集める **/
		spawnableCreatureList.add(new Biome.SpawnListEntry(EntityPig.class, 10, 4, 4));
		spawnableCreatureList.add(new Biome.SpawnListEntry(EntityChicken.class, 10, 4, 4));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityOcelot.class, 2, 1, 1));

		/** ネコが出るため、クリーパーは少なめ 100→50 **/
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySpider.class, 100, 4, 4));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityZombie.class, 95, 4, 4));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityZombieVillager.class, 5, 1, 1));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntitySkeleton.class, 100, 4, 4));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityCreeper.class, 50, 4, 4));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityEnderman.class, 10, 1, 4));
		spawnableMonsterList.add(new Biome.SpawnListEntry(EntityWitch.class, 5, 1, 1));

		spawnableWaterCreatureList.add(new Biome.SpawnListEntry(EntitySquid.class, 10, 4, 4));
		spawnableCaveCreatureList.add(new Biome.SpawnListEntry(EntityBat.class, 10, 8, 8));
	}

	public Class <? extends Biome > getBiomeClass() {
		return BiomeKaede.class;
	}

}