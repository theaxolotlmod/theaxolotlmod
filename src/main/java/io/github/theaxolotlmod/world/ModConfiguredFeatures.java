package io.github.theaxolotlmod.world;

import io.github.theaxolotlmod.Theaxolotlmod;
import io.github.theaxolotlmod.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.int_provider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModConfiguredFeatures {
	public static final RegistryKey<ConfiguredFeature<?, ?>> GENERIC_WOOD_KEY = registerKey("generic_wood");

	public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {


		register(context, GENERIC_WOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
			BlockStateProvider.of(ModBlocks.GENERIC_WOOD_LOG),
			new StraightTrunkPlacer(5, 6, 3),
			BlockStateProvider.of(ModBlocks.GENERIC_WOOD_LEAVES),
			new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
			new TwoLayersFeatureSize(1, 0, 2)).build();
		))



	}

	public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Theaxolotlmod.MOD_ID, name));
	}

	private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
																				   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
		context.register(key, new ConfiguredFeature<>(feature, configuration));
	}

}
