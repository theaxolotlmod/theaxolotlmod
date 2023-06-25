package io.github.theaxolotlmod.block;

import io.github.theaxolotlmod.Theaxolotlmod;
import io.github.theaxolotlmod.item.ModItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.client.resource.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.int_provider.UniformIntProvider;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

//To add a block you can copy the BLOCK line and change the names. after that, you need to add it to the en_us.json file, make it its own models/block/blockname.json, models/item.blockname.json, blockstates/blockname.json, and give it a texture

public class ModBlocks {

	public static final Block BLOCK = registerBlock("block",
		new Block(QuiltBlockSettings.create().strength(4.04f).requiresTool()), ModItemGroup.ITEMS);

	public static final Block BLOCK_ORE = registerBlock("block_ore",
		new ExperienceDroppingBlock(QuiltBlockSettings.create().strength(4.04f).requiresTool(),
		UniformIntProvider.create(3/*minimum amount of experience*/, /*maximum amount of experience*/7)), ModItemGroup.ITEMS);

	public static final Block DEEPSLATE_BLOCK_ORE = registerBlock("deepslate_block_ore",
		new ExperienceDroppingBlock(QuiltBlockSettings.create().strength(4.04f).requiresTool(),
		UniformIntProvider.create(3, 7)), ModItemGroup.ITEMS);



	private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group){
		registerBlockItem(name, block, group);
		return Registry.register(Registries.BLOCK, new Identifier(Theaxolotlmod.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> group) {
		Item item = Registry.register(Registries.ITEM, new Identifier(Theaxolotlmod.MOD_ID, name),
			new BlockItem(block, new QuiltItemSettings()));
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.addItem(item));
		return item;
	}

	public static void registerModBlocks(){
		Theaxolotlmod.LOGGER.info("Registering ModBlocks for " + Theaxolotlmod.MOD_ID);
	}

}
