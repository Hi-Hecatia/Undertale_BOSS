package d_DongGuanTeEr.undertale_BOSSCharacters.item.potion.beneficialPotionTypes;

import d_DongGuanTeEr.undertale_BOSSCharacters.item.potion.BeneficialPotionTypesLoaderUT_BOSS;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHealthBoost;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
//import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
//import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class TorielsCare extends PotionHealthBoost {

	public TorielsCare() {
		/*
		 * 1、第一个参数表示这个附魔是否有害，这里很明显是无害的 。
		 * 2、第二个参数表示这个附魔的粒子效果（螺旋）颜色。
		 */
		super(false, 2550255);
		// 设置药水效果名称。
		this.setPotionName("potion.torielscare");
		// setIconIndex方法表示这个药水效果在显示的时候使用的图标在下面。
		// this.setIconIndex(0, 0);
	}

	public static EntityPlayer player;
	// 这个int数值暂定。
	public static int tick;

	@SubscribeEvent
	public void onLivingHurt(LivingHurtEvent eventOfCare) {
		if (eventOfCare.getSource().isDamageAbsolute()) {
			// 获取药水效果。
			PotionEffect effectOfCare = eventOfCare.getEntityLiving()
					.getActivePotionEffect(BeneficialPotionTypesLoaderUT_BOSS.potionTorielsCare);
			if (effectOfCare != null) {
				if (eventOfCare.getAmount() == 0) {
					// 如果药水效果等级为1。
					if (tick == 120) {
						player.heal(20);
					}
				} else {
					if (tick == 60) {
						player.heal(20);
					}
				}
			}
		}
	}
}
