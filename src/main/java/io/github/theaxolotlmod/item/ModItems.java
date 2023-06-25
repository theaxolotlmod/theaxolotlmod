package io.github.theaxolotlmod.item;

import io.github.theaxolotlmod.Theaxolotlmod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
public class ModItems {

	public static final Item ITEM = registerItem("item",
		new Item(/*idk*/));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(Theaxolotlmod.MOD_ID, name), item);
	}

	public static void registerModItems() {
		Theaxolotlmod.LOGGER.debug("Registering Mod Items for " + Theaxolotlmod.MOD_ID);
	}
}
