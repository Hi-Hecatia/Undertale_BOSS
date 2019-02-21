package d_DongGuanTeEr.undertale_BOSSCharacters.item.food;

import d_DongGuanTeEr.undertale_BOSSCharacters.common.creativetab.CreativeTab_UT_BOSS;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class SpidersDoughnuts extends ItemFood{
	
	public SpidersDoughnuts() {
		super(6, 0.5F, false);
		this.setAlwaysEdible();
		this.setMaxStackSize(64);
		this.setUnlocalizedName("spidersDoughunts");
		this.setCreativeTab(CreativeTab_UT_BOSS.FOODICON);
	}
	
	public EnumAction getUseFoodType(ItemStack partItemStack) {
		return EnumAction.EAT;
	}

}
