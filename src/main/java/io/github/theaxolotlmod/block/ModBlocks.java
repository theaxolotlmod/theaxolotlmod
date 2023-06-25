package io.github.theaxolotlmod.block;

import io.github.theaxolotlmod.Theaxolotlmod;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.int_provider.UniformIntProvider;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

//To add a block you can copy the BLOCK line and change the names. after that, you need to add it to the en_us.json file, make it its own models/block/blockname.json, models/item.blockname.json, blockstates/blockname.json, and give it a texture

public class ModBlocks {

	public static final Block BLOCK = registerBlock("block",
		new Block(QuiltBlockSettings.create().strength(4.04f).requiresTool()));

	public static final Block BLOCK_ORE = registerBlock("block_ore",
		new ExperienceDroppingBlock(QuiltBlockSettings.create().strength(4.04f).requiresTool(),
		UniformIntProvider.create(3/*minimum amount of experience*/, /*maximum amount of experience*/7)));

	public static final Block DEEPSLATE_BLOCK_ORE = registerBlock("deepslate_block_ore",
		new ExperienceDroppingBlock(QuiltBlockSettings.create().strength(4.04f).requiresTool(),
		UniformIntProvider.create(3, 7)));



	private static Block registerBlock(String name, Block block){
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(Theaxolotlmod.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block) {
		Item item = Registry.register(Registries.ITEM, new Identifier(Theaxolotlmod.MOD_ID, name),
			new BlockItem(block, new QuiltItemSettings()));
		return item;
	}

	public static void registerModBlocks(){
		Theaxolotlmod.LOGGER.info("Registering ModBlocks for " + Theaxolotlmod.MOD_ID);
	}

}
