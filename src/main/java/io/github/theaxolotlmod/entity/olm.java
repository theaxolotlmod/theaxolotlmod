package io.github.theaxolotlmod.entity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class olm extends EntityModel<WaterCreatureEntity> {
	private final ModelPart body;
	private final ModelPart body_tail_r1;
	private final ModelPart head;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart jaw;
	private final ModelPart gils;
	private final ModelPart gil_r;
	private final ModelPart top_gil_r;
	private final ModelPart top_gil_r_plane_r1;
	private final ModelPart top_gil_r_r1;
	private final ModelPart mid_gil_r;
	private final ModelPart mid_gil_r_plane_r1;
	private final ModelPart mid_gil_r_r1;
	private final ModelPart bot_gil_r;
	private final ModelPart bot_gil_r_plane_r1;
	private final ModelPart bot_gil_r_r1;
	private final ModelPart gil_l;
	private final ModelPart top_gil_l;
	private final ModelPart top_gil_l_plane_r1;
	private final ModelPart top_gil_l_r1;
	private final ModelPart mid_gil_l;
	private final ModelPart mid_gil_l_plane_r1;
	private final ModelPart mid_gil_l_r1;
	private final ModelPart bot_gil_l;
	private final ModelPart bot_gil_l_plane_r1;
	private final ModelPart bot_gil_l_r1;
	private final ModelPart tail;
	private final ModelPart wide_tail2_r1;
	private final ModelPart wide_tail1_r1;
	private final ModelPart tail_top_r1;
	private final ModelPart legs;
	private final ModelPart f_l;
	private final ModelPart arm;
	private final ModelPart arm_r1;
	private final ModelPart fore;
	private final ModelPart f_r;
	private final ModelPart arm2;
	private final ModelPart arm_r2;
	private final ModelPart fore2;
	private final ModelPart b_r;
	private final ModelPart arm3;
	private final ModelPart arm_r3;
	private final ModelPart fore3;
	private final ModelPart b_l;
	private final ModelPart arm4;
	private final ModelPart arm_r4;
	private final ModelPart fore4;
	public olm(ModelPart root) {
		this.body = root.getChild("body");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.4333F, -0.96F));

		ModelPartData body_tail_r1 = body.addChild("body_tail_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-1.6334F, 0.4167F, 0.0F, 1.6667F, 0.5833F, 0.0F, new Dilation(0.0F))
		.uv(3, 3).cuboid(-1.6333F, 0.125F, -0.4583F, 1.2667F, 0.4167F, 0.9167F, new Dilation(0.0F))
		.uv(0, 2).cuboid(-1.7333F, 0.025F, -0.4083F, 1.4667F, 0.6167F, 0.8167F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.9333F, 0.125F, -0.3083F, 1.8667F, 0.4167F, 0.6167F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-2.0333F, 0.225F, -0.2083F, 2.0667F, 0.2167F, 0.4167F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.4333F, 0.96F, 0.0F, -1.5708F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.0083F, -0.99F));

		ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(6, 2).cuboid(-3.6333F, 0.275F, -0.2083F, 1.4F, 0.1667F, 0.4167F, new Dilation(0.0F))
		.uv(6, 0).cuboid(-3.5333F, 0.275F, -0.2083F, 1.5F, 0.2667F, 0.4167F, new Dilation(0.0F))
		.uv(5, 3).cuboid(-3.5333F, 0.275F, -0.2833F, 1.2F, 0.1667F, 0.5667F, new Dilation(0.0F))
		.uv(0, 5).cuboid(-3.3333F, 0.25F, -0.3083F, 1.2F, 0.2917F, 0.6667F, new Dilation(0.0F))
		.uv(4, 0).cuboid(-2.7083F, 0.225F, -0.4333F, 0.5F, 0.2167F, 0.8667F, new Dilation(0.0F))
		.uv(4, 5).cuboid(-2.7833F, 0.175F, -0.3583F, 0.6F, 0.3167F, 0.6917F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, 2.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r2 = head.addChild("cube_r2", ModelPartBuilder.create().uv(0, 7).cuboid(-0.7F, -0.1458F, -0.2083F, 1.2F, 0.3917F, 0.4167F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.1292F, -0.6333F, 0.0F, -1.5708F, 0.0F));

		ModelPartData jaw = head.addChild("jaw", ModelPartBuilder.create().uv(2, 5).cuboid(-0.2F, 0.075F, -1.4F, 0.4F, 0.1F, 0.875F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.4F, -0.2F));

		ModelPartData gils = head.addChild("gils", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData gil_r = gils.addChild("gil_r", ModelPartBuilder.create(), ModelTransform.pivot(-0.1333F, -0.1667F, -0.2638F));

		ModelPartData top_gil_r = gil_r.addChild("top_gil_r", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.1667F, 0.0F));

		ModelPartData top_gil_r_plane_r1 = top_gil_r.addChild("top_gil_r_plane_r1", ModelPartBuilder.create().uv(15, 14).cuboid(0.1F, -0.25F, -1.0F, 0.0F, 0.425F, 0.3F, new Dilation(0.0F)), ModelTransform.of(-0.283F, 0.2735F, 0.9F, 0.0F, 0.0F, -0.5672F));

		ModelPartData top_gil_r_r1 = top_gil_r.addChild("top_gil_r_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.1F, -0.25F, -0.1F, 0.2F, 0.5F, 0.2F, new Dilation(0.0F)), ModelTransform.of(-0.183F, 0.2735F, 0.0F, 0.0F, 0.0F, -0.5672F));

		ModelPartData mid_gil_r = gil_r.addChild("mid_gil_r", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0667F, 0.0F));

		ModelPartData mid_gil_r_plane_r1 = mid_gil_r.addChild("mid_gil_r_plane_r1", ModelPartBuilder.create().uv(14, 14).cuboid(0.05F, -0.4125F, -0.15F, 0.0F, 0.4F, 0.3F, new Dilation(0.0F)), ModelTransform.of(-0.4914F, 0.2448F, 0.05F, 0.0F, 0.0F, -1.0472F));

		ModelPartData mid_gil_r_r1 = mid_gil_r.addChild("mid_gil_r_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.4F, -0.15F, -0.1F, 0.2F, 0.4F, 0.2F, new Dilation(0.0F)), ModelTransform.of(-0.0987F, 0.4272F, 0.0F, 0.0F, 0.0F, -1.0472F));

		ModelPartData bot_gil_r = gil_r.addChild("bot_gil_r", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bot_gil_r_plane_r1 = bot_gil_r.addChild("bot_gil_r_plane_r1", ModelPartBuilder.create().uv(14, 14).cuboid(0.0F, -0.2F, -0.15F, 0.0F, 0.4F, 0.3F, new Dilation(0.0F)), ModelTransform.of(-0.2391F, -0.0071F, 0.05F, 0.0F, 0.0F, -1.309F));

		ModelPartData bot_gil_r_r1 = bot_gil_r.addChild("bot_gil_r_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.6F, -0.15F, -0.1F, 0.2F, 0.4F, 0.2F, new Dilation(0.0F)), ModelTransform.of(-0.0987F, 0.4939F, 0.0F, 0.0F, 0.0F, -1.309F));

		ModelPartData gil_l = gils.addChild("gil_l", ModelPartBuilder.create(), ModelTransform.pivot(0.1333F, -0.1667F, -0.2638F));

		ModelPartData top_gil_l = gil_l.addChild("top_gil_l", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.1667F, 0.0F));

		ModelPartData top_gil_l_plane_r1 = top_gil_l.addChild("top_gil_l_plane_r1", ModelPartBuilder.create().uv(13, 14).cuboid(-0.1F, -0.25F, -1.0F, 0.0F, 0.425F, 0.3F, new Dilation(0.0F)), ModelTransform.of(0.283F, 0.2735F, 0.9F, 0.0F, 0.0F, 0.5672F));

		ModelPartData top_gil_l_r1 = top_gil_l.addChild("top_gil_l_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.1F, -0.25F, -0.1F, 0.2F, 0.5F, 0.2F, new Dilation(0.0F)), ModelTransform.of(0.183F, 0.2735F, 0.0F, 0.0F, 0.0F, 0.5672F));

		ModelPartData mid_gil_l = gil_l.addChild("mid_gil_l", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0667F, 0.0F));

		ModelPartData mid_gil_l_plane_r1 = mid_gil_l.addChild("mid_gil_l_plane_r1", ModelPartBuilder.create().uv(14, 15).cuboid(-0.05F, -0.4125F, -0.15F, 0.0F, 0.4F, 0.3F, new Dilation(0.0F)), ModelTransform.of(0.4914F, 0.2448F, 0.05F, 0.0F, 0.0F, 1.0472F));

		ModelPartData mid_gil_l_r1 = mid_gil_l.addChild("mid_gil_l_r1", ModelPartBuilder.create().uv(0, 0).cuboid(0.2F, -0.15F, -0.1F, 0.2F, 0.4F, 0.2F, new Dilation(0.0F)), ModelTransform.of(0.0987F, 0.4272F, 0.0F, 0.0F, 0.0F, 1.0472F));

		ModelPartData bot_gil_l = gil_l.addChild("bot_gil_l", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bot_gil_l_plane_r1 = bot_gil_l.addChild("bot_gil_l_plane_r1", ModelPartBuilder.create().uv(15, 15).cuboid(0.0F, -0.2F, -0.15F, 0.0F, 0.4F, 0.3F, new Dilation(0.0F)), ModelTransform.of(0.2391F, -0.0071F, 0.05F, 0.0F, 0.0F, 1.309F));

		ModelPartData bot_gil_l_r1 = bot_gil_l.addChild("bot_gil_l_r1", ModelPartBuilder.create().uv(0, 0).cuboid(0.4F, -0.15F, -0.1F, 0.2F, 0.4F, 0.2F, new Dilation(0.0F)), ModelTransform.of(0.0987F, 0.4939F, 0.0F, 0.0F, 0.0F, 1.309F));

		ModelPartData tail = body.addChild("tail", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.4333F, 0.96F));

		ModelPartData wide_tail2_r1 = tail.addChild("wide_tail2_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.2F, -0.15F, -0.4F, 0.4F, 0.3F, 0.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.25F, 1.6F, -0.0873F, 0.0F, 0.0F));

		ModelPartData wide_tail1_r1 = tail.addChild("wide_tail1_r1", ModelPartBuilder.create().uv(-1, 3).cuboid(-0.3F, -0.2F, -0.8F, 0.6F, 0.4F, 1.45F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.3F, 0.65F, -0.0436F, 0.0F, 0.0F));

		ModelPartData tail_top_r1 = tail.addChild("tail_top_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.0334F, 0.6667F, 0.0F, 1.3667F, 0.3333F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.2333F, 0.3333F, 0.0F, 2.5667F, 0.3333F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.7583F, -0.1333F, 0.0F, 3.0917F, 0.1583F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.45F, 0.0F, 0.0F, 3.1167F, 0.3333F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData legs = body.addChild("legs", ModelPartBuilder.create(), ModelTransform.pivot(0.932F, -0.4561F, 0.6962F));

		ModelPartData f_l = legs.addChild("f_l", ModelPartBuilder.create(), ModelTransform.pivot(-0.4559F, 0.1287F, -1.2094F));

		ModelPartData arm = f_l.addChild("arm", ModelPartBuilder.create(), ModelTransform.pivot(-0.0761F, 0.0041F, -0.125F));

		ModelPartData arm_r1 = arm.addChild("arm_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.0518F, -0.06F, -0.4529F, 0.1F, 0.1F, 0.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData fore = arm.addChild("fore", ModelPartBuilder.create().uv(0, 0).cuboid(0.0011F, -0.06F, -0.05F, 0.5F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.pivot(0.45F, 0.0F, 0.0F));

		ModelPartData f_r = legs.addChild("f_r", ModelPartBuilder.create(), ModelTransform.pivot(-1.6081F, 0.0287F, -1.2094F));

		ModelPartData arm2 = f_r.addChild("arm2", ModelPartBuilder.create(), ModelTransform.pivot(0.1761F, 0.1041F, -0.125F));

		ModelPartData arm_r2 = arm2.addChild("arm_r2", ModelPartBuilder.create().uv(0, 0).cuboid(-0.0482F, -0.06F, -0.1F, 0.1F, 0.1F, 0.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData fore2 = arm2.addChild("fore2", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5011F, -0.06F, -0.05F, 0.5F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.pivot(-0.4F, 0.0F, 0.0F));

		ModelPartData b_r = legs.addChild("b_r", ModelPartBuilder.create(), ModelTransform.pivot(-1.864F, 0.0F, 0.0F));

		ModelPartData arm3 = b_r.addChild("arm3", ModelPartBuilder.create(), ModelTransform.pivot(0.432F, 0.0328F, -0.1362F));

		ModelPartData arm_r3 = arm3.addChild("arm_r3", ModelPartBuilder.create().uv(-1, -1).cuboid(-0.0482F, 0.04F, -0.11F, 0.1F, 0.1F, 0.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData fore3 = arm3.addChild("fore3", ModelPartBuilder.create().uv(0, 0).cuboid(-0.475F, -0.06F, -0.05F, 0.5F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.pivot(-0.4F, 0.1F, 0.0F));

		ModelPartData b_l = legs.addChild("b_l", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData arm4 = b_l.addChild("arm4", ModelPartBuilder.create(), ModelTransform.pivot(-0.532F, 0.1328F, -0.1362F));

		ModelPartData arm_r4 = arm4.addChild("arm_r4", ModelPartBuilder.create().uv(0, 0).cuboid(-0.06F, -0.06F, -0.46F, 0.1F, 0.1F, 0.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData fore4 = arm4.addChild("fore4", ModelPartBuilder.create().uv(0, 0).cuboid(0.0011F, -0.06F, -0.06F, 0.5F, 0.1F, 0.1F, new Dilation(0.0F)), ModelTransform.pivot(0.45F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 16, 16);
	}
	@Override
	public void setAngles(WaterCreatureEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	public static final Animation OLM_LAND_IDLE = Animation.Builder.create(0f).looping().addBoneAnimation("gil_r",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(-35f, 35f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("gil_l",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(-35f, -35f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("arm",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, -70f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("fore",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 150f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("arm2",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 70f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("fore2",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, NaNf, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("arm3",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, -77.5f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("fore3",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 152.5f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("arm4",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 77.5f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("fore4",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, -152.5f, 0f),Transformation.Interpolations.LINEAR))).build();
	public static final Animation OLM_WATER_IDLE = Animation.Builder.create(2f).looping().addBoneAnimation("gil_r",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),Transformation.Interpolations.LINEAR),new Keyframe(1f, AnimationHelper.createRotationalVector(-10f, 10f, 0f),Transformation.Interpolations.LINEAR),new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("gil_l",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 0f, 0f),Transformation.Interpolations.LINEAR),new Keyframe(1f, AnimationHelper.createRotationalVector(-10f, -10f, 0f),Transformation.Interpolations.LINEAR),new Keyframe(2f, AnimationHelper.createRotationalVector(0f, 0f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("arm",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, -60f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("fore",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 140f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("arm2",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 60f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("fore2",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, -140f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("arm3",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, -67.5f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("fore3",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 142.5f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("arm4",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, 67.5f, 0f),Transformation.Interpolations.LINEAR))).addBoneAnimation("fore4",new Transformation(Transformation.Targets.ROTATE,new Keyframe(0f, AnimationHelper.createRotationalVector(0f, -142.5f, 0f),Transformation.Interpolations.LINEAR))).build();
}