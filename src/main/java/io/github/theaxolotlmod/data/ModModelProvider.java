package io.github.theaxolotlmod.data;

import io.github.theaxolotlmod.block.ModBlocks;
import io.github.theaxolotlmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.client.model.Models;
import net.minecraft.item.Item;

public class ModModelProvider extends FabricModelProvider {
	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOLY_BLOCK);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOLY_ORE);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_MOLY_ORE);

		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STEEL_BLOCK);

		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOLY_STEEL_BLOCK);

		blockStateModelGenerator.registerLog(ModBlocks.AHUEJOTE_LOG).log(ModBlocks.AHUEJOTE_LOG).wood(ModBlocks.AHUEJOTE_WOOD);
		blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_AHUEJOTE_LOG).log(ModBlocks.STRIPPED_AHUEJOTE_LOG).wood(ModBlocks.STRIPPED_AHUEJOTE_WOOD);

		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AHUEJOTE_PLANKS);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AHUEJOTE_LEAVES);

		blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.AHUEJOTE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(ModItems.MOLY_INGOT, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(ModItems.RAW_MOLY, Models.SINGLE_LAYER_ITEM);

		itemModelGenerator.register(ModItems.STEEL_INGOT, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(ModItems.RAW_STEEL, Models.SINGLE_LAYER_ITEM);

		itemModelGenerator.register(ModItems.MOLY_STEEL_INGOT, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(ModItems.RAW_MOLY_STEEL, Models.SINGLE_LAYER_ITEM);

		itemModelGenerator.register(Item.fromBlock(ModBlocks.AHUEJOTE_SAPLING), Models.SINGLE_LAYER_ITEM);
	}
}
