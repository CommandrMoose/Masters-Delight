package commandrmoose.master.client.renderers.exterior;

import com.mojang.blaze3d.platform.GlStateManager;
import commandrmoose.master.Master;
import commandrmoose.master.client.models.exteriors.BoothExteriorModel;
import commandrmoose.master.client.models.tile.TemporalSiphonModel;
import commandrmoose.master.tiles.TemporalSiphonTile;
import commandrmoose.master.tiles.exterior.BoothExteriorTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;


public class BoothExteriorRenderer extends TileEntityRenderer<BoothExteriorTile> {

    public static final BoothExteriorModel model = new BoothExteriorModel();

    public static final ResourceLocation TEXTURE = new ResourceLocation(Master.MODID, "textures/exteriors/booth.png");

    @Override
    public void render(BoothExteriorTile tileEntityIn, double x, double y, double z, float partialTicks, int destroyStage) {
        System.out.println("AHHHH");
        GlStateManager.pushMatrix();
        GlStateManager.translated(x + 0.5, y + 1.8, z + 0.5);
        GlStateManager.scaled(1.2, 1.2, 1.2);
        GlStateManager.rotated(180, 0, 0, 1);
        this.bindTexture(TEXTURE);
        model.render(tileEntityIn);
        GlStateManager.popMatrix();
    }



    @Override
    protected void bindTexture(ResourceLocation location) {
        Minecraft.getInstance().getTextureManager().bindTexture(location);
    }

}
