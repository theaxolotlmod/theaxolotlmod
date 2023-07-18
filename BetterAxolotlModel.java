// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class better_axolotl extends EntityModel<AxolotlEntity> {
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
	private final ModelPart fore3;
	private final ModelPart b_l;
	private final ModelPart arm4;
	private final ModelPart arm_r3;
	private final ModelPart fore4;
	public better_axolotl(ModelPart root) {
		this.body = root.getChild("body");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.4333F, -0.96F));

		ModelPartData body_tail_r1 = body.addChild("body_tail_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-1.6334F, 0.6667F, 0.0F, 1.6667F, 0.3333F, 0.0F, new Dilation(0.0F))
		.uv(3, 3).cuboid(-1.6333F, 0.0F, -0.5833F, 1.2667F, 0.6667F, 1.1667F, new Dilation(0.0F))
		.uv(0, 2).cuboid(-1.7333F, -0.1F, -0.5333F, 1.4667F, 0.8667F, 1.0667F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-1.9333F, 0.0F, -0.4333F, 1.8667F, 0.6667F, 0.8667F, new Dilation(0.0F))
		.uv(2, 2).cuboid(-2.0333F, 0.1F, -0.3333F, 2.0667F, 0.4667F, 0.6667F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.4333F, 0.96F, 0.0F, -1.5708F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0667F, -1.04F));

		ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(6, 2).cuboid(-3.1333F, 0.15F, -0.3333F, 0.9F, 0.4167F, 0.6667F, new Dilation(0.0F))
		.uv(6, 0).cuboid(-3.0333F, 0.15F, -0.3333F, 1.0F, 0.5167F, 0.6667F, new Dilation(0.0F))
		.uv(5, 3).cuboid(-3.0333F, 0.15F, -0.4083F, 0.7F, 0.4167F, 0.8167F, new Dilation(0.0F))
		.uv(0, 5).cuboid(-2.8333F, 0.125F, -0.4333F, 0.7F, 0.5417F, 0.9167F, new Dilation(0.0F))
		.uv(4, 0).cuboid(-2.7083F, 0.1F, -0.5583F, 0.5F, 0.4667F, 1.1167F, new Dilation(0.0F))
		.uv(4, 5).cuboid(-2.7833F, 0.05F, -0.4833F, 0.6F, 0.5667F, 0.9417F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, 2.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData cube_r2 = head.addChild("cube_r2", ModelPartBuilder.create().uv(0, 7).cuboid(-0.2F, -0.2708F, -0.3333F, 0.7F, 0.6417F, 0.6667F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.1292F, -0.6333F, 0.0F, -1.5708F, 0.0F));

		ModelPartData jaw = head.addChild("jaw", ModelPartBuilder.create().uv(2, 5).cuboid(-0.4F, -0.05F, -0.8F, 0.8F, 0.1F, 0.9F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -0.4F, -0.2F));

		ModelPartData gils = head.addChild("gils", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData gil_r = gils.addChild("gil_r", ModelPartBuilder.create(), ModelTransform.pivot(-0.3333F, -0.1667F, -0.2638F));

		ModelPartData top_gil_r = gil_r.addChild("top_gil_r", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.1667F, 0.0F));

		ModelPartData top_gil_r_plane_r1 = top_gil_r.addChild("top_gil_r_plane_r1", ModelPartBuilder.create().uv(0, 0).cuboid(0.1F, -0.25F, -1.0F, 0.0F, 0.425F, 0.3F, new Dilation(0.0F)), ModelTransform.of(-0.283F, 0.2735F, 0.9F, 0.0F, 0.0F, -0.5672F));

		ModelPartData top_gil_r_r1 = top_gil_r.addChild("top_gil_r_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.1F, -0.25F, -0.1F, 0.2F, 0.5F, 0.2F, new Dilation(0.0F)), ModelTransform.of(-0.183F, 0.2735F, 0.0F, 0.0F, 0.0F, -0.5672F));

		ModelPartData mid_gil_r = gil_r.addChild("mid_gil_r", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0667F, 0.0F));

		ModelPartData mid_gil_r_plane_r1 = mid_gil_r.addChild("mid_gil_r_plane_r1", ModelPartBuilder.create().uv(0, 0).cuboid(0.05F, -0.4125F, -0.15F, 0.0F, 0.4F, 0.3F, new Dilation(0.0F)), ModelTransform.of(-0.4914F, 0.2448F, 0.05F, 0.0F, 0.0F, -1.0472F));

		ModelPartData mid_gil_r_r1 = mid_gil_r.addChild("mid_gil_r_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.4F, -0.15F, -0.1F, 0.2F, 0.4F, 0.2F, new Dilation(0.0F)), ModelTransform.of(-0.0987F, 0.4272F, 0.0F, 0.0F, 0.0F, -1.0472F));

		ModelPartData bot_gil_r = gil_r.addChild("bot_gil_r", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bot_gil_r_plane_r1 = bot_gil_r.addChild("bot_gil_r_plane_r1", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -0.2F, -0.15F, 0.0F, 0.4F, 0.3F, new Dilation(0.0F)), ModelTransform.of(-0.2391F, -0.0071F, 0.05F, 0.0F, 0.0F, -1.309F));

		ModelPartData bot_gil_r_r1 = bot_gil_r.addChild("bot_gil_r_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.6F, -0.15F, -0.1F, 0.2F, 0.4F, 0.2F, new Dilation(0.0F)), ModelTransform.of(-0.0987F, 0.4939F, 0.0F, 0.0F, 0.0F, -1.309F));

		ModelPartData gil_l = gils.addChild("gil_l", ModelPartBuilder.create(), ModelTransform.pivot(0.3333F, -0.1667F, -0.2638F));

		ModelPartData top_gil_l = gil_l.addChild("top_gil_l", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.1667F, 0.0F));

		ModelPartData top_gil_l_plane_r1 = top_gil_l.addChild("top_gil_l_plane_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.1F, -0.25F, -1.0F, 0.0F, 0.425F, 0.3F, new Dilation(0.0F)), ModelTransform.of(0.283F, 0.2735F, 0.9F, 0.0F, 0.0F, 0.5672F));

		ModelPartData top_gil_l_r1 = top_gil_l.addChild("top_gil_l_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.1F, -0.25F, -0.1F, 0.2F, 0.5F, 0.2F, new Dilation(0.0F)), ModelTransform.of(0.183F, 0.2735F, 0.0F, 0.0F, 0.0F, 0.5672F));

		ModelPartData mid_gil_l = gil_l.addChild("mid_gil_l", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0667F, 0.0F));

		ModelPartData mid_gil_l_plane_r1 = mid_gil_l.addChild("mid_gil_l_plane_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.05F, -0.4125F, -0.15F, 0.0F, 0.4F, 0.3F, new Dilation(0.0F)), ModelTransform.of(0.4914F, 0.2448F, 0.05F, 0.0F, 0.0F, 1.0472F));

		ModelPartData mid_gil_l_r1 = mid_gil_l.addChild("mid_gil_l_r1", ModelPartBuilder.create().uv(0, 0).cuboid(0.2F, -0.15F, -0.1F, 0.2F, 0.4F, 0.2F, new Dilation(0.0F)), ModelTransform.of(0.0987F, 0.4272F, 0.0F, 0.0F, 0.0F, 1.0472F));

		ModelPartData bot_gil_l = gil_l.addChild("bot_gil_l", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bot_gil_l_plane_r1 = bot_gil_l.addChild("bot_gil_l_plane_r1", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -0.2F, -0.15F, 0.0F, 0.4F, 0.3F, new Dilation(0.0F)), ModelTransform.of(0.2391F, -0.0071F, 0.05F, 0.0F, 0.0F, 1.309F));

		ModelPartData bot_gil_l_r1 = bot_gil_l.addChild("bot_gil_l_r1", ModelPartBuilder.create().uv(0, 0).cuboid(0.4F, -0.15F, -0.1F, 0.2F, 0.4F, 0.2F, new Dilation(0.0F)), ModelTransform.of(0.0987F, 0.4939F, 0.0F, 0.0F, 0.0F, 1.309F));

		ModelPartData tail = body.addChild("tail", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -0.4333F, 0.96F));

		ModelPartData wide_tail2_r1 = tail.addChild("wide_tail2_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.2F, -0.25F, -0.4F, 0.4F, 0.3F, 0.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.25F, 1.6F, -0.0873F, 0.0F, 0.0F));

		ModelPartData wide_tail1_r1 = tail.addChild("wide_tail1_r1", ModelPartBuilder.create().uv(0, 4).cuboid(-0.3F, -0.2F, -0.65F, 0.6F, 0.4F, 1.3F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.3F, 0.65F, -0.0873F, 0.0F, 0.0F));

		ModelPartData tail_top_r1 = tail.addChild("tail_top_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.0334F, 0.6667F, 0.0F, 1.3667F, 0.3333F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.0333F, 0.3333F, 0.0F, 2.3667F, 0.3333F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.3333F, -0.1333F, 0.0F, 2.6667F, 0.1333F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(0.0F, 0.0F, 0.0F, 2.6667F, 0.3333F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData legs = body.addChild("legs", ModelPartBuilder.create(), ModelTransform.pivot(0.932F, -0.4561F, 0.6962F));

		ModelPartData f_l = legs.addChild("f_l", ModelPartBuilder.create(), ModelTransform.pivot(-0.2559F, 0.0287F, -1.2094F));

		ModelPartData arm = f_l.addChild("arm", ModelPartBuilder.create(), ModelTransform.pivot(-0.1761F, 0.0041F, -0.125F));

		ModelPartData arm_r1 = arm.addChild("arm_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-0.1018F, -0.11F, -0.6029F, 0.2F, 0.2F, 0.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData fore = arm.addChild("fore", ModelPartBuilder.create().uv(0, 0).cuboid(0.0011F, -0.11F, -0.1F, 0.6F, 0.2F, 0.2F, new Dilation(0.0F)), ModelTransform.pivot(0.6F, 0.0F, 0.0F));

		ModelPartData f_r = legs.addChild("f_r", ModelPartBuilder.create(), ModelTransform.pivot(-1.6081F, 0.0287F, -1.2094F));

		ModelPartData arm2 = f_r.addChild("arm2", ModelPartBuilder.create(), ModelTransform.pivot(0.1761F, 0.0041F, -0.125F));

		ModelPartData arm_r2 = arm2.addChild("arm_r2", ModelPartBuilder.create().uv(0, 0).cuboid(-0.0982F, -0.11F, -0.0029F, 0.2F, 0.2F, 0.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData fore2 = arm2.addChild("fore2", ModelPartBuilder.create().uv(0, 0).cuboid(-0.6011F, -0.11F, -0.1F, 0.6F, 0.2F, 0.2F, new Dilation(0.0F)), ModelTransform.pivot(-0.6F, 0.0F, 0.0F));

		ModelPartData b_r = legs.addChild("b_r", ModelPartBuilder.create(), ModelTransform.pivot(-1.864F, 0.0F, 0.0F));

		ModelPartData arm3 = b_r.addChild("arm3", ModelPartBuilder.create().uv(0, 0).cuboid(-0.6289F, -0.1208F, -0.0637F, 0.6F, 0.2F, 0.2F, new Dilation(0.0F)), ModelTransform.pivot(0.432F, 0.0328F, -0.1362F));

		ModelPartData fore3 = arm3.addChild("fore3", ModelPartBuilder.create().uv(0, 0).cuboid(-0.625F, -0.2256F, -0.0715F, 0.6F, 0.2F, 0.2F, new Dilation(0.0F)), ModelTransform.pivot(-0.6F, 0.09F, 0.0F));

		ModelPartData b_l = legs.addChild("b_l", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData arm4 = b_l.addChild("arm4", ModelPartBuilder.create(), ModelTransform.pivot(-0.432F, 0.0328F, -0.1362F));

		ModelPartData arm_r3 = arm4.addChild("arm_r3", ModelPartBuilder.create().uv(0, 0).cuboid(-0.1018F, -0.1208F, -0.6387F, 0.2F, 0.2F, 0.6F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData fore4 = arm4.addChild("fore4", ModelPartBuilder.create().uv(0, 0).cuboid(0.035F, -0.13F, -0.11F, 0.6F, 0.2F, 0.2F, new Dilation(0.0F)), ModelTransform.pivot(0.6F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 16, 16);
	}
	@Override
	public void setAngles(AxolotlEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}