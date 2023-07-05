package io.github.theaxolotlmod.world.gen;

public class ModOreGeneration{
    public static void generateOres() {
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
			GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.BLOCK_ORE_PLACED_KEY);
	}
}
