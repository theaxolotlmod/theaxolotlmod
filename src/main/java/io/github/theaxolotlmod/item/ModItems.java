package io.github.theaxolotlmod.item;

import io.github.theaxolotlmod.Theaxolotlmod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

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
		addToItemGroup(ModItemGroup.ITEMS, ITEM);
		addToItemGroup(ModItemGroup.ITEMS, RAW_ITEM);
	}

	private static void addToItemGroup(ItemGroup group, Item item) {
		ItemGroupEvents.modifyEntriesEvent(RegistryKey<group>).register(entries -> entries.addItem(item));
	}


	public static void registerModItems() {
		Theaxolotlmod.LOGGER.debug("Registering Mod Items for " + Theaxolotlmod.MOD_ID);
	}
}
