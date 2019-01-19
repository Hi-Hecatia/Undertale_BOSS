package d_DongGuanTeEr.undertale_BOSSCharacters;

import org.apache.logging.log4j.Logger;

import d_DongGuanTeEr.undertale_BOSSCharacters.common.CommonProxyUT_BOSS;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
/**
 * 
 * @author d_DongGuanTeEr
 *
 */
//Mod信息的显示。
@Mod(modid = Undertale_BOSSCharacters.MODID, name = Undertale_BOSSCharacters.NAME, version = Undertale_BOSSCharacters.VERSION, 
acceptedMinecraftVersions = "[1.12,)")
//Mod基本信息的设置。
public class Undertale_BOSSCharacters {
	public static final String MODID = "undertale_boss";
	public static final String NAME = "Undertale_BOSSCharacters";
	public static final String VERSION = "1.0.0";
	//让Mod添加自己的代理。
	@SidedProxy(clientSide = "d_DongGuanTeEr.undertale_PartOfTheBOSSMonsters.client.ClientProxyUT_BOSS",
			serverSide = "d_DongGuanTeEr.undertale_PartOfTheBOSSMonsters.common.CommonProxyUT_BOSS")
	//静态创建类CommonProxy的对象。
	public static CommonProxyUT_BOSS proxy;
	//添加本类的实例化变量。
	@Instance(MODID)
	public static Undertale_BOSSCharacters instance;
	//将Logger私有化。
	private Logger logger;
	//监听Mod事件。
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		//调用成员方法preInit()。
		proxy.preInit(event);
	}
	//监听Mod事件。
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//调用成员方法init()。
		proxy.init(event);
	}
	//监听Mod事件。
	public void postInit(FMLPostInitializationEvent event) {
		//调用成员方法postInit()。
		proxy.postInit(event);
	}
	//创建方法Logger。
	public Logger getLogger() {
		return logger;
	}
}
