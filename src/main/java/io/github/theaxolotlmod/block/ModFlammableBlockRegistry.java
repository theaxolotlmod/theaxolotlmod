package io.github.theaxolotlmod.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
	public static void registerFlammableBlocks() {
		FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

		registry.add(ModBlocks.GENERIC_WOOD_LOG, 5, 5);
		registry.add(ModBlocks.GENERIC_WOOD_WOOD, 5, 5);
		registry.add(ModBlocks.STRIPPED_GENERIC_WOOD_LOG, 5, 5);
		registry.add(ModBlocks.STRIPPED_GENERIC_WOOD_WOOD, 5, 5);

		registry.add(ModBlocks.GENERIC_WOOD_LEAVES, 30, 60);
		registry.add(ModBlocks.GENERIC_WOOD_PLANKS, 5, 20);
	}
}
