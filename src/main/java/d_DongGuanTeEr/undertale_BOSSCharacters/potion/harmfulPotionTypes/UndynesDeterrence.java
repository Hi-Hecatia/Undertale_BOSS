package d_DongGuanTeEr.undertale_BOSSCharacters.potion.harmfulPotionTypes;

import java.util.HashMap;

import d_DongGuanTeEr.undertale_BOSSCharacters.potion.PotionTypesLoader_UT_BOSS;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class UndynesDeterrence extends Potion {

	public UndynesDeterrence() {
		super(false, 02550);
		this.setPotionName("potion.undynesdeterrence");
	}

	public static void errorReport(HashMap<String, Object> errReport) {
		if (errReport.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure onLivingUnmoveness!");
		}
		if (errReport.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure onLivingUnmoveness!");
		}
	}

	@SubscribeEvent
	public void onLivingUnmoveness(LivingHurtEvent eventOfUnmoveness, EntityPlayer player) {
		if (eventOfUnmoveness.getSource().isMagicDamage()) {
			PotionEffect effectOfUnmoveness = eventOfUnmoveness.getEntityLiving()
					.getActivePotionEffect(PotionTypesLoader_UT_BOSS.potionUndynesDeterrence);
			if(effectOfUnmoveness!=null) {
				//尝试将实体移向指定位置
				//!player.move(MoverType.PLAYER, 0, 0, 0);
				//为移动统计字段添加一个值，如跑步、步行、游泳或爬山。
				//!player.addMovementStat(p_71000_1_, p_71000_3_, p_71000_5_);
				player.moveForward=0;
				player.moveStrafing=0;
				player.moveVertical=0;
				//用于确定该实体在跳跃或下落时将移动每个刻度的距离的因素。
				player.jumpMovementFactor=0;
				//!player.moveRelative(0, 0, 0, 0);
			}
		}
	}

}
