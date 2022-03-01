// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class never.icewyvern<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "never.icewyvern"), "main");
	private final ModelPart root;

	public never.icewyvern(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition BodyUpper = root.addOrReplaceChild("BodyUpper", CubeListBuilder.create().texOffs(67, 47).addBox(-3.0F, -1.8F, 0.0F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.6F, -10.0F, 0.0911F, 0.0F, 0.0F));

		PartDefinition BodyLower = BodyUpper.addOrReplaceChild("BodyLower", CubeListBuilder.create().texOffs(93, 47).addBox(-3.5F, -1.5F, 0.0F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.7F, -0.0911F, 0.0F, 0.0F));

		PartDefinition Tail1 = BodyLower.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(75, 35).addBox(-2.0F, -2.0F, 1.0F, 4.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8F, 5.5F, -0.0911F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(95, 33).addBox(-1.49F, -1.6F, 0.9F, 3.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 5.8F, -0.1367F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(72, 21).addBox(-1.5F, -1.3F, 0.9F, 3.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1F, 7.7F, 0.0911F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(94, 20).addBox(-1.0F, -0.9F, 1.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 8.6F));

		PartDefinition spike16 = Tail4.addOrReplaceChild("spike16", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 3.8F, 0.6829F, 0.0F, 0.0F));

		PartDefinition spike17 = Tail4.addOrReplaceChild("spike17", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 7.3F, 0.5918F, 0.0F, 0.0F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(94, 9).addBox(-1.01F, -0.9F, 1.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.6F, 0.182F, 0.0F, 0.0F));

		PartDefinition Club = Tail5.addOrReplaceChild("Club", CubeListBuilder.create().texOffs(42, 17).addBox(-2.0F, -0.4F, 1.0F, 4.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.4F, 7.5F));

		PartDefinition TailFin2 = Club.addOrReplaceChild("TailFin2", CubeListBuilder.create().texOffs(70, 70).addBox(-9.0F, 0.29F, 1.31F, 9.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0873F));

		PartDefinition TailFin1 = Club.addOrReplaceChild("TailFin1", CubeListBuilder.create().texOffs(70, 70).mirror().addBox(0.0F, 0.3F, 1.31F, 9.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.0F, 0.0F, 0.0F, -0.7854F, -0.0873F));

		PartDefinition spike20 = Club.addOrReplaceChild("spike20", CubeListBuilder.create().texOffs(22, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.3643F, 0.0F, 0.0F));

		PartDefinition spike18 = Tail5.addOrReplaceChild("spike18", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 3.8F, 0.6829F, 0.0F, 0.0F));

		PartDefinition spike19 = Tail5.addOrReplaceChild("spike19", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 7.3F, 0.5009F, 0.0F, 0.0F));

		PartDefinition spike13 = Tail3.addOrReplaceChild("spike13", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 2.0F, 0.4554F, 0.0F, 0.0F));

		PartDefinition spike14 = Tail3.addOrReplaceChild("spike14", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 5.5F, 0.5009F, 0.0F, 0.0F));

		PartDefinition spike15 = Tail3.addOrReplaceChild("spike15", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, 8.9F, 0.6374F, 0.0F, 0.0F));

		PartDefinition spike11 = Tail2.addOrReplaceChild("spike11", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2F, 2.3F, 0.5009F, 0.0F, 0.0F));

		PartDefinition spike12 = Tail2.addOrReplaceChild("spike12", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 5.8F, 0.5009F, 0.0F, 0.0F));

		PartDefinition spike10 = Tail1.addOrReplaceChild("spike10", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, 4.6F, 0.5918F, 0.0F, 0.0F));

		PartDefinition spike8 = BodyLower.addOrReplaceChild("spike8", CubeListBuilder.create().texOffs(22, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 2.8F, 0.5463F, 0.0F, 0.0F));

		PartDefinition spike9 = BodyLower.addOrReplaceChild("spike9", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 6.5F, 0.5463F, 0.0F, 0.0F));

		PartDefinition ThighR = BodyLower.addOrReplaceChild("ThighR", CubeListBuilder.create().texOffs(0, 23).addBox(-1.57F, -0.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, 1.6F, 6.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition LegR = ThighR.addOrReplaceChild("LegR", CubeListBuilder.create().texOffs(15, 23).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.3F, 1.9F, -0.3316F, 0.0F, 0.0F));

		PartDefinition ToeR1 = LegR.addOrReplaceChild("ToeR1", CubeListBuilder.create().texOffs(2, 64).addBox(-0.5F, -0.8F, -3.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.1F, 1.0F, 0.4363F, 0.1745F, 0.0F));

		PartDefinition ToeR11 = ToeR1.addOrReplaceChild("ToeR11", CubeListBuilder.create().texOffs(3, 73).mirror().addBox(-0.5F, -0.8F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -2.45F, 0.1745F, 0.0F, 0.0F));

		PartDefinition ToeR2 = LegR.addOrReplaceChild("ToeR2", CubeListBuilder.create().texOffs(2, 64).addBox(-0.5F, -0.8F, -3.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.9F, 0.4F, 0.5236F, 0.0F, 0.0F));

		PartDefinition ToeR21 = ToeR2.addOrReplaceChild("ToeR21", CubeListBuilder.create().texOffs(3, 73).mirror().addBox(-0.5F, -0.8F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -2.45F, 0.1745F, 0.0F, 0.0F));

		PartDefinition ToeR3 = LegR.addOrReplaceChild("ToeR3", CubeListBuilder.create().texOffs(2, 64).addBox(-0.5F, -0.8F, -3.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.1F, 1.0F, 0.4363F, -0.1745F, 0.0F));

		PartDefinition ToeR31 = ToeR3.addOrReplaceChild("ToeR31", CubeListBuilder.create().texOffs(3, 73).mirror().addBox(-0.5F, -0.8F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -2.45F, 0.1745F, 0.0F, 0.0F));

		PartDefinition ThighL = BodyLower.addOrReplaceChild("ThighL", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-1.57F, -0.5F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 1.6F, 6.0F, -0.192F, 0.0F, 0.0F));

		PartDefinition LegL = ThighL.addOrReplaceChild("LegL", CubeListBuilder.create().texOffs(15, 23).mirror().addBox(-1.0F, -0.5F, 0.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.3F, 1.9F, -0.3316F, 0.0F, 0.0F));

		PartDefinition ToeL3 = LegL.addOrReplaceChild("ToeL3", CubeListBuilder.create().texOffs(2, 64).addBox(-0.5F, -0.8F, -3.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 6.1F, 1.0F, 0.4363F, 0.1745F, 0.0F));

		PartDefinition ToeL31 = ToeL3.addOrReplaceChild("ToeL31", CubeListBuilder.create().texOffs(3, 73).addBox(-0.5F, -0.8F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.45F, 0.1745F, 0.0F, 0.0F));

		PartDefinition ToeL2 = LegL.addOrReplaceChild("ToeL2", CubeListBuilder.create().texOffs(2, 64).addBox(-0.5F, -0.8F, -3.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.9F, 0.4F, 0.5236F, 0.0F, 0.0F));

		PartDefinition ToeL21 = ToeL2.addOrReplaceChild("ToeL21", CubeListBuilder.create().texOffs(3, 73).addBox(-0.5F, -0.8F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.45F, 0.1745F, 0.0F, 0.0F));

		PartDefinition ToeL1 = LegL.addOrReplaceChild("ToeL1", CubeListBuilder.create().texOffs(2, 64).addBox(-0.5F, -0.8F, -3.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 6.1F, 1.0F, 0.4363F, -0.1745F, 0.0F));

		PartDefinition ToeL11 = ToeL1.addOrReplaceChild("ToeL11", CubeListBuilder.create().texOffs(3, 73).addBox(-0.5F, -0.8F, -2.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.45F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Neck1 = BodyUpper.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(55, 43).addBox(-2.5F, -2.0F, -5.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 1.8F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(23, 39).addBox(-2.0F, -2.7F, -5.1F, 4.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2F, -4.7F, -0.0463F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(24, 63).addBox(-1.5F, -1.6F, -7.1F, 3.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -4.4F, 0.3217F, 0.0F, 0.0F));

		PartDefinition spike1 = Neck3.addOrReplaceChild("spike1", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, -4.4F, 0.5009F, 0.0F, 0.0F));

		PartDefinition Head = Neck3.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(6, 54).addBox(-2.5F, -2.2F, -4.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -5.5F, 0.3142F, 0.0F, 0.0F));

		PartDefinition HeadFront = Head.addOrReplaceChild("HeadFront", CubeListBuilder.create().texOffs(5, 43).addBox(-2.0F, -1.5F, -5.0F, 4.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.63F, -3.3F, -0.0668F, 0.0F, 0.0F));

		PartDefinition Teeth2 = HeadFront.addOrReplaceChild("Teeth2", CubeListBuilder.create().texOffs(6, 16).mirror().addBox(-1.52F, 2.0F, -5.02F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.4F, -0.7F, 0.1F));

		PartDefinition Teeth1 = HeadFront.addOrReplaceChild("Teeth1", CubeListBuilder.create().texOffs(6, 16).addBox(-0.48F, 2.0F, -5.02F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.4F, -0.7F, 0.1F));

		PartDefinition HornR4 = HeadFront.addOrReplaceChild("HornR4", CubeListBuilder.create().texOffs(71, 36).addBox(-0.5F, 0.0F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.87F, -5.6F, 0.7285F, 0.0F, 0.0F));

		PartDefinition HornR5 = HornR4.addOrReplaceChild("HornR5", CubeListBuilder.create().texOffs(62, 30).mirror().addBox(-0.5F, -0.83F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.77F, 2.5F, -0.3187F, 0.0F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(33, 55).addBox(-2.0F, -0.4F, -5.5F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -3.2F, -0.1244F, 0.0F, 0.0F));

		PartDefinition Teeth3 = Jaw.addOrReplaceChild("Teeth3", CubeListBuilder.create().texOffs(7, 17).mirror().addBox(-1.41F, 0.1F, -5.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.1F, -0.3F, 0.0524F, 0.0F, -3.1416F));

		PartDefinition Teeth4 = Jaw.addOrReplaceChild("Teeth4", CubeListBuilder.create().texOffs(7, 17).addBox(-0.59F, 0.1F, -5.3F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.1F, -0.3F, 0.0524F, 0.0F, -3.1416F));

		PartDefinition HornR = Head.addOrReplaceChild("HornR", CubeListBuilder.create().texOffs(59, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -1.6F, -1.6F, 0.1745F, 0.3316F, -0.192F));

		PartDefinition HornR2 = HornR.addOrReplaceChild("HornR2", CubeListBuilder.create().texOffs(46, 36).addBox(-1.01F, -0.8F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3F, 3.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition HornR3 = HornR2.addOrReplaceChild("HornR3", CubeListBuilder.create().texOffs(55, 30).mirror().addBox(-0.49F, -0.8F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 2.6F, 0.0524F, 0.0F, 0.0F));

		PartDefinition HornL = Head.addOrReplaceChild("HornL", CubeListBuilder.create().texOffs(59, 34).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -1.6F, -1.6F, 0.1745F, -0.3316F, 0.192F));

		PartDefinition HornL2 = HornL.addOrReplaceChild("HornL2", CubeListBuilder.create().texOffs(46, 36).mirror().addBox(-0.99F, -0.8F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.3F, 3.3F, -0.0698F, 0.0F, 0.0F));

		PartDefinition HornL3 = HornL2.addOrReplaceChild("HornL3", CubeListBuilder.create().texOffs(55, 30).mirror().addBox(-0.49F, -0.8F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0F, 2.6F, 0.0524F, 0.0F, 0.0F));

		PartDefinition HornR4 = Head.addOrReplaceChild("HornR4", CubeListBuilder.create().texOffs(36, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8F, -0.1F, -1.8F, -0.1745F, 0.3142F, 0.0F));

		PartDefinition HornR5 = HornR4.addOrReplaceChild("HornR5", CubeListBuilder.create().texOffs(47, 30).mirror().addBox(-0.53F, -0.8F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, 3.6F, 0.0873F, 0.0F, 0.0F));

		PartDefinition HornL4 = Head.addOrReplaceChild("HornL4", CubeListBuilder.create().texOffs(36, 28).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.1F, -1.8F, -0.1745F, -0.3142F, 0.0F));

		PartDefinition HornL5 = HornL4.addOrReplaceChild("HornL5", CubeListBuilder.create().texOffs(47, 30).mirror().addBox(-0.47F, -0.8F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, 3.6F, 0.0873F, 0.0F, 0.0F));

		PartDefinition HornR4 = Head.addOrReplaceChild("HornR4", CubeListBuilder.create().texOffs(59, 34).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -2.1F, -1.8F, 0.3491F, 0.3142F, 0.0F));

		PartDefinition HornR5 = HornR4.addOrReplaceChild("HornR5", CubeListBuilder.create().texOffs(47, 30).mirror().addBox(-0.53F, -0.8F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, 3.6F, 0.0524F, 0.0F, 0.0F));

		PartDefinition HornR4 = Head.addOrReplaceChild("HornR4", CubeListBuilder.create().texOffs(59, 34).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8F, -2.1F, -1.8F, 0.3491F, -0.3142F, 0.0F));

		PartDefinition HornR5 = HornR4.addOrReplaceChild("HornR5", CubeListBuilder.create().texOffs(47, 30).mirror().addBox(-0.53F, -0.8F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.8F, 3.6F, 0.0524F, 0.0F, 0.0F));

		PartDefinition spike2 = Neck3.addOrReplaceChild("spike2", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -1.2F, 0.5918F, 0.0F, 0.0F));

		PartDefinition spike3 = Neck2.addOrReplaceChild("spike3", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, -2.4F, 0.9032F, 0.0F, 0.0F));

		PartDefinition spike4 = Neck1.addOrReplaceChild("spike4", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6F, -4.0F, 0.6829F, 0.0F, 0.0F));

		PartDefinition spike5 = BodyUpper.addOrReplaceChild("spike5", CubeListBuilder.create().texOffs(34, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5F, 1.0F, 0.5918F, 0.0F, 0.0F));

		PartDefinition spike6 = BodyUpper.addOrReplaceChild("spike6", CubeListBuilder.create().texOffs(22, 34).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 3.5F, 0.6374F, 0.0F, 0.0F));

		PartDefinition spike7 = BodyUpper.addOrReplaceChild("spike7", CubeListBuilder.create().texOffs(22, 34).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, 6.5F, 0.5463F, 0.0F, 0.0F));

		PartDefinition armL1 = BodyUpper.addOrReplaceChild("armL1", CubeListBuilder.create().texOffs(170, 31).mirror().addBox(-1.0F, -1.5F, -2.0F, 2.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.3F, -0.7F, 3.0F, 0.1745F, 0.0456F, -1.5359F));

		PartDefinition armL2 = armL1.addOrReplaceChild("armL2", CubeListBuilder.create().texOffs(189, 27).mirror().addBox(-1.0F, -1.5F, -1.4F, 2.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 11.3F, -0.1F, -0.7741F, 0.0F, 0.0F));

		PartDefinition fingerL11 = armL2.addOrReplaceChild("fingerL11", CubeListBuilder.create().texOffs(145, 23).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 19.3F, -0.1F, 0.576F, 0.0F, 0.0F));

		PartDefinition fingerL12 = fingerL11.addOrReplaceChild("fingerL12", CubeListBuilder.create().texOffs(152, 23).mirror().addBox(-0.48F, -0.5F, -1.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 17.4F, 0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition membraneL1 = fingerL11.addOrReplaceChild("membraneL1", CubeListBuilder.create().texOffs(54, 73).mirror().addBox(-0.5F, -1.0F, 0.0F, 0.0F, 33.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.4F, -0.5F, 0.0911F, 0.0F, 0.0F));

		PartDefinition fingerL21 = armL2.addOrReplaceChild("fingerL21", CubeListBuilder.create().texOffs(145, 23).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 18.6F, -0.1F, 1.1383F, 0.0F, 0.0F));

		PartDefinition fingerL22 = fingerL21.addOrReplaceChild("fingerL22", CubeListBuilder.create().texOffs(160, 23).mirror().addBox(-0.48F, -0.5F, -1.0F, 1.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 16.4F, 0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition membraneL2 = fingerL21.addOrReplaceChild("membraneL2", CubeListBuilder.create().texOffs(54, 75).mirror().addBox(-0.5F, -0.5F, 0.0F, 0.0F, 32.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.4F, -0.9F, 0.0911F, 0.0F, 0.0F));

		PartDefinition fingerL31 = armL2.addOrReplaceChild("fingerL31", CubeListBuilder.create().texOffs(145, 23).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2F, 18.3F, -0.1F, 1.7301F, 0.0F, 0.0F));

		PartDefinition fingerL32 = fingerL31.addOrReplaceChild("fingerL32", CubeListBuilder.create().texOffs(151, 52).mirror().addBox(-0.48F, -0.5F, -1.0F, 1.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 15.4F, 0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition membraneL3 = fingerL31.addOrReplaceChild("membraneL3", CubeListBuilder.create().texOffs(54, 77).mirror().addBox(-0.5F, -0.5F, 0.0F, 0.0F, 30.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2F, -1.1F, 0.0911F, 0.0F, 0.0F));

		PartDefinition fingerL41 = armL2.addOrReplaceChild("fingerL41", CubeListBuilder.create().texOffs(145, 23).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 18.3F, -0.1F, 2.322F, 0.0F, 0.0F));

		PartDefinition fingerL42 = fingerL41.addOrReplaceChild("fingerL42", CubeListBuilder.create().texOffs(151, 52).mirror().addBox(-0.48F, -0.5F, -1.0F, 1.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 15.4F, 0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition membraneL4 = fingerL41.addOrReplaceChild("membraneL4", CubeListBuilder.create().texOffs(54, 77).mirror().addBox(-0.5F, -0.5F, 0.0F, 0.0F, 30.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.2F, -1.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition membraneL5 = armL2.addOrReplaceChild("membraneL5", CubeListBuilder.create().texOffs(106, 73).mirror().addBox(-0.5F, -0.5F, 0.0F, 0.0F, 27.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 17.8F, 2.0F, 2.5042F, 0.0F, 0.0F));

		PartDefinition ClawL = armL2.addOrReplaceChild("ClawL", CubeListBuilder.create().texOffs(128, 44).mirror().addBox(-1.7F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 19.0F, -0.1F, 0.0F, -0.6981F, 1.5708F));

		PartDefinition ClawL2 = ClawL.addOrReplaceChild("ClawL2", CubeListBuilder.create().texOffs(128, 52).mirror().addBox(-1.7F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 0.0F, 0.0F));

		PartDefinition ClawL3 = ClawL2.addOrReplaceChild("ClawL3", CubeListBuilder.create().texOffs(128, 61).mirror().addBox(-1.2F, 0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition membraneL6 = armL1.addOrReplaceChild("membraneL6", CubeListBuilder.create().texOffs(156, 82).mirror().addBox(-0.5F, -8.8F, 0.8F, 0.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.57F, -1.9F, 2.5F, -1.457F, 0.0F, 0.0F));

		PartDefinition armR1 = BodyUpper.addOrReplaceChild("armR1", CubeListBuilder.create().texOffs(170, 31).addBox(-1.0F, -1.5F, -2.0F, 2.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.3F, -0.7F, 3.0F, 0.1745F, -0.0456F, 1.5359F));

		PartDefinition armR2 = armR1.addOrReplaceChild("armR2", CubeListBuilder.create().texOffs(189, 27).addBox(-1.0F, -1.5F, -1.4F, 2.0F, 21.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 11.3F, -0.1F, -0.7741F, 0.0F, 0.0F));

		PartDefinition fingerR11 = armR2.addOrReplaceChild("fingerR11", CubeListBuilder.create().texOffs(145, 23).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 19.3F, -0.1F, 0.576F, 0.0F, 0.0F));

		PartDefinition fingerR2 = fingerR11.addOrReplaceChild("fingerR2", CubeListBuilder.create().texOffs(152, 23).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 17.4F, 0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition membraneR1 = fingerR11.addOrReplaceChild("membraneR1", CubeListBuilder.create().texOffs(54, 73).addBox(0.5F, -1.0F, 0.0F, 0.0F, 33.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4F, -0.5F, 0.0911F, 0.0F, 0.0F));

		PartDefinition fingerR21 = armR2.addOrReplaceChild("fingerR21", CubeListBuilder.create().texOffs(145, 23).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 18.6F, -0.1F, 1.1383F, 0.0F, 0.0F));

		PartDefinition fingerR22 = fingerR21.addOrReplaceChild("fingerR22", CubeListBuilder.create().texOffs(160, 23).addBox(-0.52F, -0.5F, -1.0F, 1.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 16.4F, 0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition membraneR2 = fingerR21.addOrReplaceChild("membraneR2", CubeListBuilder.create().texOffs(54, 75).addBox(0.5F, -0.5F, 0.0F, 0.0F, 32.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.4F, -0.9F, 0.0911F, 0.0F, 0.0F));

		PartDefinition fingerR31 = armR2.addOrReplaceChild("fingerR31", CubeListBuilder.create().texOffs(145, 23).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 18.3F, -0.1F, 1.7301F, 0.0F, 0.0F));

		PartDefinition fingerR32 = fingerR31.addOrReplaceChild("fingerR32", CubeListBuilder.create().texOffs(151, 52).addBox(-0.52F, -0.5F, -1.0F, 1.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.4F, 0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition membraneR3 = fingerR31.addOrReplaceChild("membraneR3", CubeListBuilder.create().texOffs(54, 77).addBox(0.5F, -0.5F, 0.0F, 0.0F, 30.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2F, -1.1F, 0.0911F, 0.0F, 0.0F));

		PartDefinition fingerR41 = armR2.addOrReplaceChild("fingerR41", CubeListBuilder.create().texOffs(145, 23).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 18.3F, -0.1F, 2.322F, 0.0F, 0.0F));

		PartDefinition fingerR42 = fingerR41.addOrReplaceChild("fingerR42", CubeListBuilder.create().texOffs(151, 52).addBox(-0.52F, -0.5F, -1.0F, 1.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.4F, 0.1F, 0.1745F, 0.0F, 0.0F));

		PartDefinition membraneR4 = fingerR41.addOrReplaceChild("membraneR4", CubeListBuilder.create().texOffs(54, 77).addBox(0.5F, -0.5F, 0.0F, 0.0F, 30.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2F, -1.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition membraneR5 = armR2.addOrReplaceChild("membraneR5", CubeListBuilder.create().texOffs(106, 73).addBox(0.5F, -0.5F, 0.0F, 0.0F, 27.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 17.8F, 2.0F, 2.5042F, 0.0F, 0.0F));

		PartDefinition ClawR = armR2.addOrReplaceChild("ClawR", CubeListBuilder.create().texOffs(128, 44).mirror().addBox(-1.7F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1F, 19.0F, -0.1F, 3.1416F, -0.6981F, 1.5708F));

		PartDefinition ClawR2 = ClawR.addOrReplaceChild("ClawR2", CubeListBuilder.create().texOffs(128, 52).mirror().addBox(-1.7F, -0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 0.0F, 0.0F));

		PartDefinition ClawR3 = ClawR2.addOrReplaceChild("ClawR3", CubeListBuilder.create().texOffs(128, 61).mirror().addBox(-1.2F, 0.7F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition membraneR6 = armR1.addOrReplaceChild("membraneR6", CubeListBuilder.create().texOffs(156, 82).addBox(0.5F, -8.8F, 0.8F, 0.0F, 11.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.57F, -1.9F, 2.5F, -1.457F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, buffer, packedLight, packedOverlay);
	}
}