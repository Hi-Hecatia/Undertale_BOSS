package d_DongGuanTeEr.undertale_BOSSCharacters.common.creativetab;

import d_DongGuanTeEr.undertale_BOSSCharacters.item.ItemsLoader_UT_BOSS;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTab_UT_BOSS extends CreativeTabs {

	public static int[] custonTabArray = { 1, 2, 3, 4, 5 };

	public static final CreativeTab_UT_BOSS ITEMICON = new CreativeTab_UT_BOSS(CREATIVE_TAB_ARRAY.length, "itemtab_utboss") {
		@SideOnly(Side.CLIENT)
		@Override
		public ItemStack getTabIconItem() {
			// TODO 自动生成的方法存根
			return new ItemStack(ItemsLoader_UT_BOSS.doggyLeft);
		}

		@SideOnly(Side.CLIENT)
		public boolean hasSearchBar() {
			return true;
		}
	};

	public static final CreativeTab_UT_BOSS SOULICON = new CreativeTab_UT_BOSS(CREATIVE_TAB_ARRAY.length+custonTabArray[0], "soultab_utboss") {

		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			// TODO 自动生成的方法存根
			return new ItemStack(ItemsLoader_UT_BOSS.determination);
		}

		@SideOnly(Side.CLIENT)
		public boolean hasSearchBar() {
			return true;
		}
	};

	public static final CreativeTab_UT_BOSS FOODICON = new CreativeTab_UT_BOSS(CREATIVE_TAB_ARRAY.length+custonTabArray[1], "foodtab_utboss") {
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			// TODO 自动生成的方法存根
			return new ItemStack(ItemsLoader_UT_BOSS.creamCandyPie);
		}

		@SideOnly(Side.CLIENT)
		public boolean hasSearchBar() {
			return true;
		}
	};

	public static final CreativeTab_UT_BOSS WEAPONICON = new CreativeTab_UT_BOSS(15, "weapontab_utboss") {

	};

	public CreativeTab_UT_BOSS(String UnlocalizedName) {
		super(UnlocalizedName);
		// TODO 自动生成的构造函数存根
		// !CreativeTab_UT_BOSS.itemIcon=d_DongGuanTeEr.undertale_BOSSCharacters.item.ItemsLoader_UT_BOSS.determination;
	}

	public CreativeTab_UT_BOSS(int tabID, String tabName) {
		super(tabID, tabName);
		// TODO 自动生成的构造函数存根
	}
//!	public void setItemIcon(Item item) {
//!		CreativeTab_UT_BOSS.itemIcon=item;
//!	}

	@Override
	public ItemStack getTabIconItem() {
		// TODO 自动生成的方法存根
		return null;
	}

}
