package commandrmoose.master.client.renderers.entity.passive;

import com.mojang.blaze3d.platform.GlStateManager;
import commandrmoose.master.Master;
import commandrmoose.master.client.models.entity.passive.TemporalBatModel;
import commandrmoose.master.entity.passive.TemporalBatEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.helper.RenderUtil;

import java.util.Random;

public class TemporalBatRenderer extends MobRenderer<TemporalBatEntity, TemporalBatModel> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(Master.MODID, "textures/entity/temporal_bat.png");
    public static final TemporalBatModel MODEL = new TemporalBatModel();

    public TemporalBatRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, MODEL, 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(TemporalBatEntity entity) {
        return TEXTURE;
    }

    @Override
    public void doRender(TemporalBatEntity entity, double x, double y, double z, float entityYaw, float partialTicks) {
            GlStateManager.pushMatrix();
            GlStateManager.scaled(0.5F, 0.5F, 0.5F);
            GlStateManager.popMatrix();
            super.doRender(entity,x,y,z,entityYaw,partialTicks);

    }
}

