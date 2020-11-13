package commandrmoose.master.client.renderers.entity.aggressive;

import com.mojang.blaze3d.platform.GlStateManager;
import commandrmoose.master.Master;
import commandrmoose.master.client.models.entity.aggressive.TempleGolemModel;
import commandrmoose.master.client.models.entity.passive.TemporalBatModel;
import commandrmoose.master.entity.aggressive.TempleGolemEntity;
import commandrmoose.master.entity.passive.TemporalBatEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.IronGolemModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class TempleGolemRenderer extends MobRenderer<TempleGolemEntity, TempleGolemModel> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(Master.MODID, "textures/entity/temple_golem.png");
    public static final TempleGolemModel MODEL = new TempleGolemModel();

    public TempleGolemRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, MODEL, 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(TempleGolemEntity entity) {
        return TEXTURE;
    }

    @Override
    public void doRender(TempleGolemEntity entity, double x, double y, double z, float entityYaw, float partialTicks) {
        GlStateManager.pushMatrix();
        super.doRender(entity,x,y,z,entityYaw,partialTicks);
        GlStateManager.popMatrix();
    }


}
