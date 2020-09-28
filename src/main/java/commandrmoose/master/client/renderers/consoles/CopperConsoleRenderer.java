package commandrmoose.master.client.renderers.consoles;

import com.mojang.blaze3d.platform.GlStateManager;

import commandrmoose.master.client.models.consoles.CopperConsoleModel;
import commandrmoose.master.tiles.console.CopperConsoleTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.helper.Helper;

public class CopperConsoleRenderer extends TileEntityRenderer<CopperConsoleTile> {

	public static final ResourceLocation TEXTURE = Helper.createRL("textures/consoles/kelt.png");
	public static final CopperConsoleModel MODEL = new CopperConsoleModel();
	
	@Override
	public void render(CopperConsoleTile tileEntityIn, double x, double y, double z, float partialTicks, int destroyStage) {
		GlStateManager.pushMatrix();
		GlStateManager.translated(x + 0.5, y + 1.8, z + 0.5);
		GlStateManager.scaled(1.2, 1.2, 1.2);
		GlStateManager.rotated(180, 0, 0, 1);
		this.bindTexture(TEXTURE);
		MODEL.render(tileEntityIn);
		GlStateManager.popMatrix();
	}

	@Override
	protected void bindTexture(ResourceLocation location) {
		Minecraft.getInstance().getTextureManager().bindTexture(location);
	}

}
