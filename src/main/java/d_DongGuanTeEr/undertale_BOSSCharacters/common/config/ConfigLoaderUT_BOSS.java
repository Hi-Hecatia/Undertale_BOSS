package d_DongGuanTeEr.undertale_BOSSCharacters.common.config;

import org.apache.logging.log4j.core.Logger;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigLoaderUT_BOSS {

	private static Configuration config;
	private static Logger logger;
	public static int maxStackSize;

	public ConfigLoaderUT_BOSS(FMLPreInitializationEvent event) {
		logger = (Logger) event.getModLog();
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		load();
	}

	public static void load() {
		logger.info("Started loading config. ");
		String comment = "How many DoggyLeft can be put together? ";		maxStackSize = config.get(Configuration.CATEGORY_GENERAL, "maxStackSize", 64, comment).getInt();
		config.save();
		logger.info("Finished loading config. ");
	}
}
