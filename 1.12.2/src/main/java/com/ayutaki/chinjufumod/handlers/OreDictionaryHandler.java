package com.ayutaki.chinjufumod.handlers;

import com.ayutaki.chinjufumod.init.ChinjufuModBlocks;
import com.ayutaki.chinjufumod.init.ChinjufuModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {

	/*鉱石辞書にある素材名と自分のMODの素材を紐付けする
	* Link the material name in the ore dictionary with the material of your MOD.*/
	public static void registerOreDictionary() {

		OreDictionary.registerOre("oreBauxite", ChinjufuModBlocks.BAUXITE_ORE);
		OreDictionary.registerOre("ingotAluminium", ChinjufuModItems.ALUMINUM);
		OreDictionary.registerOre("ingotAluminum", ChinjufuModItems.ALUMINUM);

	}

}
