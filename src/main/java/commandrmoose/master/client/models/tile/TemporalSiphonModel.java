package commandrmoose.master.client.models.tile;// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import commandrmoose.master.tiles.TemporalSiphonTile;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;

public class TemporalSiphonModel extends Model {
	private final RendererModel bone;
	private final RendererModel bone2;
	private final RendererModel bone3;
	private final RendererModel bone16;
	private final RendererModel bone10;
	private final RendererModel bone11;
	private final RendererModel bone12;
	private final RendererModel bone13;
	private final RendererModel bone14;
	private final RendererModel bone15;
	private final RendererModel bone9;
	private final RendererModel bone8;
	private final RendererModel bone4;
	private final RendererModel bone7;
	private final RendererModel bone6;
	private final RendererModel bone5;
	private final RendererModel bone17;
	private final RendererModel bone18;
	private final RendererModel bone19;
	private final RendererModel bone20;
	private final RendererModel bone21;
	private final RendererModel bone22;
	private final RendererModel bone23;
	private final RendererModel bone24;
	private final RendererModel bone25;
	private final RendererModel bone26;
	private final RendererModel bone27;
	private final RendererModel bone28;
	private final RendererModel bone29;

	public TemporalSiphonModel() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new RendererModel(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -16.0F, -8.0F, 16, 16, 16, 0.0F, false));

		bone2 = new RendererModel(this);
		bone2.setRotationPoint(0.25F, 23.5F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -4.75F, -4.5F, -4.5F, 9, 5, 9, 0.0F, false));

		bone3 = new RendererModel(this);
		bone3.setRotationPoint(0.25F, 18.5F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 14, -3.75F, -4.5F, -3.5F, 7, 5, 7, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 21, 14, -2.75F, -6.5F, -2.5F, 5, 2, 5, 0.0F, false));

		bone16 = new RendererModel(this);
		bone16.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone10 = new RendererModel(this);
		bone10.setRotationPoint(-0.0625F, -0.0625F, -0.0625F);
		bone16.addChild(bone10);
		

		bone11 = new RendererModel(this);
		bone11.setRotationPoint(0.0625F, 0.0625F, 0.0625F);
		bone10.addChild(bone11);
		

		bone12 = new RendererModel(this);
		bone12.setRotationPoint(0.0F, -7.25F, 4.0F);
		bone11.addChild(bone12);
		setRotationAngle(bone12, 0.7418F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 14, 32, -2.0F, -4.5F, -1.25F, 4, 7, 3, 0.0F, false));

		bone13 = new RendererModel(this);
		bone13.setRotationPoint(0.0F, -1.5F, 7.5F);
		bone11.addChild(bone13);
		bone13.cubeList.add(new ModelBox(bone13, 36, 12, -2.0F, 0.5F, -2.25F, 4, 2, 4, 0.0F, false));

		bone14 = new RendererModel(this);
		bone14.setRotationPoint(0.0F, 4.75F, 7.5F);
		bone11.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 42, 42, -1.0F, -4.5F, -1.25F, 2, 7, 2, 0.0F, false));

		bone15 = new RendererModel(this);
		bone15.setRotationPoint(0.0F, -2.25F, 7.0F);
		bone11.addChild(bone15);
		setRotationAngle(bone15, 0.2618F, 0.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 16, 42, -1.0F, -4.5F, -1.25F, 2, 7, 2, 0.0F, false));

		bone9 = new RendererModel(this);
		bone9.setRotationPoint(-0.0625F, -0.0625F, 0.0625F);
		bone16.addChild(bone9);
		

		bone8 = new RendererModel(this);
		bone8.setRotationPoint(0.0625F, 0.0625F, -0.0625F);
		bone9.addChild(bone8);
		

		bone4 = new RendererModel(this);
		bone4.setRotationPoint(0.0F, -7.25F, -4.0F);
		bone8.addChild(bone4);
		setRotationAngle(bone4, -0.7418F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 28, 35, -2.0F, -4.5F, -1.75F, 4, 7, 3, 0.0F, false));

		bone7 = new RendererModel(this);
		bone7.setRotationPoint(0.0F, -1.5F, -7.5F);
		bone8.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 36, 21, -2.0F, 0.5F, -1.75F, 4, 2, 4, 0.0F, false));

		bone6 = new RendererModel(this);
		bone6.setRotationPoint(0.0F, 4.75F, -7.5F);
		bone8.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 0, 45, -1.0F, -4.5F, -0.75F, 2, 7, 2, 0.0F, false));

		bone5 = new RendererModel(this);
		bone5.setRotationPoint(0.0F, -2.25F, -7.0F);
		bone8.addChild(bone5);
		setRotationAngle(bone5, -0.2618F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 24, 45, -1.0F, -4.5F, -0.75F, 2, 7, 2, 0.0F, false));

		bone17 = new RendererModel(this);
		bone17.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone17, 0.0F, -1.5708F, 0.0F);
		

		bone18 = new RendererModel(this);
		bone18.setRotationPoint(-0.0625F, -0.0625F, -0.0625F);
		bone17.addChild(bone18);
		

		bone19 = new RendererModel(this);
		bone19.setRotationPoint(0.0625F, 0.0625F, 0.0625F);
		bone18.addChild(bone19);
		

		bone20 = new RendererModel(this);
		bone20.setRotationPoint(0.0F, -7.25F, 4.0F);
		bone19.addChild(bone20);
		setRotationAngle(bone20, 0.7418F, 0.0F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 0, 26, -2.0F, -4.5F, -1.25F, 4, 7, 3, 0.0F, false));

		bone21 = new RendererModel(this);
		bone21.setRotationPoint(0.0F, -1.5F, 7.5F);
		bone19.addChild(bone21);
		bone21.cubeList.add(new ModelBox(bone21, 36, 6, -2.0F, 0.5F, -2.25F, 4, 2, 4, 0.0F, false));

		bone22 = new RendererModel(this);
		bone22.setRotationPoint(0.0F, 4.75F, 7.5F);
		bone19.addChild(bone22);
		bone22.cubeList.add(new ModelBox(bone22, 8, 40, -1.0F, -4.5F, -1.25F, 2, 7, 2, 0.0F, false));

		bone23 = new RendererModel(this);
		bone23.setRotationPoint(0.0F, -2.25F, 7.0F);
		bone19.addChild(bone23);
		setRotationAngle(bone23, 0.2618F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 39, 27, -1.0F, -4.5F, -1.25F, 2, 7, 2, 0.0F, false));

		bone24 = new RendererModel(this);
		bone24.setRotationPoint(-0.0625F, -0.0625F, 0.0625F);
		bone17.addChild(bone24);
		

		bone25 = new RendererModel(this);
		bone25.setRotationPoint(0.0625F, 0.0625F, -0.0625F);
		bone24.addChild(bone25);
		

		bone26 = new RendererModel(this);
		bone26.setRotationPoint(0.0F, -7.25F, -4.0F);
		bone25.addChild(bone26);
		setRotationAngle(bone26, -0.7418F, 0.0F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 25, 25, -2.0F, -4.5F, -1.75F, 4, 7, 3, 0.0F, false));

		bone27 = new RendererModel(this);
		bone27.setRotationPoint(0.0F, -1.5F, -7.5F);
		bone25.addChild(bone27);
		bone27.cubeList.add(new ModelBox(bone27, 27, 0, -2.0F, 0.5F, -1.75F, 4, 2, 4, 0.0F, false));

		bone28 = new RendererModel(this);
		bone28.setRotationPoint(0.0F, 4.75F, -7.5F);
		bone25.addChild(bone28);
		bone28.cubeList.add(new ModelBox(bone28, 0, 36, -1.0F, -4.5F, -0.75F, 2, 7, 2, 0.0F, false));

		bone29 = new RendererModel(this);
		bone29.setRotationPoint(0.0F, -2.25F, -7.0F);
		bone25.addChild(bone29);
		setRotationAngle(bone29, -0.2618F, 0.0F, 0.0F);
		bone29.cubeList.add(new ModelBox(bone29, 0, 0, -1.0F, -4.5F, -0.75F, 2, 7, 2, 0.0F, false));
	}


	public void render(TemporalSiphonTile tile) {
		//bone.render(0.0625F);
		bone2.render(0.0625F);
		bone3.render(0.0625F);
		bone16.render(0.0625F);
		bone17.render(0.0625F);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}