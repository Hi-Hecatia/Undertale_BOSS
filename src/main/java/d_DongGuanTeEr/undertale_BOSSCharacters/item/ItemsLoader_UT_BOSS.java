package d_DongGuanTeEr.undertale_BOSSCharacters.item;

import d_DongGuanTeEr.undertale_BOSSCharacters.Undertale_BOSSCharacters;
import d_DongGuanTeEr.undertale_BOSSCharacters.item.food.CreamCandyPie;
import d_DongGuanTeEr.undertale_BOSSCharacters.item.food.DoggySalad;
import d_DongGuanTeEr.undertale_BOSSCharacters.item.food.SeaTea;
import d_DongGuanTeEr.undertale_BOSSCharacters.item.food.SpidersDoughnuts;
import d_DongGuanTeEr.undertale_BOSSCharacters.item.souls.CharasDetermination;
import d_DongGuanTeEr.undertale_BOSSCharacters.item.souls.Determination;
import d_DongGuanTeEr.undertale_BOSSCharacters.item.souls.FrisksDetermination;
import d_DongGuanTeEr.undertale_BOSSCharacters.item.souls.HumanSoul;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
//import net.minecraftforge.client.model.ModelLoader;
//import net.minecraftforge.client.model.ModelLoader;
//import net.minecraftforge.event.RegistryEvent.Register;
//import net.minecraftforge.fml.common.eventhandler.Event;
//import net.minecraftforge.registries.ForgeRegistry;

public class ItemsLoader_UT_BOSS {
	// !ForgeRegistries.ITEMS.register(doggyLeft.setRegistryName("doggyleft"));
	// !ForgeRegistries.ITEMS.register(humanSoul.setRegistryName("humansoul"));
	// !ForgeRegistries.ITEMS.register(determination.setRegistryName("determination"));
	
	/*
	 * 1、在ItemsLoader中新建Item类型的公共静态变量DoggyLeft，让它等于new DoggyLeft()。
	 * 2、这样做的目的是为了让我们的物品更方便的被调用。 3、可以使用Item#setUnlocalizedName来为物品添加非本地名称，因为Item#
	 * setUnlocalizedName方法的返回值就是item对象本身。
	 */
	public static Item doggyLeft = new DoggyLeft().setUnlocalizedName("doggyLeft");
	public static Item humanSoul = new HumanSoul().setUnlocalizedName("humanSoul");
	public static Item determination = new Determination().setUnlocalizedName("determination");
	public static Item frisksDetermination = new FrisksDetermination().setUnlocalizedName("frisksDetermination");
	public static Item charasDetermination = new CharasDetermination().setUnlocalizedName("charasDetermination");
	public static ItemFood creamCandyPie = new CreamCandyPie();
	public static ItemFood seaTea = new SeaTea();
	public static ItemFood spidersDoughnuts=new SpidersDoughnuts();
	public static ItemFood doggySalad=new DoggySalad();
	
	public ItemsLoader_UT_BOSS(FMLPreInitializationEvent event) {
		/*
		 * 1、注册物品是客户端和服务端都该注册的。 2、要把调用ItemsLoader().init的语句加入到CommonProxy的preInit方法里。
		 * 3、id请尽量使用小写字母加下划线，并且同一个Mod下的物品id不能相同，有的Mod会使用驼峰式，这样的好处是把物品的非本地化名称和物品id设置成相同的。
		 */
		registerItem(doggyLeft, "doggyleft");
		registerItem(humanSoul, "humansoul");
		registerItem(determination, "determination");
		registerItem(frisksDetermination, "frisksdetermination");
		registerItem(charasDetermination, "charasdetermination");
		registerItem(creamCandyPie, "creamcandypie");
		registerItem(seaTea, "seatea");
		registerItem(spidersDoughnuts, "spidersdoughnuts");
		registerItem(doggySalad, "doggysalad");
	}
	
//==========================================================================================================================
	public static void registerItem(Item items, String itemName) {
		// TODO 自动生成的方法存根
		/*
		 * 1、其中set的RegistryName就是物品的id。 2、DoggyLeft()就是构造方法名。 p.s.给予物品指令：give
		 * d_DongGuanTeEr undertale_partofthebossmonsters:物品英文名 -username 名字（设置名称）
		 */
		ForgeRegistries.ITEMS.register(items.setRegistryName(itemName));
	}

//==========================================================================
	@SideOnly(Side.CLIENT)
	public static void clientInit(Item items, String itemName, int meta) {
		/*
		 * At、先来介绍setCustomModelResourceLocation的参数： 1、DoggyLeft是我们要注册的物品。
		 * 2、0表示物品的Metadata。举个简单的例子，木板有多个Metadata表示不同的颜色。 3、new
		 * ModelResourceLocation(...)这个参数表示模型的位置，为ModelResourceLocation类的一个实例。
		 * 3的解释：ModelResourceLocation被用于标注模型的位置，通常为由冒号（:）和井号（#）分隔的三个字符串组成。
		 * （接3的解释）：对于我们这里构造的ModelResourceLocation，它的一部分通过调用物品的getRegistryName方法得到，
		 * 第二部分由我们指定，为inventory，是一个固定的字符串，代表作为一个物品的渲染模型。
		 */
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(items, meta, new ModelResourceLocation(
				Undertale_BOSSCharacters.MODID + ":" + itemName, Undertale_BOSSCharacters.variantIn));
		// DoggyLeft模型的注册。
		// !ModelLoader.setCustomModelResourceLocation(doggyLeft, 0, new
		// ModelResourceLocation(doggyLeft.getRegistryName(), "inventory"));
		// Determination模型的注册。
		// !ModelLoader.setCustomModelResourceLocation(determination, 0, new
		// ModelResourceLocation(determination.getRegistryName(), "inventory"));
	}

	@SideOnly(Side.CLIENT)
	public static void clientInit() {
		// DoggyLeft模型的注册
		clientInit(doggyLeft, "doggyleft", 0);
		// HumanSoul模型的注册。
		clientInit(humanSoul, "humansoul", 0);
		// Determination模型的注册。
		clientInit(determination, "determination", 0);
		//CreamCandyPie模型的注册。
		clientInit(creamCandyPie, "creamcandypie", 0);
		//SeaTea模型的注册。
		clientInit(seaTea, "seatea", 0);
	}

}
