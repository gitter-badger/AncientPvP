package net.catpro.ancientpvp;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnJoin implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		 Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(),"scoreboard teams join all @a[team=]");
	}	
}
