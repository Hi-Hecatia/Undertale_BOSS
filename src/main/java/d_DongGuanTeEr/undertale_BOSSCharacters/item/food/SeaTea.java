package d_DongGuanTeEr.undertale_BOSSCharacters.item.food;

import d_DongGuanTeEr.undertale_BOSSCharacters.common.creativetab.CreativeTab_UT_BOSS;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SeaTea extends ItemFood{
	
	public SeaTea() {
		super(8, 0.3F, false);
		this.setAlwaysEdible();
		this.setMaxStackSize(32);
		this.setUnlocalizedName("seaTea");
		this.setCreativeTab(CreativeTab_UT_BOSS.FOODICON);
		this.setPotionEffect(new PotionEffect(MobEffects.SPEED, 600, 0), 1.0F);
	}
	
	public EnumAction getUseFoodType(ItemStack partItemStack) {
		return EnumAction.DRINK;
	}
	
	@SuppressWarnings("unused")
	protected void onFoodEaten(ItemStack itemstack,EntityPlayer player,World world) {
		super.onFoodEaten(itemstack, world, player);
		{
			int x=(int) player.posX;
			int y=(int) player.posY;
			int z=(int) player.posZ;
		}
	}

}
