package d_DongGuanTeEr.undertale_BOSSCharacters.common;

import d_DongGuanTeEr.undertale_BOSSCharacters.common.config.ConfigLoaderUT_BOSS;
import d_DongGuanTeEr.undertale_BOSSCharacters.common.events.EventsLoaderUT_BOSS;
import d_DongGuanTeEr.undertale_BOSSCharacters.item.ItemsLoaderUT_BOSS;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxyUT_BOSS {

	public void preInit(FMLPreInitializationEvent event) {
		new ConfigLoaderUT_BOSS(event);
		new ItemsLoaderUT_BOSS(event);
	}

	public void init(FMLInitializationEvent event) {
		new EventsLoaderUT_BOSS();
	}

	public void postInit(FMLPostInitializationEvent event) {
		// TODO 自动生成的方法存根
	}
}
