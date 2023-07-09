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

		ShapedRecipeJsonFactory.create(RecipeCategory.MISC, ModItems.RAW_MOLY)
			.pattern("SSS")
			.pattern("SCS")
			.pattern("SSS")
			.ingredient('S', Items.STONE)
			.ingredient('C', ModItems.MOLY_INGOT)
			.criterion(FabricRecipeProvider.hasItem(Items.STONE),
				FabricRecipeProvider.conditionsFromItem(Items.STONE))
			.criterion(FabricRecipeProvider.hasItem(ModItems.MOLY_INGOT),
				FabricRecipeProvider.conditionsFromItem(ModItems.MOLY_INGOT))
			.offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RAW_MOLY)));
	}
}
