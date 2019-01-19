package d_DongGuanTeEr.undertale_BOSSCharacters.item.potion.beneficialPotionTypes;

import d_DongGuanTeEr.undertale_BOSSCharacters.item.potion.BeneficialPotionTypesLoaderUT_BOSS;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TorielsCare extends Potion {

	public TorielsCare() {
		/*
		 * 1、第一个参数表示这个附魔是否有害，这里很明显是无害的 
		 * 2、第二个参数表示这个附魔的粒子效果（螺旋）颜色，这里定为深红色
		 */
		super(false, 2550255);
		//设置药水效果名称。
		this.setPotionName("potion.torielscare");
		//setIconIndex方法表示这个药水效果在显示的时候使用的图标在下面。
		//this.setIconIndex(0, 0);
	}

	@SubscribeEvent
	public void onLivingHurt(LivingHurtEvent event) {
		if (event.getSource().getDamageType().equals("torielscare")) {
			@SuppressWarnings("unused")
			PotionEffect effect = event.getEntityLiving().getActivePotionEffect(BeneficialPotionTypesLoaderUT_BOSS.potionTorielsCare);
		}
	}

}
