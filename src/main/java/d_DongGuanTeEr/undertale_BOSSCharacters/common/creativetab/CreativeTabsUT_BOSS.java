package d_DongGuanTeEr.undertale_BOSSCharacters.common.creativetab;

import d_DongGuanTeEr.undertale_BOSSCharacters.item.ItemsLoaderUT_BOSS;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsUT_BOSS extends CreativeTabs{
	//创建创造模式物品栏。
	public static CreativeTabsUT_BOSS tabUndertale_PartOfTheBOSSMonsters = new CreativeTabsUT_BOSS();

	public CreativeTabsUT_BOSS() {
		//undertale_partofthebossmonsters表示物品栏的名称。
		super("undertale_partofthebossmonsters");
	}

	@Override
	public ItemStack getTabIconItem() {
		//new ItemStack(ItemsLoaderUT_BOSS.Determination)表示物品栏的图标，由一个ItemStack的图标决定。
		return new ItemStack(ItemsLoaderUT_BOSS.determination);
	}

}
