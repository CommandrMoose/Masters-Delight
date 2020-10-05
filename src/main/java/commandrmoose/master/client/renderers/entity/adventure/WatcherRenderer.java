package commandrmoose.master.client.renderers.entity.adventure;

import commandrmoose.master.Master;
import commandrmoose.master.entity.adventure.WatcherEntity;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class WatcherRenderer extends BipedRenderer<WatcherEntity, PlayerModel<WatcherEntity>> {

    public WatcherRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new PlayerModel<WatcherEntity>(0.0625F, false), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(WatcherEntity entity) {
        return new ResourceLocation(Master.MODID, "textures/entity/watcher.png");
    }
}
