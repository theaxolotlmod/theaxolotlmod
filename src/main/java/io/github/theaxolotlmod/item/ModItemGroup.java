package io.github.theaxolotlmod.item;


import io.github.theaxolotlmod.Theaxolotlmod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroup {
	public static final ItemGroup ITEMS = Registry.register(Registries.ITEM_GROUP,
		new Identifier(Theaxolotlmod.MOD_ID, "item"),
		FabricItemGroup.builder().name(Text.translatable("itemgroup.item"))
			.icon(() -> new ItemStack(ModItems.ITEM)).entries((displayContext, entries) -> {
				// Adding your items and blocks here
				entries.addItem(ModItems.ITEM);

			}).build());


	public static void registerItemGroups() {
		Theaxolotlmod.LOGGER.info("Registering Item Groups for " + Theaxolotlmod.MOD_ID);
    }
}
