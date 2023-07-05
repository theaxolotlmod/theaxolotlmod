package io.github.theaxolotlmod.world.gen;

public class ModWorldGeneration {
	public static void generateModWorldGen() {
		ModOreGeneration.generateOres();
		
		ModTreeGeneration.generateTrees();
	}
}
