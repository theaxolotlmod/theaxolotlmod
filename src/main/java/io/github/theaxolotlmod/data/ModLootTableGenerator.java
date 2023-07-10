package io.github.theaxolotlmod.data;

import io.github.theaxolotlmod.block.ModBlocks;
import io.github.theaxolotlmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
	public ModLootTableGenerator(FabricDataOutput dataOutput) {
		super(dataOutput);
	}

	@Override
	public void generate() {
		addDrop(ModBlocks.AHUEJOTE_PLANKS);
		addDrop(ModBlocks.AHUEJOTE_WOOD);
		addDrop(ModBlocks.AHUEJOTE_LOG);
		addDrop(ModBlocks.STRIPPED_AHUEJOTE_LOG);
		addDrop(ModBlocks.STRIPPED_AHUEJOTE_WOOD);
		addDrop(ModBlocks.AHUEJOTE_SAPLING);
	}
}
