package io.github.theaxolotlmod.data;

import io.github.theaxolotlmod.block.ModBlocks;
import io.github.theaxolotlmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonFactory;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
	public ModRecipeGenerator(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
		offerSmelting(exporter, List.of(ModItems.RAW_MOLY), RecipeCategory.MISC, ModItems.MOLY_INGOT,
			0.7f, 200, "moly_ingot");

		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOLY_INGOT, RecipeCategory.DECORATIONS, ModBlocks.MOLY_BLOCK);



		offerSmelting(exporter, List.of(ModItems.RAW_STEEL), RecipeCategory.MISC, ModItems.STEEL_INGOT,
			0.7f, 200, "steel_ingot");

		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.STEEL_BLOCK);

		ShapedRecipeJsonFactory.create(RecipeCategory.MISC, ModItems.RAW_STEEL)
			.pattern("SSS")
			.pattern("SCS")
			.pattern("SSS")
			.ingredient('S', Items.COAL)
			.ingredient('C', Items.IRON_INGOT)
			.criterion(FabricRecipeProvider.hasItem(Items.COAL),
				FabricRecipeProvider.conditionsFromItem(Items.COAL))
			.criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
				FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
			.offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RAW_STEEL)));

		
		


		offerSmelting(exporter, List.of(ModItems.RAW_MOLY_STEEL), RecipeCategory.MISC, ModItems.MOLY_STEEL_INGOT,
			0.7f, 200, "steel_ingot");

		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MOLY_STEEL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.MOLY_STEEL_BLOCK);

		ShapedRecipeJsonFactory.create(RecipeCategory.MISC, ModItems.RAW_MOLY_STEEL)
			.pattern("MSM")
			.pattern("SCS")
			.pattern("MSM")
			.ingredient('C', Items.COAL)
			.ingredient('S', ModItems.STEEL_INGOT)
			.ingredient('M', ModItems.MOLY_INGOT)
			.criterion(FabricRecipeProvider.hasItem(Items.COAL),
				FabricRecipeProvider.conditionsFromItem(Items.COAL))
			.criterion(FabricRecipeProvider.hasItem(ModItems.STEEL_INGOT),
				FabricRecipeProvider.conditionsFromItem(ModItems.STEEL_INGOT))
			.criterion(FabricRecipeProvider.hasItem(ModItems.MOLY_INGOT),
				FabricRecipeProvider.conditionsFromItem(ModItems.MOLY_INGOT))
			.offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RAW_MOLY_STEEL)));
	}
}
