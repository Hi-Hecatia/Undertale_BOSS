package d_DongGuanTeEr.undertale_BOSSCharacters;

import org.apache.logging.log4j.Logger;

import d_DongGuanTeEr.undertale_BOSSCharacters.common.CommonProxy_UT_BOSS;
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
 * @version 1.0.0
 * 
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
	//!public static CreativeTab_UT_BOSS itemTab;
	//!public static CreativeTab_UT_BOSS foodTab;
	public static String variantIn="inventory";
	//让Mod添加自己的代理。
	@SidedProxy(clientSide = "d_DongGuanTeEr.undertale_BOSSCharacters.client.ClientProxy_UT_BOSS",
			serverSide = "d_DongGuanTeEr.undertale_BOSSCharacters.common.CommonProxy_UT_BOSS")
	//静态创建类CommonProxy的对象。
	public static CommonProxy_UT_BOSS proxy;
	//添加本类的实例化变量。
	@Instance(MODID)
	public static Undertale_BOSSCharacters instance;
	//将Logger私有化。
	private Logger logger;
	//监听Mod事件。
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
		//!itemTab=new CreativeTab_UT_BOSS(MODID+".Items");
		//!foodTab=new CreativeTab_UT_BOSS(MODID+".Foods");
	}
	//监听Mod事件。
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	//监听Mod事件。
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	//创建方法Logger。
	public Logger getLogger() {
		return logger;
	}
}
