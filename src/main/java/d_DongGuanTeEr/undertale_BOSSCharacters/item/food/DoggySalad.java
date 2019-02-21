package d_DongGuanTeEr.undertale_BOSSCharacters.item.food;

import d_DongGuanTeEr.undertale_BOSSCharacters.common.creativetab.CreativeTab_UT_BOSS;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class DoggySalad extends ItemFood {
	
	public DoggySalad() {
		super(6, 0.4F, true);
		this.setAlwaysEdible();
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTab_UT_BOSS.FOODICON);
		this.setUnlocalizedName("doggySalad");
	}
	
	public EnumAction getFoodUseType(ItemStack partItemStack) {
		return EnumAction.EAT;
	}

}
