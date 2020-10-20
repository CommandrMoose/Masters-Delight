package commandrmoose.master.client.models.consoles;

import com.mojang.blaze3d.platform.GlStateManager;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.tardis.mod.controls.*;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.Helper;
import net.tardis.mod.misc.WorldText;
import net.tardis.mod.tileentities.ConsoleTile;

// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


public class CopperConsoleModel extends Model {
	private final RendererModel base;
	private final RendererModel side;
	private final RendererModel bone;
	private final RendererModel bone14;
	private final RendererModel bone15;
	private final RendererModel bone4;
	private final RendererModel bone13;
	private final RendererModel bone2;
	private final RendererModel bone3;
	private final RendererModel throttle;
	private final RendererModel bone5;
	private final RendererModel bone6;
	private final RendererModel fastreturn;
	private final RendererModel bone7;
	private final RendererModel bone8;
	private final RendererModel bone12;
	private final RendererModel bone9;
	private final RendererModel bone10;
	private final RendererModel bone11;
	private final RendererModel side2;
	private final RendererModel bone16;
	private final RendererModel bone17;
	private final RendererModel bone18;
	private final RendererModel bone19;
	private final RendererModel bone151;
	private final RendererModel yswitch;
	private final RendererModel xswitch;
	private final RendererModel zswitch;
	private final RendererModel bone20;
	private final RendererModel bone21;
	private final RendererModel bone22;
	private final RendererModel bone154;
	private final RendererModel bone23;
	private final RendererModel doorcontrol;
	private final RendererModel bone24;
	private final RendererModel bone25;
	private final RendererModel bone26;
	private final RendererModel bone27;
	private final RendererModel bone28;
	private final RendererModel bone29;
	private final RendererModel bone30;
	private final RendererModel side3;
	private final RendererModel bone31;
	private final RendererModel telepathic;
	private final RendererModel bone32;
	private final RendererModel bone33;
	private final RendererModel bone34;
	private final RendererModel bone35;
	private final RendererModel bone36;
	private final RendererModel bone37;
	private final RendererModel verticallanding;
	private final RendererModel bone38;
	private final RendererModel bone39;
	private final RendererModel bone40;
	private final RendererModel bone41;
	private final RendererModel bone42;
	private final RendererModel bone43;
	private final RendererModel bone44;
	private final RendererModel bone45;
	private final RendererModel side4;
	private final RendererModel bone46;
	private final RendererModel phone;
	private final RendererModel bone47;
	private final RendererModel bone48;
	private final RendererModel bone49;
	private final RendererModel randomiser;
	private final RendererModel bone50;
	private final RendererModel bone51;
	private final RendererModel bone52;
	private final RendererModel bone53;
	private final RendererModel bone54;
	private final RendererModel bone55;
	private final RendererModel bone56;
	private final RendererModel bone57;
	private final RendererModel bone58;
	private final RendererModel bone59;
	private final RendererModel bone60;
	private final RendererModel side5;
	private final RendererModel bone61;
	private final RendererModel bone62;
	private final RendererModel bone63;
	private final RendererModel bone64;
	private final RendererModel sonicport;
	private final RendererModel bluestab;
	private final RendererModel bone65;
	private final RendererModel bone66;
	private final RendererModel bone67;
	private final RendererModel incrementincrease;
	private final RendererModel bone68;
	private final RendererModel bone69;
	private final RendererModel handbreak;
	private final RendererModel bone70;
	private final RendererModel bone71;
	private final RendererModel bone72;
	private final RendererModel bone73;
	private final RendererModel bone74;
	private final RendererModel bone75;
	private final RendererModel side6;
	private final RendererModel bone76;
	private final RendererModel facingcontrol;
	private final RendererModel bone77;
	private final RendererModel bone78;
	private final RendererModel bone79;
	private final RendererModel bone149;
	private final RendererModel bone80;
	private final RendererModel bone81;
	private final RendererModel bone82;
	private final RendererModel bone83;
	private final RendererModel bone84;
	private final RendererModel refuel;
	private final RendererModel bone85;
	private final RendererModel bone86;
	private final RendererModel bone87;
	private final RendererModel bone88;
	private final RendererModel bone89;
	private final RendererModel bone90;
	private final RendererModel bone95;
	private final RendererModel bone94;
	private final RendererModel bone93;
	private final RendererModel bone92;
	private final RendererModel bone91;
	private final RendererModel bone96;
	private final RendererModel bone97;
	private final RendererModel bone98;
	private final RendererModel bone99;
	private final RendererModel bone100;
	private final RendererModel bone101;
	private final RendererModel bone102;
	private final RendererModel bone103;
	private final RendererModel bone104;
	private final RendererModel bone105;
	private final RendererModel bone106;
	private final RendererModel bone107;
	private final RendererModel bone108;
	private final RendererModel bone109;
	private final RendererModel bone110;
	private final RendererModel bone111;
	private final RendererModel bone112;
	private final RendererModel bone113;
	private final RendererModel bone114;
	private final RendererModel bone115;
	private final RendererModel bone116;
	private final RendererModel bone117;
	private final RendererModel bone118;
	private final RendererModel bone119;
	private final RendererModel bone120;
	private final RendererModel rotarupndown;
	private final RendererModel sectiontwo;
	private final RendererModel sectionone;
	private final RendererModel circle;
	private final RendererModel bone128;
	private final RendererModel bone129;
	private final RendererModel bone130;
	private final RendererModel bone131;
	private final RendererModel circle2;
	private final RendererModel bone132;
	private final RendererModel bone133;
	private final RendererModel bone134;
	private final RendererModel bone135;
	private final RendererModel circle3;
	private final RendererModel bone136;
	private final RendererModel bone137;
	private final RendererModel bone138;
	private final RendererModel bone139;
	private final RendererModel circle4;
	private final RendererModel bone142;
	private final RendererModel bone143;
	private final RendererModel bone144;
	private final RendererModel bone145;
	private final RendererModel rotar3;
	private final RendererModel bone121;
	private final RendererModel bone122;
	private final RendererModel bone123;
	private final RendererModel rotar2;
	private final RendererModel bone124;
	private final RendererModel bone125;
	private final RendererModel bone126;
	private final RendererModel bone127;
	private final RendererModel bone141;
	private final RendererModel bone140;

	private boolean rotateRight = true;

	public CopperConsoleModel() {
		textureWidth = 256;
		textureHeight = 256;

		base = new RendererModel(this);
		base.setRotationPoint(1.35F, 23.0F, 1.5F);


		side = new RendererModel(this);
		side.setRotationPoint(0.0F, 3.0F, -8.0F);
		base.addChild(side);


		bone = new RendererModel(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		side.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 109, 127, -7.0F, -15.15F, -11.45F, 12, 3, 1, 0.2F, false));
		bone.cubeList.add(new ModelBox(bone, 208, 89, -3.0F, -14.25F, -11.75F, 4, 1, 1, 0.2F, false));
		bone.cubeList.add(new ModelBox(bone, 90, 240, -4.0F, -23.1F, -2.7F, 6, 4, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 209, 53, -4.0F, -20.1F, -0.7F, 6, 1, 13, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 209, 53, -4.0F, -6.1F, -0.7F, 6, 1, 13, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 48, 68, -0.6F, -22.3F, -2.9F, 2, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 242, 221, -2.1F, -22.3F, -3.2F, 1, 1, 1, -0.25F, false));
		bone.cubeList.add(new ModelBox(bone, 7, 56, -3.1F, -23.3F, -3.2F, 1, 1, 1, -0.25F, false));
		bone.cubeList.add(new ModelBox(bone, 152, 203, -2.7F, -25.5F, -3.0F, 2, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 252, 219, -2.5F, -27.5F, -2.9F, 1, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 64, 101, -2.5F, -27.8F, -2.9F, 1, 1, 1, -0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 152, 203, -2.7F, -25.5F, -3.4F, 2, 2, 1, -0.25F, false));
		bone.cubeList.add(new ModelBox(bone, 91, 250, -2.0F, -25.4F, -2.7F, 2, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 144, 12, -2.9739F, -25.5191F, -2.7F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 91, 250, -1.0261F, -25.5191F, -2.7F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 32, 170, -9.0F, -15.65F, -11.75F, 2, 4, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 166, 31, -10.7F, -15.65F, -10.45F, 3, 4, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 100, 171, 5.0F, -15.65F, -11.75F, 2, 4, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 166, 43, 5.4F, -15.65F, -10.05F, 3, 4, 2, 0.0F, false));

