package d_DongGuanTeEr.undertale_BOSSCharacters.potion;

import d_DongGuanTeEr.undertale_BOSSCharacters.Undertale_BOSSCharacters;
import d_DongGuanTeEr.undertale_BOSSCharacters.potion.beneficialPotionTypes.TorielsCare;
import d_DongGuanTeEr.undertale_BOSSCharacters.potion.harmfulPotionTypes.MuffetsInvitation;
import d_DongGuanTeEr.undertale_BOSSCharacters.potion.harmfulPotionTypes.UndynesDeterrence;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class PotionTypesLoader_UT_BOSS {

	public static Potion potionTorielsCare = null;
	public static PotionType torielsCare = null;
	public static PotionType long_torielsCare = null;
	public static Potion potionMuffetsinvitation = null;
	public static PotionType muffetsInvitation = null;
	public static Potion potionUndynesDeterrence = null;
	public static PotionType undynesDeterrence = null;

	public PotionTypesLoader_UT_BOSS(FMLPreInitializationEvent event) {
		potionTorielsCare = new TorielsCare();
		potionMuffetsinvitation = new MuffetsInvitation();
		potionUndynesDeterrence=new UndynesDeterrence();
	}

	public static void preInlt(Potion potion, String potionName) {
		ForgeRegistries.POTIONS.register(potion.setRegistryName(Undertale_BOSSCharacters.MODID, potionName));
	}

	public static void preInlt(PotionType potionType) {
		ForgeRegistries.POTION_TYPES.registerAll(potionType);
		torielsCare = new PotionTypeID_UT_BOSS(new PotionEffect(potionTorielsCare, 180, 0), "torielscare")
				.setRegistryName(Undertale_BOSSCharacters.MODID, "torielscare");
		long_torielsCare = new PotionTypeID_UT_BOSS(new PotionEffect(potionTorielsCare, 300, 1),
				"long_torielscare").setRegistryName(Undertale_BOSSCharacters.MODID, "long_torielscare");
	}

	public static void preInlt() {
		preInlt(potionTorielsCare, "torielscare");
		preInlt(potionMuffetsinvitation, "muffetsinvitation");
		preInlt(potionUndynesDeterrence, "undynesdeterrence");
		preInlt(torielsCare);
		preInlt(long_torielsCare);
	}
}
