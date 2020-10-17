package commandrmoose.master.client.models.tile;// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import commandrmoose.master.tiles.BrokenEngineTile;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;

public class BrokenEngineModel extends EntityModel {
	private final RendererModel glow;
	private final RendererModel rotorglow1;
	private final RendererModel rotorglow2;
	private final RendererModel rotorglow4;
	private final RendererModel rotorglow5;
	private final RendererModel rotorglow3;
	private final RendererModel basiccubes;
	private final RendererModel compartmentoutline;
	private final RendererModel cross;
	private final RendererModel rotorstand;
	private final RendererModel rotorstand1;
	private final RendererModel rotorstand2;
	private final RendererModel rotorstand3;
	private final RendererModel door1_rotate_y;
	private final RendererModel door2_rotate_y;
	private final RendererModel door3_rotate_y;
	private final RendererModel door4_rotate_y;
	private final RendererModel basiccubes2;

	public BrokenEngineModel() {
		textureWidth = 128;
		textureHeight = 128;

		glow = new RendererModel(this);
		glow.setRotationPoint(0.0F, -2.0F, 0.0F);
		glow.cubeList.add(new ModelBox(glow, 0, 62, -6.0F, -16.0F, -6.0F, 12, 7, 12, 0.0F, false));

		rotorglow1 = new RendererModel(this);
		rotorglow1.setRotationPoint(0.0F, 26.0F, 0.0F);
		glow.addChild(rotorglow1);
		

		rotorglow2 = new RendererModel(this);
		rotorglow2.setRotationPoint(0.0F, 26.0F, 0.0F);
		glow.addChild(rotorglow2);
		setRotationAngle(rotorglow2, 0.0F, -1.0472F, 0.0F);
		rotorglow2.cubeList.add(new ModelBox(rotorglow2, 48, 22, -0.5F, -30.5F, 4.0F, 1, 9, 1, 0.0F, false));

		rotorglow4 = new RendererModel(this);
		rotorglow4.setRotationPoint(4.75F, 4.25F, -2.75F);
		glow.addChild(rotorglow4);
		setRotationAngle(rotorglow4, 0.2182F, -1.0472F, 0.0F);
		rotorglow4.cubeList.add(new ModelBox(rotorglow4, 48, 22, -0.5F, -4.5F, -0.5F, 1, 9, 1, 0.0F, false));

		rotorglow5 = new RendererModel(this);
		rotorglow5.setRotationPoint(-1.25F, 8.5F, -0.25F);
		glow.addChild(rotorglow5);
		setRotationAngle(rotorglow5, 0.2182F, -1.0472F, 1.309F);
		rotorglow5.cubeList.add(new ModelBox(rotorglow5, 48, 22, -0.5F, -4.5F, -0.5F, 1, 9, 1, 0.0F, false));

		rotorglow3 = new RendererModel(this);
		rotorglow3.setRotationPoint(0.0F, 26.0F, 0.0F);
		glow.addChild(rotorglow3);
		setRotationAngle(rotorglow3, 0.0F, -2.0944F, 0.0F);
		rotorglow3.cubeList.add(new ModelBox(rotorglow3, 12, 22, -0.5F, -24.5F, -5.0F, 1, 3, 1, 0.0F, false));
		rotorglow3.cubeList.add(new ModelBox(rotorglow3, 48, 22, -0.5F, -23.5F, 4.0F, 1, 2, 1, 0.0F, false));

		basiccubes = new RendererModel(this);
		basiccubes.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		compartmentoutline = new RendererModel(this);
		compartmentoutline.setRotationPoint(0.0F, 24.0F, 0.0F);
		compartmentoutline.cubeList.add(new ModelBox(compartmentoutline, 48, 0, -6.5F, -15.0F, -6.5F, 3, 8, 3, 0.0F, false));
		compartmentoutline.cubeList.add(new ModelBox(compartmentoutline, 0, 22, -6.5F, -15.0F, 3.5F, 3, 8, 3, 0.0F, false));
		compartmentoutline.cubeList.add(new ModelBox(compartmentoutline, 42, 44, 3.5F, -15.0F, -6.5F, 3, 8, 3, 0.0F, false));
		compartmentoutline.cubeList.add(new ModelBox(compartmentoutline, 0, 44, 3.5F, -15.0F, 3.5F, 3, 8, 3, 0.0F, false));
		compartmentoutline.cubeList.add(new ModelBox(compartmentoutline, 58, 37, -7.0F, -7.0F, -7.0F, 14, 1, 14, 0.0F, false));
		compartmentoutline.cubeList.add(new ModelBox(compartmentoutline, 39, 79, -4.5F, -16.0F, -4.5F, 9, 10, 9, 0.0F, false));
		compartmentoutline.cubeList.add(new ModelBox(compartmentoutline, 65, 65, -6.5F, -16.0F, -6.5F, 13, 1, 13, 0.0F, false));

		cross = new RendererModel(this);
		cross.setRotationPoint(0.0F, -11.0F, 0.0F);
		compartmentoutline.addChild(cross);
		setRotationAngle(cross, 0.0F, -0.7854F, 0.0F);
		cross.cubeList.add(new ModelBox(cross, 36, 44, -0.5F, -4.8F, -10.0F, 1, 10, 20, 0.0F, false));
		cross.cubeList.add(new ModelBox(cross, 75, 79, -10.0F, -4.8F, -0.5F, 20, 10, 1, 0.0F, false));

		rotorstand = new RendererModel(this);
		rotorstand.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		rotorstand1 = new RendererModel(this);
		rotorstand1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rotorstand.addChild(rotorstand1);
		rotorstand1.cubeList.add(new ModelBox(rotorstand1, 8, 33, -1.0F, -18.0F, -5.5F, 2, 1, 2, 0.0F, false));
		rotorstand1.cubeList.add(new ModelBox(rotorstand1, 0, 33, -1.0F, -18.0F, 3.5F, 2, 1, 2, 0.0F, false));
		rotorstand1.cubeList.add(new ModelBox(rotorstand1, 8, 9, -1.0F, -34.75F, -5.5F, 2, 3, 2, 0.0F, false));
		rotorstand1.cubeList.add(new ModelBox(rotorstand1, 48, 11, -0.5F, -31.5F, -5.0F, 1, 2, 1, 0.25F, false));

		rotorstand2 = new RendererModel(this);
		rotorstand2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rotorstand.addChild(rotorstand2);
		setRotationAngle(rotorstand2, 0.0F, -1.0472F, 0.0F);
		rotorstand2.cubeList.add(new ModelBox(rotorstand2, 8, 33, -1.0F, -18.0F, -5.5F, 2, 1, 2, 0.0F, false));
		rotorstand2.cubeList.add(new ModelBox(rotorstand2, 0, 33, -1.0F, -18.0F, 3.5F, 2, 1, 2, 0.0F, false));
		rotorstand2.cubeList.add(new ModelBox(rotorstand2, 0, 9, -1.0F, -34.75F, 3.5F, 2, 3, 2, 0.0F, false));
		rotorstand2.cubeList.add(new ModelBox(rotorstand2, 48, 32, -0.5F, -21.25F, 4.0F, 1, 3, 1, 0.25F, false));
		rotorstand2.cubeList.add(new ModelBox(rotorstand2, 9, 44, -0.5F, -31.5F, 4.0F, 1, 2, 1, 0.25F, false));

		rotorstand3 = new RendererModel(this);
		rotorstand3.setRotationPoint(0.0F, 0.0F, 0.0F);
		rotorstand.addChild(rotorstand3);
		setRotationAngle(rotorstand3, 0.0F, -2.0944F, 0.0F);
		rotorstand3.cubeList.add(new ModelBox(rotorstand3, 8, 33, -1.0F, -18.0F, -5.5F, 2, 1, 2, 0.0F, false));
		rotorstand3.cubeList.add(new ModelBox(rotorstand3, 0, 33, -1.0F, -18.0F, 3.5F, 2, 1, 2, 0.0F, false));
		rotorstand3.cubeList.add(new ModelBox(rotorstand3, 8, 9, -1.0F, -34.75F, -5.5F, 2, 3, 2, 0.0F, false));
		rotorstand3.cubeList.add(new ModelBox(rotorstand3, 0, 9, -1.0F, -34.75F, 3.5F, 2, 3, 2, 0.0F, false));
		rotorstand3.cubeList.add(new ModelBox(rotorstand3, 52, 22, -0.5F, -21.25F, -5.0F, 1, 3, 1, 0.25F, false));
		rotorstand3.cubeList.add(new ModelBox(rotorstand3, 48, 32, -0.5F, -21.25F, 4.0F, 1, 3, 1, 0.25F, false));
		rotorstand3.cubeList.add(new ModelBox(rotorstand3, 48, 11, -0.5F, -31.5F, -5.0F, 1, 2, 1, 0.25F, false));
		rotorstand3.cubeList.add(new ModelBox(rotorstand3, 9, 44, -0.5F, -31.5F, 4.0F, 1, 2, 1, 0.25F, false));

		door1_rotate_y = new RendererModel(this);
		door1_rotate_y.setRotationPoint(1.75F, 23.5F, -14.75F);
		setRotationAngle(door1_rotate_y, -1.5708F, -0.3054F, 0.0F);
		door1_rotate_y.cubeList.add(new ModelBox(door1_rotate_y, 7, 105, -3.5F, -4.0F, -0.5F, 7, 8, 1, 0.0F, false));

		door2_rotate_y = new RendererModel(this);
		door2_rotate_y.setRotationPoint(6.25F, 13.0F, -3.5F);
		setRotationAngle(door2_rotate_y, -0.4363F, 0.0F, -0.3491F);
		door2_rotate_y.cubeList.add(new ModelBox(door2_rotate_y, 25, 99, -0.5F, -4.0F, 0.0F, 1, 8, 7, 0.0F, false));

		door3_rotate_y = new RendererModel(this);
		door3_rotate_y.setRotationPoint(3.5F, 13.0F, 6.25F);
		door3_rotate_y.cubeList.add(new ModelBox(door3_rotate_y, 43, 105, -7.0F, -4.0F, -0.5F, 7, 8, 1, 0.0F, false));

		door4_rotate_y = new RendererModel(this);
		door4_rotate_y.setRotationPoint(-6.25F, 13.0F, 3.5F);
		door4_rotate_y.cubeList.add(new ModelBox(door4_rotate_y, 61, 99, -0.5F, -4.0F, -7.0F, 1, 8, 7, 0.0F, false));

		basiccubes2 = new RendererModel(this);
		basiccubes2.setRotationPoint(0.0F, 24.0F, 0.0F);
		basiccubes2.cubeList.add(new ModelBox(basiccubes2, 0, 22, -8.0F, -6.0F, -8.0F, 16, 6, 16, 0.0F, false));
		basiccubes2.cubeList.add(new ModelBox(basiccubes2, 0, 0, -8.0F, -48.0F, -8.0F, 16, 6, 16, 0.0F, false));
		basiccubes2.cubeList.add(new ModelBox(basiccubes2, 48, 0, -7.0F, -41.0F, -7.0F, 14, 1, 14, 0.0F, false));
		basiccubes2.cubeList.add(new ModelBox(basiccubes2, 78, 52, -6.0F, -17.0F, -6.0F, 12, 1, 12, 0.0F, false));
		basiccubes2.cubeList.add(new ModelBox(basiccubes2, 48, 22, -7.0F, -35.0F, -7.0F, 14, 1, 14, 0.0F, false));
	}



	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void render(BrokenEngineTile tileEntityIn) {
		glow.render(0.0625F);
		basiccubes.render(0.0625F);
		compartmentoutline.render(0.0625F);
		rotorstand.render(0.0625F);
		door1_rotate_y.render(0.0625F);
		door2_rotate_y.render(0.0625F);
		door3_rotate_y.render(0.0625F);
		door4_rotate_y.render(0.0625F);
		basiccubes2.render(0.0625F);
	}
}