package d_DongGuanTeEr.undertale_BOSSCharacters.item.souls;

import d_DongGuanTeEr.undertale_BOSSCharacters.common.creativetab.CreativeTabsUT_BOSS;
import net.minecraft.item.Item;

public class HumanSoul extends Item{
	//首先，要实例化这个物品。
		public static Item HumanSoul = new HumanSoul();
	
	public HumanSoul() {
		this.maxStackSize=1;
		//将物品添加至创造模式物品栏中。
		this.setCreativeTab(CreativeTabsUT_BOSS.tabUndertale_PartOfTheBOSSMonsters);
	}
}
