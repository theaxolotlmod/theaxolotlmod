package io.github.theaxolotlmod.block;

import io.github.theaxolotlmod.Theaxolotlmod;
import io.github.theaxolotlmod.item.ModItemGroup;
import io.github.theaxolotlmod.world.tree.GenericWoodSaplingGenerator;
import net.minecraft.block.*;
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

	public static final Block MOLY_BLOCK = registerBlock("moly_block",
		new Block(QuiltBlockSettings.create().strength(4.04f).requiresTool()));

	public static final Block MOLY_ORE = registerBlock("moly_ore",
		new ExperienceDroppingBlock(QuiltBlockSettings.create().strength(4.04f).requiresTool(),
		UniformIntProvider.create(3/*minimum amount of experience*/, /*maximum amount of experience*/7)));

	public static final Block DEEPSLATE_MOLY_ORE = registerBlock("deepslate_moly_ore",
		new ExperienceDroppingBlock(QuiltBlockSettings.create().strength(4.04f).requiresTool(),
		UniformIntProvider.create(3, 7)));

	public static final Block AHUEJOTE_LOG = registerBlock("ahuejote_log",
		new PillarBlock(QuiltBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()));
	public static final Block AHUEJOTE_WOOD = registerBlock("ahuejote_wood",
		new PillarBlock(QuiltBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4.0f).requiresTool()));
	public static final Block STRIPPED_AHUEJOTE_LOG = registerBlock("stripped_ahuejote_log",
		new PillarBlock(QuiltBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()));
	public static final Block STRIPPED_AHUEJOTE_WOOD = registerBlock("stripped_ahuejote_wood",
		new PillarBlock(QuiltBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()));

	public static final Block AHUEJOTE_PLANKS = registerBlock("ahuejote_planks",
		new Block(QuiltBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()));
	public static final Block AHUEJOTE_LEAVES = registerBlock("ahuejote_leaves",
		new LeavesBlock(QuiltBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()));

	public static final Block AHUEJOTE_SAPLING = registerBlock("ahuejote_sapling",
		new SaplingBlock(new GenericWoodSaplingGenerator(), QuiltBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()));

	private static Block registerBlock(String name, Block block){
		registerBlockItem(name, block);
		return Registry.register(Registries.MOLY_BLOCK, new Identifier(Theaxolotlmod.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block) {
		Item item = Registry.register(Registries.MOLY_INGOT, new Identifier(Theaxolotlmod.MOD_ID, name),
			new BlockItem(block, new QuiltItemSettings()));
		return item;
	}

	public static void registerModBlocks(){
		Theaxolotlmod.LOGGER.info("Registering ModBlocks for " + Theaxolotlmod.MOD_ID);
	}

}
