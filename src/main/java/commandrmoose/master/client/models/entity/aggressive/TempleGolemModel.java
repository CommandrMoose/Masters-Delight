package commandrmoose.master.client.models.entity.aggressive;// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import commandrmoose.master.entity.aggressive.TempleGolemEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;

public class TempleGolemModel extends EntityModel<TempleGolemEntity> {
	private final RendererModel golem;
	private final RendererModel bottom_anvil;
	private final RendererModel cauldron_upwards_rotate;
	private final RendererModel above_cauldron_rotation;
	private final RendererModel top_anvil;
	private final RendererModel left_arm;
	private final RendererModel left_entire_lower_part;
	private final RendererModel left_lower;
	private final RendererModel left_upper;
	private final RendererModel left_hopper;
	private final RendererModel right_arm;
	private final RendererModel right_entire_lower_part;
	private final RendererModel right_upper;
	private final RendererModel right_lower;
	private final RendererModel pole;
	private final RendererModel anvil_tip;
	private final RendererModel fence;
	private final RendererModel right_hopper;
	private final RendererModel head;
	private final RendererModel cauldron;

	public TempleGolemModel() {
		textureWidth = 256;
		textureHeight = 256;

		golem = new RendererModel(this);
		golem.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bottom_anvil = new RendererModel(this);
		bottom_anvil.setRotationPoint(6.0F, -4.0F, -6.0F);
		golem.addChild(bottom_anvil);
		bottom_anvil.cubeList.add(new ModelBox(bottom_anvil, 0, 85, -12.0F, 0.0F, 0.0F, 12, 4, 12, 0.0F, false));
		bottom_anvil.cubeList.add(new ModelBox(bottom_anvil, 97, 22, -11.0F, -1.0F, 2.0F, 10, 1, 8, 0.0F, false));
		bottom_anvil.cubeList.add(new ModelBox(bottom_anvil, 36, 119, -10.0F, -6.0F, 4.0F, 8, 5, 4, 0.0F, false));
		bottom_anvil.cubeList.add(new ModelBox(bottom_anvil, 6, 48, -14.0F, -12.0F, 1.0F, 16, 6, 10, 0.0F, false));

		cauldron_upwards_rotate = new RendererModel(this);
		cauldron_upwards_rotate.setRotationPoint(0.0F, -16.0F, 0.0F);
		golem.addChild(cauldron_upwards_rotate);
		

		above_cauldron_rotation = new RendererModel(this);
		above_cauldron_rotation.setRotationPoint(0.0F, -16.0F, 0.0F);
		cauldron_upwards_rotate.addChild(above_cauldron_rotation);
		setRotationAngle(above_cauldron_rotation, 0.0F, 0.0F, 0.0F);
		

		top_anvil = new RendererModel(this);
		top_anvil.setRotationPoint(0.0F, 0.0F, 0.0F);
		above_cauldron_rotation.addChild(top_anvil);
		top_anvil.cubeList.add(new ModelBox(top_anvil, 0, 85, -6.0F, -4.0F, -6.0F, 12, 4, 12, 0.0F, false));
		top_anvil.cubeList.add(new ModelBox(top_anvil, 97, 22, -5.0F, -5.0F, -4.0F, 10, 1, 8, 0.0F, false));
		top_anvil.cubeList.add(new ModelBox(top_anvil, 36, 119, -4.0F, -10.0F, -2.0F, 8, 5, 4, 0.0F, false));
		top_anvil.cubeList.add(new ModelBox(top_anvil, 6, 48, -8.0F, -16.0F, -5.0F, 16, 6, 10, 0.0F, false));

		left_arm = new RendererModel(this);
		left_arm.setRotationPoint(16.0F, -17.0F, 0.0F);
		above_cauldron_rotation.addChild(left_arm);
		

		left_entire_lower_part = new RendererModel(this);
		left_entire_lower_part.setRotationPoint(0.0F, 17.0F, 0.0F);
		left_arm.addChild(left_entire_lower_part);
		

		left_lower = new RendererModel(this);
		left_lower.setRotationPoint(0.0F, 16.0F, 0.0F);
		left_entire_lower_part.addChild(left_lower);
		left_lower.cubeList.add(new ModelBox(left_lower, 87, 87, -4.0F, 0.0F, -4.0F, 8, 16, 8, 0.0F, false));

		left_upper = new RendererModel(this);
		left_upper.setRotationPoint(0.0F, 0.0F, 0.0F);
		left_entire_lower_part.addChild(left_upper);
		left_upper.cubeList.add(new ModelBox(left_upper, 0, 101, -4.0F, 0.0F, -4.0F, 8, 16, 8, 0.0F, false));

		left_hopper = new RendererModel(this);
		left_hopper.setRotationPoint(0.0F, 0.0F, 0.0F);
		left_arm.addChild(left_hopper);
		left_hopper.cubeList.add(new ModelBox(left_hopper, 0, 8, -2.0F, 13.0F, -2.0F, 4, 4, 4, 0.0F, false));
		left_hopper.cubeList.add(new ModelBox(left_hopper, 72, 15, -4.0F, 7.0F, -4.0F, 8, 6, 8, 0.0F, false));
		left_hopper.cubeList.add(new ModelBox(left_hopper, 0, 68, -8.0F, 6.0F, -8.0F, 16, 1, 16, 0.0F, false));
		left_hopper.cubeList.add(new ModelBox(left_hopper, 93, 112, -8.0F, 1.0F, -8.0F, 16, 5, 2, 0.0F, false));
		left_hopper.cubeList.add(new ModelBox(left_hopper, 72, 53, -8.0F, 1.0F, 6.0F, 16, 5, 2, 0.0F, false));
		left_hopper.cubeList.add(new ModelBox(left_hopper, 102, 35, 6.0F, 1.0F, -6.0F, 2, 5, 12, 0.0F, false));
		left_hopper.cubeList.add(new ModelBox(left_hopper, 0, 125, -8.0F, 1.0F, -6.0F, 2, 5, 12, 0.0F, false));
		left_hopper.cubeList.add(new ModelBox(left_hopper, 72, 0, -7.0F, 0.0F, -7.0F, 14, 1, 14, 0.0F, false));

		right_arm = new RendererModel(this);
		right_arm.setRotationPoint(-16.0F, -17.0F, 0.0F);
		above_cauldron_rotation.addChild(right_arm);
		

		right_entire_lower_part = new RendererModel(this);
		right_entire_lower_part.setRotationPoint(0.0F, 17.0F, 0.0F);
		right_arm.addChild(right_entire_lower_part);
		

		right_upper = new RendererModel(this);
		right_upper.setRotationPoint(0.0F, 0.0F, 0.0F);
		right_entire_lower_part.addChild(right_upper);
		right_upper.cubeList.add(new ModelBox(right_upper, 0, 101, -4.0F, 0.0F, -4.0F, 8, 16, 8, 0.0F, false));

		right_lower = new RendererModel(this);
		right_lower.setRotationPoint(-1.0F, 16.0F, 0.0F);
		right_entire_lower_part.addChild(right_lower);
		right_lower.cubeList.add(new ModelBox(right_lower, 87, 87, -3.0F, 0.0F, -4.0F, 8, 16, 8, 0.0F, false));

		pole = new RendererModel(this);
		pole.setRotationPoint(17.0F, 12.0F, 28.0F);
		right_lower.addChild(pole);
		

		anvil_tip = new RendererModel(this);
		anvil_tip.setRotationPoint(-10.0F, -4.0F, -72.0F);
		pole.addChild(anvil_tip);
		setRotationAngle(anvil_tip, 1.5708F, 0.0F, 1.5708F);
		anvil_tip.cubeList.add(new ModelBox(anvil_tip, 0, 85, -6.0F, 0.0F, -12.0F, 12, 4, 12, 0.0F, false));
		anvil_tip.cubeList.add(new ModelBox(anvil_tip, 97, 22, -5.0F, -1.0F, -10.0F, 10, 1, 8, 0.0F, false));
		anvil_tip.cubeList.add(new ModelBox(anvil_tip, 36, 119, -4.0F, -6.0F, -8.0F, 8, 5, 4, 0.0F, false));
		anvil_tip.cubeList.add(new ModelBox(anvil_tip, 6, 48, -8.0F, -12.0F, -11.0F, 16, 6, 10, 0.0F, false));

		fence = new RendererModel(this);
		fence.setRotationPoint(-14.0F, -2.0F, -33.0F);
		pole.addChild(fence);
		fence.cubeList.add(new ModelBox(fence, 0, 0, -4.0F, -4.0F, -35.0F, 4, 4, 64, 0.0F, false));

		right_hopper = new RendererModel(this);
		right_hopper.setRotationPoint(-16.0F, 49.0F, 0.0F);
		right_arm.addChild(right_hopper);
		right_hopper.cubeList.add(new ModelBox(right_hopper, 0, 8, 14.0F, -36.0F, -2.0F, 4, 4, 4, 0.0F, false));
		right_hopper.cubeList.add(new ModelBox(right_hopper, 72, 15, 12.0F, -42.0F, -4.0F, 8, 6, 8, 0.0F, false));
		right_hopper.cubeList.add(new ModelBox(right_hopper, 0, 68, 8.0F, -43.0F, -8.0F, 16, 1, 16, 0.0F, false));
		right_hopper.cubeList.add(new ModelBox(right_hopper, 93, 112, 8.0F, -48.0F, -8.0F, 16, 5, 2, 0.0F, false));
		right_hopper.cubeList.add(new ModelBox(right_hopper, 72, 53, 8.0F, -48.0F, 6.0F, 16, 5, 2, 0.0F, false));
		right_hopper.cubeList.add(new ModelBox(right_hopper, 102, 35, 22.0F, -48.0F, -6.0F, 2, 5, 12, 0.0F, false));
		right_hopper.cubeList.add(new ModelBox(right_hopper, 0, 125, 8.0F, -48.0F, -6.0F, 2, 5, 12, 0.0F, false));
		right_hopper.cubeList.add(new ModelBox(right_hopper, 72, 0, 9.0F, -49.0F, -7.0F, 14, 1, 14, 0.0F, false));

		head = new RendererModel(this);
		head.setRotationPoint(0.0F, -16.0F, 0.0F);
		above_cauldron_rotation.addChild(head);
		head.cubeList.add(new ModelBox(head, 0, 0, -8.0F, -16.0F, -8.0F, 16, 16, 16, 0.0F, false));

		cauldron = new RendererModel(this);
		cauldron.setRotationPoint(0.0F, 0.0F, 0.0F);
		cauldron_upwards_rotate.addChild(cauldron);
		cauldron.cubeList.add(new ModelBox(cauldron, 48, 42, -8.0F, -3.0F, -6.0F, 2, 3, 2, 0.0F, false));
		cauldron.cubeList.add(new ModelBox(cauldron, 48, 37, -8.0F, -3.0F, -8.0F, 2, 3, 2, 0.0F, false));
		cauldron.cubeList.add(new ModelBox(cauldron, 48, 32, -6.0F, -3.0F, -8.0F, 2, 3, 2, 0.0F, false));
		cauldron.cubeList.add(new ModelBox(cauldron, 48, 10, 6.0F, -3.0F, -8.0F, 2, 3, 2, 0.0F, false));
		cauldron.cubeList.add(new ModelBox(cauldron, 64, 68, -8.0F, -4.0F, -8.0F, 16, 1, 16, 0.0F, false));
		cauldron.cubeList.add(new ModelBox(cauldron, 35, 103, -8.0F, -16.0F, -8.0F, 16, 12, 2, 0.0F, false));
		cauldron.cubeList.add(new ModelBox(cauldron, 49, 86, -8.0F, -16.0F, 6.0F, 16, 12, 2, 0.0F, false));
		cauldron.cubeList.add(new ModelBox(cauldron, 72, 29, 6.0F, -16.0F, -6.0F, 2, 12, 12, 0.0F, false));
		cauldron.cubeList.add(new ModelBox(cauldron, 64, 109, -8.0F, -16.0F, -6.0F, 2, 12, 12, 0.0F, false));
		cauldron.cubeList.add(new ModelBox(cauldron, 0, 42, 6.0F, -3.0F, 6.0F, 2, 3, 2, 0.0F, false));
		cauldron.cubeList.add(new ModelBox(cauldron, 8, 32, -6.0F, -3.0F, 6.0F, 2, 3, 2, 0.0F, false));
		cauldron.cubeList.add(new ModelBox(cauldron, 8, 37, 6.0F, -3.0F, 4.0F, 2, 3, 2, 0.0F, false));
		cauldron.cubeList.add(new ModelBox(cauldron, 48, 5, 6.0F, -3.0F, -6.0F, 2, 3, 2, 0.0F, false));
		cauldron.cubeList.add(new ModelBox(cauldron, 48, 0, 4.0F, -3.0F, -8.0F, 2, 3, 2, 0.0F, false));
		cauldron.cubeList.add(new ModelBox(cauldron, 8, 42, 4.0F, -3.0F, 6.0F, 2, 3, 2, 0.0F, false));
		cauldron.cubeList.add(new ModelBox(cauldron, 0, 37, -8.0F, -3.0F, 6.0F, 2, 3, 2, 0.0F, false));
		cauldron.cubeList.add(new ModelBox(cauldron, 0, 32, -8.0F, -3.0F, 4.0F, 2, 3, 2, 0.0F, false));
	}

	@Override
	public void render(TempleGolemEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		golem.render(f5);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}