package io.github.theaxolotlmod.block;

import io.github.theaxolotlmod.Theaxolotlmod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BannerItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModBlocks {

	public static Block BLOCK = registerBlock("block", new Block(AbstractBlock.Settings.create()));


	public static Block registerBlock(String name, Block block){
		Registry.register(Registries.ITEM, new Identifier(Theaxolotlmod.MOD_ID, name), new BlockItem(block, new QuiltItemSettings()));
		return Registry.register(Registries.BLOCK, new Identifier(Theaxolotlmod.MOD_ID, name), block);
	}

	public static void registerBlock(){
	}

}
