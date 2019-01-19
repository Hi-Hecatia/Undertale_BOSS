package d_DongGuanTeEr.undertale_BOSSCharacters.item;

import d_DongGuanTeEr.undertale_BOSSCharacters.common.creativetab.CreativeTabsUT_BOSS;
import net.minecraft.item.Item;

public class DoggyLeft extends Item {
	//静态构造成员变量DoggyLeft。
	//首先，要实例化这个物品。
	public static Item DoggyLeft = new DoggyLeft();

	public DoggyLeft() {
		this.maxStackSize = 64;
		//将物品添加至创造模式物品栏中。
		this.setCreativeTab(CreativeTabsUT_BOSS.tabUndertale_PartOfTheBOSSMonsters);
	}
}