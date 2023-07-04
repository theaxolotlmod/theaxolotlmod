package io.github.theaxolotlmod;

import io.github.theaxolotlmod.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;

public class TheaxolotlmodClient implements ClientModInitializer {
	@Override
	public void onInitializeClient(ModContainer mod) {
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.GENERIC_WOOD_LEAVES);
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.GENERIC_WOOD_SAPLING);
	}
}
