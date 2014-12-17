package com.github.prinzpommes.plugin;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.prinzpommes.listener.JoinmessageListener;
import com.github.prinzpommes.util.Configloader;
import com.github.prinzpommes.util.Recipes;

public class RecipePlugin extends JavaPlugin {

	private Logger log;
	private final String mainDirectory = "plugins/Recipes-Rework/";
	protected FileConfiguration config = null;
	private static Configloader cfgl;

	@Override
	public void onEnable() {
		log = Logger.getLogger("Minecraft");
		new File(mainDirectory).mkdir();
		log.info("Welcome to the Future of Crafting! Recipes has been enabled successfully.");
		config = this.getConfig();
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		cfgl = new Configloader(this);
		new Recipes(this);
		new JoinmessageListener(this);
	}

	@Override
	public void onDisable() {
		log = Logger.getLogger("Minecraft");
		log.info("Returning back to now...");
	}

	public static Configloader getConfigLoader(){
		return cfgl;
	}
}
