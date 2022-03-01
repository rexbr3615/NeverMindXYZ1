// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class never.voidvenator<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "never.voidvenator"), "main");
	private final ModelPart Head;
	private final ModelPart spine;
	private final ModelPart tail1;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart bb_main;

	public never.voidvenator(ModelPart root) {
		this.Head = root.getChild("Head");
		this.spine = root.getChild("spine");
		this.tail1 = root.getChild("tail1");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(114, 7).addBox(-2.0F, 1.0F, 0.0F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(37, 14).addBox(-3.0F, 0.0F, -9.0F, 6.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, -8.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(0, 45).addBox(-3.0F, -2.0F, -9.0F, 6.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition spine = partdefinition.addOrReplaceChild("spine", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(60, 0).addBox(-3.0F, -0.5F, 0.0F, 6.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, -5.0F));

		PartDefinition tail1 = partdefinition.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 23).addBox(0.0F, -4.0F, 7.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(0.0F, -4.0F, 11.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(25, 30).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.0F, 9.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 23).addBox(0.0F, -5.0F, 1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(0.0F, -5.0F, 4.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(0.0F, -5.0F, 7.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(0.0F, -5.0F, 10.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(0.0F, -5.0F, 13.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(0.0F, -5.0F, 16.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 22).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 5.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 15.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 23).addBox(0.0F, -4.0F, 1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 18.0F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(106, 0).addBox(0.0F, -1.0F, -2.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 23.0F, -5.0F));

		PartDefinition 11 = leg1.addOrReplaceChild("11", CubeListBuilder.create().texOffs(9, 42).addBox(0.0F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -0.5F, -1.5F));

		PartDefinition 2 = leg1.addOrReplaceChild("2", CubeListBuilder.create().texOffs(9, 42).addBox(0.0F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -0.5F, -0.5F));

		PartDefinition 3 = leg1.addOrReplaceChild("3", CubeListBuilder.create().texOffs(9, 42).addBox(0.0F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -0.5F, 0.5F));

		PartDefinition 4 = leg1.addOrReplaceChild("4", CubeListBuilder.create().texOffs(9, 42).addBox(0.0F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -0.5F, 1.5F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(106, 0).addBox(-7.0F, -1.0F, -2.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 23.0F, -5.0F));

		PartDefinition 5 = leg2.addOrReplaceChild("5", CubeListBuilder.create().texOffs(9, 42).addBox(-9.0F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -0.5F, -1.5F));

		PartDefinition 6 = leg2.addOrReplaceChild("6", CubeListBuilder.create().texOffs(9, 42).addBox(-9.0F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -0.5F, -0.5F));

		PartDefinition 7 = leg2.addOrReplaceChild("7", CubeListBuilder.create().texOffs(9, 42).addBox(-9.0F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -0.5F, 0.5F));

		PartDefinition 8 = leg2.addOrReplaceChild("8", CubeListBuilder.create().texOffs(9, 42).addBox(-9.0F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -0.5F, 1.5F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -5.0F, -8.0F, 6.0F, 5.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		spine.render(poseStack, buffer, packedLight, packedOverlay);
		tail1.render(poseStack, buffer, packedLight, packedOverlay);
		leg1.render(poseStack, buffer, packedLight, packedOverlay);
		leg2.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}