package io.github.theaxolotlmod.world;

import io.github.theaxolotlmod.Theaxolotlmod;
import io.github.theaxolotlmod.block.ModBlocks;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.BootstrapContext;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.int_provider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.Collections;
import java.util.List;

public class ModConfiguredFeatures {
	public static final RegistryKey<ConfiguredFeature<?, ?>> AHUEJOTE_KEY = registerKey("ahuejote_wood");
	public static final RegistryKey<ConfiguredFeature<?, ?>> MOLY_ORE_KEY = registerKey("moly_ore");

	public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
		RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
		RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

		List<OreFeatureConfig.Target> overworldBlockOres =
			List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.MOLY_ORE.getDefaultState()),
			OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_MOLY_ORE.getDefaultState()));

		register(context, AHUEJOTE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
			BlockStateProvider.of(ModBlocks.AHUEJOTE_LOG),
			new StraightTrunkPlacer(5, 6, 3),
			BlockStateProvider.of(ModBlocks.AHUEJOTE_LEAVES),
			new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 1),
			new TwoLayersFeatureSize(1, 0, 2)).build());

		register(context, MOLY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldBlockOres, 6));

	}

	public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Theaxolotlmod.MOD_ID, name));
	}

	private static <FC extends FeatureConfig, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
																				   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
		context.register(key, new ConfiguredFeature<>(feature, configuration));
	}

}
