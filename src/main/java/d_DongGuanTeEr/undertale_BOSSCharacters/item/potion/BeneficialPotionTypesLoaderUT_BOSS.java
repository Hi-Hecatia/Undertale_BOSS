package d_DongGuanTeEr.undertale_BOSSCharacters.item.potion;

import d_DongGuanTeEr.undertale_BOSSCharacters.item.potion.beneficialPotionTypes.TorielsCare;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class BeneficialPotionTypesLoaderUT_BOSS {
	//
	public static Potion potionTorielsCare;

	public BeneficialPotionTypesLoaderUT_BOSS(FMLPreInitializationEvent event) {
		
		potionTorielsCare=new TorielsCare();
	}
	
	public static void init() {
		
	}

}
