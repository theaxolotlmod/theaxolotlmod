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
		addDrop(ModBlocks.BLOCK);
		addDrop(ModBlocks.GENERIC_WOOD_PLANKS);
		addDrop(ModBlocks.GENERIC_WOOD_WOOD);
		addDrop(ModBlocks.GENERIC_WOOD_LOG);
		addDrop(ModBlocks.STRIPPED_GENERIC_WOOD_LOG);
		addDrop(ModBlocks.STRIPPED_GENERIC_WOOD_WOOD);
		addDrop(ModBlocks.GENERIC_WOOD_SAPLING);


		oreDrops(ModBlocks.BLOCK_ORE, ModItems.RAW_ITEM);
		oreDrops(ModBlocks.DEEPSLATE_BLOCK_ORE, ModItems.RAW_ITEM);
	}
}
