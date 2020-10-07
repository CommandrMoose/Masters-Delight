package commandrmoose.master.client.models.exteriors;// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelBox;
import net.tardis.mod.client.models.IExteriorModel;
import net.tardis.mod.entity.TardisEntity;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class BoothExteriorModel extends Model implements IExteriorModel {
    private final RendererModel Base;
    private final RendererModel Pillars;
    private final RendererModel Sides;
    private final RendererModel Phone;
    private final RendererModel PhoneSign;
    private final RendererModel Roof;
    private final RendererModel Doors;
    private final RendererModel door_left;
    private final RendererModel door_right;
    private final RendererModel Antena;
    private final RendererModel part2;
    private final RendererModel part1;
    private final RendererModel InsideLight;
    private final RendererModel PhoneBook;
    private final RendererModel PhoneCord;

    public BoothExteriorModel() {
        textureWidth = 256;
        textureHeight = 256;

        Base = new RendererModel(this);
        Base.setRotationPoint(0.0F, 24.0F, 0.0F);
        Base.cubeList.add(new ModelBox(Base, 0, 0, -12.5F, -3.0F, -12.5F, 25, 3, 25, 0.0F, false));

        Pillars = new RendererModel(this);
        Pillars.setRotationPoint(-3.5F, 24.0F, -10.5F);
        Pillars.cubeList.add(new ModelBox(Pillars, 0, 106, -8.5F, -60.0F, -1.5F, 1, 57, 2, 0.0F, false));
        Pillars.cubeList.add(new ModelBox(Pillars, 14, 6, -9.0F, -8.0F, -2.0F, 1, 5, 1, 0.0F, false));
        Pillars.cubeList.add(new ModelBox(Pillars, 20, 14, 15.0F, -6.0F, 22.0F, 1, 3, 1, 0.0F, false));
        Pillars.cubeList.add(new ModelBox(Pillars, 18, 0, -9.0F, -6.0F, 22.0F, 1, 3, 1, 0.0F, false));
        Pillars.cubeList.add(new ModelBox(Pillars, 14, 0, 15.0F, -8.0F, -2.0F, 1, 5, 1, 0.0F, false));
        Pillars.cubeList.add(new ModelBox(Pillars, 88, 102, -8.5F, -60.0F, 20.5F, 2, 57, 2, 0.0F, false));
        Pillars.cubeList.add(new ModelBox(Pillars, 104, 104, 14.5F, -60.0F, -1.5F, 1, 57, 2, 0.0F, false));
        Pillars.cubeList.add(new ModelBox(Pillars, 96, 102, 13.5F, -60.0F, 20.5F, 2, 57, 2, 0.0F, false));

        Sides = new RendererModel(this);
        Sides.setRotationPoint(0.0F, 24.0F, 0.0F);
        Sides.cubeList.add(new ModelBox(Sides, 46, 107, 10.0F, -55.0F, 3.0F, 2, 47, 1, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 28, 106, -4.0F, -55.0F, 10.0F, 1, 47, 2, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 40, 107, -12.0F, -55.0F, -4.0F, 2, 47, 1, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 102, 0, 10.0F, -32.0F, -10.0F, 2, 1, 20, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 102, 24, -10.0F, -32.0F, 10.0F, 20, 1, 2, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 96, 32, -12.0F, -32.0F, -10.0F, 2, 1, 20, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 94, 77, 10.0F, -57.0F, -10.0F, 2, 2, 20, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 75, 0, -10.0F, -57.0F, 10.0F, 20, 2, 2, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 72, 30, -12.0F, -57.0F, -10.0F, 2, 2, 20, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 52, 107, 10.0F, -55.0F, -4.0F, 2, 47, 1, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 22, 106, 3.0F, -55.0F, 10.0F, 1, 47, 2, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 34, 106, -12.0F, -55.0F, 3.0F, 2, 47, 1, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 76, 4, 11.5F, -8.0F, -11.5F, 1, 2, 24, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 102, 21, -12.5F, -8.0F, 11.5F, 24, 2, 1, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 69, 77, -12.5F, -8.0F, -11.5F, 1, 2, 23, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 44, 82, 10.0F, -8.0F, -10.0F, 2, 5, 20, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 110, 110, -10.0F, -8.0F, 10.0F, 20, 5, 2, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 0, 81, -12.0F, -8.0F, -10.0F, 2, 5, 20, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 138, 138, 10.5F, -31.0F, -10.0F, 1, 23, 6, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 164, 58, 11.5F, -55.0F, -3.0F, 0, 47, 6, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 138, 77, 4.0F, -31.0F, 10.5F, 6, 23, 1, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 164, 64, -3.0F, -55.0F, 11.5F, 6, 47, 0, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 110, 117, -11.5F, -31.0F, 4.0F, 1, 23, 6, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 164, 58, -11.5F, -55.0F, -3.0F, 0, 47, 6, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 72, 136, 10.5F, -31.0F, 4.0F, 1, 23, 6, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 143, 27, -10.0F, -31.0F, 10.5F, 6, 23, 1, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 124, 124, -11.5F, -31.0F, -10.0F, 1, 23, 6, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 58, 136, 10.5F, -55.0F, 4.0F, 1, 23, 6, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 0, 0, -10.0F, -55.0F, 10.5F, 6, 23, 1, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 58, 107, -11.5F, -55.0F, -10.0F, 1, 23, 6, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 135, 47, 10.5F, -55.0F, -10.0F, 1, 23, 6, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 0, 28, 4.0F, -55.0F, 10.5F, 6, 23, 1, 0.0F, false));
        Sides.cubeList.add(new ModelBox(Sides, 72, 107, -11.5F, -55.0F, 4.0F, 1, 23, 6, 0.0F, false));

        Phone = new RendererModel(this);
        Phone.setRotationPoint(8.5F, -19.0F, 8.5F);
        setRotationAngle(Phone, 0.0F, -0.7854F, 0.0F);
        Phone.cubeList.add(new ModelBox(Phone, 0, 54, -1.8787F, 1.0F, -2.5F, 3, 11, 5, 0.0F, false));
        Phone.cubeList.add(new ModelBox(Phone, 14, 14, -2.8787F, 4.0F, -0.5F, 1, 5, 2, 0.0F, false));
        Phone.cubeList.add(new ModelBox(Phone, 69, 54, -0.8787F, 12.0F, -2.5F, 2, 5, 5, 0.0F, false));

        PhoneSign = new RendererModel(this);
        PhoneSign.setRotationPoint(0.0F, 24.0F, 0.0F);
        PhoneSign.cubeList.add(new ModelBox(PhoneSign, 0, 55, -11.5F, -60.0F, -11.5F, 23, 3, 23, 0.0F, false));

        Roof = new RendererModel(this);
        Roof.setRotationPoint(0.0F, 24.0F, 0.0F);
        Roof.cubeList.add(new ModelBox(Roof, 32, 37, 10.0F, -60.0F, -12.0F, 1, 3, 2, 0.0F, false));
        Roof.cubeList.add(new ModelBox(Roof, 35, 39, -11.0F, -60.0F, -12.0F, 1, 3, 2, 0.0F, false));
        Roof.cubeList.add(new ModelBox(Roof, 96, 30, -11.0F, -57.0F, -12.0F, 22, 1, 1, 0.0F, false));
        Roof.cubeList.add(new ModelBox(Roof, 19, 20, -8.0F, -60.0F, -11.0F, 1, 3, 1, 0.0F, false));
        Roof.cubeList.add(new ModelBox(Roof, 18, 4, 10.0F, -60.0F, -11.0F, 1, 3, 1, 0.0F, false));
        Roof.cubeList.add(new ModelBox(Roof, 0, 28, -12.0F, -62.0F, -12.0F, 24, 2, 24, 0.0F, false));
        Roof.cubeList.add(new ModelBox(Roof, 69, 54, -11.0F, -63.0F, -11.0F, 22, 1, 22, 0.0F, false));
        Roof.cubeList.add(new ModelBox(Roof, 5, 56, -10.5F, -57.0F, -10.5F, 21, 1, 21, 0.0F, false));

        Doors = new RendererModel(this);
        Doors.setRotationPoint(11.0F, 20.0F, -11.0F);


        door_left = new RendererModel(this);
        door_left.setRotationPoint(-1.5F, 0.0F, 1.5F);
        Doors.addChild(door_left);
        door_left.cubeList.add(new ModelBox(door_left, 189, 0, -8.5F, -51.0F, -1.0F, 9, 47, 0, 0.0F, false));
        door_left.cubeList.add(new ModelBox(door_left, 69, 72, -8.5F, -28.0F, -1.5F, 9, 1, 1, 0.0F, false));
        door_left.cubeList.add(new ModelBox(door_left, 0, 70, -8.5F, -52.0F, -1.5F, 9, 1, 1, 0.0F, false));
        door_left.cubeList.add(new ModelBox(door_left, 72, 36, -8.5F, -4.0F, -1.5F, 9, 1, 1, 0.0F, false));
        door_left.cubeList.add(new ModelBox(door_left, 18, 106, -9.5F, -52.0F, -1.5F, 1, 52, 1, 0.0F, false));
        door_left.cubeList.add(new ModelBox(door_left, 17, 11, -9.0F, -27.5F, -2.0F, 2, 2, 1, 0.0F, false));
        door_left.cubeList.add(new ModelBox(door_left, 14, 106, 0.5F, -52.0F, -1.5F, 1, 52, 1, 0.0F, false));
        door_left.cubeList.add(new ModelBox(door_left, 69, 64, -8.5F, -3.0F, -1.0F, 9, 2, 1, 0.0F, false));
        door_left.cubeList.add(new ModelBox(door_left, 72, 34, -8.5F, -1.0F, -1.5F, 9, 1, 1, 0.0F, false));

        door_right = new RendererModel(this);
        door_right.setRotationPoint(-9.5F, 0.0F, -0.5F);
        door_left.addChild(door_right);
        door_right.cubeList.add(new ModelBox(door_right, 6, 106, -11.0F, -52.0F, -1.0F, 1, 52, 1, 0.0F, false));
        door_right.cubeList.add(new ModelBox(door_right, 72, 32, -10.0F, -1.0F, -1.0F, 9, 1, 1, 0.0F, false));
        door_right.cubeList.add(new ModelBox(door_right, 10, 106, -1.0F, -52.0F, -1.0F, 1, 52, 1, 0.0F, false));
        door_right.cubeList.add(new ModelBox(door_right, 72, 30, -10.0F, -4.0F, -1.0F, 9, 1, 1, 0.0F, false));
        door_right.cubeList.add(new ModelBox(door_right, 166, 0, -10.0F, -51.0F, -0.5F, 9, 47, 0, 0.0F, false));
        door_right.cubeList.add(new ModelBox(door_right, 0, 72, -10.0F, -28.0F, -1.0F, 9, 1, 1, 0.0F, false));
        door_right.cubeList.add(new ModelBox(door_right, 69, 67, -10.0F, -52.0F, -1.0F, 9, 1, 1, 0.0F, false));
        door_right.cubeList.add(new ModelBox(door_right, 69, 69, -10.0F, -3.0F, -0.5F, 9, 2, 1, 0.0F, false));

        Antena = new RendererModel(this);
        Antena.setRotationPoint(0.0F, 24.0F, 0.0F);


        part2 = new RendererModel(this);
        part2.setRotationPoint(0.0F, -63.0F, 0.0F);
        Antena.addChild(part2);
        setRotationAngle(part2, 0.0F, -0.7854F, 0.0F);
        part2.cubeList.add(new ModelBox(part2, 24, 81, -9.5F, -8.0F, 0.0F, 19, 8, 0, 0.0F, false));

        part1 = new RendererModel(this);
        part1.setRotationPoint(0.0F, -63.0F, 0.0F);
        Antena.addChild(part1);
        setRotationAngle(part1, 0.0F, 0.7854F, 0.0F);
        part1.cubeList.add(new ModelBox(part1, 24, 81, -9.5F, -8.0F, 0.0F, 19, 8, 0, 0.0F, false));

        InsideLight = new RendererModel(this);
        InsideLight.setRotationPoint(2.5F, 24.0F, -0.5F);
        InsideLight.cubeList.add(new ModelBox(InsideLight, 0, 168, -9.0F, -56.0F, -6.0F, 13, 1, 13, 0.0F, false));

        PhoneBook = new RendererModel(this);
        PhoneBook.setRotationPoint(6.0F, 20.0F, 5.0F);
        setRotationAngle(PhoneBook, 0.0F, 0.6545F, 0.0F);
        PhoneBook.cubeList.add(new ModelBox(PhoneBook, 133, 0, -3.0F, -1.0F, -2.0F, 6, 2, 4, 0.0F, false));

        PhoneCord = new RendererModel(this);
        PhoneCord.setRotationPoint(0.0F, 24.0F, 0.0F);
        PhoneCord.cubeList.add(new ModelBox(PhoneCord, 197, 93, 4.0F, -35.0F, 7.5F, 4, 11, 0, 0.0F, false));
    }

    public void render(ExteriorTile tile) {
        Base.render(0.0625F);
        Pillars.render(0.0625F);
        Sides.render(0.0625F);
        Phone.render(0.0625F);
        PhoneSign.render(0.0625F);
        Roof.render(0.0625F);


        switch (tile.getOpen()) {
            case ONE:
                door_left.rotateAngleY = (float) Math.toRadians(-60);
                door_right.rotateAngleY = (float) Math.toRadians(120);
                break;
            case BOTH:
                door_left.rotateAngleY = (float) Math.toRadians(-80);
                door_right.rotateAngleY = (float) Math.toRadians(160);
                break;
            case CLOSED:
                door_left.rotateAngleY = (float) Math.toDegrees(0);
                door_right.rotateAngleY = (float) Math.toDegrees(0);
                break;
        }

        Doors.render(0.0625F);
        Antena.render(0.0625F);
        InsideLight.render(0.0625F);
        PhoneBook.render(0.0625F);
        PhoneCord.render(0.0625F);
    }


    public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderEntity(TardisEntity tardisEntity) {
        Base.render(0.0625F);
        Pillars.render(0.0625F);
        Sides.render(0.0625F);
        Phone.render(0.0625F);
        PhoneSign.render(0.0625F);
        Roof.render(0.0625F);
        Doors.render(0.0625F);
        Antena.render(0.0625F);
        InsideLight.render(0.0625F);
        PhoneBook.render(0.0625F);
        PhoneCord.render(0.0625F);

        System.out.println("Rendering");
    }
}