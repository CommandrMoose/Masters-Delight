package commandrmoose.master.client.models.entity.passive;// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.platform.GlStateManager;
import commandrmoose.master.entity.passive.TemporalBatEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;
import net.tardis.mod.entity.DalekEntity;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class TemporalBatModel extends EntityModel<TemporalBatEntity> {
	private final RendererModel mob;

	public TemporalBatModel() {
		textureWidth = 128;
		textureHeight = 128;

		mob = new RendererModel(this);
		mob.setRotationPoint(0.0F, 24.0F, 0.0F);
		mob.cubeList.add(new ModelBox(mob, 0, 45, -9.0F, -14.0F, -6.0F, 1, 12, 12, 0.0F, false));
		mob.cubeList.add(new ModelBox(mob, 0, 0, -8.0F, -16.0F, -8.0F, 16, 16, 16, 0.0F, false));
		mob.cubeList.add(new ModelBox(mob, 0, 32, -6.0F, 0.0F, -6.0F, 12, 1, 12, 0.0F, false));
		mob.cubeList.add(new ModelBox(mob, 36, 36, -6.0F, -17.0F, -6.0F, 12, 1, 12, 0.0F, false));
		mob.cubeList.add(new ModelBox(mob, 52, 52, -6.0F, -14.0F, -9.0F, 12, 12, 1, 0.0F, false));
		mob.cubeList.add(new ModelBox(mob, 48, 0, -6.0F, -14.0F, 8.0F, 12, 12, 1, 0.0F, false));
		mob.cubeList.add(new ModelBox(mob, 26, 49, 8.0F, -14.0F, -6.0F, 1, 12, 12, 0.0F, false));
	}

	@Override
	public void render(TemporalBatEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mob.render(f5);

		GlStateManager.pushMatrix();
		GlStateManager.translated(0, 0.125, 0);
		GlStateManager.enableRescaleNormal();
		GlStateManager.scaled(0.25, 0.25, 0.25);
		GlStateManager.disableRescaleNormal();
		GlStateManager.popMatrix();

	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}