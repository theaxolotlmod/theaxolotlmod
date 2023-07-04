package io.github.theaxolotlmod.world.gen;

import io.github.theaxolotlmod.world.ModPlacedFeatures;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStep;
import org.quiltmc.qsl.worldgen.biome.api.BiomeModifications;
import org.quiltmc.qsl.worldgen.biome.api.BiomeSelectors;

public class ModTreeGeneration {
	public static void generateTrees() {
		BiomeModifications.addFeature(BiomeSelectors.includeByKey(Biomes.PLAINS, Biomes.FOREST),
			GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GENERIC_WOOD_KEY);
	}
}
