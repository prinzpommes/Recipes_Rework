package com.github.prinzpommes.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.github.prinzpommes.plugin.RecipePlugin;

public class JoinmessageListener implements Listener {

	public JoinmessageListener(RecipePlugin plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void message(PlayerJoinEvent event) {
		String privateJoinMessage = RecipePlugin.getConfigLoader()
				.getPrivatJoinMessage();
		privateJoinMessage = privateJoinMessage.replace("online%",
				ChatColor.GRAY + "Online ("
						+ Bukkit.getServer().getOnlinePlayers().length + "/"
						+ Bukkit.getMaxPlayers() + "): " + listPlayers());

		event.getPlayer().sendMessage(privateJoinMessage);
	}

	public static String listPlayers() {

		Player ar[] = Bukkit.getOnlinePlayers();
		String liste = "";
		for (Player p : Bukkit.getOnlinePlayers()) {

			if (p.equals(ar[Bukkit.getOnlinePlayers().length - 1])) {

				liste += p.getDisplayName();
			} else {

				liste += p.getDisplayName() + ", ";
			}
		}

		return liste;
	}
	
}
