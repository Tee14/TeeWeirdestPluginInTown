package me.tee14.tee.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class EDeath implements Listener {

	@EventHandler
	public void PlayerDeathEvent(PlayerDeathEvent event) {
		
		event.setDeathMessage("§cPopo wanted to remind " + event.getEntity().getName() + " of their place on the pecking order.");
	}
}