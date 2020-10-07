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
import net.tardis.mod.client.renderers.exteriors.ClockExteriorRenderer;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.tileentities.exteriors.ClockExteriorTile;


public class BoothExteriorRenderer extends ExteriorRenderer<BoothExteriorTile>{

    public static final BoothExteriorModel model = new BoothExteriorModel();

    public static final ResourceLocation TEXTURE = new ResourceLocation(Master.MODID, "textures/exteriors/booth.png");

    @Override
    public void renderExterior(BoothExteriorTile boothExteriorTile) {
        GlStateManager.pushMatrix();
        GlStateManager.translated(0,-1,0);
        this.bindTexture(TEXTURE);
        model.render(boothExteriorTile);
        GlStateManager.popMatrix();
    }


    @Override
    protected void bindTexture(ResourceLocation location) {
        Minecraft.getInstance().getTextureManager().bindTexture(location);
    }

}
