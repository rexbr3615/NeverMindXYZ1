// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class stalker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "stalker"), "main");
	private final ModelPart Head;
	private final ModelPart leg3;
	private final ModelPart leg4;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart bb_main;

	public stalker(ModelPart root) {
		this.Head = root.getChild("Head");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -11.0F, -11.0F, 12.0F, 7.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 1.0F, -15.0F, 12.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 4.0F));

		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -1.0F, -3.0F, 6.0F, 26.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, 25.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -1.0F, 0.0F));

		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -3.0F, 6.0F, 26.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0F, 25.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -1.0F, 0.0F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 12.0F, 0.0F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 12.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -27.0F, -4.0F, 10.0F, 15.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -27.0F, 1.0F, 2.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		leg3.render(poseStack, buffer, packedLight, packedOverlay);
		leg4.render(poseStack, buffer, packedLight, packedOverlay);
		leg1.render(poseStack, buffer, packedLight, packedOverlay);
		leg2.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}