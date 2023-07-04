package io.github.theaxolotlmod.world;

import io.github.theaxolotlmod.Theaxolotlmod;
import io.github.theaxolotlmod.block.ModBlocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.BootstrapContext;
import net.minecraft.world.gen.feature.*;
import net.minecraft.registry.Holder;
import net.minecraft.world.gen.feature.util.PlacedFeatureUtil;
import software.bernie.shadowed.eliotlash.mclib.math.functions.classic.Mod;

import java.util.List;

public class ModPlacedFeatures  {
	public static final RegistryKey<PlacedFeature> GENERIC_WOOD_KEY = registerKey("generic_wood");

	public static void bootstrap(BootstrapContext<PlacedFeature> context) {
		var configuredFeatureRegistryEntryLookup = context.lookup(RegistryKeys.CONFIGURED_FEATURE);

		register(context, GENERIC_WOOD_KEY, configuredFeatureRegistryEntryLookup.getHolderOrThrow(ModConfiguredFeatures.GENERIC_WOOD_KEY),
			VegetationPlacedFeatures.treePlacementModifiers(PlacedFeatureUtil.createCountExtraModifier(1, 0.1f, 2), ModBlocks.GENERIC_WOOD_SAPLING));
	}

	public static RegistryKey<PlacedFeature> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Theaxolotlmod.MOD_ID, name));
	}

	private static void register(BootstrapContext<PlacedFeature> context, RegistryKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
								 List<PlacementModifier> modifiers) {
		context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
	}

	private static <FC extends FeatureConfig, F extends Feature<FC>> void register(BootstrapContext<PlacedFeature> context, RegistryKey<PlacedFeature> key,
																				   Holder<ConfiguredFeature<?, ?>> configuration,
		PlacementModifier... modifiers) {
		register(context, key, configuration, List.of(modifiers));
	}
}
