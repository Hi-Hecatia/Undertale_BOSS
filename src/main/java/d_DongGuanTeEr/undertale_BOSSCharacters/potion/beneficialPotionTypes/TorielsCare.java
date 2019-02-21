package d_DongGuanTeEr.undertale_BOSSCharacters.potion.beneficialPotionTypes;

import d_DongGuanTeEr.undertale_BOSSCharacters.Undertale_BOSSCharacters;
import d_DongGuanTeEr.undertale_BOSSCharacters.potion.PotionTypesLoader_UT_BOSS;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
//import net.minecraft.entity.EntityLivingBase;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraftforge.event.entity.living.LivingHurtEvent;
//import net.minecraftforge.event.entity.player.PlayerEvent;
//import net.minecraftforge.fml.common.gameevent.PlayerEvent;
//import net.minecraft.item.ItemBook;

public class TorielsCare extends Potion {

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

	private static final ResourceLocation potionResource = new ResourceLocation(Undertale_BOSSCharacters.MODID,
			"textures/potion/beneficialpotiontypes/torielscare.png");

	@Override
	public void renderInventoryEffect(int x, int y, PotionEffect effectOfCare, Minecraft mc) {
		mc.getTextureManager().bindTexture(TorielsCare.potionResource);
		//第一个参数和第二个参数表示绘制的图标在游戏中的左上角的横纵坐标（xy值）。
		//第三个参数和第四个参数表示绘制的图标在图片中的左上角的横纵坐标（uv值）。这里是整张图的左上角，自然都是零。
		//第五个参数和第六个参数表示绘制的图标大小。这里和原版一样，是18x18。
		mc.currentScreen.drawTexturedModalRect(x + 6, y + 7, 0, 0, 18, 18);
	}
	
	@SubscribeEvent
	public void onLivingCare(LivingHurtEvent eventOfCare,EntityPlayer player) {
		if (eventOfCare.getSource().isDamageAbsolute()) {
			// 获取药水效果。
			PotionEffect effectOfCare = eventOfCare.getEntityLiving()
					.getActivePotionEffect(PotionTypesLoader_UT_BOSS.potionTorielsCare);
			if (effectOfCare != null) {
				player.getActivePotionEffects();
				int tick = effectOfCare.getDuration();
				if (eventOfCare.getAmount() == 0) {
					// 如果药水效果等级为1。
					if (tick%120==0) {
						player.heal(20);
					}
				} else if(eventOfCare.getAmount()>0){
					if (tick%60==0) {
						player.heal(20);
					}
				}
			}
		}
	}
}
