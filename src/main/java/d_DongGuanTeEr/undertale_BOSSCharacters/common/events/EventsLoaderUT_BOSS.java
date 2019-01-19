package d_DongGuanTeEr.undertale_BOSSCharacters.common.events;
import d_DongGuanTeEr.undertale_BOSSCharacters.Undertale_BOSSCharacters;
import d_DongGuanTeEr.undertale_BOSSCharacters.common.config.ConfigLoaderUT_BOSS;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.EventBus;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

//@EventBusSubscriber(modid = Undertale_BOSSCharacters.MODID)
public class EventsLoaderUT_BOSS {
	
	public static final EventBus EVENT_BUS = new EventBus();

//=========================================================================
	/*
	 * 1、订阅了LivingEvent.LivingJumpEvent事件。
	 * 2、在@SubscribeEvent注解中priority参数表示监听事件的优先级，优先级越高可以越早被调用。我们想让我们订阅这个事件的优先级最高，所以把优先级设置为EventPriority.HIGHEST。 
	 * 3、优先级一共有五种，由高到低排列就是： EventPriority.HIGHEST
	 * EventPriority.HIGH 
	 * EventPriority.NORMAL（当参数为空时，默认就是这个） 
	 * EventPriority.LOW
	 * EventPriority.LOWEST
	 */
	// 事件举例。
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void onLivingJump(LivingEvent.LivingJumpEvent event) {
		// 监听玩家跳跃。
		if (event.getEntityLiving().getEntityWorld().isRemote) {
			Undertale_BOSSCharacters.instance.getLogger().info("监听到玩家" + event.getEntityLiving().getName() + "跳跃！");
		}
	}
	// 事件举例。
	@SubscribeEvent(priority=EventPriority.HIGHEST)
	public static void onItemPickUp(PlayerEvent.ItemPickupEvent event) {
		if(event.player.isServerWorld()) {
			@SuppressWarnings("unused")
			String infomation=String.format("%s picks up: %s", event.player.getName(), event.pickedUp.getItem());
			ConfigLoaderUT_BOSS.load();
		}
	}
	
	public static void init() {
		//为自己的EVENT_BUS注册监听器。
		EVENT_BUS.register(EventsLoaderUT_BOSS.class);
	}
}
