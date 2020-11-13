package commandrmoose.master.entity;

import commandrmoose.master.Master;
import commandrmoose.master.entity.adventure.WatcherEntity;
import commandrmoose.master.entity.aggressive.TempleGolemEntity;
import commandrmoose.master.entity.passive.TemporalBatEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.tardis.mod.Tardis;
import net.tardis.mod.entity.TEntities;

@Mod.EventBusSubscriber(modid = Master.MODID, bus = Bus.MOD)
public class MEntities {

    public static final EntityType<TemporalBatEntity> TEMPORAL_BAT = registerMob(TemporalBatEntity::new, TemporalBatEntity::new, EntityClassification.CREATURE, 0.5f, 0.5f, "temporal_bat", false);
    public static final EntityType<WatcherEntity> WATCHER = registerMob(WatcherEntity::new, WatcherEntity::new, EntityClassification.MONSTER, 0.5f, 0.5f, "watcher", false);
    public static final EntityType<TempleGolemEntity> TEMPLEGOLEM = registerMob(TempleGolemEntity::new, TempleGolemEntity::new, EntityClassification.MONSTER, 1.5f, 4f, "temple_golem", false);

    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
        event.getRegistry().registerAll(
                TEMPORAL_BAT,
                WATCHER,
                TEMPLEGOLEM
        );
    }

    @SubscribeEvent
    public static void registerWorldSpawns(RegistryEvent.Register event){
        registerBiomeSpawn(WATCHER, EntityClassification.MONSTER, 1, 0, 1, Biomes.PLAINS, Biomes.BADLANDS);
    }


    public static <T extends Entity> EntityType<T> registerBase(EntityType.IFactory<T> factory, MEntities.IClientSpawner<T> client, EntityClassification classification, float width, float height, int trackingRange, int updateFreq, boolean sendUpdate, String name){
        ResourceLocation loc = new ResourceLocation(Master.MODID, name);
        EntityType.Builder<T> builder = EntityType.Builder.create(factory, classification)
                .setShouldReceiveVelocityUpdates(sendUpdate)
                .setTrackingRange(trackingRange)
                .setUpdateInterval(updateFreq)
                .size(width, height)
                .setCustomClientFactory((spawnEntity, world) -> client.spawn(world));
        EntityType<T> type = builder.build("");
        type.setRegistryName(loc);

        return type;
    }

    public static <T extends Entity> EntityType<T> registerMob(EntityType.IFactory<T> factory, MEntities.IClientSpawner<T> client, EntityClassification classification, float width, float height, String name, boolean velocity) {
        return MEntities.registerBase(factory, client, classification, width, height, 80, 3, velocity, name);
    }


    public static void registerBiomeSpawn(EntityType<?> type, EntityClassification classification, int weight, int min, int max, Biome... biomes) {
        for (Biome biome : biomes) {
            if (biome != null) {
                biome.getSpawns(classification).add(new Biome.SpawnListEntry(type, weight, min, max));
            }
        }
    }


    public interface IClientSpawner<T> {
        T spawn(World world);
    }

}
