package net.minecraft.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.EggEntity;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class EggItem extends Item {
   public EggItem(Item.Properties builder) {
      super(builder);
   }

   public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
      ItemStack itemstack = playerIn.getHeldItem(handIn);
      if (!playerIn.abilities.isCreativeMode) {
         itemstack.shrink(1);
      }

      worldIn.playSound((PlayerEntity)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_EGG_THROW, SoundCategory.PLAYERS, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
      if (!worldIn.isRemote) {
         EggEntity eggentity = new EggEntity(worldIn, playerIn);
         eggentity.setItem(itemstack);
         eggentity.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
         worldIn.addEntity(eggentity);
      }

      playerIn.addStat(Stats.ITEM_USED.get(this));
      return new ActionResult<>(ActionResultType.SUCCESS, itemstack);
   }
}