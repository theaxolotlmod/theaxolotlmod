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
	public static final ItemGroup ITEMS = Registry.register(Registries.ITEM_GROUP,
		new Identifier(Theaxolotlmod.MOD_ID, "item"),
		FabricItemGroup.builder().name(Text.translatable("itemgroup.item"))
			.icon(() -> new ItemStack(ModItems.ITEM)).entries((displayContext, entries) -> {
				// Adding your items and blocks here
				entries.addItem(ModItems.RAW_ITEM);
				entries.addItem(ModItems.ITEM);
				entries.addItem(ModBlocks.BLOCK);
				entries.addItem(ModBlocks.BLOCK_ORE);
				entries.addItem(ModBlocks.DEEPSLATE_BLOCK_ORE);
				entries.addItem(ModBlocks.GENERIC_WOOD_LOG);
				entries.addItem(ModBlocks.GENERIC_WOOD_WOOD);
				entries.addItem(ModBlocks.GENERIC_WOOD_PLANKS);
				entries.addItem(ModBlocks.GENERIC_WOOD_LEAVES);
				entries.addItem(ModBlocks.STRIPPED_GENERIC_WOOD_LOG);
				entries.addItem(ModBlocks.STRIPPED_GENERIC_WOOD_WOOD);
				entries.addItem(ModBlocks.GENERIC_WOOD_SAPLING);

<<<<<<< HEAD
    public static void registerItemGroups() {
        ITEMS = QuiltItemGroup.builder(new Identifier(Theaxolotlmod.MOD_ID, "item"))
            .displayName(Text.translatable("itemgroup.items"))
            .icon(() -> new ItemStack(ModItems.ITEM)).build();
=======
			}).build());
>>>>>>> 2713bfd29087b8dde850ac27b0fe271e988210d5


	public static void registerItemGroups() {
		Theaxolotlmod.LOGGER.info("Registering Item Groups for " + Theaxolotlmod.MOD_ID);
    }
}
