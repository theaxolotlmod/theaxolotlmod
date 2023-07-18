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
		ShapelessRecipeJsonFactory.create(RecipeCategory.MISC, ModItems.WORM)
			.ingredient(Items.DIRT_BLOCK)
			.criterion(FabricRecipeProvider.hasItem(Items.DIRT_BLOCK),
				FabricRecipeProvider.conditionsFromItem(ITEMS.DIRT_BLOCK))
			.offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.WORM)));
	}
}
