package d_DongGuanTeEr.undertale_BOSSCharacters.potion.harmfulPotionTypes;

import d_DongGuanTeEr.undertale_BOSSCharacters.potion.PotionTypesLoader_UT_BOSS;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MuffetsInvitation extends Potion {

	public MuffetsInvitation() {
		super(true, 18685211);
		this.setPotionName("potion.muffetsinvitation");
	}

	@SubscribeEvent
	public void onLivingBound(LivingHurtEvent eventOfBound, EntityPlayer player) {
		if (eventOfBound.getSource().isMagicDamage()) {
			PotionEffect effectOfBound = eventOfBound.getEntityLiving()
					.getActivePotionEffect(PotionTypesLoader_UT_BOSS.potionMuffetsinvitation);
			if (effectOfBound != null) {
				if(player.onGround==true) {
					player.setInWeb();
				}else if(player.arrowHitTimer==0) {
					
				}
			}
		}
	}

}
