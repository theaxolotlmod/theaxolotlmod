package io.github.theaxolotlmod.data;

import io.github.theaxolotlmod.Theaxolotlmod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.HolderLookup;
import net.minecraft.registry.RegistryKeys;

import java.util.concurrent.CompletableFuture;

public class ModWorldGenerator extends FabricDynamicRegistryProvider {

	public ModWorldGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected void configure(HolderLookup.Provider registries, Entries entries) {
		// WORLD GEN
		entries.addAll(registries.getLookupOrThrow(RegistryKeys.CONFIGURED_FEATURE));
	}

	@Override
	public String getName() {
		return Theaxolotlmod.MOD_ID;
	}
}
