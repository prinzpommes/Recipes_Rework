package com.github.prinzpommes.util;

import me.RecipePlugin;

public class Configloader {
	private RecipePlugin plugin;
	
	private String privateJoinMessage;
	private boolean netherrack;
	private boolean netherbrick;
	private boolean glowstone;
	private boolean soulsand;
	private boolean blazerod;
	private boolean netherstar;
	private boolean netherwartseed;

	public Configloader(RecipePlugin plugin) {
		this.plugin = plugin;
		loadConfig();
	}

	private void loadConfig() {
		privateJoinMessage = this.plugin.getConfig().getString(
				"message.privatejoinmessage");

		netherrack = this.plugin.getConfig().getBoolean("netherrack");
		netherbrick = this.plugin.getConfig().getBoolean("netherbrick");
		glowstone = this.plugin.getConfig().getBoolean("glowstone");
		soulsand = this.plugin.getConfig().getBoolean("soulsand");
		blazerod = this.plugin.getConfig().getBoolean("blazerod");
		netherstar = this.plugin.getConfig().getBoolean("netherstar");
		netherwartseed = this.plugin.getConfig().getBoolean("netherwartseed");

	}

	public boolean getnetherrack() {
		return netherrack;
	}

	public boolean getnetherbrick() {
		return netherbrick;
	}

	public boolean getglowstone() {
		return glowstone;
	}

	public boolean getsoulsand() {
		return soulsand;
	}

	public boolean getblazerod() {
		return blazerod;
	}

	public boolean getnetherstar() {
		return netherstar;
	}

	public boolean getnetherwartseed() {
		return netherwartseed;
	}

	public String getPrivatJoinMessage() {
		return privateJoinMessage;
	}

}