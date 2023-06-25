package io.github.theaxolotlmod.item;

import io.github.theaxolotlmod.Theaxolotlmod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

//To add an item you can copy the ITEM or ITEM_2 and change the names, and don't forget to add them to groups. after that, you need to add them to the en_us.json file, make them their own models/item/itemname.json, and give them a texture

public class ModItems {

	public static final Item ITEM = registerItem("item",
		new Item(new QuiltItemSettings()));

	public static final Item RAW_ITEM = registerItem("raw_item",
		new Item(new QuiltItemSettings()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(Theaxolotlmod.MOD_ID, name), item);
	}

	public static void addItemsToItemGroup() {
		addToItemGroup(ModItemGroup.ITEM, ITEM);
		addToItemGroup(ModItemGroup.ITEM, RAW_ITEM);
	}

	private static void addToItemGroup(ItemGroup group, Item item) {
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item))
	}


	public static void registerModItems() {
		Theaxolotlmod.LOGGER.debug("Registering Mod Items for " + Theaxolotlmod.MOD_ID);
	}
}
