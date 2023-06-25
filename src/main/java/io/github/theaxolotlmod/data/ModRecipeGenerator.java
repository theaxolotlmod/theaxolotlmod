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
		offerSmelting(exporter, List.of(ModItems.RAW_ITEM), RecipeCategory.MISC, ModItems.ITEM,
			0.7f, 200, "item");

		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ITEM, RecipeCategory.DECORATIONS, ModBlocks.BLOCK);

		ShapedRecipeJsonFactory.create(RecipeCategory.MISC, ModItems.RAW_ITEM)
			.pattern("SSS")
			.pattern("SCS")
			.pattern("SSS")
			.ingredient('S', Items.STONE)
			.ingredient('C', ModItems.ITEM)
			.criterion(FabricRecipeProvider.hasItem(Items.STONE),
				FabricRecipeProvider.conditionsFromItem(Items.STONE))
			.criterion(FabricRecipeProvider.hasItem(ModItems.ITEM),
				FabricRecipeProvider.conditionsFromItem(ModItems.ITEM))
			.offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RAW_ITEM)));
	}
}
