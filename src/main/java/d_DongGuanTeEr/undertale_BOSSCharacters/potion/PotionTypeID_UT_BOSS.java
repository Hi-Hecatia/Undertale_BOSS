package d_DongGuanTeEr.undertale_BOSSCharacters.potion;

import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;

public class PotionTypeID_UT_BOSS extends PotionType{
	
	public static final String EFFECT="effect";
	
	public PotionTypeID_UT_BOSS(PotionEffect potionEffect) {
		super(potionEffect);
	}
	
	public PotionTypeID_UT_BOSS(PotionEffect potionEffect,String baseName) {
		super(baseName,potionEffect);
	}
	
	public String getNamePreFixed(String p_185174_1_){
		String string=super.getNamePrefixed(p_185174_1_);
		int integer=string.indexOf(EFFECT)+EFFECT.length();
		String load=string.substring(0, integer+1)+getRegistryName().getResourceDomain()+string.substring(integer);
		return load;
	}
}
