// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class mitryl<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "mitryl"), "main");
	private final ModelPart tail1;
	private final ModelPart neck1;
	private final ModelPart bb_main;

	public mitryl(ModelPart root) {
		this.tail1 = root.getChild("tail1");
		this.neck1 = root.getChild("neck1");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition tail1 = partdefinition.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(64, 0).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.0F, 7.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(46, 28).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 13.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 60).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 16.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(22, 40).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 15.0F));

		PartDefinition end1 = tail4.addOrReplaceChild("end1", CubeListBuilder.create().texOffs(0, 20).addBox(-13.0F, 0.0F, -1.0F, 13.0F, 0.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.0F));

		PartDefinition end2 = tail4.addOrReplaceChild("end2", CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F, 0.0F, -1.0F, 13.0F, 0.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(13.0F, 0.0F, 1.0F));

		PartDefinition swing1 = tail1.addOrReplaceChild("swing1", CubeListBuilder.create().texOffs(32, 14).addBox(0.0F, 0.0F, -4.0F, 9.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.0F, 12.0F));

		PartDefinition swing2 = tail1.addOrReplaceChild("swing2", CubeListBuilder.create().texOffs(32, 0).addBox(-9.0F, 0.0F, -4.0F, 9.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 0.0F, 12.0F));

		PartDefinition neck1 = partdefinition.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(25, 67).addBox(-2.0F, -2.0F, -11.0F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.0F, -7.0F));

		PartDefinition head = neck1.addOrReplaceChild("head", CubeListBuilder.create().texOffs(55, 68).addBox(-2.5F, -1.5F, -7.0F, 5.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, -11.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(64, 18).addBox(-2.5F, 0.0F, -7.0F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition hair1 = head.addOrReplaceChild("hair1", CubeListBuilder.create().texOffs(86, 97).addBox(0.0F, -1.0F, -1.0F, 0.0F, 10.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition hair2 = head.addOrReplaceChild("hair2", CubeListBuilder.create().texOffs(86, 97).addBox(0.0F, -1.0F, -1.0F, 0.0F, 10.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(52, 48).addBox(-3.0F, -6.0F, -7.0F, 6.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		tail1.render(poseStack, buffer, packedLight, packedOverlay);
		neck1.render(poseStack, buffer, packedLight, packedOverlay);
		bb_main.render(poseStack, buffer, packedLight, packedOverlay);
	}
}