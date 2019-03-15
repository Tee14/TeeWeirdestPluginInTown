package me.tee14.tee.events;

import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityShootBowEvent;

public class EArrowRiding implements Listener {

	@EventHandler
	public void ArrowLaunch(EntityShootBowEvent event) {
		
		if(event.getEntity() instanceof Player) {
			
			Player player = (Player) event.getEntity();
			
			event.getProjectile().setPassenger(player);
		}
	}
	
	@EventHandler
	public void DamageEvent(EntityDamageEvent event) {
		
		if(event.getEntity() instanceof Player) {
			Player player = (Player) event.getEntity();
			
			if(player.getVehicle() instanceof Projectile && event.getCause().equals(DamageCause.PROJECTILE)) {
				
				event.setCancelled(true);
			}
		}
	}
}

//Ride arrows.