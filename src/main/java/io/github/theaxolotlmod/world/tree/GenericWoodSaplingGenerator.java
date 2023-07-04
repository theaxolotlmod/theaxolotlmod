package io.github.theaxolotlmod.world.tree;

import io.github.theaxolotlmod.world.ModConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.random.RandomGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class GenericWoodSaplingGenerator extends SaplingGenerator {
	@Nullable
	@Override
	protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(RandomGenerator random, boolean bees) {
		return ModConfiguredFeatures.GENERIC_WOOD_KEY;
	}
}
