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
		addDrop(ModBlocks.MOLY_BLOCK);

		addDrop(ModBlocks.STEEL_BLOCK);

		addDrop(ModBlocks.MOLY_STEEL_BLOCK);

		addDrop(ModBlocks.AHUEJOTE_PLANKS);
		addDrop(ModBlocks.AHUEJOTE_WOOD);
		addDrop(ModBlocks.AHUEJOTE_LOG);
		addDrop(ModBlocks.STRIPPED_AHUEJOTE_LOG);
		addDrop(ModBlocks.STRIPPED_AHUEJOTE_WOOD);
		addDrop(ModBlocks.AHUEJOTE_SAPLING);


		add(ModBlocks.MOLY_ORE, oreDrops(ModBlocks.MOLY_ORE, ModItems.RAW_MOLY));
		add(ModBlocks.DEEPSLATE_MOLY_ORE, oreDrops(ModBlocks.DEEPSLATE_MOLY_ORE, ModItems.RAW_MOLY));
	}
}
