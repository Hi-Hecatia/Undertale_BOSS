package d_DongGuanTeEr.undertale_BOSSCharacters.client;

import d_DongGuanTeEr.undertale_BOSSCharacters.common.CommonProxy_UT_BOSS;
import d_DongGuanTeEr.undertale_BOSSCharacters.item.ItemsLoader_UT_BOSS;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy_UT_BOSS extends CommonProxy_UT_BOSS{
	/*
	 * ClientProxy中的FMLPreInitializationEvent事件可以用于注册模型。
	 * 1、所以需要在preInit阶段执行registerModels方法。
	 * 2、由于registerModels是客户端方法，所以需要在ClientProxy的preInit方法调用。
	 */
	 public void preInit(FMLPreInitializationEvent event)
	    {
	        super.preInit(event);
	        //!ItemsLoader_UT_BOSS.clientInit();
	    }
	    
	    public void init(FMLInitializationEvent event)
	    {
	        super.init(event);
	        ItemsLoader_UT_BOSS.clientInit();
	    }
}
