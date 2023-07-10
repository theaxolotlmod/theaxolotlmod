package io.github.theaxolotlmod.item;


import io.github.theaxolotlmod.Theaxolotlmod;
import io.github.theaxolotlmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroup {
	public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
		new Identifier(Theaxolotlmod.MOD_ID, "theaxolotlmod_group"),
		FabricItemGroup.builder().name(Text.translatable("itemgroup.theaxolotlmod_group"))
			.icon(() -> new ItemStack(ModItems.WORM)).entries((displayContext, entries) -> {
				// Adding your items and blocks here
				entries.addItem(ModItems.WORM);
				entries.addItem(ModBlocks.AHUEJOTE_LOG);
				entries.addItem(ModBlocks.AHUEJOTE_WOOD);
				entries.addItem(ModBlocks.AHUEJOTE_PLANKS);
				entries.addItem(ModBlocks.AHUEJOTE_LEAVES);
				entries.addItem(ModBlocks.STRIPPED_AHUEJOTE_LOG);
				entries.addItem(ModBlocks.STRIPPED_AHUEJOTE_WOOD);
				entries.addItem(ModBlocks.AHUEJOTE_SAPLING);
			}).build());

    public static void registerItemGroups() {
		Theaxolotlmod.LOGGER.info("Registering Item Groups for " + Theaxolotlmod.MOD_ID);
	}
}
