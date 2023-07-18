package io.github.theaxolotlmod;

import io.github.theaxolotlmod.block.ModBlocks;
import io.github.theaxolotlmod.item.ModItemGroup;
import io.github.theaxolotlmod.item.ModItems;
import io.github.theaxolotlmod.world.gen.ModWorldGeneration;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Theaxolotlmod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "theaxolotlmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize(ModContainer mod) {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();

		LOGGER.info("Hello, World!");
	}
}
