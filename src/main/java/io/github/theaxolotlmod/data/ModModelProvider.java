package io.github.theaxolotlmod.data;

import io.github.theaxolotlmod.block.ModBlocks;
import io.github.theaxolotlmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.client.model.Models;

public class ModModelProvider extends FabricModelProvider {
	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLOCK_ORE);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_BLOCK_ORE);

		blockStateModelGenerator.registerLog(ModBlocks.GENERIC_WOOD_LOG).log(ModBlocks.GENERIC_WOOD_LOG).wood(ModBlocks.GENERIC_WOOD_WOOD);
		blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_GENERIC_WOOD_LOG).log(ModBlocks.STRIPPED_GENERIC_WOOD_LOG).wood(ModBlocks.STRIPPED_GENERIC_WOOD_WOOD);

		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GENERIC_WOOD_PLANKS);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GENERIC_WOOD_LEAVES);

		blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.GENERIC_WOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(ModItems.ITEM, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(ModItems.RAW_ITEM, Models.SINGLE_LAYER_ITEM);
	}
}
