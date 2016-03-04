package net.catpro.ancientpvp;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.scheduler.BukkitScheduler;

public class OnDamage implements Listener {
	@EventHandler
	public void onDamage(EntityDamageEvent event){
	Entity e = event.getEntity();
		if(e instanceof Player){
			Player p = ((Player) e).getPlayer();
			double h = p.getHealth();
			if(p.getFoodLevel() == 20 ){
				while(h != p.getMaxHealth()){
			        BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
			        scheduler.runTaskLater(Main.getPlugin(), new Runnable() {
			            @Override
			            public void run() {
			            	int i =  p.getFoodLevel();
			            	p.setFoodLevel(i + 1);	
			            }
			        }, 10L);
			    }
			}
		}
	}
}
	

