package io.github.theaxolotlmod.entity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class BetterAxolotlModel extends EntityModel<Entity> {
	private final ModelPart body;
	private final ModelPart body_r1;
	private final ModelPart head;
	private final ModelPart head_r1;
	private final ModelPart head_r2;
	private final ModelPart jaw;
	private final ModelPart gils;
	private final ModelPart gil_r;
	private final ModelPart top_gil_r;
	private final ModelPart top_gil_r_r1;
	private final ModelPart top_gil_r_r2;
	private final ModelPart mid_gil_r;
	private final ModelPart mid_gil_r_r1;
	private final ModelPart mid_gil_r_r2;
	private final ModelPart bot_gil_r;
	private final ModelPart bot_gil_r_r1;
	private final ModelPart bot_gil_r_r2;
	private final ModelPart gil_l;
	private final ModelPart top_gil_l;
	private final ModelPart top_gil_l_r1;
	private final ModelPart top_gil_l_r2;
	private final ModelPart mid_gil_l;
	private final ModelPart mid_gil_l_r1;
	private final ModelPart mid_gil_l_r2;
	private final ModelPart bot_gil_l;
	private final ModelPart bot_gil_l_r1;
	private final ModelPart bot_gil_l_r2;
	private final ModelPart tail;
	private final ModelPart tail_r1;
	private final ModelPart tail_r2;
	private final ModelPart tail_r3;
	private final ModelPart legs;
	private final ModelPart f_l;
	private final ModelPart arm;
	private final ModelPart arm_r1;
	private final ModelPart fore;
	private final ModelPart f_r;
	private final ModelPart arm2;
	private final ModelPart arm2_r1;
	private final ModelPart fore2;
	private final ModelPart b_r;
	private final ModelPart arm3;
	private final ModelPart fore3;
	private final ModelPart b_l;
	private final ModelPart arm4;
	private final ModelPart arm4_r1;
	private final ModelPart fore4;
	public BetterAxolotlModel(ModelPart root, ModelPart bodyR1, ModelPart head, ModelPart headR1, ModelPart headR2, ModelPart jaw, ModelPart gils, ModelPart gilR, ModelPart topGilR, ModelPart topGilRR1, ModelPart topGilRR2, ModelPart midGilR, ModelPart midGilRR1, ModelPart midGilRR2, ModelPart botGilR, ModelPart botGilRR1, ModelPart botGilRR2, ModelPart gilL, ModelPart topGilL, ModelPart topGilLR1, ModelPart topGilLR2, ModelPart midGilL, ModelPart midGilLR1, ModelPart midGilLR2, ModelPart botGilL, ModelPart botGilLR1, ModelPart botGilLR2, ModelPart tail, ModelPart tailR1, ModelPart tailR2, ModelPart tailR3, ModelPart legs, ModelPart fL, ModelPart arm, ModelPart armR1, ModelPart fore, ModelPart fR, ModelPart arm2, ModelPart arm2R1, ModelPart fore2, ModelPart bR, ModelPart arm3, ModelPart fore3, ModelPart bL, ModelPart arm4, ModelPart arm4R1, ModelPart fore4) {
		this.body = root.getChild("body");
		body_r1 = bodyR1;
		this.head = head;
		head_r1 = headR1;
		head_r2 = headR2;
		this.jaw = jaw;
		this.gils = gils;
		gil_r = gilR;
		top_gil_r = topGilR;
		top_gil_r_r1 = topGilRR1;
		top_gil_r_r2 = topGilRR2;
		mid_gil_r = midGilR;
		mid_gil_r_r1 = midGilRR1;
		mid_gil_r_r2 = midGilRR2;
		bot_gil_r = botGilR;
		bot_gil_r_r1 = botGilRR1;
		bot_gil_r_r2 = botGilRR2;
		gil_l = gilL;
		top_gil_l = topGilL;
		top_gil_l_r1 = topGilLR1;
		top_gil_l_r2 = topGilLR2;
		mid_gil_l = midGilL;
		mid_gil_l_r1 = midGilLR1;
		mid_gil_l_r2 = midGilLR2;
		bot_gil_l = botGilL;
		bot_gil_l_r1 = botGilLR1;
		bot_gil_l_r2 = botGilLR2;
		this.tail = tail;
		tail_r1 = tailR1;
		tail_r2 = tailR2;
		tail_r3 = tailR3;
		this.legs = legs;
		f_l = fL;
		this.arm = arm;
		arm_r1 = armR1;
		this.fore = fore;
		f_r = fR;
		this.arm2 = arm2;
		arm2_r1 = arm2R1;
		this.fore2 = fore2;
		b_r = bR;
		this.arm3 = arm3;
		this.fore3 = fore3;
		b_l = bL;
		this.arm4 = arm4;
		arm4_r1 = arm4R1;
		this.fore4 = fore4;
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 23.5667F, -0.96F));

		ModelPartData body_r1 = body.addChild("body_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-1.6334F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, new Dilation(0.0F))
		.uv(35, 32).mirrored().cuboid(-1.6333F, -0.6667F, -0.5833F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F)).mirrored(false)
		.uv(32, 32).cuboid(-1.7333F, -0.7667F, -0.5333F, 1.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 0).cuboid(-1.9333F, -0.6667F, -0.4333F, 1.0F, 0.0F, 0.0F, new Dilation(0.0F))
		.uv(75, 0).mirrored().cuboid(-2.0333F, -0.5667F, -0.3333F, 2.0F, 0.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.4333F, 0.96F, 0.0F, -1.5708F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.0667F, -1.04F));

		ModelPartData head_r1 = head.addChild("head_r1", ModelPartBuilder.create().uv(91, 80).mirrored().cuboid(-3.1333F, -0.5667F, -0.3333F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)).mirrored(false)
		.uv(0, 16).cuboid(-3.0333F, -0.6667F, -0.3333F, 1.0F, 0.0F, 0.0F, new Dilation(0.0F))
		.uv(128, 0).cuboid(-3.0333F, -0.5667F, -0.4083F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F))
		.uv(144, 128).cuboid(-2.8333F, -0.6667F, -0.4333F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F))
		.uv(144, 128).cuboid(-2.7083F, -0.5667F, -0.5583F, 0.0F, 0.0F, 1.0F, new Dilation(0.0F))
		.uv(47, 96).mirrored().cuboid(-2.7833F, -0.6167F, -0.4833F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.5F, 2.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData head_r2 = head.addChild("head_r2", ModelPartBuilder.create().uv(160, 144).cuboid(-0.2F, -0.3708F, -0.3333F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.1292F, -0.6333F, 0.0F, -1.5708F, 0.0F));

		ModelPartData jaw = head.addChild("jaw", ModelPartBuilder.create().uv(190, 0).mirrored().cuboid(-0.4F, -0.05F, -0.8F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.4F, -0.2F));

		ModelPartData gils = head.addChild("gils", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData gil_r = gils.addChild("gil_r", ModelPartBuilder.create(), ModelTransform.pivot(-0.3333F, 0.1667F, -0.2638F));

		ModelPartData top_gil_r = gil_r.addChild("top_gil_r", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.1667F, 0.0F));

		ModelPartData top_gil_r_r1 = top_gil_r.addChild("top_gil_r_r1", ModelPartBuilder.create().uv(0, 0).cuboid(0.1F, -0.175F, -1.0F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.283F, -0.2735F, 0.9F, 0.0F, 0.0F, -0.5672F));

		ModelPartData top_gil_r_r2 = top_gil_r.addChild("top_gil_r_r2", ModelPartBuilder.create().uv(224, 112).cuboid(-0.1F, -0.25F, -0.1F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.183F, -0.2735F, 0.0F, 0.0F, 0.0F, -0.5672F));

		ModelPartData mid_gil_r = gil_r.addChild("mid_gil_r", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.0667F, 0.0F));

		ModelPartData mid_gil_r_r1 = mid_gil_r.addChild("mid_gil_r_r1", ModelPartBuilder.create().uv(149, 0).mirrored().cuboid(0.05F, 0.0125F, -0.15F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-0.4914F, -0.2448F, 0.05F, 0.0F, 0.0F, -1.0472F));

		ModelPartData mid_gil_r_r2 = mid_gil_r.addChild("mid_gil_r_r2", ModelPartBuilder.create().uv(224, 128).cuboid(-0.4F, -0.25F, -0.1F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.0987F, -0.4272F, 0.0F, 0.0F, 0.0F, -1.0472F));

		ModelPartData bot_gil_r = gil_r.addChild("bot_gil_r", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bot_gil_r_r1 = bot_gil_r.addChild("bot_gil_r_r1", ModelPartBuilder.create().uv(165, 0).mirrored().cuboid(0.0F, -0.2F, -0.15F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(-0.2391F, 0.0071F, 0.05F, 0.0F, 0.0F, -1.309F));

		ModelPartData bot_gil_r_r2 = bot_gil_r.addChild("bot_gil_r_r2", ModelPartBuilder.create().uv(224, 144).cuboid(-0.6F, -0.25F, -0.1F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.0987F, -0.4939F, 0.0F, 0.0F, 0.0F, -1.309F));

		ModelPartData gil_l = gils.addChild("gil_l", ModelPartBuilder.create(), ModelTransform.pivot(0.3333F, 0.1667F, -0.2638F));

		ModelPartData top_gil_l = gil_l.addChild("top_gil_l", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.1667F, 0.0F));

		ModelPartData top_gil_l_r1 = top_gil_l.addChild("top_gil_l_r1", ModelPartBuilder.create().uv(176, 0).cuboid(-0.1F, -0.175F, -1.0F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.283F, -0.2735F, 0.9F, 0.0F, 0.0F, 0.5672F));

		ModelPartData top_gil_l_r2 = top_gil_l.addChild("top_gil_l_r2", ModelPartBuilder.create().uv(208, 64).cuboid(-0.1F, -0.25F, -0.1F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.183F, -0.2735F, 0.0F, 0.0F, 0.0F, 0.5672F));

		ModelPartData mid_gil_l = gil_l.addChild("mid_gil_l", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.0667F, 0.0F));

		ModelPartData mid_gil_l_r1 = mid_gil_l.addChild("mid_gil_l_r1", ModelPartBuilder.create().uv(117, 0).mirrored().cuboid(-0.05F, 0.0125F, -0.15F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.4914F, -0.2448F, 0.05F, 0.0F, 0.0F, 1.0472F));

		ModelPartData mid_gil_l_r2 = mid_gil_l.addChild("mid_gil_l_r2", ModelPartBuilder.create().uv(224, 80).cuboid(0.2F, -0.25F, -0.1F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0987F, -0.4272F, 0.0F, 0.0F, 0.0F, 1.0472F));

		ModelPartData bot_gil_l = gil_l.addChild("bot_gil_l", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bot_gil_l_r1 = bot_gil_l.addChild("bot_gil_l_r1", ModelPartBuilder.create().uv(133, 0).mirrored().cuboid(0.0F, -0.2F, -0.15F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.2391F, 0.0071F, 0.05F, 0.0F, 0.0F, 1.309F));

		ModelPartData bot_gil_l_r2 = bot_gil_l.addChild("bot_gil_l_r2", ModelPartBuilder.create().uv(224, 96).cuboid(0.4F, -0.25F, -0.1F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0987F, -0.4939F, 0.0F, 0.0F, 0.0F, 1.309F));

		ModelPartData tail = body.addChild("tail", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.4333F, 0.96F));

		ModelPartData tail_r1 = tail.addChild("tail_r1", ModelPartBuilder.create().uv(170, 112).mirrored().cuboid(-0.2F, -0.05F, -0.4F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, -0.25F, 1.6F, -0.0873F, 0.0F, 0.0F));

		ModelPartData tail_r2 = tail.addChild("tail_r2", ModelPartBuilder.create().uv(96, 112).cuboid(-0.3F, -0.2F, -0.65F, 0.0F, 0.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.3F, 0.65F, -0.0873F, 0.0F, 0.0F));

		ModelPartData tail_r3 = tail.addChild("tail_r3", ModelPartBuilder.create().uv(0, 0).cuboid(-0.0334F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.0333F, -0.6667F, 0.0F, 2.0F, 0.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.3333F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(0.0F, -0.3333F, 0.0F, 2.0F, 0.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData legs = body.addChild("legs", ModelPartBuilder.create(), ModelTransform.pivot(0.932F, 0.4561F, 0.6962F));

		ModelPartData f_l = legs.addChild("f_l", ModelPartBuilder.create(), ModelTransform.pivot(-0.2559F, -0.0287F, -1.2094F));

		ModelPartData arm = f_l.addChild("arm", ModelPartBuilder.create(), ModelTransform.pivot(-0.1761F, -0.0041F, -0.125F));

		ModelPartData arm_r1 = arm.addChild("arm_r1", ModelPartBuilder.create().uv(32, 48).cuboid(-0.1018F, -0.09F, -0.6029F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData fore = arm.addChild("fore", ModelPartBuilder.create().uv(90, 80).mirrored().cuboid(0.0011F, -0.09F, -0.1F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.6F, 0.0F, 0.0F));

		ModelPartData f_r = legs.addChild("f_r", ModelPartBuilder.create(), ModelTransform.pivot(-1.6081F, -0.0287F, -1.2094F));

		ModelPartData arm2 = f_r.addChild("arm2", ModelPartBuilder.create(), ModelTransform.pivot(0.1761F, -0.0041F, -0.125F));

		ModelPartData arm2_r1 = arm2.addChild("arm2_r1", ModelPartBuilder.create().uv(154, 144).mirrored().cuboid(-0.0982F, -0.09F, -0.0029F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData fore2 = arm2.addChild("fore2", ModelPartBuilder.create().uv(122, 112).mirrored().cuboid(-0.6011F, -0.09F, -0.1F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-0.6F, 0.0F, 0.0F));

		ModelPartData b_r = legs.addChild("b_r", ModelPartBuilder.create(), ModelTransform.pivot(-1.864F, 0.0F, 0.0F));

		ModelPartData arm3 = b_r.addChild("arm3", ModelPartBuilder.create().uv(0, 208).cuboid(-0.6289F, -0.0792F, -0.0637F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.432F, -0.0328F, -0.1362F));

		ModelPartData fore3 = arm3.addChild("fore3", ModelPartBuilder.create().uv(186, 176).mirrored().cuboid(-0.625F, 0.0256F, -0.0715F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(-0.6F, -0.09F, 0.0F));

		ModelPartData b_l = legs.addChild("b_l", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData arm4 = b_l.addChild("arm4", ModelPartBuilder.create(), ModelTransform.pivot(-0.432F, -0.0328F, -0.1362F));

		ModelPartData arm4_r1 = arm4.addChild("arm4_r1", ModelPartBuilder.create().uv(32, 48).cuboid(-0.1018F, -0.0792F, -0.6387F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData fore4 = arm4.addChild("fore4", ModelPartBuilder.create().uv(90, 80).mirrored().cuboid(0.035F, -0.07F, -0.11F, 0.0F, 0.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.6F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}
