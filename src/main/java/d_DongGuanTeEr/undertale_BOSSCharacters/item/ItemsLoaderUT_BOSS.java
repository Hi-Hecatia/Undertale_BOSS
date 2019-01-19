package d_DongGuanTeEr.undertale_BOSSCharacters.item;

import d_DongGuanTeEr.undertale_BOSSCharacters.item.souls.Determination;
import d_DongGuanTeEr.undertale_BOSSCharacters.item.souls.HumanSoul;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
//import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
//import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
//import net.minecraftforge.registries.ForgeRegistry;

public class ItemsLoaderUT_BOSS {
		//!ForgeRegistries.ITEMS.register(doggyLeft.setRegistryName("doggyleft"));
		//!ForgeRegistries.ITEMS.register(humanSoul.setRegistryName("humansoul"));
		//!ForgeRegistries.ITEMS.register(determination.setRegistryName("determination"));
	public ItemsLoaderUT_BOSS(FMLPreInitializationEvent event) {
		/*
		 * 1、注册物品是客户端和服务端都该注册的。
		 * 2、要把调用ItemsLoader().init的语句加入到CommonProxy的preInit方法里。
		 * 3、id请尽量使用小写字母加下划线，并且同一个Mod下的物品id不能相同，有的Mod会使用驼峰式，这样的好处是把物品的非本地化名称和物品id设置成相同的。
		 */
		register(determination, "determination");
	}
	private static void register(Item items, String string) {
		// TODO 自动生成的方法存根
		/*
		 * 1、其中set的RegistryName就是物品的id。
		 * 2、DoggyLeft()就是构造方法名。
		 * p.s.给予物品指令：give d_DongGuanTeEr undertale_partofthebossmonsters:物品英文名
		 * -username 名字（设置名称）
		 */
		ForgeRegistries.ITEMS.register(determination.setRegistryName("determination"));
		ForgeRegistries.ITEMS.register(doggyLeft.setRegistryName("doggyleft"));
		ForgeRegistries.ITEMS.register(humanSoul.setRegistryName("humansoul"));
	}
//==========================================================================================================================
	/*
	 * 1、在ItemsLoader中新建Item类型的公共静态变量DoggyLeft，让它等于new DoggyLeft()。
	 * 2、这样做的目的是为了让我们的物品更方便的被调用。
	 * 3、可以使用Item#setUnlocalizedName来为物品添加非本地名称，因为Item#setUnlocalizedName方法的返回值就是item对象本身。
	 */
	public static Item doggyLeft=new DoggyLeft().setUnlocalizedName("doggyLeft");
	public static Item humanSoul=new HumanSoul().setUnlocalizedName("humanSoul");
	public static Item determination=new Determination().setUnlocalizedName("deterMination");
//==========================================================================
	@SideOnly(Side.CLIENT)
	private static void clientInit(Item items) { 
		/*
		 * At、先来介绍setCustomModelResourceLocation的参数：
		 * 1、DoggyLeft是我们要注册的物品。
		 * 2、0表示物品的Metadata。举个简单的例子，木板有多个Metadata表示不同的颜色。
		 * 3、new ModelResourceLocation(...)这个参数表示模型的位置，为ModelResourceLocation类的一个实例。
		 * 3的解释：ModelResourceLocation被用于标注模型的位置，通常为由冒号（:）和井号（#）分隔的三个字符串组成。
		 * （接3的解释）：对于我们这里构造的ModelResourceLocation，它的一部分通过调用物品的getRegistryName方法得到，第二部分由我们指定，为inventory，是一个固定的字符串，代表作为一个物品的渲染模型。
		 */
		//DoggyLeft模型的注册。
		//!ModelLoader.setCustomModelResourceLocation(doggyLeft, 0, new ModelResourceLocation(doggyLeft.getRegistryName(), "inventory"));
		//HumanSoul模型的注册。
		//Determination模型的注册。
		ModelLoader.setCustomModelResourceLocation(determination, 0, new ModelResourceLocation(determination.getRegistryName(), "inventory"));
	}
	
	@SideOnly(Side.CLIENT)
	public static void clientInit1() {
		clientInit(determination);
		clientInit(doggyLeft);
	}
	
}
