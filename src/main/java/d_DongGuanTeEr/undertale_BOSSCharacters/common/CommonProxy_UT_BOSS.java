package d_DongGuanTeEr.undertale_BOSSCharacters.common;

import d_DongGuanTeEr.undertale_BOSSCharacters.common.config.ConfigLoader_UT_BOSS;
import d_DongGuanTeEr.undertale_BOSSCharacters.common.events.EventsLoaderUT_BOSS;
import d_DongGuanTeEr.undertale_BOSSCharacters.item.ItemsLoader_UT_BOSS;
import d_DongGuanTeEr.undertale_BOSSCharacters.potion.PotionTypesLoader_UT_BOSS;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy_UT_BOSS {

	public void preInit(FMLPreInitializationEvent event) {
		new ConfigLoader_UT_BOSS(event);
		new ItemsLoader_UT_BOSS(event);
		new PotionTypesLoader_UT_BOSS(event);
	}

	public void init(FMLInitializationEvent event) {
		new EventsLoaderUT_BOSS();
	}

	public void postInit(FMLPostInitializationEvent event) {
		// TODO 自动生成的方法存根
	}
}
