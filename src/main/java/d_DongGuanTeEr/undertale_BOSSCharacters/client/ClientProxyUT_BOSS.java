package d_DongGuanTeEr.undertale_BOSSCharacters.client;

import d_DongGuanTeEr.undertale_BOSSCharacters.common.CommonProxyUT_BOSS;
import d_DongGuanTeEr.undertale_BOSSCharacters.item.ItemsLoaderUT_BOSS;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxyUT_BOSS extends CommonProxyUT_BOSS{
	/*
	 * ClientProxy中的FMLPreInitializationEvent事件可以用于注册模型。
	 * 1、所以需要在preInit阶段执行registerModels方法。
	 * 2、由于registerModels是客户端方法，所以需要在ClientProxy的preInit方法调用。
	 */
	 public void preInit(FMLPreInitializationEvent event)
	    {
	        super.preInit(event);
	        //进行调用。
	        ItemsLoaderUT_BOSS.clientInit1();
	    }
	    
	    public void init(FMLInitializationEvent event)
	    {
	        super.init(event);
	    }
}
