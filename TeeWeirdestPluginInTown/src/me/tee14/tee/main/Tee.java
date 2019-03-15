package me.tee14.tee.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.tee14.tee.commands.CShrug;
import me.tee14.tee.commands.CSuidice;
import me.tee14.tee.events.EArrowRiding;
import me.tee14.tee.events.EDeath;

public class Tee extends JavaPlugin {
	
	@Override
	public void onEnable() {
	
		this.registerCommands();
		this.registerEvents();
	}
		
	@Override
	public void onDisable() {
		
		
	}
		
	public void registerCommands() {
		
		getCommand("suidice").setExecutor(new CSuidice());
		getCommand("shrug").setExecutor(new CShrug());
	}
	
	public void registerEvents() {
		
		PluginManager pm = Bukkit.getPluginManager();
		
		pm.registerEvents(new EArrowRiding(), this);
		pm.registerEvents(new EDeath(), this);
	}
}