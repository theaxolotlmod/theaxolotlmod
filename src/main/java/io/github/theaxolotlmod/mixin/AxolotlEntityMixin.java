package io.github.theaxolotlmod.mixin;

import com.google.common.collect.ImmutableMap;
import io.github.theaxolotlmod.entity.BetterAxolotlModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.EntityModels;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(EntityModels.class)
public class AxolotlEntityMixin {
	@Redirect(
		method = "Lnet/minecraft/client/render/entity/model/EntityModels;getModels()Ljava/util/Map;",
		at = @At(
			value = "INVOKE",
			target = "Lcom/google/common/collect/ImmutableMap$Builder;put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;",
			remap = false
		),
		slice = @Slice(
			from = @At(value = "FIELD", target = "Lnet/minecraft/client/render/entity/model/EntityModelLayers;AXOLOTL:Lnet/minecraft/client/render/entity/model/EntityModelLayer;"),
			to = @At(value = "FIELD", target = "Lnet/minecraft/client/render/entity/model/EntityModelLayers;BANNER:Lnet/minecraft/client/render/entity/model/EntityModelLayer;")
		),
		allow = 1
	)
	private static ImmutableMap.Builder<?, ?> theaxolotlmod$injectAxolotlModel(ImmutableMap.Builder instance, Object key, Object value) {
		return instance.put(EntityModelLayers.AXOLOTL,  BetterAxolotlModel.getTexturedModelData());
	}
}
