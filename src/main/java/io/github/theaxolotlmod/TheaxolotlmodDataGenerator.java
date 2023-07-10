package io.github.theaxolotlmod;

import io.github.theaxolotlmod.data.ModLootTableGenerator;
import io.github.theaxolotlmod.data.ModModelProvider;
import io.github.theaxolotlmod.data.ModRecipeGenerator;
import io.github.theaxolotlmod.data.ModWorldGenerator;
import io.github.theaxolotlmod.world.ModConfiguredFeatures;
import io.github.theaxolotlmod.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistrySetBuilder;

public class TheaxolotlmodDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModRecipeGenerator::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		registryBuilder.add(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.add(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
