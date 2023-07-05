package io.github.theaxolotlmod.world.gen;

import io.github.theaxolotlmod.world.ModPlacedFeatures;
import net.minecraft.world.gen.GenerationStep;
import org.quiltmc.qsl.worldgen.biome.api.BiomeModifications;
import org.quiltmc.qsl.worldgen.biome.api.BiomeSelectors;

public class ModOreGeneration{
    public static void generateOres() {
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
			GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.BLOCK_ORE_PLACED_KEY);
	}
}
