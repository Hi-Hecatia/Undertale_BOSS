package d_DongGuanTeEr.undertale_BOSSCharacters.item.food;

import d_DongGuanTeEr.undertale_BOSSCharacters.common.creativetab.CreativeTab_UT_BOSS;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class PangpangFruit extends ItemFood{
	
	public PangpangFruit() {
		super(5,0.5F,false);
		this.setAlwaysEdible();
		this.setUnlocalizedName("pangpangFruit");
		this.setCreativeTab(CreativeTab_UT_BOSS.FOODICON);
		this.setMaxStackSize(64);
	}
	
	public EnumAction getUseFoodType(ItemStack partItemStack) {
		return EnumAction.EAT;
	}

}
