package com.buzzthegamer23.no115nether;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
	extends JavaPlugin {
	public void onEnable() {
		plugin = this;
		Bukkit.getPluginManager().registerEvents(new DisableNether(), (Plugin)plugin);
	}
	public static JavaPlugin plugin;
	public void onDisable() {
		plugin = null;
	}
}