		bone14 = new RendererModel(this);
		bone14.setRotationPoint(-4.0F, -23.1F, -2.7F);
		bone.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, 0.3491F);
		bone14.cubeList.add(new ModelBox(bone14, 91, 250, 0.0F, -3.0F, 0.0F, 2, 3, 2, 0.0F, false));

		bone15 = new RendererModel(this);
		bone15.setRotationPoint(2.0F, -23.1F, -2.7F);
		bone.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, -0.3491F);
		bone15.cubeList.add(new ModelBox(bone15, 91, 250, -2.0F, -3.0F, 0.0F, 2, 3, 2, 0.0F, false));

		bone4 = new RendererModel(this);
		bone4.setRotationPoint(-1.1F, -20.4268F, -2.6F);
		bone.addChild(bone4);
		setRotationAngle(bone4, 0.5236F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 170, 149, -2.4F, 0.0F, -1.0F, 5, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 170, 121, -2.4F, -0.45F, -0.625F, 5, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 165, 69, -2.9F, 0.0F, -2.0F, 6, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 122, 106, -4.9F, 0.0F, -5.0F, 10, 1, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 86, 121, -3.9F, 14.5F, -11.6F, 8, 0, 4, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 60, 118, -5.9F, 0.0F, -7.0F, 12, 1, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 65, 99, -2.9F, -0.2F, -8.3F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 80, 237, 2.1F, -0.4F, -7.3F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 80, 237, 2.1F, -0.9F, -7.3F, 1, 1, 1, -0.25F, false));
		bone4.cubeList.add(new ModelBox(bone4, 80, 237, 0.9F, -0.4F, -8.8F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 80, 237, 0.9F, -0.9F, -8.8F, 1, 1, 1, -0.25F, false));
		bone4.cubeList.add(new ModelBox(bone4, 80, 237, 3.3F, -0.4F, -8.8F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 80, 237, 3.3F, -0.9F, -8.8F, 1, 1, 1, -0.25F, false));
		bone4.cubeList.add(new ModelBox(bone4, 65, 99, -2.9F, -0.5F, -8.3F, 1, 1, 1, -0.15F, false));
		bone4.cubeList.add(new ModelBox(bone4, 65, 99, -4.9F, -0.4F, -8.3F, 1, 1, 1, -0.15F, false));
		bone4.cubeList.add(new ModelBox(bone4, 251, 219, -1.5F, -0.8F, -2.3F, 2, 1, 1, -0.35F, false));
		bone4.cubeList.add(new ModelBox(bone4, 251, 219, -3.0F, -0.8F, -3.3F, 2, 1, 1, -0.35F, false));
		bone4.cubeList.add(new ModelBox(bone4, 251, 219, -2.3F, -0.8F, -4.9F, 2, 1, 1, -0.35F, false));
		bone4.cubeList.add(new ModelBox(bone4, 251, 219, 0.9F, -0.8F, -3.3F, 2, 1, 1, -0.35F, false));
		bone4.cubeList.add(new ModelBox(bone4, 251, 219, 0.2F, -0.8F, -4.9F, 2, 1, 1, -0.35F, false));
		bone4.cubeList.add(new ModelBox(bone4, 251, 219, -0.5F, -0.5F, -2.3F, 1, 1, 1, -0.15F, false));
		bone4.cubeList.add(new ModelBox(bone4, 206, 216, -0.5F, -0.3F, -2.3F, 1, 1, 1, -0.05F, false));
		bone4.cubeList.add(new ModelBox(bone4, 206, 216, -2.0F, -0.3F, -3.3F, 1, 1, 1, -0.05F, false));
		bone4.cubeList.add(new ModelBox(bone4, 206, 216, -1.3F, -0.3F, -4.9F, 1, 1, 1, -0.05F, false));
		bone4.cubeList.add(new ModelBox(bone4, 206, 216, 0.9F, -0.3F, -3.3F, 1, 1, 1, -0.05F, false));
		bone4.cubeList.add(new ModelBox(bone4, 206, 216, 0.2F, -0.3F, -4.9F, 1, 1, 1, -0.05F, false));
		bone4.cubeList.add(new ModelBox(bone4, 251, 219, -2.0F, -0.5F, -3.3F, 1, 1, 1, -0.15F, false));
		bone4.cubeList.add(new ModelBox(bone4, 251, 219, -1.3F, -0.5F, -4.9F, 1, 1, 1, -0.15F, false));
		bone4.cubeList.add(new ModelBox(bone4, 251, 219, 0.9F, -0.5F, -3.3F, 1, 1, 1, -0.15F, false));
		bone4.cubeList.add(new ModelBox(bone4, 251, 219, 0.2F, -0.5F, -4.9F, 1, 1, 1, -0.15F, false));
		bone4.cubeList.add(new ModelBox(bone4, 118, 23, -5.9F, 0.0F, -10.0F, 12, 1, 3, 0.0F, false));

		bone13 = new RendererModel(this);
		bone13.setRotationPoint(-1.1F, -12.1499F, -0.5857F);
		bone.addChild(bone13);
		setRotationAngle(bone13, -0.0873F, 0.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 60, 146, -2.4F, 0.0F, -1.0F, 5, 9, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 96, 30, -2.9F, 0.0F, -2.0F, 6, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 132, 118, -4.4F, 0.0F, -5.0F, 9, 1, 3, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 116, 86, -5.9F, 0.0F, -8.0F, 12, 1, 3, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 99, 117, -5.9F, 0.0F, -10.0F, 12, 1, 3, 0.0F, false));

		bone2 = new RendererModel(this);
		bone2.setRotationPoint(5.0F, -15.5F, -11.5F);
		side.addChild(bone2);
		setRotationAngle(bone2, -1.0472F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 175, 156, 0.0F, -1.8585F, -0.2549F, 2, 2, 2, 0.0F, false));

		bone3 = new RendererModel(this);
		bone3.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.4363F);
		bone3.cubeList.add(new ModelBox(bone3, 159, 159, -2.0598F, -9.8718F, -0.2549F, 2, 10, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 113, 158, -2.0598F, -6.8718F, -1.9549F, 2, 4, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 113, 158, -2.0598F, -6.3718F, -2.9549F, 2, 3, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 250, 248, -2.0598F, -6.3718F, -3.3549F, 1, 1, 1, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 250, 248, -2.0598F, -5.3718F, -3.3549F, 1, 1, 1, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 250, 248, -2.0598F, -4.3718F, -3.3549F, 1, 1, 1, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 250, 248, -2.0598F, -3.6718F, -2.4549F, 1, 1, 1, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 250, 248, -2.0598F, -7.0718F, -2.4549F, 1, 1, 1, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 250, 248, -1.0598F, -6.3718F, -3.3549F, 1, 1, 1, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 250, 248, -1.0598F, -5.3718F, -3.3549F, 1, 1, 1, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 250, 248, -1.0598F, -4.3718F, -3.3549F, 1, 1, 1, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 250, 248, -1.0598F, -3.6718F, -2.4549F, 1, 1, 1, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 250, 248, -1.0598F, -7.0718F, -2.4549F, 1, 1, 1, -0.25F, false));
		bone3.cubeList.add(new ModelBox(bone3, 148, 195, -2.3598F, -5.8718F, -2.7549F, 1, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 148, 195, -0.7598F, -5.8718F, -2.7549F, 1, 2, 2, 0.0F, false));

		throttle = new RendererModel(this);
		throttle.setRotationPoint(-2.6F, -4.9F, -1.8F);
		bone3.addChild(throttle);
		setRotationAngle(throttle, -0.9599F, 0.0F, 0.0F);
		throttle.cubeList.add(new ModelBox(throttle, 148, 195, -0.4848F, -0.4718F, -3.4549F, 2, 1, 1, -0.25F, false));
		throttle.cubeList.add(new ModelBox(throttle, 148, 195, -0.4848F, -0.4718F, -3.4549F, 1, 1, 4, -0.25F, false));
		throttle.cubeList.add(new ModelBox(throttle, 148, 195, -0.4848F, -0.4718F, -0.4549F, 1, 1, 1, -0.15F, false));
		throttle.cubeList.add(new ModelBox(throttle, 148, 195, 1.5152F, -0.4718F, -3.4549F, 2, 1, 1, -0.25F, false));
		throttle.cubeList.add(new ModelBox(throttle, 148, 195, 2.5152F, -0.4718F, -3.4549F, 1, 1, 4, -0.25F, false));
		throttle.cubeList.add(new ModelBox(throttle, 148, 195, 2.5152F, -0.4718F, -0.4549F, 1, 1, 1, -0.15F, false));

		bone5 = new RendererModel(this);
		bone5.setRotationPoint(-9.0F, -15.5F, -11.5F);
		side.addChild(bone5);
		setRotationAngle(bone5, -1.0472F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 12, 176, 0.0F, -1.8585F, -0.2549F, 2, 2, 2, 0.0F, false));

		bone6 = new RendererModel(this);
		bone6.setRotationPoint(0.0F, -2.0F, 0.0F);
		bone5.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, 0.4363F);
		bone6.cubeList.add(new ModelBox(bone6, 45, 158, 0.0598F, -9.8718F, -0.2549F, 2, 10, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 234, 190, 0.1598F, -6.5718F, -1.7549F, 1, 4, 2, -0.25F, false));
		bone6.cubeList.add(new ModelBox(bone6, 250, 200, 0.0598F, -2.2718F, -1.4549F, 2, 2, 2, -0.45F, false));
		bone6.cubeList.add(new ModelBox(bone6, 250, 200, 0.0598F, -8.8718F, -1.4549F, 2, 2, 2, -0.45F, false));
		bone6.cubeList.add(new ModelBox(bone6, 250, 200, 0.0598F, -2.2718F, -2.1549F, 2, 2, 2, -0.7F, false));
		bone6.cubeList.add(new ModelBox(bone6, 250, 200, 0.0598F, -8.8718F, -2.1549F, 2, 2, 2, -0.7F, false));
		bone6.cubeList.add(new ModelBox(bone6, 250, 200, 0.5598F, -6.0718F, -1.5549F, 1, 3, 2, -0.25F, false));
		bone6.cubeList.add(new ModelBox(bone6, 64, 101, -0.9402F, -7.0718F, -0.6549F, 2, 1, 1, -0.2F, false));
		bone6.cubeList.add(new ModelBox(bone6, 250, 200, -0.1402F, -6.0718F, -1.5549F, 1, 3, 2, -0.25F, false));

		fastreturn = new RendererModel(this);
		fastreturn.setRotationPoint(1.3F, -4.5F, -0.9F);
		bone6.addChild(fastreturn);
		setRotationAngle(fastreturn, 0.0F, 0.0F, 0.4363F);
		fastreturn.cubeList.add(new ModelBox(fastreturn, 232, 194, -1.2402F, -0.5718F, -0.2549F, 3, 1, 1, -0.25F, false));
		fastreturn.cubeList.add(new ModelBox(fastreturn, 65, 101, 1.2598F, -0.5718F, -0.2549F, 1, 1, 1, -0.15F, false));

		bone7 = new RendererModel(this);
		bone7.setRotationPoint(5.0F, -15.5F, -11.5F);
		side.addChild(bone7);
		setRotationAngle(bone7, -1.6581F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 73, 176, 0.0F, -2.0865F, 1.8571F, 2, 2, 2, 0.0F, false));

		bone8 = new RendererModel(this);
		bone8.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone7.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, -0.4363F);
		bone8.cubeList.add(new ModelBox(bone8, 123, 152, -1.9634F, -11.0784F, 1.8571F, 2, 11, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 19, 135, -1.9634F, -11.0784F, 3.8571F, 2, 2, 7, 0.0F, false));

		bone12 = new RendererModel(this);
		bone12.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone7.addChild(bone12);
		setRotationAngle(bone12, 0.4363F, 0.0F, -0.4363F);
		bone12.cubeList.add(new ModelBox(bone12, 114, 165, -1.9634F, -5.452F, 12.5218F, 2, 6, 2, 0.0F, false));

		bone9 = new RendererModel(this);
		bone9.setRotationPoint(-9.0F, -15.5F, -11.5F);
		side.addChild(bone9);
		setRotationAngle(bone9, -1.6581F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 37, 176, 0.0F, -2.0865F, 1.8571F, 2, 2, 2, 0.0F, false));

		bone10 = new RendererModel(this);
		bone10.setRotationPoint(0.0F, -2.0F, 0.0F);
		bone9.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, 0.4363F);
		bone10.cubeList.add(new ModelBox(bone10, 99, 152, -0.0366F, -11.0784F, 1.8571F, 2, 11, 2, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 142, 49, -0.0366F, -11.0784F, 3.8571F, 2, 2, 7, 0.0F, false));

		bone11 = new RendererModel(this);
		bone11.setRotationPoint(1.9634F, -11.0784F, 10.8321F);
		bone10.addChild(bone11);
		setRotationAngle(bone11, -1.1345F, 0.0F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 121, 144, -2.0F, -0.0235F, 0.0086F, 2, 2, 6, 0.0F, false));

		side2 = new RendererModel(this);
		side2.setRotationPoint(-20.0F, 3.0F, -8.0F);
		base.addChild(side2);
		setRotationAngle(side2, 0.0F, 1.0472F, 0.0F);


		bone16 = new RendererModel(this);
		bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
		side2.addChild(bone16);
		bone16.cubeList.add(new ModelBox(bone16, 80, 12, -2.1902F, -15.15F, 1.7192F, 12, 3, 1, 0.2F, false));
		bone16.cubeList.add(new ModelBox(bone16, 90, 240, 0.8098F, -23.1F, 10.4692F, 6, 4, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 232, 54, -1.1902F, -20.1F, 12.4692F, 10, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 209, 53, -1.1902F, -6.1F, 12.4692F, 10, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 243, 17, 1.6098F, -22.3F, 10.1692F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 243, 17, 1.3098F, -24.2F, 10.0692F, 2, 1, 1, -0.1F, false));
		bone16.cubeList.add(new ModelBox(bone16, 243, 17, 3.4098F, -22.3F, 10.1692F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 243, 17, 5.3098F, -22.3F, 10.1692F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 66, 100, 4.7098F, -23.5F, 10.1692F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 66, 100, 4.7098F, -25.7F, 10.1692F, 1, 1, 1, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 66, 100, 4.7098F, -25.6F, 10.0692F, 1, 3, 0, 0.1F, false));
		bone16.cubeList.add(new ModelBox(bone16, 66, 100, 1.8098F, -24.7F, 10.4692F, 1, 2, 0, 0.1F, false));
		bone16.cubeList.add(new ModelBox(bone16, 66, 100, 1.8098F, -24.7F, 10.4692F, 1, 2, 0, 0.1F, false));
		bone16.cubeList.add(new ModelBox(bone16, 66, 100, 4.7098F, -22.6F, 10.0942F, 0, 1, 0, 0.1F, false));
		bone16.cubeList.add(new ModelBox(bone16, 66, 100, 5.1098F, -21.6F, 10.0942F, 0, 1, 0, 0.1F, false));
		bone16.cubeList.add(new ModelBox(bone16, 66, 100, 5.1098F, -20.6F, 10.0942F, 0, 0, 0, 0.2F, false));
		bone16.cubeList.add(new ModelBox(bone16, 66, 100, 4.9098F, -21.6F, 10.0942F, 0, 0, 0, 0.1F, false));
		bone16.cubeList.add(new ModelBox(bone16, 66, 100, 5.8098F, -22.25F, 9.8692F, 0, 1, 1, -0.1F, false));
		bone16.cubeList.add(new ModelBox(bone16, 66, 100, 3.9098F, -22.25F, 9.8692F, 0, 1, 1, -0.1F, false));
		bone16.cubeList.add(new ModelBox(bone16, 66, 100, 2.1098F, -22.25F, 9.8692F, 0, 1, 1, -0.1F, false));
		bone16.cubeList.add(new ModelBox(bone16, 91, 250, 2.8098F, -25.7F, 10.4692F, 2, 3, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 91, 250, 1.8358F, -25.9191F, 10.4692F, 2, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 91, 250, 3.7837F, -25.9191F, 10.4692F, 2, 1, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 170, 115, -4.1902F, -15.65F, 1.4192F, 2, 4, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 243, 192, -4.1902F, -15.65F, 0.8192F, 2, 2, 1, -0.1F, false));
		bone16.cubeList.add(new ModelBox(bone16, 224, 175, -4.0902F, -15.55F, 0.3192F, 1, 3, 1, -0.3F, false));
		bone16.cubeList.add(new ModelBox(bone16, 224, 175, -3.6902F, -13.55F, 0.3192F, 1, 1, 1, -0.3F, false));
		bone16.cubeList.add(new ModelBox(bone16, 224, 175, -4.6902F, -15.55F, 0.3192F, 2, 1, 1, -0.3F, false));
		bone16.cubeList.add(new ModelBox(bone16, 224, 175, -3.2902F, -15.55F, 0.3192F, 1, 4, 1, -0.3F, false));
		bone16.cubeList.add(new ModelBox(bone16, 64, 100, -3.2902F, -12.55F, -1.0808F, 1, 1, 2, -0.3F, false));
		bone16.cubeList.add(new ModelBox(bone16, 106, 95, -5.9902F, -15.65F, 2.7656F, 3, 4, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 108, 171, 9.8098F, -15.65F, 1.4192F, 2, 4, 2, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 167, 158, 10.7F, -15.65F, 2.829F, 3, 4, 2, 0.0F, false));

		bone17 = new RendererModel(this);
		bone17.setRotationPoint(-4.0F, -23.1F, -2.7F);
		bone16.addChild(bone17);
		setRotationAngle(bone17, 0.0F, 0.0F, 0.3491F);
		bone17.cubeList.add(new ModelBox(bone17, 91, 250, 4.5197F, -4.645F, 13.1692F, 2, 3, 2, 0.0F, false));

		bone18 = new RendererModel(this);
		bone18.setRotationPoint(2.0F, -23.1F, -2.7F);
		bone16.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0F, -0.3491F);
		bone18.cubeList.add(new ModelBox(bone18, 91, 250, 2.5197F, -1.355F, 13.1692F, 2, 3, 2, 0.0F, false));

		bone19 = new RendererModel(this);
		bone19.setRotationPoint(-1.1F, -20.4268F, -2.6F);
		bone16.addChild(bone19);
		setRotationAngle(bone19, 0.5236F, 0.0F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 170, 149, 2.4098F, 6.5846F, 10.4049F, 5, 1, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 172, 71, 2.4098F, 6.1346F, 10.7799F, 5, 1, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 165, 69, 1.9098F, 6.5846F, 9.4049F, 6, 1, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 86, 121, 0.9098F, 21.1846F, -0.0951F, 8, 0, 4, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 122, 106, -0.0902F, 6.5846F, 6.4049F, 10, 1, 3, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 237, 97, 0.7098F, 5.7846F, 2.4049F, 2, 2, 2, -0.4F, false));
		bone19.cubeList.add(new ModelBox(bone19, 237, 97, 1.1098F, 5.7846F, 2.9049F, 1, 1, 1, -0.2F, false));
		bone19.cubeList.add(new ModelBox(bone19, 237, 97, -0.1902F, 5.6846F, 2.9049F, 2, 1, 1, -0.3F, false));
		bone19.cubeList.add(new ModelBox(bone19, 60, 118, -1.0902F, 6.5846F, 4.4049F, 12, 1, 2, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 118, 23, -1.0902F, 6.5846F, 1.4049F, 12, 1, 3, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 34, 132, 6.9098F, 5.9846F, 3.9049F, 2, 1, 1, -0.3F, false));
		bone19.cubeList.add(new ModelBox(bone19, 34, 132, 6.0098F, 5.9846F, 5.5049F, 2, 1, 1, -0.3F, false));
		bone19.cubeList.add(new ModelBox(bone19, 34, 132, 6.0098F, 5.9846F, 2.2049F, 2, 1, 1, -0.3F, false));

		bone151 = new RendererModel(this);
		bone151.setRotationPoint(4.8098F, 5.2846F, 7.4049F);
		bone19.addChild(bone151);
		bone151.cubeList.add(new ModelBox(bone151, 237, 97, -1.0F, -0.3F, -1.0F, 2, 2, 2, -0.3F, false));
		bone151.cubeList.add(new ModelBox(bone151, 237, 97, 0.3F, -0.3F, -1.0F, 1, 2, 2, -0.4F, false));
		bone151.cubeList.add(new ModelBox(bone151, 237, 97, -1.0F, -1.6F, -1.0F, 2, 2, 2, -0.4F, false));
		bone151.cubeList.add(new ModelBox(bone151, 237, 97, -1.0F, -1.3F, -1.0F, 2, 1, 2, -0.3F, false));

		yswitch = new RendererModel(this);
		yswitch.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone19.addChild(yswitch);
		yswitch.cubeList.add(new ModelBox(yswitch, 207, 148, 6.8848F, 5.0846F, 3.9049F, 1, 2, 1, -0.4F, false));
		yswitch.cubeList.add(new ModelBox(yswitch, 34, 132, 6.8848F, 4.9846F, 3.9049F, 1, 1, 1, -0.3F, false));

		xswitch = new RendererModel(this);
		xswitch.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone19.addChild(xswitch);
		xswitch.cubeList.add(new ModelBox(xswitch, 207, 148, 6.0098F, 5.0846F, 5.5049F, 1, 2, 1, -0.4F, false));
		xswitch.cubeList.add(new ModelBox(xswitch, 34, 132, 6.0098F, 4.9846F, 5.5049F, 1, 1, 1, -0.3F, false));

		zswitch = new RendererModel(this);
		zswitch.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone19.addChild(zswitch);
		zswitch.cubeList.add(new ModelBox(zswitch, 207, 148, 5.9848F, 4.9846F, 2.2049F, 1, 2, 1, -0.4F, false));
		zswitch.cubeList.add(new ModelBox(zswitch, 34, 132, 5.9848F, 4.9846F, 2.2049F, 1, 1, 1, -0.3F, false));

		bone20 = new RendererModel(this);
		bone20.setRotationPoint(-1.1F, -12.1499F, -0.5857F);
		bone16.addChild(bone20);
		setRotationAngle(bone20, -0.0873F, 0.0F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 60, 145, 2.4098F, -2.1478F, 12.1191F, 5, 10, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 166, 67, 1.9098F, -1.1478F, 11.1191F, 6, 1, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 92, 111, 0.4098F, -1.1478F, 8.1191F, 9, 1, 3, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 116, 78, -1.0902F, -1.1478F, 5.1191F, 12, 1, 3, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 112, 16, -1.0902F, -1.1478F, 3.1191F, 12, 1, 3, 0.0F, false));

		bone21 = new RendererModel(this);
		bone21.setRotationPoint(5.0F, -15.5F, -11.5F);
		side2.addChild(bone21);
		setRotationAngle(bone21, -1.0472F, 0.0F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 0, 176, 4.8098F, -13.2634F, 6.3297F, 2, 2, 2, 0.0F, false));

		bone22 = new RendererModel(this);
		bone22.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone21.addChild(bone22);
		setRotationAngle(bone22, 0.0F, 0.0F, -0.4363F);
		bone22.cubeList.add(new ModelBox(bone22, 161, 9, 7.1192F, -18.1754F, 6.3297F, 2, 10, 2, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 250, 199, 7.6192F, -12.1754F, 5.5297F, 1, 1, 2, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 250, 199, 7.6192F, -13.9754F, 5.5297F, 1, 2, 2, -0.1F, false));
		bone22.cubeList.add(new ModelBox(bone22, 64, 101, 7.6192F, -15.3754F, 5.5297F, 1, 2, 2, -0.2F, false));
		bone22.cubeList.add(new ModelBox(bone22, 64, 101, 7.6192F, -15.3754F, 5.5297F, 2, 1, 2, -0.2F, false));

		bone154 = new RendererModel(this);
		bone154.setRotationPoint(7.9692F, -11.6754F, 5.4297F);
		bone22.addChild(bone154);
		setRotationAngle(bone154, 0.0F, 0.0F, 0.1745F);
		bone154.cubeList.add(new ModelBox(bone154, 105, 59, -2.65F, -0.5F, -0.5F, 2, 1, 1, -0.175F, false));
		bone154.cubeList.add(new ModelBox(bone154, 250, 199, -1.35F, -0.5F, -0.5F, 2, 1, 1, -0.2F, false));

		bone23 = new RendererModel(this);
		bone23.setRotationPoint(-9.0F, -15.5F, -11.5F);
		side2.addChild(bone23);
		setRotationAngle(bone23, -1.0472F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 175, 145, 4.8098F, -13.2634F, 6.3297F, 2, 2, 2, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 250, 162, 7.0098F, -17.7634F, 6.0297F, 1, 2, 1, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 250, 162, 7.0098F, -17.7634F, 5.7297F, 1, 2, 1, -0.1F, false));

		doorcontrol = new RendererModel(this);
		doorcontrol.setRotationPoint(7.5098F, -15.7634F, 6.3297F);
		bone23.addChild(doorcontrol);
		setRotationAngle(doorcontrol, -0.9599F, 0.0F, 0.0F);
		doorcontrol.cubeList.add(new ModelBox(doorcontrol, 203, 164, -0.5F, -0.2739F, -0.6011F, 1, 2, 1, -0.175F, false));
		doorcontrol.cubeList.add(new ModelBox(doorcontrol, 64, 100, -0.5F, 1.3261F, -0.6011F, 1, 2, 1, -0.2F, false));

		bone24 = new RendererModel(this);
		bone24.setRotationPoint(0.0F, -2.0F, 0.0F);
		bone23.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.0F, 0.4363F);
		bone24.cubeList.add(new ModelBox(bone24, 162, 113, -0.401F, -22.2408F, 6.3297F, 2, 10, 2, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 199, 137, -0.401F, -20.9408F, 5.9297F, 2, 2, 2, -0.1F, false));
		bone24.cubeList.add(new ModelBox(bone24, 63, 100, -0.401F, -14.9408F, 5.8297F, 2, 2, 2, -0.4F, false));
		bone24.cubeList.add(new ModelBox(bone24, 244, 194, 0.099F, -14.4408F, 5.8297F, 1, 1, 2, -0.3F, false));
		bone24.cubeList.add(new ModelBox(bone24, 199, 137, 0.099F, -20.4408F, 3.2297F, 1, 1, 4, -0.3F, false));
		bone24.cubeList.add(new ModelBox(bone24, 199, 137, 0.099F, -20.4408F, 3.2297F, 1, 1, 1, -0.1F, false));
		bone24.cubeList.add(new ModelBox(bone24, 199, 137, 0.099F, -20.4408F, 5.5297F, 1, 1, 1, -0.1F, false));

		bone25 = new RendererModel(this);
		bone25.setRotationPoint(5.0F, -15.5F, -11.5F);
		side2.addChild(bone25);
		setRotationAngle(bone25, -1.6581F, 0.0F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 81, 122, 4.8098F, -15.2056F, 0.7094F, 2, 2, 2, 0.0F, false));

		bone26 = new RendererModel(this);
		bone26.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone25.addChild(bone26);
		setRotationAngle(bone26, 0.0F, 0.0F, -0.4363F);
		bone26.cubeList.add(new ModelBox(bone26, 115, 152, 7.9401F, -20.9357F, 0.7094F, 2, 11, 2, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 132, 136, 7.9401F, -20.9357F, 2.7094F, 2, 2, 7, 0.0F, false));

		bone27 = new RendererModel(this);
		bone27.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone25.addChild(bone27);
		setRotationAngle(bone27, 0.4363F, 0.0F, -0.4363F);
		bone27.cubeList.add(new ModelBox(bone27, 122, 165, 7.9401F, -14.8708F, 15.6475F, 2, 6, 2, 0.0F, false));

		bone28 = new RendererModel(this);
		bone28.setRotationPoint(-9.0F, -15.5F, -11.5F);
		side2.addChild(bone28);
		setRotationAngle(bone28, -1.6581F, 0.0F, 0.0F);
		bone28.cubeList.add(new ModelBox(bone28, 175, 137, 4.8098F, -15.2056F, 0.7094F, 2, 2, 2, 0.0F, false));

		bone29 = new RendererModel(this);
		bone29.setRotationPoint(0.0F, -2.0F, 0.0F);
		bone28.addChild(bone29);
		setRotationAngle(bone29, 0.0F, 0.0F, 0.4363F);
		bone29.cubeList.add(new ModelBox(bone29, 107, 152, -1.2218F, -25.0011F, 0.7094F, 2, 11, 2, 0.0F, false));
		bone29.cubeList.add(new ModelBox(bone29, 114, 135, -1.2218F, -25.0011F, 2.7094F, 2, 2, 7, 0.0F, false));

		bone30 = new RendererModel(this);
		bone30.setRotationPoint(1.9634F, -11.0784F, 10.8321F);
		bone29.addChild(bone30);
		setRotationAngle(bone30, -1.1345F, 0.0F, 0.0F);
		bone30.cubeList.add(new ModelBox(bone30, 142, 23, -3.1852F, -4.8672F, -13.0947F, 2, 2, 6, 0.0F, false));

		side3 = new RendererModel(this);
		side3.setRotationPoint(-32.0F, 3.0F, -8.0F);
		base.addChild(side3);
		setRotationAngle(side3, 0.0F, 2.0944F, 0.0F);


		bone31 = new RendererModel(this);
		bone31.setRotationPoint(0.0F, 0.0F, 0.0F);
		side3.addChild(bone31);
		bone31.cubeList.add(new ModelBox(bone31, 25, 131, -27.1902F, -15.15F, 5.541F, 12, 3, 1, 0.2F, false));
		bone31.cubeList.add(new ModelBox(bone31, 90, 240, -24.1902F, -23.1F, 14.291F, 6, 4, 2, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 233, 196, -22.0902F, -26.4F, 13.791F, 2, 2, 1, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 95, 131, -21.0902F, -26.2F, 13.391F, 0, 2, 1, -0.2F, false));
		bone31.cubeList.add(new ModelBox(bone31, 237, 57, -24.1902F, -20.1F, 16.291F, 6, 1, 2, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 209, 53, -24.1902F, -6.1F, 16.291F, 6, 1, 2, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 91, 250, -22.1902F, -25.6F, 14.291F, 2, 3, 2, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 91, 250, -23.1642F, -25.6191F, 14.291F, 2, 1, 2, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 91, 250, -21.2163F, -25.6191F, 14.291F, 2, 1, 2, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 75, 170, -29.1902F, -15.65F, 5.241F, 2, 4, 2, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 130, 167, -31.0304F, -15.65F, 6.5642F, 3, 4, 2, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 59, 170, -15.1902F, -15.65F, 5.241F, 2, 4, 2, 0.0F, false));
		bone31.cubeList.add(new ModelBox(bone31, 166, 61, -14.3902F, -15.65F, 6.5874F, 3, 4, 2, 0.0F, false));

		telepathic = new RendererModel(this);
		telepathic.setRotationPoint(-4.0F, -12.0F, -11.0F);
		bone31.addChild(telepathic);
		telepathic.cubeList.add(new ModelBox(telepathic, 161, 208, -18.2902F, -11.8F, 23.291F, 2, 1, 4, -0.1F, false));
		telepathic.cubeList.add(new ModelBox(telepathic, 161, 208, -18.2902F, -11.1F, 23.291F, 2, 1, 4, -0.1F, false));
		telepathic.cubeList.add(new ModelBox(telepathic, 148, 221, -18.2902F, -11.5F, 23.291F, 2, 1, 4, 0.0F, false));
		telepathic.cubeList.add(new ModelBox(telepathic, 148, 221, -19.0902F, -12.1F, 24.791F, 4, 1, 2, 0.0F, false));
		telepathic.cubeList.add(new ModelBox(telepathic, 148, 221, -19.6902F, -11.7F, 24.791F, 5, 2, 2, 0.0F, false));

		bone32 = new RendererModel(this);
		bone32.setRotationPoint(-4.0F, -23.1F, -2.7F);
		bone31.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, 0.3491F);
		bone32.cubeList.add(new ModelBox(bone32, 91, 250, -18.9726F, 3.9055F, 16.991F, 2, 3, 2, 0.0F, false));

		bone33 = new RendererModel(this);
		bone33.setRotationPoint(2.0F, -23.1F, -2.7F);
		bone31.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, -0.3491F);
		bone33.cubeList.add(new ModelBox(bone33, 91, 250, -20.9726F, -9.9055F, 16.991F, 2, 3, 2, 0.0F, false));

		bone34 = new RendererModel(this);
		bone34.setRotationPoint(-1.1F, -20.4268F, -2.6F);
		bone31.addChild(bone34);
		setRotationAngle(bone34, 0.5236F, 0.0F, 0.0F);
		bone34.cubeList.add(new ModelBox(bone34, 170, 149, -22.5902F, 8.4955F, 13.7147F, 5, 1, 1, 0.0F, false));
		bone34.cubeList.add(new ModelBox(bone34, 167, 9, -22.5902F, 8.0455F, 14.0897F, 5, 1, 1, 0.0F, false));
		bone34.cubeList.add(new ModelBox(bone34, 165, 69, -23.0902F, 8.4955F, 12.7147F, 6, 1, 1, 0.0F, false));
		bone34.cubeList.add(new ModelBox(bone34, 122, 106, -25.0902F, 8.4955F, 9.7147F, 10, 1, 3, 0.0F, false));
		bone34.cubeList.add(new ModelBox(bone34, 86, 121, -24.0902F, 23.0205F, 3.1147F, 8, 0, 4, 0.0F, false));
		bone34.cubeList.add(new ModelBox(bone34, 60, 118, -26.0902F, 8.4955F, 7.7147F, 12, 1, 2, 0.0F, false));
		bone34.cubeList.add(new ModelBox(bone34, 233, 190, -20.0902F, 6.5955F, 9.8147F, 0, 2, 0, -0.2F, false));
		bone34.cubeList.add(new ModelBox(bone34, 248, 193, -21.0902F, 5.0955F, 9.2147F, 2, 2, 2, -0.3F, false));
		bone34.cubeList.add(new ModelBox(bone34, 233, 190, -21.0902F, 7.9955F, 9.3397F, 2, 2, 2, -0.2F, false));
		bone34.cubeList.add(new ModelBox(bone34, 218, 207, -21.5902F, 5.0955F, 9.2147F, 3, 2, 2, -0.4F, false));
		bone34.cubeList.add(new ModelBox(bone34, 233, 190, -20.0902F, 6.5955F, 10.7147F, 0, 2, 0, -0.2F, false));
		bone34.cubeList.add(new ModelBox(bone34, 118, 23, -26.0902F, 8.4955F, 4.7147F, 12, 1, 3, 0.0F, false));
		bone34.cubeList.add(new ModelBox(bone34, 230, 189, -23.8902F, 7.9955F, 7.6147F, 2, 1, 2, 0.0F, false));
		bone34.cubeList.add(new ModelBox(bone34, 22, 35, -23.8902F, 7.7955F, 7.6147F, 2, 1, 2, -0.1F, false));
		bone34.cubeList.add(new ModelBox(bone34, 67, 101, -22.8902F, 7.6955F, 7.7147F, 0, 1, 1, -0.1F, false));
		bone34.cubeList.add(new ModelBox(bone34, 67, 101, -25.2902F, 7.6955F, 6.0147F, 1, 1, 0, -0.1F, false));
		bone34.cubeList.add(new ModelBox(bone34, 230, 189, -25.2902F, 7.9955F, 5.1147F, 2, 1, 2, 0.0F, false));
		bone34.cubeList.add(new ModelBox(bone34, 20, 33, -25.2902F, 7.7955F, 5.1147F, 2, 1, 2, -0.1F, false));
		bone34.cubeList.add(new ModelBox(bone34, 34, 132, -17.6902F, 6.9846F, 6.9049F, 1, 1, 1, -0.3F, false));
		bone34.cubeList.add(new ModelBox(bone34, 34, 132, -17.6902F, 6.9846F, 5.6049F, 1, 1, 1, -0.3F, false));
		bone34.cubeList.add(new ModelBox(bone34, 207, 148, -17.6902F, 6.9846F, 6.9049F, 1, 2, 1, -0.4F, false));
		bone34.cubeList.add(new ModelBox(bone34, 207, 148, -17.6902F, 6.9846F, 5.6049F, 1, 2, 1, -0.4F, false));
		bone34.cubeList.add(new ModelBox(bone34, 34, 132, -17.6902F, 7.9846F, 6.9049F, 2, 1, 1, -0.3F, false));
		bone34.cubeList.add(new ModelBox(bone34, 34, 132, -17.6902F, 7.9846F, 5.6049F, 2, 1, 1, -0.3F, false));

		bone35 = new RendererModel(this);
		bone35.setRotationPoint(-1.1F, -12.1499F, -0.5857F);
		bone31.addChild(bone35);
		setRotationAngle(bone35, -0.0873F, 0.0F, 0.0F);
		bone35.cubeList.add(new ModelBox(bone35, 60, 104, -22.5902F, -1.4809F, 15.9264F, 5, 9, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 60, 145, -22.5902F, -1.4809F, 15.9264F, 5, 9, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 146, 80, -23.0902F, -1.4809F, 14.9264F, 6, 1, 1, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 131, 132, -24.5902F, -1.4809F, 11.9264F, 9, 1, 3, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 112, 66, -26.0902F, -1.4809F, 8.9264F, 12, 1, 3, 0.0F, false));
		bone35.cubeList.add(new ModelBox(bone35, 112, 0, -26.0902F, -1.4809F, 6.9264F, 12, 1, 3, 0.0F, false));

		bone36 = new RendererModel(this);
		bone36.setRotationPoint(5.0F, -15.5F, -11.5F);
		side3.addChild(bone36);
		setRotationAngle(bone36, -1.0472F, 0.0F, 0.0F);
		bone36.cubeList.add(new ModelBox(bone36, 140, 3, -20.1902F, -16.5732F, 8.2406F, 2, 2, 2, 0.0F, false));

		bone37 = new RendererModel(this);
		bone37.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone36.addChild(bone37);
		setRotationAngle(bone37, 0.0F, 0.0F, -0.4363F);
		bone37.cubeList.add(new ModelBox(bone37, 92, 163, -14.1397F, -31.7405F, 8.2406F, 2, 10, 2, 0.0F, false));
		bone37.cubeList.add(new ModelBox(bone37, 193, 221, -14.1165F, -29.9663F, 7.9438F, 2, 5, 1, -0.025F, false));
		bone37.cubeList.add(new ModelBox(bone37, 193, 221, -13.6165F, -25.9163F, 7.4938F, 1, 1, 1, -0.1F, false));
		bone37.cubeList.add(new ModelBox(bone37, 193, 221, -14.1165F, -28.7163F, 6.9938F, 1, 2, 1, -0.1F, false));
		bone37.cubeList.add(new ModelBox(bone37, 193, 221, -13.5165F, -29.7163F, 6.9938F, 1, 4, 1, -0.3F, false));
		bone37.cubeList.add(new ModelBox(bone37, 193, 221, -13.0165F, -29.7163F, 6.9938F, 1, 4, 1, -0.3F, false));
		bone37.cubeList.add(new ModelBox(bone37, 193, 221, -14.1165F, -29.7163F, 7.3938F, 2, 4, 1, -0.1F, false));

		verticallanding = new RendererModel(this);
		verticallanding.setRotationPoint(-13.6102F, -27.6163F, 7.4438F);
		bone37.addChild(verticallanding);
		setRotationAngle(verticallanding, -0.9599F, 0.0F, 0.0F);
		verticallanding.cubeList.add(new ModelBox(verticallanding, 247, 220, -0.1563F, 0.0F, -2.95F, 1, 0, 0, -0.2F, false));
		verticallanding.cubeList.add(new ModelBox(verticallanding, 193, 221, -0.2062F, 0.0F, -2.95F, 0, 0, 3, -0.125F, false));
		verticallanding.cubeList.add(new ModelBox(verticallanding, 193, 221, 0.1938F, 0.0F, -2.95F, 0, 0, 3, -0.125F, false));
		verticallanding.cubeList.add(new ModelBox(verticallanding, 247, 220, -0.8313F, 0.0F, -2.95F, 1, 0, 0, -0.2F, false));

		bone38 = new RendererModel(this);
		bone38.setRotationPoint(-9.0F, -15.5F, -11.5F);
		side3.addChild(bone38);
		setRotationAngle(bone38, -1.0472F, 0.0F, 0.0F);
		bone38.cubeList.add(new ModelBox(bone38, 175, 59, -20.1902F, -16.5732F, 8.2406F, 2, 2, 2, 0.0F, false));

		bone39 = new RendererModel(this);
		bone39.setRotationPoint(0.0F, -2.0F, 0.0F);
		bone38.addChild(bone39);
		setRotationAngle(bone39, 0.0F, 0.0F, 0.4363F);
		bone39.cubeList.add(new ModelBox(bone39, 37, 158, -24.4574F, -14.675F, 8.2406F, 2, 10, 2, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 232, 191, -24.0586F, -8.5361F, 7.0496F, 1, 2, 2, 0.0F, false));
		bone39.cubeList.add(new ModelBox(bone39, 232, 191, -24.0586F, -11.1361F, 7.0246F, 1, 3, 2, -0.1F, false));
		bone39.cubeList.add(new ModelBox(bone39, 249, 195, -24.0586F, -7.8361F, 7.0496F, 1, 2, 2, 0.1F, false));
		bone39.cubeList.add(new ModelBox(bone39, 94, 131, -24.0586F, -6.5361F, 6.9246F, 1, 2, 2, 0.125F, false));

		bone40 = new RendererModel(this);
		bone40.setRotationPoint(5.0F, -15.5F, -11.5F);
		side3.addChild(bone40);
		setRotationAngle(bone40, -1.6581F, 0.0F, 0.0F);
		bone40.cubeList.add(new ModelBox(bone40, 175, 73, -20.1902F, -19.0129F, 0.3763F, 2, 2, 2, 0.0F, false));

		bone41 = new RendererModel(this);
		bone41.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone40.addChild(bone41);
		setRotationAngle(bone41, 0.0F, 0.0F, -0.4363F);
		bone41.cubeList.add(new ModelBox(bone41, 0, 156, -13.1086F, -34.9517F, 0.3763F, 2, 11, 2, 0.0F, false));
		bone41.cubeList.add(new ModelBox(bone41, 139, 63, -13.1086F, -34.9517F, 2.3763F, 2, 2, 7, 0.0F, false));

		bone42 = new RendererModel(this);
		bone42.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone40.addChild(bone42);
		setRotationAngle(bone42, 0.4363F, 0.0F, -0.4363F);
		bone42.cubeList.add(new ModelBox(bone42, 48, 0, -13.1086F, -27.7144F, 21.269F, 2, 6, 2, 0.0F, false));

		bone43 = new RendererModel(this);
		bone43.setRotationPoint(-9.0F, -15.5F, -11.5F);
		side3.addChild(bone43);
		setRotationAngle(bone43, -1.6581F, 0.0F, 0.0F);
		bone43.cubeList.add(new ModelBox(bone43, 175, 96, -20.1902F, -19.0129F, 0.3763F, 2, 2, 2, 0.0F, false));

		bone44 = new RendererModel(this);
		bone44.setRotationPoint(0.0F, -2.0F, 0.0F);
		bone43.addChild(bone44);
		setRotationAngle(bone44, 0.0F, 0.0F, 0.4363F);
		bone44.cubeList.add(new ModelBox(bone44, 29, 156, -25.4885F, -17.8861F, 0.3763F, 2, 11, 2, 0.0F, false));
		bone44.cubeList.add(new ModelBox(bone44, 78, 135, -25.4885F, -17.8861F, 2.3763F, 2, 2, 7, 0.0F, false));

		bone45 = new RendererModel(this);
		bone45.setRotationPoint(1.9634F, -11.0784F, 10.8321F);
		bone44.addChild(bone45);
		setRotationAngle(bone45, -1.1345F, 0.0F, 0.0F);
		bone45.cubeList.add(new ModelBox(bone45, 105, 144, -27.452F, -1.5584F, -6.7872F, 2, 2, 6, 0.0F, false));

		side4 = new RendererModel(this);
		side4.setRotationPoint(-32.0F, 3.0F, -8.0F);
		base.addChild(side4);
		setRotationAngle(side4, 0.0F, 3.1416F, 0.0F);


		bone46 = new RendererModel(this);
		bone46.setRotationPoint(0.0F, 0.0F, 0.0F);
		side4.addChild(bone46);
		bone46.cubeList.add(new ModelBox(bone46, 82, 131, -37.0F, -15.15F, -24.591F, 12, 3, 1, 0.2F, false));
		bone46.cubeList.add(new ModelBox(bone46, 90, 240, -34.0F, -23.1F, -15.841F, 6, 4, 2, 0.0F, false));
		bone46.cubeList.add(new ModelBox(bone46, 246, 191, -28.35F, -26.1F, -16.141F, 1, 7, 1, -0.1F, false));
		bone46.cubeList.add(new ModelBox(bone46, 246, 191, -28.35F, -26.1F, -15.416F, 1, 1, 3, -0.1F, false));
		bone46.cubeList.add(new ModelBox(bone46, 246, 191, -33.15F, -26.1F, -13.416F, 5, 1, 1, -0.1F, false));
		bone46.cubeList.add(new ModelBox(bone46, 246, 196, -36.15F, -27.6F, -13.416F, 4, 1, 1, -0.1F, false));
		bone46.cubeList.add(new ModelBox(bone46, 246, 191, -33.15F, -26.8F, -13.416F, 1, 1, 1, -0.1F, false));
		bone46.cubeList.add(new ModelBox(bone46, 231, 97, -29.8F, -24.7F, -16.041F, 1, 2, 2, 0.0F, false));
		bone46.cubeList.add(new ModelBox(bone46, 231, 97, -29.8F, -24.7F, -16.241F, 1, 2, 2, -0.1F, false));
		bone46.cubeList.add(new ModelBox(bone46, 237, 57, -36.0F, -20.1F, -13.841F, 10, 1, 2, 0.0F, false));
		bone46.cubeList.add(new ModelBox(bone46, 209, 53, -36.0F, -6.1F, -13.841F, 10, 1, 2, 0.0F, false));
		bone46.cubeList.add(new ModelBox(bone46, 91, 250, -32.0F, -25.7F, -15.841F, 2, 3, 2, 0.0F, false));
		bone46.cubeList.add(new ModelBox(bone46, 91, 250, -32.9739F, -25.9191F, -15.841F, 2, 1, 2, 0.0F, false));
		bone46.cubeList.add(new ModelBox(bone46, 91, 250, -31.0261F, -25.9191F, -15.841F, 2, 1, 2, 0.0F, false));
		bone46.cubeList.add(new ModelBox(bone46, 51, 168, -39.0F, -15.65F, -24.891F, 2, 4, 2, 0.0F, false));
		bone46.cubeList.add(new ModelBox(bone46, 165, 143, -40.8F, -15.65F, -23.491F, 3, 4, 2, 0.0F, false));
		bone46.cubeList.add(new ModelBox(bone46, 140, 170, -25.0F, -15.65F, -24.891F, 2, 4, 2, 0.0F, false));
		bone46.cubeList.add(new ModelBox(bone46, 100, 84, -24.2F, -15.65F, -23.591F, 3, 4, 2, 0.0F, false));

		phone = new RendererModel(this);
		phone.setRotationPoint(-4.0F, -12.0F, -11.0F);
		bone46.addChild(phone);
		phone.cubeList.add(new ModelBox(phone, 244, 2, -28.7F, -12.3F, -5.141F, 1, 3, 2, 0.1F, false));
		phone.cubeList.add(new ModelBox(phone, 216, 7, -29.0F, -12.7F, -5.041F, 3, 4, 2, 0.0F, false));
		phone.cubeList.add(new ModelBox(phone, 244, 2, -27.1F, -11.4F, -5.041F, 0, 0, 2, 0.2F, false));
		phone.cubeList.add(new ModelBox(phone, 244, 2, -26.5F, -11.4F, -5.041F, 0, 0, 2, 0.2F, false));
		phone.cubeList.add(new ModelBox(phone, 244, 2, -27.1F, -10.9F, -5.041F, 0, 0, 2, 0.2F, false));
		phone.cubeList.add(new ModelBox(phone, 244, 2, -26.5F, -10.9F, -5.041F, 0, 0, 2, 0.2F, false));
		phone.cubeList.add(new ModelBox(phone, 244, 2, -27.1F, -10.4F, -5.041F, 0, 0, 2, 0.2F, false));
		phone.cubeList.add(new ModelBox(phone, 244, 2, -26.5F, -10.4F, -5.041F, 0, 0, 2, 0.2F, false));
		phone.cubeList.add(new ModelBox(phone, 244, 2, -27.1F, -9.925F, -5.041F, 0, 0, 2, 0.2F, false));
		phone.cubeList.add(new ModelBox(phone, 244, 2, -26.5F, -9.925F, -5.041F, 0, 0, 2, 0.2F, false));

		bone47 = new RendererModel(this);
		bone47.setRotationPoint(-4.0F, -23.1F, -2.7F);
		bone46.addChild(bone47);
		setRotationAngle(bone47, 0.0F, 0.0F, 0.3491F);
		bone47.cubeList.add(new ModelBox(bone47, 91, 250, -28.1908F, 7.2606F, -13.141F, 2, 3, 2, 0.0F, false));

		bone48 = new RendererModel(this);
		bone48.setRotationPoint(2.0F, -23.1F, -2.7F);
		bone46.addChild(bone48);
		setRotationAngle(bone48, 0.0F, 0.0F, -0.3491F);
		bone48.cubeList.add(new ModelBox(bone48, 91, 250, -30.1908F, -13.2606F, -13.141F, 2, 3, 2, 0.0F, false));

		bone49 = new RendererModel(this);
		bone49.setRotationPoint(-1.1F, -20.4268F, -2.6F);
		bone46.addChild(bone49);
		setRotationAngle(bone49, 0.5236F, 0.0F, 0.0F);
		bone49.cubeList.add(new ModelBox(bone49, 170, 149, -32.4F, -6.5705F, -12.3805F, 5, 1, 1, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 136, 104, -32.4F, -7.0205F, -12.0055F, 5, 1, 1, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 165, 69, -32.9F, -6.5705F, -13.3805F, 6, 1, 1, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 122, 106, -34.9F, -6.5705F, -16.3805F, 10, 1, 3, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 116, 32, -32.8F, -7.8705F, -16.0805F, 6, 2, 3, -0.3F, false));
		bone49.cubeList.add(new ModelBox(bone49, 86, 121, -33.9F, 7.9045F, -22.9555F, 8, 0, 4, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 60, 118, -35.9F, -6.5705F, -18.3805F, 12, 1, 2, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 118, 23, -35.9F, -6.5705F, -21.3805F, 12, 1, 3, 0.0F, false));

		randomiser = new RendererModel(this);
		randomiser.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone49.addChild(randomiser);
		randomiser.cubeList.add(new ModelBox(randomiser, 61, 209, -32.8F, -8.4705F, -18.1805F, 6, 2, 1, -0.3F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 61, 209, -32.8F, -8.0705F, -22.3805F, 6, 2, 5, -0.3F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 153, 215, -32.3F, -8.6705F, -19.0805F, 5, 1, 1, -0.3F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 61, 209, -32.8F, -8.4705F, -20.3805F, 6, 2, 2, -0.3F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -32.5F, -8.2455F, -20.9805F, 1, 2, 1, -0.275F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -31.85F, -8.2455F, -20.9805F, 1, 2, 1, -0.275F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -31.2F, -8.2455F, -20.9805F, 1, 2, 1, -0.275F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -30.6F, -8.2455F, -20.9805F, 1, 2, 1, -0.275F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -29.95F, -8.2455F, -20.9805F, 1, 2, 1, -0.275F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -29.3F, -8.2455F, -20.9805F, 1, 2, 1, -0.275F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -28.7F, -8.2455F, -20.9805F, 1, 2, 1, -0.275F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -28.1F, -8.2455F, -20.9805F, 1, 2, 1, -0.275F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -32.5F, -8.2455F, -21.6305F, 1, 2, 1, -0.275F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -31.85F, -8.2455F, -21.6305F, 1, 2, 1, -0.275F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -31.2F, -8.2455F, -21.6305F, 1, 2, 1, -0.275F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -30.6F, -8.2455F, -21.6305F, 1, 2, 1, -0.275F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -29.95F, -8.2455F, -21.6305F, 1, 2, 1, -0.275F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -29.3F, -8.2455F, -21.6305F, 1, 2, 1, -0.275F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -28.7F, -8.2455F, -21.6305F, 1, 2, 1, -0.275F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -28.1F, -8.2455F, -21.6305F, 1, 2, 1, -0.275F, false));
		randomiser.cubeList.add(new ModelBox(randomiser, 35, 132, -30.8F, -8.2455F, -22.2305F, 2, 2, 1, -0.275F, false));

		bone50 = new RendererModel(this);
		bone50.setRotationPoint(-1.1F, -12.1499F, -0.5857F);
		bone46.addChild(bone50);
		setRotationAngle(bone50, -0.0873F, 0.0F, 0.0F);
		bone50.cubeList.add(new ModelBox(bone50, 60, 145, -32.4F, 1.1453F, -14.091F, 5, 9, 1, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 92, 115, -32.9F, 1.1453F, -15.091F, 6, 1, 1, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 92, 107, -34.4F, 1.1453F, -18.091F, 9, 1, 3, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 112, 42, -35.9F, 1.1453F, -21.091F, 12, 1, 3, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 112, 46, -35.9F, 1.1453F, -23.091F, 12, 1, 3, 0.0F, false));

		bone51 = new RendererModel(this);
		bone51.setRotationPoint(5.0F, -15.5F, -11.5F);
		side4.addChild(bone51);
		setRotationAngle(bone51, -1.0472F, 0.0F, 0.0F);
		bone51.cubeList.add(new ModelBox(bone51, 176, 5, -30.0F, 9.522F, -6.8254F, 2, 2, 2, 0.0F, false));

		bone52 = new RendererModel(this);
		bone52.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone51.addChild(bone52);
		setRotationAngle(bone52, 0.0F, 0.0F, -0.4363F);
		bone52.cubeList.add(new ModelBox(bone52, 68, 158, -34.0586F, -12.2361F, -6.8254F, 2, 10, 2, 0.0F, false));
		bone52.cubeList.add(new ModelBox(bone52, 232, 191, -33.4586F, -12.1361F, -7.8004F, 1, 2, 2, -0.1F, false));
		bone52.cubeList.add(new ModelBox(bone52, 232, 191, -34.2586F, -11.1361F, -7.1254F, 1, 1, 1, -0.1F, false));
		bone52.cubeList.add(new ModelBox(bone52, 232, 191, -36.2586F, -7.7111F, -7.8004F, 2, 1, 1, -0.1F, false));
		bone52.cubeList.add(new ModelBox(bone52, 232, 191, -34.4586F, -8.7361F, -7.8004F, 1, 2, 1, -0.1F, false));
		bone52.cubeList.add(new ModelBox(bone52, 232, 191, -34.2586F, -8.7361F, -7.8004F, 2, 1, 1, -0.1F, false));
		bone52.cubeList.add(new ModelBox(bone52, 232, 191, -36.2586F, -9.7111F, -7.8004F, 1, 3, 1, -0.1F, false));
		bone52.cubeList.add(new ModelBox(bone52, 232, 191, -37.2586F, -9.8361F, -7.8004F, 2, 1, 1, -0.1F, false));
		bone52.cubeList.add(new ModelBox(bone52, 232, 191, -37.2586F, -10.6361F, -7.8004F, 1, 1, 1, -0.1F, false));
		bone52.cubeList.add(new ModelBox(bone52, 232, 191, -37.2586F, -11.1361F, -7.8004F, 4, 1, 1, -0.1F, false));

		bone53 = new RendererModel(this);
		bone53.setRotationPoint(-9.0F, -15.5F, -11.5F);
		side4.addChild(bone53);
		setRotationAngle(bone53, -1.0472F, 0.0F, 0.0F);
		bone53.cubeList.add(new ModelBox(bone53, 175, 171, -30.0F, 9.522F, -6.8254F, 2, 2, 2, 0.0F, false));

		bone54 = new RendererModel(this);
		bone54.setRotationPoint(0.0F, -2.0F, 0.0F);
		bone53.addChild(bone54);
		setRotationAngle(bone54, 0.0F, 0.0F, 0.4363F);
		bone54.cubeList.add(new ModelBox(bone54, 76, 158, -22.3198F, 13.121F, -6.8254F, 2, 10, 2, 0.0F, false));
		bone54.cubeList.add(new ModelBox(bone54, 184, 190, -21.8198F, 15.921F, -7.1254F, 1, 1, 2, 0.0F, false));
		bone54.cubeList.add(new ModelBox(bone54, 184, 190, -21.8198F, 20.821F, -7.1254F, 1, 1, 2, 0.0F, false));

		bone55 = new RendererModel(this);
		bone55.setRotationPoint(5.0F, -15.5F, -11.5F);
		side4.addChild(bone55);
		setRotationAngle(bone55, -1.6581F, 0.0F, 0.0F);
		bone55.cubeList.add(new ModelBox(bone55, 172, 126, -30.0F, 11.0045F, 3.0025F, 2, 2, 2, 0.0F, false));

		bone56 = new RendererModel(this);
		bone56.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone55.addChild(bone56);
		setRotationAngle(bone56, 0.0F, 0.0F, -0.4363F);
		bone56.cubeList.add(new ModelBox(bone56, 52, 147, -34.6852F, -11.8925F, 3.0025F, 2, 11, 2, 0.0F, false));
		bone56.cubeList.add(new ModelBox(bone56, 139, 31, -34.6852F, -11.8925F, 5.0025F, 2, 2, 7, 0.0F, false));

		bone57 = new RendererModel(this);
		bone57.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone55.addChild(bone57);
		setRotationAngle(bone57, 0.4363F, 0.0F, -0.4363F);
		bone57.cubeList.add(new ModelBox(bone57, 39, 135, -34.6852F, -5.7058F, 13.9039F, 2, 6, 2, 0.0F, false));

		bone58 = new RendererModel(this);
		bone58.setRotationPoint(-9.0F, -15.5F, -11.5F);
		side4.addChild(bone58);
		setRotationAngle(bone58, -1.6581F, 0.0F, 0.0F);
		bone58.cubeList.add(new ModelBox(bone58, 18, 152, -30.0F, 11.0045F, 3.0025F, 2, 2, 2, 0.0F, false));

		bone59 = new RendererModel(this);
		bone59.setRotationPoint(0.0F, -2.0F, 0.0F);
		bone58.addChild(bone59);
		setRotationAngle(bone59, 0.0F, 0.0F, 0.4363F);
		bone59.cubeList.add(new ModelBox(bone59, 139, 156, -21.6933F, 13.4646F, 3.0025F, 2, 11, 2, 0.0F, false));
		bone59.cubeList.add(new ModelBox(bone59, 61, 137, -21.6933F, 13.4646F, 5.0025F, 2, 2, 7, 0.0F, false));

		bone60 = new RendererModel(this);
		bone60.setRotationPoint(1.9634F, -11.0784F, 10.8321F);
		bone59.addChild(bone60);
		setRotationAngle(bone60, -1.1345F, 0.0F, 0.0F);
		bone60.cubeList.add(new ModelBox(bone60, 73, 144, -23.6567F, 9.3108F, 22.7361F, 2, 2, 6, 0.0F, false));

		side5 = new RendererModel(this);
		side5.setRotationPoint(-32.0F, 3.0F, -8.0F);
		base.addChild(side5);
		setRotationAngle(side5, 0.0F, -2.0944F, 0.0F);


		bone61 = new RendererModel(this);
		bone61.setRotationPoint(0.0F, 0.0F, 0.0F);
		side5.addChild(bone61);
		bone61.cubeList.add(new ModelBox(bone61, 122, 110, -15.8098F, -15.15F, -48.1525F, 12, 3, 1, 0.2F, false));
		bone61.cubeList.add(new ModelBox(bone61, 90, 240, -12.8098F, -23.1F, -39.4025F, 6, 4, 2, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 242, 192, -12.393F, -27.6F, -37.9782F, 6, 1, 1, -0.1F, false));
		bone61.cubeList.add(new ModelBox(bone61, 242, 192, -12.393F, -32.4F, -37.9782F, 1, 5, 1, -0.1F, false));
		bone61.cubeList.add(new ModelBox(bone61, 242, 192, -13.393F, -33.1F, -37.9782F, 2, 1, 1, -0.1F, false));
		bone61.cubeList.add(new ModelBox(bone61, 236, 193, -12.6098F, -23.6F, -40.3025F, 1, 2, 0, 0.1F, false));
		bone61.cubeList.add(new ModelBox(bone61, 236, 193, -8.3098F, -23.4F, -40.3025F, 1, 2, 0, 0.1F, false));
		bone61.cubeList.add(new ModelBox(bone61, 236, 193, -12.6098F, -23.0F, -40.3025F, 1, 1, 1, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 236, 193, -10.5098F, -24.0F, -39.7025F, 1, 2, 1, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 120, 127, -10.5098F, -23.6F, -39.9025F, 1, 1, 1, -0.1F, false));
		bone61.cubeList.add(new ModelBox(bone61, 236, 193, -8.3098F, -22.8F, -40.3025F, 1, 1, 1, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 247, 217, -7.5098F, -23.1F, -39.4025F, 0, 4, 1, 0.1F, false));
		bone61.cubeList.add(new ModelBox(bone61, 247, 217, -8.5098F, -25.2F, -39.4025F, 0, 2, 1, 0.1F, false));
		bone61.cubeList.add(new ModelBox(bone61, 247, 217, -10.0098F, -25.2F, -39.4025F, 0, 2, 1, 0.1F, false));
		bone61.cubeList.add(new ModelBox(bone61, 247, 217, -8.5098F, -25.8F, -39.4025F, 0, 2, 1, 0.1F, false));
		bone61.cubeList.add(new ModelBox(bone61, 247, 217, -10.0098F, -25.8F, -39.4025F, 0, 2, 1, 0.1F, false));
		bone61.cubeList.add(new ModelBox(bone61, 247, 217, -10.0098F, -25.8F, -38.4025F, 1, 2, 0, 0.1F, false));
		bone61.cubeList.add(new ModelBox(bone61, 247, 217, -9.5098F, -25.8F, -38.4025F, 1, 2, 0, 0.1F, false));
		bone61.cubeList.add(new ModelBox(bone61, 247, 217, -8.5098F, -23.1F, -39.4025F, 1, 0, 1, 0.1F, false));
		bone61.cubeList.add(new ModelBox(bone61, 209, 53, -12.8098F, -20.1F, -37.4025F, 6, 1, 13, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 209, 53, -12.8098F, -6.1F, -37.4025F, 6, 1, 13, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 91, 250, -10.8098F, -25.6F, -39.4025F, 2, 3, 2, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 91, 250, -11.7837F, -25.6191F, -39.4025F, 2, 1, 2, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 91, 250, -9.8358F, -25.6191F, -39.4025F, 2, 1, 2, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 40, 170, -17.8098F, -15.65F, -48.4525F, 2, 4, 2, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 177, 200, -17.8098F, -14.85F, -49.1525F, 2, 2, 2, -0.4F, false));
		bone61.cubeList.add(new ModelBox(bone61, 96, 16, -19.3598F, -15.65F, -46.6731F, 3, 4, 2, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 0, 169, -3.8098F, -15.65F, -48.4525F, 2, 4, 2, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 92, 131, -3.8098F, -14.95F, -49.0525F, 2, 2, 1, -0.2F, false));
		bone61.cubeList.add(new ModelBox(bone61, 166, 3, -3.0562F, -15.65F, -47.0793F, 3, 4, 2, 0.0F, false));

		bone62 = new RendererModel(this);
		bone62.setRotationPoint(-4.0F, -23.1F, -2.7F);
		bone61.addChild(bone62);
		setRotationAngle(bone62, 0.0F, 0.0F, 0.3491F);
		bone62.cubeList.add(new ModelBox(bone62, 91, 250, -8.2785F, 0.0131F, -36.7025F, 2, 3, 2, 0.0F, false));

		bone63 = new RendererModel(this);
		bone63.setRotationPoint(2.0F, -23.1F, -2.7F);
		bone61.addChild(bone63);
		setRotationAngle(bone63, 0.0F, 0.0F, -0.3491F);
		bone63.cubeList.add(new ModelBox(bone63, 91, 250, -10.2785F, -6.0131F, -36.7025F, 2, 3, 2, 0.0F, false));

		bone64 = new RendererModel(this);
		bone64.setRotationPoint(-1.1F, -20.4268F, -2.6F);
		bone61.addChild(bone64);
		setRotationAngle(bone64, 0.5236F, 0.0F, 0.0F);
		bone64.cubeList.add(new ModelBox(bone64, 170, 149, -11.2098F, -18.3513F, -32.7853F, 5, 1, 1, 0.0F, false));
		bone64.cubeList.add(new ModelBox(bone64, 65, 170, -11.2098F, -18.8013F, -32.4103F, 5, 1, 1, 0.0F, false));
		bone64.cubeList.add(new ModelBox(bone64, 165, 69, -11.7098F, -18.3513F, -33.7853F, 6, 1, 1, 0.0F, false));
		bone64.cubeList.add(new ModelBox(bone64, 122, 106, -13.7098F, -18.3513F, -36.7853F, 10, 1, 3, 0.0F, false));
		bone64.cubeList.add(new ModelBox(bone64, 85, 120, -12.7098F, -3.7763F, -43.2853F, 8, 0, 5, 0.0F, false));
		bone64.cubeList.add(new ModelBox(bone64, 60, 118, -14.7098F, -18.3513F, -38.7853F, 12, 1, 2, 0.0F, false));
		bone64.cubeList.add(new ModelBox(bone64, 233, 192, -6.8848F, -18.7513F, -35.9853F, 1, 1, 1, 0.0F, false));
		bone64.cubeList.add(new ModelBox(bone64, 233, 192, -7.0848F, -18.7513F, -35.9853F, 1, 1, 1, -0.1F, false));
		bone64.cubeList.add(new ModelBox(bone64, 233, 192, -6.6848F, -18.7513F, -35.9853F, 1, 1, 1, -0.1F, false));
		bone64.cubeList.add(new ModelBox(bone64, 246, 220, -6.4098F, -18.5513F, -34.9853F, 0, 0, 1, 0.1F, false));
		bone64.cubeList.add(new ModelBox(bone64, 246, 220, -6.4098F, -18.5513F, -33.9853F, 0, 0, 2, 0.1F, false));
		bone64.cubeList.add(new ModelBox(bone64, 246, 220, -6.4098F, -18.7513F, -32.6853F, 0, 0, 1, 0.1F, false));
		bone64.cubeList.add(new ModelBox(bone64, 118, 23, -14.7098F, -18.3513F, -41.7853F, 12, 1, 3, 0.0F, false));
		bone64.cubeList.add(new ModelBox(bone64, 250, 194, -4.4098F, -18.9513F, -41.1853F, 1, 1, 1, 0.0F, false));
		bone64.cubeList.add(new ModelBox(bone64, 250, 194, -4.4098F, -19.6513F, -41.1853F, 1, 1, 1, -0.1F, false));

		sonicport = new RendererModel(this);
		sonicport.setRotationPoint(1.4F, 0.0F, 1.675F);
		bone64.addChild(sonicport);
		sonicport.cubeList.add(new ModelBox(sonicport, 66, 23, -12.1598F, -18.7514F, -39.2603F, 1, 1, 2, -0.25F, false));
		sonicport.cubeList.add(new ModelBox(sonicport, 62, 100, -13.4098F, -18.6513F, -39.2603F, 2, 1, 2, -0.25F, false));
		sonicport.cubeList.add(new ModelBox(sonicport, 66, 23, -13.3098F, -18.7513F, -39.4353F, 2, 1, 1, -0.25F, false));
		sonicport.cubeList.add(new ModelBox(sonicport, 66, 23, -13.5098F, -18.7514F, -39.2603F, 1, 1, 2, -0.25F, false));
		sonicport.cubeList.add(new ModelBox(sonicport, 66, 23, -13.3098F, -18.7513F, -38.0853F, 2, 1, 1, -0.25F, false));

		bluestab = new RendererModel(this);
		bluestab.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone64.addChild(bluestab);
		bluestab.cubeList.add(new ModelBox(bluestab, 206, 218, -13.5098F, -18.7513F, -40.9853F, 2, 1, 2, 0.0F, false));
		bluestab.cubeList.add(new ModelBox(bluestab, 243, 220, -12.5848F, -19.1513F, -40.9603F, 1, 1, 1, -0.2F, false));
		bluestab.cubeList.add(new ModelBox(bluestab, 70, 71, -13.4848F, -19.1513F, -40.4603F, 1, 1, 1, -0.2F, false));
		bluestab.cubeList.add(new ModelBox(bluestab, 70, 71, -12.5848F, -19.1513F, -39.9603F, 1, 1, 1, -0.2F, false));

		bone65 = new RendererModel(this);
		bone65.setRotationPoint(-1.1F, -12.1499F, -0.5857F);
		bone61.addChild(bone65);
		setRotationAngle(bone65, -0.0873F, 0.0F, 0.0F);
		bone65.cubeList.add(new ModelBox(bone65, 60, 145, -11.2098F, 3.1988F, -37.5629F, 5, 9, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 165, 82, -11.7098F, 3.1988F, -38.5629F, 6, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 132, 122, -13.2098F, 3.1988F, -41.5629F, 9, 1, 3, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 112, 54, -14.7098F, 3.1988F, -44.5629F, 12, 1, 3, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 112, 50, -14.7098F, 3.1988F, -46.5629F, 12, 1, 3, 0.0F, false));

		bone66 = new RendererModel(this);
		bone66.setRotationPoint(5.0F, -15.5F, -11.5F);
		side5.addChild(bone66);
		setRotationAngle(bone66, -1.0472F, 0.0F, 0.0F);
		bone66.cubeList.add(new ModelBox(bone66, 175, 176, -8.8098F, 29.9268F, -18.6062F, 2, 2, 2, 0.0F, false));

		bone67 = new RendererModel(this);
		bone67.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone66.addChild(bone67);
		setRotationAngle(bone67, 0.0F, 0.0F, -0.4363F);
		bone67.cubeList.add(new ModelBox(bone67, 8, 158, -23.4772F, 15.2124F, -18.6062F, 2, 10, 2, 0.0F, false));
		bone67.cubeList.add(new ModelBox(bone67, 232, 192, -23.4772F, 16.2124F, -19.0062F, 2, 2, 2, -0.1F, false));
		bone67.cubeList.add(new ModelBox(bone67, 232, 192, -23.4772F, 18.6124F, -19.0062F, 2, 3, 2, -0.1F, false));
		bone67.cubeList.add(new ModelBox(bone67, 89, 130, -23.4772F, 21.9124F, -19.0062F, 1, 3, 2, -0.1F, false));
		bone67.cubeList.add(new ModelBox(bone67, 89, 130, -22.4772F, 21.9124F, -19.0062F, 1, 3, 2, -0.1F, false));
		bone67.cubeList.add(new ModelBox(bone67, 248, 190, -23.4772F, 18.6124F, -19.4062F, 1, 1, 2, -0.1F, false));
		bone67.cubeList.add(new ModelBox(bone67, 248, 190, -23.4772F, 20.5124F, -19.4062F, 1, 1, 2, -0.1F, false));
		bone67.cubeList.add(new ModelBox(bone67, 248, 190, -23.4772F, 19.0124F, -19.9062F, 1, 2, 2, -0.1F, false));
		bone67.cubeList.add(new ModelBox(bone67, 248, 190, -22.4772F, 18.6124F, -19.4062F, 1, 1, 2, -0.1F, false));
		bone67.cubeList.add(new ModelBox(bone67, 248, 190, -22.4772F, 20.5124F, -19.4062F, 1, 1, 2, -0.1F, false));
		bone67.cubeList.add(new ModelBox(bone67, 248, 190, -22.4772F, 19.0124F, -19.9062F, 1, 2, 2, -0.1F, false));
		bone67.cubeList.add(new ModelBox(bone67, 69, 49, -23.4772F, 16.2124F, -19.2062F, 2, 2, 2, -0.2F, false));
		bone67.cubeList.add(new ModelBox(bone67, 168, 210, -28.7772F, 20.4124F, -18.5062F, 5, 3, 2, -0.1F, false));
		bone67.cubeList.add(new ModelBox(bone67, 186, 200, -27.7772F, 19.9124F, -18.5062F, 4, 1, 2, -0.1F, false));
		bone67.cubeList.add(new ModelBox(bone67, 241, 54, -28.5772F, 20.7124F, -18.7062F, 2, 2, 2, -0.1F, false));
		bone67.cubeList.add(new ModelBox(bone67, 241, 54, -26.2772F, 21.3124F, -19.1062F, 2, 2, 2, -0.4F, false));
		bone67.cubeList.add(new ModelBox(bone67, 213, 124, -26.2772F, 21.3124F, -19.4062F, 2, 2, 2, -0.5F, false));
		bone67.cubeList.add(new ModelBox(bone67, 245, 190, -26.5772F, 19.9124F, -19.1062F, 2, 2, 2, -0.5F, false));
		bone67.cubeList.add(new ModelBox(bone67, 230, 194, -26.5772F, 19.9124F, -19.3062F, 2, 2, 2, -0.6F, false));

		incrementincrease = new RendererModel(this);
		incrementincrease.setRotationPoint(-1.0F, 2.0F, 1.0F);
		bone67.addChild(incrementincrease);
		incrementincrease.cubeList.add(new ModelBox(incrementincrease, 241, 220, -22.5022F, 22.0124F, -20.5062F, 2, 1, 1, -0.25F, false));

		bone68 = new RendererModel(this);
		bone68.setRotationPoint(-9.0F, -15.5F, -11.5F);
		side5.addChild(bone68);
		setRotationAngle(bone68, -1.0472F, 0.0F, 0.0F);
		bone68.cubeList.add(new ModelBox(bone68, 154, 176, -8.8098F, 29.9268F, -18.6062F, 2, 2, 2, 0.0F, false));

		bone69 = new RendererModel(this);
		bone69.setRotationPoint(0.0F, -2.0F, 0.0F);
		bone68.addChild(bone69);
		setRotationAngle(bone69, 0.0F, 0.0F, 0.4363F);
		bone69.cubeList.add(new ModelBox(bone69, 147, 160, 5.5085F, 22.6587F, -18.6062F, 2, 10, 2, 0.0F, false));
		bone69.cubeList.add(new ModelBox(bone69, 193, 221, 5.5085F, 26.6587F, -19.3062F, 2, 4, 1, -0.1F, false));
		bone69.cubeList.add(new ModelBox(bone69, 193, 221, 5.5085F, 26.6587F, -19.3062F, 2, 4, 1, -0.1F, false));
		bone69.cubeList.add(new ModelBox(bone69, 94, 154, 5.5085F, 23.6587F, -19.2062F, 2, 2, 1, -0.1F, false));
		bone69.cubeList.add(new ModelBox(bone69, 94, 154, 5.5085F, 23.6587F, -19.6062F, 2, 2, 1, -0.2F, false));
		bone69.cubeList.add(new ModelBox(bone69, 94, 154, 6.0085F, 24.2587F, -20.1062F, 1, 1, 1, -0.2F, false));
		bone69.cubeList.add(new ModelBox(bone69, 193, 221, 6.0085F, 30.4587F, -19.2062F, 1, 1, 1, -0.1F, false));
		bone69.cubeList.add(new ModelBox(bone69, 193, 221, 5.5085F, 26.4087F, -18.7562F, 2, 5, 1, -0.025F, false));
		bone69.cubeList.add(new ModelBox(bone69, 193, 221, 5.5085F, 27.6587F, -19.7062F, 1, 2, 1, -0.1F, false));
		bone69.cubeList.add(new ModelBox(bone69, 193, 221, 6.1085F, 26.6587F, -19.7062F, 1, 4, 1, -0.3F, false));
		bone69.cubeList.add(new ModelBox(bone69, 193, 221, 6.6085F, 26.6587F, -19.7062F, 1, 4, 1, -0.3F, false));
		bone69.cubeList.add(new ModelBox(bone69, 66, 101, 6.2585F, 29.4587F, -19.8562F, 1, 1, 1, -0.3F, false));
		bone69.cubeList.add(new ModelBox(bone69, 66, 101, 6.4585F, 29.4587F, -19.8562F, 1, 1, 1, -0.3F, false));

		handbreak = new RendererModel(this);
		handbreak.setRotationPoint(6.0335F, 28.7587F, -19.4562F);
		bone69.addChild(handbreak);
		setRotationAngle(handbreak, -0.6109F, 0.0F, 0.0F);
		handbreak.cubeList.add(new ModelBox(handbreak, 247, 220, -0.85F, 0.0F, -2.75F, 1, 0, 0, -0.2F, false));
		handbreak.cubeList.add(new ModelBox(handbreak, 247, 220, -0.175F, 0.0F, -2.75F, 1, 0, 0, -0.2F, false));
		handbreak.cubeList.add(new ModelBox(handbreak, 193, 221, 0.175F, 0.0F, -2.75F, 0, 0, 3, -0.125F, false));
		handbreak.cubeList.add(new ModelBox(handbreak, 193, 221, -0.225F, 0.0F, -2.75F, 0, 0, 3, -0.125F, false));

		bone70 = new RendererModel(this);
		bone70.setRotationPoint(5.0F, -15.5F, -11.5F);
		side5.addChild(bone70);
		setRotationAngle(bone70, -1.6581F, 0.0F, 0.0F);
		bone70.cubeList.add(new ModelBox(bone70, 138, 176, -8.8098F, 34.4764F, 5.056F, 2, 2, 2, 0.0F, false));

		bone71 = new RendererModel(this);
		bone71.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone70.addChild(bone71);
		setRotationAngle(bone71, 0.0F, 0.0F, -0.4363F);
		bone71.cubeList.add(new ModelBox(bone71, 21, 156, -25.4F, 18.3357F, 5.056F, 2, 11, 2, 0.0F, false));
		bone71.cubeList.add(new ModelBox(bone71, 96, 135, -25.4F, 18.3357F, 7.056F, 2, 2, 7, 0.0F, false));

		bone72 = new RendererModel(this);
		bone72.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone70.addChild(bone72);
		setRotationAngle(bone72, 0.4363F, 0.0F, -0.4363F);
		bone72.cubeList.add(new ModelBox(bone72, 167, 93, -25.4F, 22.5581F, 2.9901F, 2, 6, 2, 0.0F, false));

		bone73 = new RendererModel(this);
		bone73.setRotationPoint(-9.0F, -15.5F, -11.5F);
		side5.addChild(bone73);
		setRotationAngle(bone73, -1.6581F, 0.0F, 0.0F);
		bone73.cubeList.add(new ModelBox(bone73, 81, 176, -8.8098F, 34.4764F, 5.056F, 2, 2, 2, 0.0F, false));

		bone74 = new RendererModel(this);
		bone74.setRotationPoint(0.0F, -2.0F, 0.0F);
		bone73.addChild(bone74);
		setRotationAngle(bone74, 0.0F, 0.0F, 0.4363F);
		bone74.cubeList.add(new ModelBox(bone74, 155, 128, 7.4312F, 25.782F, 5.056F, 2, 11, 2, 0.0F, false));
		bone74.cubeList.add(new ModelBox(bone74, 0, 136, 7.4312F, 25.782F, 7.056F, 2, 2, 7, 0.0F, false));

		bone75 = new RendererModel(this);
		bone75.setRotationPoint(1.9634F, -11.0784F, 10.8321F);
		bone74.addChild(bone75);
		setRotationAngle(bone75, -1.1345F, 0.0F, 0.0F);
		bone75.cubeList.add(new ModelBox(bone75, 12, 144, 5.4678F, 12.6553F, 34.7673F, 2, 2, 6, 0.0F, false));

		side6 = new RendererModel(this);
		side6.setRotationPoint(-32.0F, 3.0F, -8.0F);
		base.addChild(side6);
		setRotationAngle(side6, 0.0F, -1.0472F, 0.0F);


		bone76 = new RendererModel(this);
		bone76.setRotationPoint(0.0F, 0.0F, 0.0F);
		side6.addChild(bone76);
		bone76.cubeList.add(new ModelBox(bone76, 128, 58, 15.1902F, -15.15F, -41.582F, 12, 3, 1, 0.2F, false));
		bone76.cubeList.add(new ModelBox(bone76, 128, 58, 15.3902F, -14.65F, -42.082F, 1, 1, 1, 0.2F, false));
		bone76.cubeList.add(new ModelBox(bone76, 194, 68, 15.3902F, -14.65F, -42.482F, 1, 1, 1, 0.0F, false));
		bone76.cubeList.add(new ModelBox(bone76, 128, 58, 25.9902F, -14.65F, -42.082F, 1, 1, 1, 0.2F, false));
		bone76.cubeList.add(new ModelBox(bone76, 194, 68, 25.9902F, -14.65F, -42.482F, 1, 1, 1, 0.0F, false));
		bone76.cubeList.add(new ModelBox(bone76, 90, 240, 18.1902F, -23.1F, -32.832F, 6, 4, 2, 0.0F, false));
		bone76.cubeList.add(new ModelBox(bone76, 122, 245, 18.2652F, -23.3F, -33.932F, 6, 1, 1, -0.2F, false));
		bone76.cubeList.add(new ModelBox(bone76, 122, 245, 22.2652F, -24.0F, -33.932F, 2, 1, 1, -0.3F, false));
		bone76.cubeList.add(new ModelBox(bone76, 122, 245, 22.2652F, -24.0F, -33.932F, 2, 1, 1, -0.3F, false));
		bone76.cubeList.add(new ModelBox(bone76, 122, 245, 18.2652F, -22.9F, -33.932F, 6, 1, 1, -0.3F, false));
		bone76.cubeList.add(new ModelBox(bone76, 122, 245, 18.2652F, -21.5F, -33.932F, 6, 1, 1, -0.3F, false));
		bone76.cubeList.add(new ModelBox(bone76, 122, 245, 20.2652F, -24.0F, -33.932F, 2, 1, 1, -0.3F, false));
		bone76.cubeList.add(new ModelBox(bone76, 122, 245, 20.2652F, -23.6F, -33.932F, 1, 1, 1, -0.3F, false));
		bone76.cubeList.add(new ModelBox(bone76, 122, 245, 23.2652F, -23.6F, -33.932F, 1, 1, 1, -0.3F, false));
		bone76.cubeList.add(new ModelBox(bone76, 122, 245, 21.2652F, -23.6F, -33.932F, 2, 1, 1, -0.3F, false));
		bone76.cubeList.add(new ModelBox(bone76, 122, 245, 18.1902F, -23.2F, -33.932F, 1, 4, 1, -0.2F, false));
		bone76.cubeList.add(new ModelBox(bone76, 122, 245, 23.2902F, -23.2F, -33.932F, 1, 4, 1, -0.2F, false));
		bone76.cubeList.add(new ModelBox(bone76, 209, 53, 16.1902F, -20.1F, -30.832F, 10, 1, 13, 0.0F, false));
		bone76.cubeList.add(new ModelBox(bone76, 209, 53, 16.1902F, -6.1F, -30.832F, 10, 1, 13, 0.0F, false));
		bone76.cubeList.add(new ModelBox(bone76, 66, 56, 18.8902F, -25.3F, -33.432F, 2, 2, 1, -0.3F, false));
		bone76.cubeList.add(new ModelBox(bone76, 65, 100, 19.3902F, -25.2F, -33.732F, 1, 2, 1, -0.4F, false));
		bone76.cubeList.add(new ModelBox(bone76, 91, 250, 20.1902F, -25.7F, -32.832F, 2, 3, 2, 0.0F, false));
		bone76.cubeList.add(new ModelBox(bone76, 91, 250, 19.2163F, -25.9191F, -32.832F, 2, 1, 2, 0.0F, false));
		bone76.cubeList.add(new ModelBox(bone76, 91, 250, 21.1642F, -25.9191F, -32.832F, 2, 1, 2, 0.0F, false));
		bone76.cubeList.add(new ModelBox(bone76, 248, 193, 21.257F, -33.1F, -30.5512F, 5, 1, 1, -0.1F, false));
		bone76.cubeList.add(new ModelBox(bone76, 248, 193, 21.257F, -40.9F, -30.5512F, 1, 8, 1, -0.1F, false));
		bone76.cubeList.add(new ModelBox(bone76, 248, 193, 21.257F, -49.3F, -32.3512F, 1, 8, 1, -0.1F, false));
		bone76.cubeList.add(new ModelBox(bone76, 248, 193, 21.257F, -41.7F, -32.3512F, 1, 1, 2, -0.1F, false));
		bone76.cubeList.add(new ModelBox(bone76, 248, 193, 21.257F, -41.7F, -31.5512F, 1, 1, 2, -0.1F, false));
		bone76.cubeList.add(new ModelBox(bone76, 83, 170, 13.1902F, -15.65F, -41.882F, 2, 4, 2, 0.0F, false));
		bone76.cubeList.add(new ModelBox(bone76, 167, 167, 11.4964F, -15.65F, -40.0124F, 3, 4, 2, 0.0F, false));
		bone76.cubeList.add(new ModelBox(bone76, 153, 170, 27.1902F, -15.65F, -41.882F, 2, 4, 2, 0.0F, false));
		bone76.cubeList.add(new ModelBox(bone76, 167, 87, 27.7402F, -15.65F, -40.1026F, 3, 4, 2, 0.0F, false));

		facingcontrol = new RendererModel(this);
		facingcontrol.setRotationPoint(21.3652F, -24.2F, -33.4654F);
		bone76.addChild(facingcontrol);
		facingcontrol.cubeList.add(new ModelBox(facingcontrol, 122, 245, -0.5F, -1.0F, -1.4667F, 1, 1, 2, -0.3F, false));
		facingcontrol.cubeList.add(new ModelBox(facingcontrol, 122, 245, -0.5F, -0.6F, -1.8667F, 1, 1, 2, -0.3F, false));
		facingcontrol.cubeList.add(new ModelBox(facingcontrol, 122, 245, -0.5F, -0.2F, -1.4667F, 1, 1, 2, -0.3F, false));

		bone77 = new RendererModel(this);
		bone77.setRotationPoint(-4.0F, -23.1F, -2.7F);
		bone76.addChild(bone77);
		setRotationAngle(bone77, 0.0F, 0.0F, 0.3491F);
		bone77.cubeList.add(new ModelBox(bone77, 91, 250, 20.852F, -10.5895F, -30.132F, 2, 3, 2, 0.0F, false));

		bone78 = new RendererModel(this);
		bone78.setRotationPoint(2.0F, -23.1F, -2.7F);
		bone76.addChild(bone78);
		setRotationAngle(bone78, 0.0F, 0.0F, -0.3491F);
		bone78.cubeList.add(new ModelBox(bone78, 91, 250, 18.852F, 4.5895F, -30.132F, 2, 3, 2, 0.0F, false));

		bone79 = new RendererModel(this);
		bone79.setRotationPoint(-1.1F, -20.4268F, -2.6F);
		bone76.addChild(bone79);
		setRotationAngle(bone79, 0.5236F, 0.0F, 0.0F);
		bone79.cubeList.add(new ModelBox(bone79, 170, 149, 19.7902F, -15.066F, -27.0951F, 5, 1, 1, 0.0F, false));
		bone79.cubeList.add(new ModelBox(bone79, 169, 15, 19.7902F, -15.516F, -26.7201F, 5, 1, 1, 0.0F, false));
		bone79.cubeList.add(new ModelBox(bone79, 165, 69, 19.2902F, -15.066F, -28.0951F, 6, 1, 1, 0.0F, false));
		bone79.cubeList.add(new ModelBox(bone79, 122, 106, 17.2902F, -15.066F, -31.0951F, 10, 1, 3, 0.0F, false));
		bone79.cubeList.add(new ModelBox(bone79, 86, 121, 18.2902F, -0.566F, -37.6951F, 8, 0, 4, 0.0F, false));
		bone79.cubeList.add(new ModelBox(bone79, 60, 118, 16.2902F, -15.066F, -33.0951F, 12, 1, 2, 0.0F, false));
		bone79.cubeList.add(new ModelBox(bone79, 118, 23, 16.2902F, -15.066F, -36.0951F, 12, 1, 3, 0.0F, false));
		bone79.cubeList.add(new ModelBox(bone79, 118, 23, 16.2902F, -15.066F, -36.0951F, 12, 1, 3, 0.0F, false));
		bone79.cubeList.add(new ModelBox(bone79, 251, 215, 21.6902F, -15.266F, -35.0951F, 1, 1, 1, 0.1F, false));
		bone79.cubeList.add(new ModelBox(bone79, 251, 215, 21.6902F, -15.466F, -35.0951F, 1, 1, 1, 0.0F, false));
		bone79.cubeList.add(new ModelBox(bone79, 236, 192, 19.2902F, -14.066F, -39.8951F, 6, 1, 3, -0.2F, false));
		bone79.cubeList.add(new ModelBox(bone79, 247, 218, 19.2902F, -14.266F, -37.9951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 19.2902F, -14.266F, -38.6951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 19.2902F, -14.266F, -39.1951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 247, 218, 20.2902F, -14.266F, -37.9951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 20.2902F, -14.266F, -38.6951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 20.2902F, -14.266F, -39.1951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 247, 218, 21.2902F, -14.266F, -37.9951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 21.2902F, -14.266F, -38.6951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 21.2902F, -14.266F, -39.1951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 247, 241, 22.2902F, -14.266F, -37.9951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 22.2902F, -14.266F, -38.6951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 22.2902F, -14.266F, -39.1951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 51, 40, 23.2902F, -14.266F, -37.9951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 23.2902F, -14.266F, -38.6951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 23.2902F, -14.266F, -39.1951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 247, 218, 19.7902F, -14.266F, -37.9951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 19.7902F, -14.266F, -38.6951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 19.7902F, -14.266F, -39.1951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 247, 218, 20.7902F, -14.266F, -37.9951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 20.7902F, -14.266F, -38.6951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 20.7902F, -14.266F, -39.1951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 247, 241, 21.7902F, -14.266F, -37.9951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 21.7902F, -14.266F, -38.6951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 21.7902F, -14.266F, -39.1951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 21.2902F, -14.266F, -39.7951F, 2, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 51, 40, 22.7902F, -14.266F, -37.9951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 22.7902F, -14.266F, -38.6951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 22.7902F, -14.266F, -39.1951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 51, 40, 23.7902F, -14.266F, -37.9951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 23.7902F, -14.266F, -38.6951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 23.7902F, -14.266F, -39.1951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 51, 40, 24.2902F, -14.266F, -37.9951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 24.2902F, -14.266F, -38.6951F, 1, 1, 1, -0.3F, false));
		bone79.cubeList.add(new ModelBox(bone79, 66, 101, 24.2902F, -14.266F, -39.1951F, 1, 1, 1, -0.3F, false));

		bone149 = new RendererModel(this);
		bone149.setRotationPoint(22.3281F, -16.1554F, -31.8778F);
		bone79.addChild(bone149);
		setRotationAngle(bone149, 0.0F, -0.6109F, 0.0F);
		bone149.cubeList.add(new ModelBox(bone149, 247, 129, -1.0385F, -0.5538F, -0.9615F, 2, 2, 2, -0.3F, false));
		bone149.cubeList.add(new ModelBox(bone149, 252, 235, -0.4385F, -0.2538F, -1.7615F, 1, 1, 1, -0.275F, false));
		bone149.cubeList.add(new ModelBox(bone149, 248, 195, -0.4385F, -0.2538F, -1.4615F, 1, 1, 2, -0.3F, false));
		bone149.cubeList.add(new ModelBox(bone149, 250, 215, 0.8615F, -0.2538F, -0.3615F, 1, 1, 1, -0.275F, false));
		bone149.cubeList.add(new ModelBox(bone149, 248, 195, -0.1385F, -0.2538F, -0.3615F, 2, 1, 1, -0.3F, false));
		bone149.cubeList.add(new ModelBox(bone149, 252, 235, -0.9385F, -1.4538F, -0.8615F, 1, 1, 1, -0.275F, false));
		bone149.cubeList.add(new ModelBox(bone149, 248, 195, -0.9385F, -1.2538F, -0.8615F, 1, 2, 1, -0.3F, false));
		bone149.cubeList.add(new ModelBox(bone149, 248, 195, -0.1385F, -1.2538F, -0.3615F, 1, 2, 1, -0.3F, false));
		bone149.cubeList.add(new ModelBox(bone149, 246, 66, -0.1385F, -1.4538F, -0.3615F, 1, 1, 1, -0.275F, false));
		bone149.cubeList.add(new ModelBox(bone149, 246, 66, -1.7385F, -0.2538F, -0.5615F, 1, 1, 1, -0.275F, false));
		bone149.cubeList.add(new ModelBox(bone149, 248, 195, -1.6385F, -0.2538F, -0.5615F, 2, 1, 1, -0.3F, false));
		bone149.cubeList.add(new ModelBox(bone149, 250, 215, -0.6385F, -0.2538F, 0.8385F, 1, 1, 1, -0.275F, false));
		bone149.cubeList.add(new ModelBox(bone149, 248, 195, -0.6385F, -0.2538F, -0.3615F, 1, 1, 2, -0.3F, false));

		bone80 = new RendererModel(this);
		bone80.setRotationPoint(-1.1F, -12.1499F, -0.5857F);
		bone76.addChild(bone80);
		setRotationAngle(bone80, -0.0873F, 0.0F, 0.0F);
		bone80.cubeList.add(new ModelBox(bone80, 60, 145, 19.7902F, 2.6262F, -31.0174F, 5, 9, 1, 0.0F, false));
		bone80.cubeList.add(new ModelBox(bone80, 134, 130, 19.2902F, 2.6262F, -32.0174F, 6, 1, 1, 0.0F, false));
		bone80.cubeList.add(new ModelBox(bone80, 61, 132, 17.7902F, 2.6262F, -35.0174F, 9, 1, 3, 0.0F, false));
		bone80.cubeList.add(new ModelBox(bone80, 80, 80, 16.2902F, 2.6262F, -38.0174F, 12, 1, 3, 0.0F, false));
		bone80.cubeList.add(new ModelBox(bone80, 106, 102, 16.2902F, 2.6262F, -40.0174F, 12, 1, 3, 0.0F, false));

		bone81 = new RendererModel(this);
		bone81.setRotationPoint(5.0F, -15.5F, -11.5F);
		side6.addChild(bone81);
		setRotationAngle(bone81, -1.0472F, 0.0F, 0.0F);
		bone81.cubeList.add(new ModelBox(bone81, 175, 41, 22.1902F, 24.2366F, -15.3209F, 2, 2, 2, 0.0F, false));

		bone82 = new RendererModel(this);
		bone82.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone81.addChild(bone82);
		setRotationAngle(bone82, 0.0F, 0.0F, -0.4363F);
		bone82.cubeList.add(new ModelBox(bone82, 84, 158, 7.0231F, 23.1564F, -15.3209F, 2, 10, 2, 0.0F, false));
		bone82.cubeList.add(new ModelBox(bone82, 236, 193, 7.0231F, 26.9564F, -15.7209F, 2, 4, 2, -0.1F, false));
		bone82.cubeList.add(new ModelBox(bone82, 236, 193, 7.6231F, 24.1564F, -15.7209F, 0, 2, 2, -0.1F, false));
		bone82.cubeList.add(new ModelBox(bone82, 236, 193, 8.0231F, 24.1564F, -15.7209F, 0, 2, 2, -0.1F, false));
		bone82.cubeList.add(new ModelBox(bone82, 236, 193, 8.6231F, 24.1564F, -15.7209F, 0, 1, 2, -0.2F, false));
		bone82.cubeList.add(new ModelBox(bone82, 236, 193, 8.6231F, 25.1564F, -15.7209F, 0, 1, 2, -0.2F, false));
		bone82.cubeList.add(new ModelBox(bone82, 236, 193, 8.6231F, 24.1564F, -15.7209F, 0, 1, 2, -0.2F, false));
		bone82.cubeList.add(new ModelBox(bone82, 68, 23, 7.0231F, 26.9564F, -16.1209F, 2, 2, 2, -0.3F, false));
		bone82.cubeList.add(new ModelBox(bone82, 68, 23, 7.0231F, 28.9564F, -16.1209F, 2, 2, 2, -0.3F, false));
		bone82.cubeList.add(new ModelBox(bone82, 66, 99, 7.5231F, 29.0314F, -16.3209F, 1, 2, 2, -0.4F, false));
		bone82.cubeList.add(new ModelBox(bone82, 66, 99, 7.0231F, 27.4064F, -16.3209F, 2, 1, 2, -0.4F, false));

		bone83 = new RendererModel(this);
		bone83.setRotationPoint(-9.0F, -15.5F, -11.5F);
		side6.addChild(bone83);
		setRotationAngle(bone83, -1.0472F, 0.0F, 0.0F);
		bone83.cubeList.add(new ModelBox(bone83, 175, 1, 22.1902F, 24.2366F, -15.3209F, 2, 2, 2, 0.0F, false));

		bone84 = new RendererModel(this);
		bone84.setRotationPoint(0.0F, -2.0F, 0.0F);
		bone83.addChild(bone84);
		setRotationAngle(bone84, 0.0F, 0.0F, 0.4363F);
		bone84.cubeList.add(new ModelBox(bone84, 159, 89, 31.1993F, 4.4005F, -15.3209F, 2, 10, 2, 0.0F, false));
		bone84.cubeList.add(new ModelBox(bone84, 250, 193, 31.1993F, 10.3005F, -16.3209F, 2, 4, 1, 0.0F, false));
		bone84.cubeList.add(new ModelBox(bone84, 246, 194, 33.2993F, 12.3005F, -16.3209F, 0, 2, 1, -0.1F, false));
		bone84.cubeList.add(new ModelBox(bone84, 246, 194, 31.0993F, 12.3005F, -16.3209F, 0, 2, 1, -0.1F, false));
		bone84.cubeList.add(new ModelBox(bone84, 250, 193, 31.2993F, 10.4005F, -16.9209F, 1, 4, 1, -0.2F, false));
		bone84.cubeList.add(new ModelBox(bone84, 250, 193, 32.0993F, 10.4005F, -16.9209F, 1, 4, 1, -0.2F, false));
		bone84.cubeList.add(new ModelBox(bone84, 250, 193, 31.1993F, 6.3005F, -15.8209F, 2, 1, 1, -0.1F, false));
		bone84.cubeList.add(new ModelBox(bone84, 252, 220, 31.1993F, 7.8005F, -15.5209F, 1, 1, 1, -0.1F, false));
		bone84.cubeList.add(new ModelBox(bone84, 252, 65, 32.1993F, 7.8005F, -15.5209F, 1, 1, 1, -0.1F, false));
		bone84.cubeList.add(new ModelBox(bone84, 250, 193, 31.0993F, 6.3005F, -16.3209F, 1, 1, 1, -0.1F, false));
		bone84.cubeList.add(new ModelBox(bone84, 250, 193, 32.2993F, 6.3005F, -16.3209F, 1, 1, 1, -0.1F, false));

		refuel = new RendererModel(this);
		refuel.setRotationPoint(32.2493F, 13.4005F, -16.0209F);
		bone84.addChild(refuel);
		setRotationAngle(refuel, 0.4363F, 0.0F, 0.0F);
		refuel.cubeList.add(new ModelBox(refuel, 65, 101, 0.35F, -0.5F, -2.8F, 1, 1, 1, -0.15F, false));
		refuel.cubeList.add(new ModelBox(refuel, 250, 193, 0.35F, -0.5F, -2.2F, 1, 1, 3, -0.25F, false));
		refuel.cubeList.add(new ModelBox(refuel, 250, 193, -1.35F, -0.5F, -2.2F, 1, 1, 3, -0.25F, false));
		refuel.cubeList.add(new ModelBox(refuel, 65, 101, -1.35F, -0.5F, -2.8F, 1, 1, 1, -0.15F, false));

		bone85 = new RendererModel(this);
		bone85.setRotationPoint(5.0F, -15.5F, -11.5F);
		side6.addChild(bone85);
		setRotationAngle(bone85, -1.6581F, 0.0F, 0.0F);
		bone85.cubeList.add(new ModelBox(bone85, 174, 141, 22.1902F, 27.9309F, 4.4833F, 2, 2, 2, 0.0F, false));

		bone86 = new RendererModel(this);
		bone86.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone85.addChild(bone86);
		setRotationAngle(bone86, 0.0F, 0.0F, -0.4363F);
		bone86.cubeList.add(new ModelBox(bone86, 131, 154, 5.4618F, 25.5046F, 4.4833F, 2, 11, 2, 0.0F, false));
		bone86.cubeList.add(new ModelBox(bone86, 141, 93, 5.4618F, 25.5046F, 6.4833F, 2, 2, 7, 0.0F, false));

		bone87 = new RendererModel(this);
		bone87.setRotationPoint(2.0F, -2.0F, 0.0F);
		bone85.addChild(bone87);
		setRotationAngle(bone87, 0.4363F, 0.0F, -0.4363F);
		bone87.cubeList.add(new ModelBox(bone87, 14, 168, 5.4618F, 28.8133F, -0.5587F, 2, 6, 2, 0.0F, false));

		bone88 = new RendererModel(this);
		bone88.setRotationPoint(-9.0F, -15.5F, -11.5F);
		side6.addChild(bone88);
		setRotationAngle(bone88, -1.6581F, 0.0F, 0.0F);
		bone88.cubeList.add(new ModelBox(bone88, 54, 176, 22.1902F, 27.9309F, 4.4833F, 2, 2, 2, 0.0F, false));

		bone89 = new RendererModel(this);
		bone89.setRotationPoint(0.0F, -2.0F, 0.0F);
		bone88.addChild(bone89);
		setRotationAngle(bone89, 0.0F, 0.0F, 0.4363F);
		bone89.cubeList.add(new ModelBox(bone89, 60, 157, 32.7605F, 6.7486F, 4.4833F, 2, 11, 2, 0.0F, false));
		bone89.cubeList.add(new ModelBox(bone89, 139, 40, 32.7605F, 6.7486F, 6.4833F, 2, 2, 7, 0.0F, false));

		bone90 = new RendererModel(this);
		bone90.setRotationPoint(1.9634F, -11.0784F, 10.8321F);
		bone89.addChild(bone90);
		setRotationAngle(bone90, -1.1345F, 0.0F, 0.0F);
		bone90.cubeList.add(new ModelBox(bone90, 89, 144, 30.7971F, 5.1304F, 17.2752F, 2, 2, 6, 0.0F, false));

		bone95 = new RendererModel(this);
		bone95.setRotationPoint(0.0F, 1.0F, -1.0F);
		base.addChild(bone95);


		bone94 = new RendererModel(this);
		bone94.setRotationPoint(5.5726F, 6.8804F, 8.652F);
		bone95.addChild(bone94);
		setRotationAngle(bone94, -0.3491F, 0.5236F, 0.0F);
		bone94.cubeList.add(new ModelBox(bone94, 143, 136, -2.6141F, -7.8713F, -5.2282F, 3, 1, 5, 0.0F, false));

		bone93 = new RendererModel(this);
		bone93.setRotationPoint(4.2239F, -1.0891F, 6.3161F);
		bone95.addChild(bone93);
		setRotationAngle(bone93, 0.0F, 0.5236F, 0.0F);
		bone93.cubeList.add(new ModelBox(bone93, 90, 95, -2.6141F, -8.8713F, -1.5532F, 3, 8, 2, 0.0F, false));

		bone92 = new RendererModel(this);
		bone92.setRotationPoint(5.2239F, -1.0891F, 8.0481F);
		bone95.addChild(bone92);
		setRotationAngle(bone92, 0.0873F, 0.5236F, 0.0F);
		bone92.cubeList.add(new ModelBox(bone92, 106, 91, -2.6141F, -8.8713F, -1.5532F, 3, 1, 10, 0.0F, false));

		bone91 = new RendererModel(this);
		bone91.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone95.addChild(bone91);
		setRotationAngle(bone91, -0.5236F, 0.5236F, 0.0F);
		bone91.cubeList.add(new ModelBox(bone91, 80, 0, -2.6141F, -19.8713F, -1.5532F, 3, 1, 10, 0.0F, false));
		bone91.cubeList.add(new ModelBox(bone91, 213, 181, -1.6391F, -22.2713F, 1.9468F, 2, 2, 1, 0.0F, false));
		bone91.cubeList.add(new ModelBox(bone91, 242, 164, -1.6391F, -22.2713F, 2.4468F, 2, 2, 5, -0.1F, false));
		bone91.cubeList.add(new ModelBox(bone91, 213, 181, -1.6391F, -22.2713F, 6.9468F, 2, 2, 1, 0.0F, false));
		bone91.cubeList.add(new ModelBox(bone91, 211, 181, -1.0391F, -21.8713F, 4.7468F, 1, 1, 5, -0.25F, false));
		bone91.cubeList.add(new ModelBox(bone91, 64, 98, -1.6391F, -22.2713F, 9.1468F, 2, 2, 1, -0.15F, false));
		bone91.cubeList.add(new ModelBox(bone91, 168, 106, -2.6141F, -19.8713F, -3.5532F, 4, 1, 2, 0.0F, false));

		bone96 = new RendererModel(this);
		bone96.setRotationPoint(-0.95F, 1.0F, -0.4F);
		base.addChild(bone96);
		setRotationAngle(bone96, 0.0F, -1.0472F, 0.0F);


		bone97 = new RendererModel(this);
		bone97.setRotationPoint(5.5726F, 6.8804F, 8.652F);
		bone96.addChild(bone97);
		setRotationAngle(bone97, -0.3491F, 0.5236F, 0.0F);
		bone97.cubeList.add(new ModelBox(bone97, 150, 58, -2.6141F, -7.8713F, -5.2282F, 3, 1, 5, 0.0F, false));

		bone98 = new RendererModel(this);
		bone98.setRotationPoint(4.2239F, -1.0891F, 6.3161F);
		bone96.addChild(bone98);
		setRotationAngle(bone98, 0.0F, 0.5236F, 0.0F);
		bone98.cubeList.add(new ModelBox(bone98, 84, 84, -2.6141F, -8.8713F, -1.5532F, 3, 8, 2, 0.0F, false));

		bone99 = new RendererModel(this);
		bone99.setRotationPoint(5.2239F, -1.0891F, 8.0481F);
		bone96.addChild(bone99);
		setRotationAngle(bone99, 0.0873F, 0.5236F, 0.0F);
		bone99.cubeList.add(new ModelBox(bone99, 106, 106, -2.6141F, -8.8713F, -1.5532F, 3, 1, 10, 0.0F, false));

		bone100 = new RendererModel(this);
		bone100.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone96.addChild(bone100);
		setRotationAngle(bone100, -0.5236F, 0.5236F, 0.0F);
		bone100.cubeList.add(new ModelBox(bone100, 60, 106, -2.6141F, -19.8713F, -1.5532F, 3, 1, 10, 0.0F, false));
		bone100.cubeList.add(new ModelBox(bone100, 213, 181, -1.5891F, -22.3713F, 2.0468F, 2, 2, 1, 0.0F, false));
		bone100.cubeList.add(new ModelBox(bone100, 245, 192, -2.731F, -22.0101F, 1.2854F, 4, 1, 1, -0.1F, false));
		bone100.cubeList.add(new ModelBox(bone100, 242, 164, -1.5891F, -22.3713F, 2.5468F, 2, 2, 5, -0.1F, false));
		bone100.cubeList.add(new ModelBox(bone100, 213, 181, -1.5891F, -22.3713F, 7.0468F, 2, 2, 1, 0.0F, false));
		bone100.cubeList.add(new ModelBox(bone100, 211, 181, -0.9891F, -21.9713F, 4.8468F, 1, 1, 5, -0.25F, false));
		bone100.cubeList.add(new ModelBox(bone100, 64, 98, -1.4891F, -22.5713F, 9.2468F, 2, 2, 1, -0.15F, false));
		bone100.cubeList.add(new ModelBox(bone100, 168, 123, -2.6141F, -19.8713F, -3.5532F, 4, 1, 2, 0.0F, false));

		bone101 = new RendererModel(this);
		bone101.setRotationPoint(-1.9F, 1.0F, -0.6F);
		base.addChild(bone101);
		setRotationAngle(bone101, 0.0F, -2.0944F, 0.0F);


		bone102 = new RendererModel(this);
		bone102.setRotationPoint(5.5726F, 6.8804F, 8.652F);
		bone101.addChild(bone102);
		setRotationAngle(bone102, -0.3491F, 0.5236F, 0.0F);
		bone102.cubeList.add(new ModelBox(bone102, 151, 121, -2.6141F, -7.8713F, -5.2282F, 3, 1, 5, 0.0F, false));

		bone103 = new RendererModel(this);
		bone103.setRotationPoint(4.2239F, -1.0891F, 6.3161F);
		bone101.addChild(bone103);
		setRotationAngle(bone103, 0.0F, 0.5236F, 0.0F);
		bone103.cubeList.add(new ModelBox(bone103, 96, 0, -2.6141F, -8.8713F, -1.5532F, 3, 8, 2, 0.0F, false));

		bone104 = new RendererModel(this);
		bone104.setRotationPoint(5.2239F, -1.0891F, 8.0481F);
		bone101.addChild(bone104);
		setRotationAngle(bone104, 0.0873F, 0.5236F, 0.0F);
		bone104.cubeList.add(new ModelBox(bone104, 100, 80, -2.6141F, -8.8713F, -1.5532F, 3, 1, 10, 0.0F, false));

		bone105 = new RendererModel(this);
		bone105.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone101.addChild(bone105);
		setRotationAngle(bone105, -0.5236F, 0.5236F, 0.0F);
		bone105.cubeList.add(new ModelBox(bone105, 96, 48, -2.6141F, -19.8713F, -1.5532F, 3, 1, 10, 0.0F, false));
		bone105.cubeList.add(new ModelBox(bone105, 168, 52, -2.6141F, -19.8713F, -3.5532F, 4, 1, 2, 0.0F, false));
		bone105.cubeList.add(new ModelBox(bone105, 64, 98, -1.7391F, -22.4713F, 9.1468F, 2, 2, 1, -0.15F, false));
		bone105.cubeList.add(new ModelBox(bone105, 211, 181, -1.2391F, -21.8713F, 4.7468F, 1, 1, 5, -0.25F, false));
		bone105.cubeList.add(new ModelBox(bone105, 213, 181, -1.8391F, -22.2713F, 6.9468F, 2, 2, 1, 0.0F, false));
		bone105.cubeList.add(new ModelBox(bone105, 242, 164, -1.8391F, -22.2713F, 2.4468F, 2, 2, 5, -0.1F, false));
		bone105.cubeList.add(new ModelBox(bone105, 213, 181, -1.8391F, -22.2713F, 1.9468F, 2, 2, 1, 0.0F, false));

		bone106 = new RendererModel(this);
		bone106.setRotationPoint(-2.0F, 1.0F, -1.9F);
		base.addChild(bone106);
		setRotationAngle(bone106, 0.0F, 3.1416F, 0.0F);


		bone107 = new RendererModel(this);
		bone107.setRotationPoint(5.5726F, 6.8804F, 8.652F);
		bone106.addChild(bone107);
		setRotationAngle(bone107, -0.3491F, 0.5236F, 0.0F);
		bone107.cubeList.add(new ModelBox(bone107, 7, 152, -2.6141F, -7.8713F, -5.2282F, 3, 1, 5, 0.0F, false));

		bone108 = new RendererModel(this);
		bone108.setRotationPoint(4.2239F, -1.0891F, 6.3161F);
		bone106.addChild(bone108);
		setRotationAngle(bone108, 0.0F, 0.5236F, 0.0F);
		bone108.cubeList.add(new ModelBox(bone108, 96, 48, -2.6141F, -8.8713F, -1.5532F, 3, 8, 2, 0.0F, false));

		bone109 = new RendererModel(this);
		bone109.setRotationPoint(5.2239F, -1.0891F, 8.0481F);
		bone106.addChild(bone109);
		setRotationAngle(bone109, 0.0873F, 0.5236F, 0.0F);
		bone109.cubeList.add(new ModelBox(bone109, 96, 12, -2.6141F, -8.8713F, -1.5532F, 3, 1, 10, 0.0F, false));

		bone110 = new RendererModel(this);
		bone110.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone106.addChild(bone110);
		setRotationAngle(bone110, -0.5236F, 0.5236F, 0.0F);
		bone110.cubeList.add(new ModelBox(bone110, 96, 1, -2.6141F, -19.8713F, -1.5532F, 3, 1, 10, 0.0F, false));
		bone110.cubeList.add(new ModelBox(bone110, 64, 101, -2.2141F, -21.0713F, 0.6468F, 3, 1, 1, -0.2F, false));
		bone110.cubeList.add(new ModelBox(bone110, 167, 164, -2.6141F, -19.8713F, -3.5532F, 4, 1, 2, 0.0F, false));
		bone110.cubeList.add(new ModelBox(bone110, 64, 98, -1.6391F, -22.5713F, 9.3468F, 2, 2, 1, -0.15F, false));
		bone110.cubeList.add(new ModelBox(bone110, 211, 181, -1.0391F, -22.0713F, 4.9468F, 1, 1, 5, -0.25F, false));
		bone110.cubeList.add(new ModelBox(bone110, 213, 181, -1.6391F, -22.4713F, 7.1468F, 2, 2, 1, 0.0F, false));
		bone110.cubeList.add(new ModelBox(bone110, 242, 164, -1.6391F, -22.4713F, 2.6468F, 2, 2, 5, -0.1F, false));
		bone110.cubeList.add(new ModelBox(bone110, 213, 181, -1.6391F, -22.4713F, 2.1468F, 2, 2, 1, 0.0F, false));

		bone111 = new RendererModel(this);
		bone111.setRotationPoint(-0.925F, 1.0F, -2.4F);
		base.addChild(bone111);
		setRotationAngle(bone111, 0.0F, 2.0944F, 0.0F);


		bone112 = new RendererModel(this);
		bone112.setRotationPoint(5.5726F, 6.8804F, 8.652F);
		bone111.addChild(bone112);
		setRotationAngle(bone112, -0.3491F, 0.5236F, 0.0F);
		bone112.cubeList.add(new ModelBox(bone112, 67, 152, -2.6141F, -7.8713F, -5.2282F, 3, 1, 5, 0.0F, false));

		bone113 = new RendererModel(this);
		bone113.setRotationPoint(4.2239F, -1.0891F, 6.3161F);
		bone111.addChild(bone113);
		setRotationAngle(bone113, 0.0F, 0.5236F, 0.0F);
		bone113.cubeList.add(new ModelBox(bone113, 60, 105, -2.6141F, -8.8713F, -1.5532F, 3, 8, 2, 0.0F, false));

		bone114 = new RendererModel(this);
		bone114.setRotationPoint(5.2239F, -1.0891F, 8.0481F);
		bone111.addChild(bone114);
		setRotationAngle(bone114, 0.0873F, 0.5236F, 0.0F);
		bone114.cubeList.add(new ModelBox(bone114, 84, 84, -2.6141F, -8.8713F, -1.5532F, 3, 1, 10, 0.0F, false));

		bone115 = new RendererModel(this);
		bone115.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone111.addChild(bone115);
		setRotationAngle(bone115, -0.5236F, 0.5236F, 0.0F);
		bone115.cubeList.add(new ModelBox(bone115, 76, 107, -2.6141F, -19.8713F, -1.5532F, 3, 1, 10, 0.0F, false));
		bone115.cubeList.add(new ModelBox(bone115, 242, 164, -1.6141F, -22.4445F, 2.3468F, 2, 2, 5, -0.1F, false));
		bone115.cubeList.add(new ModelBox(bone115, 211, 181, -1.0141F, -21.8713F, 4.7468F, 1, 1, 5, -0.25F, false));
		bone115.cubeList.add(new ModelBox(bone115, 213, 181, -1.6141F, -22.4445F, 1.8468F, 2, 2, 1, 0.0F, false));
		bone115.cubeList.add(new ModelBox(bone115, 213, 181, -1.6141F, -22.4445F, 6.8468F, 2, 2, 1, 0.0F, false));
		bone115.cubeList.add(new ModelBox(bone115, 64, 98, -1.6141F, -22.4445F, 9.0468F, 2, 2, 1, -0.15F, false));
		bone115.cubeList.add(new ModelBox(bone115, 168, 109, -2.6141F, -19.8713F, -3.5532F, 4, 1, 2, 0.0F, false));

		bone116 = new RendererModel(this);
		bone116.setRotationPoint(-0.225F, 1.0F, -2.325F);
		base.addChild(bone116);
		setRotationAngle(bone116, 0.0F, 1.0472F, 0.0F);


		bone117 = new RendererModel(this);
		bone117.setRotationPoint(5.5726F, 6.8804F, 8.652F);
		bone116.addChild(bone117);
		setRotationAngle(bone117, -0.3491F, 0.5236F, 0.0F);
		bone117.cubeList.add(new ModelBox(bone117, 150, 40, -2.6141F, -7.8713F, -5.2282F, 3, 1, 5, 0.0F, false));

		bone118 = new RendererModel(this);
		bone118.setRotationPoint(4.2239F, -1.0891F, 6.3161F);
		bone116.addChild(bone118);
		setRotationAngle(bone118, 0.0F, 0.5236F, 0.0F);
		bone118.cubeList.add(new ModelBox(bone118, 76, 106, -2.6141F, -8.8713F, -1.5532F, 3, 8, 2, 0.0F, false));

		bone119 = new RendererModel(this);
		bone119.setRotationPoint(5.2239F, -1.0891F, 8.0481F);
		bone116.addChild(bone119);
		setRotationAngle(bone119, 0.0873F, 0.5236F, 0.0F);
		bone119.cubeList.add(new ModelBox(bone119, 74, 95, -2.6141F, -8.8713F, -1.5532F, 3, 1, 10, 0.0F, false));

		bone120 = new RendererModel(this);
		bone120.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone116.addChild(bone120);
		setRotationAngle(bone120, -0.5236F, 0.5236F, 0.0F);
		bone120.cubeList.add(new ModelBox(bone120, 90, 96, -2.6141F, -19.8713F, -1.5532F, 3, 1, 10, 0.0F, false));
		bone120.cubeList.add(new ModelBox(bone120, 213, 181, -1.8141F, -22.2713F, 1.8718F, 2, 2, 1, 0.0F, false));
		bone120.cubeList.add(new ModelBox(bone120, 242, 164, -1.8141F, -22.2713F, 2.3718F, 2, 2, 5, -0.1F, false));
		bone120.cubeList.add(new ModelBox(bone120, 213, 181, -1.8141F, -22.2713F, 6.8718F, 2, 2, 1, 0.0F, false));
		bone120.cubeList.add(new ModelBox(bone120, 211, 181, -1.2141F, -21.8713F, 4.6718F, 1, 1, 5, -0.25F, false));
		bone120.cubeList.add(new ModelBox(bone120, 64, 98, -1.8141F, -22.3713F, 9.0718F, 2, 2, 1, -0.15F, false));
		bone120.cubeList.add(new ModelBox(bone120, 168, 112, -2.6141F, -19.8713F, -3.5532F, 4, 1, 2, 0.0F, false));

		rotarupndown = new RendererModel(this);
		rotarupndown.setRotationPoint(0.0F, 1.0F, -1.0F);
		base.addChild(rotarupndown);


		sectiontwo = new RendererModel(this);
		sectiontwo.setRotationPoint(-0.2F, -6.0F, 0.0F);
		rotarupndown.addChild(sectiontwo);
		sectiontwo.cubeList.add(new ModelBox(sectiontwo, 125, 136, -2.5F, -51.0F, -1.5F, 3, 3, 3, 1.5F, false));
		sectiontwo.cubeList.add(new ModelBox(sectiontwo, 161, 149, -2.5F, -60.0F, -1.5F, 3, 3, 3, 2.0F, false));
		sectiontwo.cubeList.add(new ModelBox(sectiontwo, 161, 149, -2.5F, -71.0F, -1.5F, 3, 3, 3, 2.0F, false));
		sectiontwo.cubeList.add(new ModelBox(sectiontwo, 8, 64, -2.5F, -65.5F, -1.5F, 3, 3, 3, 1.0F, false));
		sectiontwo.cubeList.add(new ModelBox(sectiontwo, 8, 64, -2.5F, -55.5F, -1.5F, 3, 3, 3, 1.0F, false));
		sectiontwo.cubeList.add(new ModelBox(sectiontwo, 8, 64, -2.5F, -46.5F, -1.5F, 3, 3, 3, 1.0F, false));
		sectiontwo.cubeList.add(new ModelBox(sectiontwo, 152, 19, -2.5F, -46.2F, -1.5F, 3, 6, 3, -0.6F, false));
		sectiontwo.cubeList.add(new ModelBox(sectiontwo, 152, 19, -2.5F, -44.9F, -1.5F, 3, 6, 3, -0.6F, false));

		sectionone = new RendererModel(this);
		sectionone.setRotationPoint(-0.2F, -3.0F, 0.0F);
		rotarupndown.addChild(sectionone);
		sectionone.cubeList.add(new ModelBox(sectionone, 83, 144, -2.5F, -29.5F, -1.5F, 3, 3, 3, 1.0F, false));
		sectionone.cubeList.add(new ModelBox(sectionone, 72, 136, -2.5F, -24.0F, -1.5F, 3, 3, 3, 1.5F, false));
		sectionone.cubeList.add(new ModelBox(sectionone, 72, 136, -2.5F, -18.4F, -1.5F, 3, 3, 3, 1.7F, false));
		sectionone.cubeList.add(new ModelBox(sectionone, 99, 144, -2.5F, -32.8F, -1.5F, 3, 3, 3, 0.5F, false));
		sectionone.cubeList.add(new ModelBox(sectionone, 107, 135, -2.5F, -35.8F, -1.5F, 3, 4, 3, -0.6F, false));
		sectionone.cubeList.add(new ModelBox(sectionone, 107, 135, -2.5F, -37.8F, -1.5F, 3, 4, 3, -0.6F, false));
		sectionone.cubeList.add(new ModelBox(sectionone, 107, 135, -2.5F, -39.6F, -1.5F, 3, 3, 3, -0.5F, false));

		circle = new RendererModel(this);
		circle.setRotationPoint(2.5F, -25.0F, -57.5F);
		base.addChild(circle);


		bone128 = new RendererModel(this);
		bone128.setRotationPoint(0.0F, 0.0F, 50.0F);
		circle.addChild(bone128);
		bone128.cubeList.add(new ModelBox(bone128, 157, 37, -7.0F, -1.0F, 1.7F, 7, 2, 1, 0.0F, false));

		bone129 = new RendererModel(this);
		bone129.setRotationPoint(0.0F, 0.0F, 50.0F);
		circle.addChild(bone129);
		setRotationAngle(bone129, 0.0F, -1.0472F, 0.0F);


		bone130 = new RendererModel(this);
		bone130.setRotationPoint(0.0F, 0.0F, 50.0F);
		circle.addChild(bone130);
		setRotationAngle(bone130, 0.0F, -2.0944F, 0.0F);


		bone131 = new RendererModel(this);
		bone131.setRotationPoint(0.0F, 0.0F, 50.0F);
		circle.addChild(bone131);
		bone131.cubeList.add(new ModelBox(bone131, 100, 91, -7.0F, -1.0F, 9.3244F, 7, 2, 1, 0.0F, false));

		circle2 = new RendererModel(this);
		circle2.setRotationPoint(2.5F, -37.0F, -57.5F);
		base.addChild(circle2);


		bone132 = new RendererModel(this);
		bone132.setRotationPoint(0.0F, 0.0F, 50.0F);
		circle2.addChild(bone132);
		bone132.cubeList.add(new ModelBox(bone132, 161, 0, -7.0F, -1.0F, 2.3F, 7, 2, 1, 0.0F, false));
		bone132.cubeList.add(new ModelBox(bone132, 161, 0, -7.9F, -16.7F, 2.3F, 9, 2, 1, 0.0F, false));
		bone132.cubeList.add(new ModelBox(bone132, 161, 0, -8.0F, -11.0F, 2.3F, 9, 2, 1, 0.0F, false));
		bone132.cubeList.add(new ModelBox(bone132, 208, 0, -9.2F, -38.1F, 2.3F, 11, 2, 1, 0.0F, false));

		bone133 = new RendererModel(this);
		bone133.setRotationPoint(0.0F, 0.0F, 50.0F);
		circle2.addChild(bone133);
		setRotationAngle(bone133, 0.0F, -1.0472F, 0.0F);


		bone134 = new RendererModel(this);
		bone134.setRotationPoint(0.0F, 0.0F, 50.0F);
		circle2.addChild(bone134);
		setRotationAngle(bone134, 0.0F, -2.0944F, 0.0F);


		bone135 = new RendererModel(this);
		bone135.setRotationPoint(0.0F, 0.0F, 50.0F);
		circle2.addChild(bone135);
		bone135.cubeList.add(new ModelBox(bone135, 161, 40, -7.0F, -1.0F, 9.0244F, 7, 2, 1, 0.0F, false));
		bone135.cubeList.add(new ModelBox(bone135, 234, 86, -7.6F, -16.7F, 9.3244F, 8, 2, 1, 0.0F, false));
		bone135.cubeList.add(new ModelBox(bone135, 234, 86, -8.0F, -11.0F, 9.0244F, 9, 2, 1, 0.0F, false));
		bone135.cubeList.add(new ModelBox(bone135, 208, 0, -9.1F, -38.1F, 9.3244F, 10, 2, 1, 0.0F, false));

		circle3 = new RendererModel(this);
		circle3.setRotationPoint(2.5F, -49.0F, -57.5F);
		base.addChild(circle3);


		bone136 = new RendererModel(this);
		bone136.setRotationPoint(0.0F, 0.0F, 50.0F);
		circle3.addChild(bone136);


		bone137 = new RendererModel(this);
		bone137.setRotationPoint(0.0F, 0.0F, 50.0F);
		circle3.addChild(bone137);
		setRotationAngle(bone137, 0.0F, -1.0472F, 0.0F);


		bone138 = new RendererModel(this);
		bone138.setRotationPoint(0.0F, 0.0F, 50.0F);
		circle3.addChild(bone138);
		setRotationAngle(bone138, 0.0F, -2.0944F, 0.0F);


		bone139 = new RendererModel(this);
		bone139.setRotationPoint(0.0F, 0.0F, 50.0F);
		circle3.addChild(bone139);


		circle4 = new RendererModel(this);
		circle4.setRotationPoint(2.5F, -41.0F, -57.5F);
		base.addChild(circle4);


		bone142 = new RendererModel(this);
		bone142.setRotationPoint(0.0F, 0.0F, 50.0F);
		circle4.addChild(bone142);


		bone143 = new RendererModel(this);
		bone143.setRotationPoint(0.0F, 0.0F, 50.0F);
		circle4.addChild(bone143);
		setRotationAngle(bone143, 0.0F, -1.0472F, 0.0F);


		bone144 = new RendererModel(this);
		bone144.setRotationPoint(0.0F, 0.0F, 50.0F);
		circle4.addChild(bone144);
		setRotationAngle(bone144, 0.0F, -2.0944F, 0.0F);


		bone145 = new RendererModel(this);
		bone145.setRotationPoint(0.0F, 0.0F, 50.0F);
		circle4.addChild(bone145);


		rotar3 = new RendererModel(this);
		rotar3.setRotationPoint(5.1F, -16.0F, -1.5F);
		base.addChild(rotar3);
		setRotationAngle(rotar3, 0.0F, 0.0F, 0.0349F);


		bone121 = new RendererModel(this);
		bone121.setRotationPoint(1.1F, 20.0F, 2.0F);
		rotar3.addChild(bone121);
		bone121.cubeList.add(new ModelBox(bone121, 0, 186, -3.5983F, -83.9058F, -5.0F, 1, 64, 6, 0.0F, false));

		bone122 = new RendererModel(this);
		bone122.setRotationPoint(1.1F, 20.0F, 2.0F);
		rotar3.addChild(bone122);
		setRotationAngle(bone122, 0.0F, -0.7854F, 0.0F);
		bone122.cubeList.add(new ModelBox(bone122, 0, 186, -2.1301F, -83.9058F, 2.5444F, 1, 64, 3, 0.0F, false));

		bone123 = new RendererModel(this);
		bone123.setRotationPoint(1.1F, 20.0F, 2.0F);
		rotar3.addChild(bone123);
		setRotationAngle(bone123, 0.0F, 0.7854F, 0.0F);
		bone123.cubeList.add(new ModelBox(bone123, 0, 186, 0.6983F, -83.9058F, -8.3728F, 1, 64, 3, 0.0F, false));

		rotar2 = new RendererModel(this);
		rotar2.setRotationPoint(-5.9F, -16.0F, -1.5F);
		base.addChild(rotar2);
		setRotationAngle(rotar2, 0.0F, 3.1416F, -0.0349F);


		bone124 = new RendererModel(this);
		bone124.setRotationPoint(1.1F, 20.0F, 2.0F);
		rotar2.addChild(bone124);
		bone124.cubeList.add(new ModelBox(bone124, 0, 186, -1.8993F, -83.9651F, -5.0F, 1, 64, 6, 0.0F, false));

		bone125 = new RendererModel(this);
		bone125.setRotationPoint(1.1F, 20.0F, 2.0F);
		rotar2.addChild(bone125);
		setRotationAngle(bone125, 0.0F, -0.7854F, 0.0F);
		bone125.cubeList.add(new ModelBox(bone125, 0, 189, -0.9288F, -83.9651F, 1.343F, 1, 64, 3, 0.0F, false));

		bone126 = new RendererModel(this);
		bone126.setRotationPoint(1.1F, 20.0F, 2.0F);
		rotar2.addChild(bone126);
		setRotationAngle(bone126, 0.0F, 0.7854F, 0.0F);
		bone126.cubeList.add(new ModelBox(bone126, 0, 186, 1.8996F, -83.9651F, -7.1714F, 1, 64, 3, 0.0F, false));

		bone127 = new RendererModel(this);
		bone127.setRotationPoint(-0.95F, 1.0F, 24.5F);
		base.addChild(bone127);
		bone127.cubeList.add(new ModelBox(bone127, 135, 127, -5.0F, -49.0F, -34.6F, 10, 2, 1, 0.0F, false));
		bone127.cubeList.add(new ModelBox(bone127, 112, 8, -7.1301F, -48.5F, -38.1641F, 14, 1, 1, 0.0F, false));
		bone127.cubeList.add(new ModelBox(bone127, 143, 77, -5.0F, -49.0F, -18.2795F, 10, 2, 1, 0.0F, false));
		bone127.cubeList.add(new ModelBox(bone127, 133, 102, -7.1301F, -48.5F, -14.9154F, 11, 1, 1, 0.0F, false));
		bone127.cubeList.add(new ModelBox(bone127, 29, 176, 0.5699F, -49.6F, -12.9154F, 3, 3, 1, 0.0F, false));
		bone127.cubeList.add(new ModelBox(bone127, 199, 66, 1.7699F, -48.5F, -22.9154F, 1, 1, 10, -0.25F, false));

		bone141 = new RendererModel(this);
		bone141.setRotationPoint(-0.95F, 1.0F, 24.5F);
		base.addChild(bone141);
		setRotationAngle(bone141, 0.0F, -2.0944F, 0.0F);
		bone141.cubeList.add(new ModelBox(bone141, 139, 74, -27.4645F, -49.0F, 4.3096F, 10, 2, 1, 0.0F, false));
		bone141.cubeList.add(new ModelBox(bone141, 143, 86, -27.4645F, -49.0F, 20.6301F, 10, 2, 1, 0.0F, false));
		bone141.cubeList.add(new ModelBox(bone141, 112, 20, -29.486F, -48.5F, 24.2569F, 14, 1, 1, 0.0F, false));
		bone141.cubeList.add(new ModelBox(bone141, 127, 202, -25.786F, -48.5F, 14.2569F, 1, 1, 12, -0.25F, false));
		bone141.cubeList.add(new ModelBox(bone141, 0, 0, -25.786F, -48.5F, 25.9569F, 1, 1, 1, 0.0F, false));

		bone140 = new RendererModel(this);
		bone140.setRotationPoint(-0.95F, 1.0F, 24.5F);
		base.addChild(bone140);
		setRotationAngle(bone140, 0.0F, -1.0472F, 0.0F);
		bone140.cubeList.add(new ModelBox(bone140, 139, 0, -27.4645F, -49.0F, -21.6301F, 10, 2, 1, 0.0F, false));
		bone140.cubeList.add(new ModelBox(bone140, 143, 82, -27.4645F, -49.0F, -5.3096F, 10, 2, 1, 0.0F, false));
		bone140.cubeList.add(new ModelBox(bone140, 118, 27, -29.6161F, -48.5F, -1.7828F, 14, 1, 1, 0.0F, false));
		bone140.cubeList.add(new ModelBox(bone140, 122, 10, -29.6161F, -48.5F, -25.0315F, 12, 1, 1, 0.0F, false));
		bone140.cubeList.add(new ModelBox(bone140, 230, 128, -28.6161F, -38.0F, -26.0315F, 2, 8, 3, 0.0F, false));
		bone140.cubeList.add(new ModelBox(bone140, 230, 128, -18.6161F, -38.0F, -26.0315F, 2, 8, 3, 0.0F, false));
		bone140.cubeList.add(new ModelBox(bone140, 230, 128, -27.6161F, -38.5F, -26.0315F, 10, 2, 3, 0.0F, false));
		bone140.cubeList.add(new ModelBox(bone140, 60, 96, -27.6161F, -37.5F, -25.6315F, 10, 7, 2, 0.0F, false));
		bone140.cubeList.add(new ModelBox(bone140, 230, 128, -27.6161F, -31.5F, -26.0315F, 10, 2, 3, 0.0F, false));
		bone140.cubeList.add(new ModelBox(bone140, 250, 200, -17.8161F, -36.5F, -26.5315F, 1, 1, 2, -0.15F, false));
		bone140.cubeList.add(new ModelBox(bone140, 246, 200, -24.1161F, -38.5F, -26.5315F, 3, 2, 2, -0.15F, false));
		bone140.cubeList.add(new ModelBox(bone140, 65, 100, -23.1161F, -30.9F, -26.5315F, 1, 1, 2, -0.15F, false));
		bone140.cubeList.add(new ModelBox(bone140, 250, 200, -17.8161F, -36.5F, -26.2315F, 1, 1, 2, -0.05F, false));
		bone140.cubeList.add(new ModelBox(bone140, 250, 200, -17.8161F, -32.5F, -26.2315F, 1, 1, 2, -0.05F, false));
		bone140.cubeList.add(new ModelBox(bone140, 250, 200, -17.8161F, -32.5F, -26.5315F, 1, 1, 2, -0.15F, false));
		bone140.cubeList.add(new ModelBox(bone140, 226, 105, -29.6161F, -39.8F, -25.0315F, 1, 12, 1, -0.1F, false));
		bone140.cubeList.add(new ModelBox(bone140, 226, 105, -29.6161F, -40.6F, -25.0315F, 14, 1, 1, -0.1F, false));
		bone140.cubeList.add(new ModelBox(bone140, 221, 22, -29.6161F, -28.5F, -25.0315F, 14, 1, 1, -0.1F, false));
		bone140.cubeList.add(new ModelBox(bone140, 72, 0, -26.6161F, -47.5F, -24.5315F, 8, 7, 0, 0.0F, false));
		bone140.cubeList.add(new ModelBox(bone140, 226, 105, -16.6161F, -39.8F, -25.0315F, 1, 12, 1, -0.1F, false));
		bone140.cubeList.add(new ModelBox(bone140, 11, 136, -18.6161F, -48.5F, -26.0315F, 1, 1, 5, -0.25F, false));
		bone140.cubeList.add(new ModelBox(bone140, 234, 86, -20.0161F, -48.5F, -10.7828F, 1, 1, 11, -0.25F, false));
		bone140.cubeList.add(new ModelBox(bone140, 106, 121, -21.6161F, -50.125F, -0.1828F, 4, 4, 1, 0.0F, false));
		bone140.cubeList.add(new ModelBox(bone140, 176, 45, -21.0911F, -49.675F, 0.1172F, 3, 3, 1, 0.0F, false));
		bone140.cubeList.add(new ModelBox(bone140, 162, 176, -28.1161F, -49.025F, -0.1828F, 2, 2, 2, 0.0F, false));
		bone140.cubeList.add(new ModelBox(bone140, 89, 135, -27.6161F, -48.5F, -4.7828F, 1, 1, 6, -0.25F, false));
	}

	public void render(ConsoleTile tile) {


		bone149.rotateAngleY = (float) (bone149.rotateAngleY + Math.toRadians(1.5f));

		float rotation = MathHelper.clamp(MathHelper.sin((Minecraft.getInstance().player.ticksExisted + Minecraft.getInstance().getRenderPartialTicks()) / 60) * 10, 0, 90);
		bone151.rotateAngleY = rotation;

		Direction consoleFacing = tile.getExteriorDirection();
		if (consoleFacing == Direction.SOUTH) {
			facingcontrol.rotateAngleY = (float) Math.toRadians(0f);
		} else if (consoleFacing == Direction.NORTH) {
			facingcontrol.rotateAngleY = (float) Math.toRadians(180f);
		} else if (consoleFacing == Direction.EAST) {
			facingcontrol.rotateAngleY = (float) Math.toRadians(270f);
		}else if (consoleFacing == Direction.WEST) {
			facingcontrol.rotateAngleY = (float) Math.toRadians(90f);
		}

		HandbrakeControl handbrake = tile.getControl(HandbrakeControl.class);
		if (!handbrake.isFree()) {
			verticallanding.rotateAngleX = (float) (Math.toRadians(45F));
		} else {
			verticallanding.rotateAngleX = (float) (Math.toRadians(-45F));
		}

		RefuelerControl refuelerControl = tile.getControl(RefuelerControl.class);
		if (refuelerControl.isRefueling()) {
			refuel.rotateAngleX = (float) (Math.toRadians(-66f));
		} else {
			refuel.rotateAngleX = (float) (Math.toRadians(-8f));
		}

		LandingTypeControl landingTypeControl = tile.getControl(LandingTypeControl.class);
		if (landingTypeControl.getLandType() == LandingTypeControl.EnumLandType.DOWN) {
			handbreak.rotateAngleX = (float) (Math.toRadians(45F));
		} else {
			handbreak.rotateAngleX = (float) (Math.toRadians(-45F));
		}


		float prevRotor = tile.flightTicks == 0 ? 0 : 0.2F - ((float)Math.cos((tile.flightTicks - 1) * 0.1F) * 0.2F);
		float rotor = 0.2F - ((float)Math.cos(tile.flightTicks * 0.1F) * 0.2F);
		this.rotarupndown.offsetY = prevRotor - (prevRotor - rotor) * Minecraft.getInstance().getRenderPartialTicks();
		
		RandomiserControl random = tile.getControl(RandomiserControl.class);
		float randomOff = random.getAnimationTicks() == 0 ? 0 : 0.006F;
		//this.random_but_1.offsetY = this.random_but_6.offsetY = this.random_but_8.offsetY = randomOff;
		
		ThrottleControl throttleA = tile.getControl(ThrottleControl.class);
		this.throttle.rotateAngleX = -45 + throttleA.getAmount() * -10F;

		tile.getDoor().ifPresent(door -> {
			this.doorcontrol.rotateAngleX = (float)Math.toRadians(door.getOpenState() == EnumDoorState.CLOSED ? -10 : -100);
		});
		
		IncModControl inc = tile.getControl(IncModControl.class);
		//this.increment_increase.offsetZ = (inc.index / (float)IncModControl.COORD_MODS.length) * 0.17F;
		
		XControl x = tile.getControl(XControl.class);
		//this.x.offsetY = x.getAnimationTicks() == 0 ? 0 : 0.006F;
		
		YControl y = tile.getControl(YControl.class);
		//this.y.offsetY = y.getAnimationTicks() == 0 ? 0 : 0.006F;
		
		ZControl z = tile.getControl(ZControl.class);
		//this.z.offsetY = z.getAnimationTicks() == 0 ? 0 : 0.006F;
		
		base.render(0.0625F);
		
		GlStateManager.pushMatrix();
		
		GlStateManager.translated(-0.12, 0.555, -0.68);
		GlStateManager.rotated(0, 1, 0, 0);
		
		//WorldText text = new WorldText(0.22F, 0.15F, 0.002F, 0xFFFFFF);
		//text.renderMonitor(Helper.getConsoleText(tile));
		GlStateManager.popMatrix();
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}