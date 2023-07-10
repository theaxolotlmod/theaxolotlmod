package io.github.theaxolotlmod.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
	public static void registerFlammableBlocks() {
		FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

		registry.add(ModBlocks.AHUEJOTE_LOG, 5, 5);
		registry.add(ModBlocks.AHUEJOTE_WOOD, 5, 5);
		registry.add(ModBlocks.STRIPPED_AHUEJOTE_LOG, 5, 5);
		registry.add(ModBlocks.STRIPPED_AHUEJOTE_WOOD, 5, 5);

		registry.add(ModBlocks.AHUEJOTE_LEAVES, 30, 60);
		registry.add(ModBlocks.AHUEJOTE_PLANKS, 5, 20);
	}
}
