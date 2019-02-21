package d_DongGuanTeEr.undertale_BOSSCharacters.item.food;

import d_DongGuanTeEr.undertale_BOSSCharacters.common.creativetab.CreativeTab_UT_BOSS;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class CreamCandyPie extends ItemFood{
	
	public CreamCandyPie() {
		super(8, 0.8F, false);
		this.setAlwaysEdible();
		this.setUnlocalizedName("creamCandyPie");
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTab_UT_BOSS.FOODICON);
		
	}
	
	public EnumAction getUseFoodType(ItemStack partItemStack) {
		return EnumAction.EAT;
		
	}
}
