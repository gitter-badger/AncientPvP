package net.catpro.ancientpvp;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static final String pp = new String("[" + "AncientPvP by Plusgames" + "]") ;
	
	@Override
    public void onEnable() {
        System.out.println( pp + "Hello " + this.getServer().getIp());
        System.out.println("This Plugin was inspired by :");
        System.out.println("Frozon & Techable & kemmeo ");
        System.out.println("This is the Thread Page that originated this Plugin:");
        System.out.println("https://aquifermc.org/threads/paperspigot-1-9.50/");
        this.registerEvents();
        this.registerCommands();
        
    }

	private void registerEvents() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents((Listener)new OnJoin(),(Plugin)this);
        pm.registerEvents((Listener)new OnDamage(),(Plugin)this);
    }
    private void registerCommands() {
    }

	public static Plugin getPlugin() {
		return getPlugin();
	}
}
