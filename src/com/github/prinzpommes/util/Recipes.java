package com.github.prinzpommes.util;

import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.material.SpawnEgg;

import com.github.prinzpommes.plugin.RecipePlugin;

public class Recipes {
	private RecipePlugin plugin;

	public Recipes(RecipePlugin plugin) {
		this.plugin = plugin;
		registerRecipes();
	}

	private void registerRecipes() {

		ShapedRecipe glows1 = new ShapedRecipe(
				new ItemStack(Material.GLOWSTONE));
		glows1.shape(new String[] { "rr ", "rr ", "   " }).setIngredient('r',
				Material.REDSTONE_TORCH_ON);
		ShapedRecipe glows2 = new ShapedRecipe(
				new ItemStack(Material.GLOWSTONE));
		glows2.shape(new String[] { " rr", " rr", "   " }).setIngredient('r',
				Material.REDSTONE_TORCH_ON);
		ShapedRecipe glows3 = new ShapedRecipe(
				new ItemStack(Material.GLOWSTONE));
		glows3.shape(new String[] { "   ", "rr ", "rr " }).setIngredient('r',
				Material.REDSTONE_TORCH_ON);
		ShapedRecipe glows4 = new ShapedRecipe(
				new ItemStack(Material.GLOWSTONE));
		glows4.shape(new String[] { "   ", " rr", " rr" }).setIngredient('r',
				Material.REDSTONE_TORCH_ON);

		ShapelessRecipe wheat = new ShapelessRecipe(new ItemStack(
				Material.SEEDS, 3));
		wheat.addIngredient(Material.WHEAT);

		ShapedRecipe grass1 = new ShapedRecipe(new ItemStack(Material.GRASS, 2));
		grass1.shape(new String[] { "ee ", "ee ", "   " }).setIngredient('e',
				Material.DIRT);
		ShapedRecipe grass2 = new ShapedRecipe(new ItemStack(Material.GRASS, 2));
		grass2.shape(new String[] { " ee", " ee", "   " }).setIngredient('e',
				Material.DIRT);
		ShapedRecipe grass3 = new ShapedRecipe(new ItemStack(Material.GRASS, 2));
		grass3.shape(new String[] { "   ", " ee", " ee" }).setIngredient('e',
				Material.DIRT);
		ShapedRecipe grass4 = new ShapedRecipe(new ItemStack(Material.GRASS, 2));
		grass4.shape(new String[] { "   ", "ee ", "ee " }).setIngredient('e',
				Material.DIRT);

		ShapedRecipe oldcobble1 = new ShapedRecipe(new ItemStack(
				Material.MOSSY_COBBLESTONE, 1));
		oldcobble1.shape(new String[] { "g  ", "c  ", "   " })
				.setIngredient('g', Material.GRASS)
				.setIngredient('c', Material.COBBLESTONE);
		ShapedRecipe oldcobble2 = new ShapedRecipe(new ItemStack(
				Material.MOSSY_COBBLESTONE, 1));
		oldcobble2.shape(new String[] { " g ", " c ", "   " })
				.setIngredient('g', Material.GRASS)
				.setIngredient('c', Material.COBBLESTONE);
		ShapedRecipe oldcobble3 = new ShapedRecipe(new ItemStack(
				Material.MOSSY_COBBLESTONE, 1));
		oldcobble3.shape(new String[] { "  g", "  c", "   " })
				.setIngredient('g', Material.GRASS)
				.setIngredient('c', Material.COBBLESTONE);
		ShapedRecipe oldcobble4 = new ShapedRecipe(new ItemStack(
				Material.MOSSY_COBBLESTONE, 1));
		oldcobble4.shape(new String[] { "   ", "g  ", "c  " })
				.setIngredient('g', Material.GRASS)
				.setIngredient('c', Material.COBBLESTONE);
		ShapedRecipe oldcobble5 = new ShapedRecipe(new ItemStack(
				Material.MOSSY_COBBLESTONE, 1));
		oldcobble5.shape(new String[] { "   ", " g ", " c " })
				.setIngredient('g', Material.GRASS)
				.setIngredient('c', Material.COBBLESTONE);
		ShapedRecipe oldcobble6 = new ShapedRecipe(new ItemStack(
				Material.MOSSY_COBBLESTONE, 1));
		oldcobble6.shape(new String[] { "   ", "  g", "  c" })
				.setIngredient('g', Material.GRASS)
				.setIngredient('c', Material.COBBLESTONE);

		@SuppressWarnings("deprecation")
		ShapedRecipe villager = new ShapedRecipe(
				new SpawnEgg((byte) 120).toItemStack(1));
		villager.shape(new String[] { "rcr", "rer", "rlr" })
				.setIngredient('r', Material.EMERALD)
				.setIngredient('c', Material.WORKBENCH)
				.setIngredient('l', Material.LEATHER)
				.setIngredient('e', Material.EGG);

		@SuppressWarnings("deprecation")
		ShapedRecipe wolf = new ShapedRecipe(
				new SpawnEgg((byte) 95).toItemStack(1));
		wolf.shape(new String[] { "rbr", "rer", "rcr" })
				.setIngredient('r', Material.EMERALD)
				.setIngredient('b', Material.BONE)
				.setIngredient('c', Material.ROTTEN_FLESH)
				.setIngredient('e', Material.EGG);

		@SuppressWarnings("deprecation")
		ShapedRecipe schwein = new ShapedRecipe(
				new SpawnEgg((byte) 90).toItemStack(1));
		schwein.shape(new String[] { "rbr", "rer", "rcr" })
				.setIngredient('r', Material.EMERALD)
				.setIngredient('b', Material.BONE)
				.setIngredient('c', Material.PORK)
				.setIngredient('e', Material.EGG);

		@SuppressWarnings("deprecation")
		ShapedRecipe schaf = new ShapedRecipe(
				new SpawnEgg((byte) 91).toItemStack(1));
		schaf.shape(new String[] { "rbr", "rer", "rcr" })
				.setIngredient('r', Material.EMERALD)
				.setIngredient('b', Material.BONE)
				.setIngredient('c', Material.WOOL)
				.setIngredient('e', Material.EGG);

		@SuppressWarnings("deprecation")
		ShapedRecipe kuh = new ShapedRecipe(
				new SpawnEgg((byte) 92).toItemStack(1));
		kuh.shape(new String[] { "rbr", "rer", "rcr" })
				.setIngredient('r', Material.EMERALD)
				.setIngredient('b', Material.BONE)
				.setIngredient('c', Material.RAW_BEEF)
				.setIngredient('e', Material.EGG);

		@SuppressWarnings("deprecation")
		ShapedRecipe huhn = new ShapedRecipe(
				new SpawnEgg((byte) 93).toItemStack(1));
		huhn.shape(new String[] { "rbr", "rer", "rcr" })
				.setIngredient('r', Material.EMERALD)
				.setIngredient('b', Material.BONE)
				.setIngredient('c', Material.RAW_CHICKEN)
				.setIngredient('e', Material.EGG);

		ShapelessRecipe netz1 = new ShapelessRecipe(new ItemStack(
				Material.STRING, 3));
		netz1.addIngredient(Material.WEB);

		ShapedRecipe netz2 = new ShapedRecipe(new ItemStack(Material.WEB, 1));
		netz2.shape(new String[] { "s s", " s ", "s s" }).setIngredient('s',
				Material.STRING);

		ShapelessRecipe sattel1 = new ShapelessRecipe(new ItemStack(
				Material.LEATHER, 3));
		sattel1.addIngredient(Material.SADDLE);

		ShapedRecipe sattel2 = new ShapedRecipe(new ItemStack(Material.SADDLE,
				1));
		sattel2.shape(new String[] { "l l", "lll", "   " }).setIngredient('l',
				Material.LEATHER);

		ShapedRecipe sattel3 = new ShapedRecipe(new ItemStack(Material.SADDLE,
				1));
		sattel3.shape(new String[] { "   ", "l l", "lll" }).setIngredient('l',
				Material.LEATHER);

		ShapelessRecipe grassbueschel = new ShapelessRecipe(new ItemStack(
				Material.LONG_GRASS, 3, (byte) 1));
		grassbueschel.addIngredient(Material.GRASS);

		ShapedRecipe chain_helm1 = new ShapedRecipe(new ItemStack(
				Material.CHAINMAIL_HELMET, 1));
		chain_helm1.shape(new String[] { "gdg", "g g", "   " })
				.setIngredient('g', Material.GLASS)
				.setIngredient('d', Material.DIAMOND);

		ShapedRecipe chain_helm2 = new ShapedRecipe(new ItemStack(
				Material.CHAINMAIL_HELMET, 1));
		chain_helm2.shape(new String[] { "   ", "gdg", "g g" })
				.setIngredient('g', Material.GLASS)
				.setIngredient('d', Material.DIAMOND);

		ShapedRecipe chain_brust = new ShapedRecipe(new ItemStack(
				Material.CHAINMAIL_CHESTPLATE, 1));
		chain_brust.shape(new String[] { "g g", "gdg", "ggg" })
				.setIngredient('g', Material.GLASS)
				.setIngredient('d', Material.DIAMOND);

		ShapedRecipe chain_bein = new ShapedRecipe(new ItemStack(
				Material.CHAINMAIL_LEGGINGS, 1));
		chain_bein.shape(new String[] { "gdg", "g g", "g g" })
				.setIngredient('g', Material.GLASS)
				.setIngredient('d', Material.DIAMOND);

		ShapedRecipe chain_fuss1 = new ShapedRecipe(new ItemStack(
				Material.CHAINMAIL_BOOTS, 1));
		chain_fuss1.shape(new String[] { "g g", "g g", "   " }).setIngredient(
				'g', Material.GLASS);

		ShapedRecipe chain_fuss2 = new ShapedRecipe(new ItemStack(
				Material.CHAINMAIL_BOOTS, 1));
		chain_fuss2.shape(new String[] { "   ", "g g", "g g" }).setIngredient(
				'g', Material.GLASS);

		ShapedRecipe soul1 = new ShapedRecipe(new ItemStack(Material.SOUL_SAND,
				1));
		soul1.shape(new String[] { "gg ", "gg ", "   " }).setIngredient('g',
				Material.GRAVEL);
		ShapedRecipe soul2 = new ShapedRecipe(new ItemStack(Material.SOUL_SAND,
				1));
		soul2.shape(new String[] { " gg", " gg", "   " }).setIngredient('g',
				Material.GRAVEL);
		ShapedRecipe soul3 = new ShapedRecipe(new ItemStack(Material.SOUL_SAND,
				1));
		soul3.shape(new String[] { "   ", "gg ", "gg " }).setIngredient('g',
				Material.GRAVEL);
		ShapedRecipe soul4 = new ShapedRecipe(new ItemStack(Material.SOUL_SAND,
				1));
		soul4.shape(new String[] { "   ", " gg", " gg" }).setIngredient('g',
				Material.GRAVEL);

		ShapedRecipe blazerod = new ShapedRecipe(new ItemStack(
				Material.BLAZE_ROD, 1));
		blazerod.shape(new String[] { "ggg", "gbg", "ggg" })
				.setIngredient('g', Material.GOLD_INGOT)
				.setIngredient('b', Material.STICK);

		ShapedRecipe netherstar = new ShapedRecipe(new ItemStack(
				Material.NETHER_STAR, 1));
		netherstar.shape(new String[] { " d ", "dbd", " d " })
				.setIngredient('d', Material.DIAMOND)
				.setIngredient('b', Material.BLAZE_POWDER);

		ShapedRecipe netherwartseed1 = new ShapedRecipe(new ItemStack(
				Material.NETHER_STALK, 6));
		netherwartseed1.shape(new String[] { "nnn", "nrn", "nnn" })
				.setIngredient('n', Material.NETHERRACK)
				.setIngredient('r', Material.RED_MUSHROOM);

		ShapedRecipe netherwartseed2 = new ShapedRecipe(new ItemStack(
				Material.NETHER_STALK, 3));
		netherwartseed2.shape(new String[] { "nnn", "nrn", "nnn" })
				.setIngredient('n', Material.NETHERRACK)
				.setIngredient('r', Material.BROWN_MUSHROOM);

		ShapedRecipe feder1 = new ShapedRecipe(new ItemStack(Material.FEATHER,
				1));
		feder1.shape(new String[] { "p  ", "s  ", "   " })
				.setIngredient('p', Material.PAPER)
				.setIngredient('s', Material.STRING);
		ShapedRecipe feder2 = new ShapedRecipe(new ItemStack(Material.FEATHER,
				1));
		feder2.shape(new String[] { " p ", " s ", "   " })
				.setIngredient('p', Material.PAPER)
				.setIngredient('s', Material.STRING);
		ShapedRecipe feder3 = new ShapedRecipe(new ItemStack(Material.FEATHER,
				1));
		feder3.shape(new String[] { "  p", "  s", "   " })
				.setIngredient('p', Material.PAPER)
				.setIngredient('s', Material.STRING);
		ShapedRecipe feder4 = new ShapedRecipe(new ItemStack(Material.FEATHER,
				1));
		feder4.shape(new String[] { "   ", "p  ", "s  " })
				.setIngredient('p', Material.PAPER)
				.setIngredient('s', Material.STRING);
		ShapedRecipe feder5 = new ShapedRecipe(new ItemStack(Material.FEATHER,
				1));
		feder5.shape(new String[] { "   ", " p ", " s " })
				.setIngredient('p', Material.PAPER)
				.setIngredient('s', Material.STRING);
		ShapedRecipe feder6 = new ShapedRecipe(new ItemStack(Material.FEATHER,
				1));
		feder6.shape(new String[] { "   ", "  p", "  s" })
				.setIngredient('p', Material.PAPER)
				.setIngredient('s', Material.STRING);
		
		ShapedRecipe ender = new ShapedRecipe(new ItemStack(Material.ENDER_PEARL,
				16));
		ender.shape(new String[] { "lgl", "gdg", "lgl" })
				.setIngredient('l', Material.LAPIS_BLOCK)
				.setIngredient('g', Material.GLOWSTONE_DUST)
				.setIngredient('d', Material.DIAMOND);
		
		ShapedRecipe slime = new ShapedRecipe(new ItemStack(Material.SLIME_BALL,
				4));
		slime.shape(new String[] { " g ", "gwg", " g " })
				.setIngredient('w', Material.POTION)
				.setIngredient('g', Material.GRASS);
		
		ShapelessRecipe flint = new ShapelessRecipe(new ItemStack(
				Material.FLINT, 2, (byte) 1));
		flint.addIngredient(Material.GRAVEL);
		

		FurnaceRecipe sponge = new FurnaceRecipe(new ItemStack(Material.SPONGE,
				1), Material.SANDSTONE);
		FurnaceRecipe ironingot1 = new FurnaceRecipe(new ItemStack(
				Material.IRON_INGOT, 1), Material.IRON_PICKAXE);
		FurnaceRecipe ironingot2 = new FurnaceRecipe(new ItemStack(
				Material.IRON_INGOT, 1), Material.IRON_AXE);
		FurnaceRecipe ironingot3 = new FurnaceRecipe(new ItemStack(
				Material.IRON_INGOT, 1), Material.IRON_HOE);
		FurnaceRecipe ironingot4 = new FurnaceRecipe(new ItemStack(
				Material.IRON_INGOT, 1), Material.IRON_SWORD);
		FurnaceRecipe goldingot1 = new FurnaceRecipe(new ItemStack(
				Material.GOLD_INGOT, 1), Material.GOLD_PICKAXE);
		FurnaceRecipe goldingot2 = new FurnaceRecipe(new ItemStack(
				Material.GOLD_INGOT, 1), Material.GOLD_AXE);
		FurnaceRecipe goldingot3 = new FurnaceRecipe(new ItemStack(
				Material.GOLD_INGOT, 1), Material.GOLD_HOE);
		FurnaceRecipe goldingot4 = new FurnaceRecipe(new ItemStack(
				Material.GOLD_INGOT, 1), Material.GOLD_SWORD);
		FurnaceRecipe diamond1 = new FurnaceRecipe(new ItemStack(
				Material.DIAMOND, 1), Material.DIAMOND_PICKAXE);
		FurnaceRecipe diamond2 = new FurnaceRecipe(new ItemStack(
				Material.DIAMOND, 1), Material.DIAMOND_AXE);
		FurnaceRecipe diamond3 = new FurnaceRecipe(new ItemStack(
				Material.DIAMOND, 1), Material.DIAMOND_HOE);
		FurnaceRecipe diamond4 = new FurnaceRecipe(new ItemStack(
				Material.DIAMOND, 1), Material.DIAMOND_SWORD);
		FurnaceRecipe nbrick = new FurnaceRecipe(new ItemStack(
				Material.NETHER_BRICK, 1), Material.NETHERRACK);
		FurnaceRecipe nrack = new FurnaceRecipe(new ItemStack(
				Material.NETHERRACK, 1), Material.GRAVEL);
		FurnaceRecipe rottenflesh = new FurnaceRecipe(new ItemStack(
				Material.RAW_BEEF, 1), Material.ROTTEN_FLESH);
		FurnaceRecipe gravel = new FurnaceRecipe(new ItemStack(Material.GRAVEL,
				1), Material.DIRT);
		FurnaceRecipe quartz = new FurnaceRecipe(new ItemStack(Material.QUARTZ,
				1), Material.GLASS);
		
		plugin.getServer().addRecipe(sponge);

		plugin.getServer().addRecipe(gravel);

		plugin.getServer().addRecipe(ironingot1);
		plugin.getServer().addRecipe(ironingot2);
		plugin.getServer().addRecipe(ironingot3);
		plugin.getServer().addRecipe(ironingot4);

		plugin.getServer().addRecipe(goldingot1);
		plugin.getServer().addRecipe(goldingot2);
		plugin.getServer().addRecipe(goldingot3);
		plugin.getServer().addRecipe(goldingot4);

		plugin.getServer().addRecipe(diamond1);
		plugin.getServer().addRecipe(diamond2);
		plugin.getServer().addRecipe(diamond3);
		plugin.getServer().addRecipe(diamond4);

		plugin.getServer().addRecipe(wheat);

		plugin.getServer().addRecipe(grass1);
		plugin.getServer().addRecipe(grass2);
		plugin.getServer().addRecipe(grass3);
		plugin.getServer().addRecipe(grass4);

		plugin.getServer().addRecipe(oldcobble1);
		plugin.getServer().addRecipe(oldcobble2);
		plugin.getServer().addRecipe(oldcobble3);
		plugin.getServer().addRecipe(oldcobble4);
		plugin.getServer().addRecipe(oldcobble5);
		plugin.getServer().addRecipe(oldcobble6);

		plugin.getServer().addRecipe(villager);

		plugin.getServer().addRecipe(wolf);

		plugin.getServer().addRecipe(huhn);

		plugin.getServer().addRecipe(kuh);

		plugin.getServer().addRecipe(schaf);

		plugin.getServer().addRecipe(schwein);

		plugin.getServer().addRecipe(netz1);
		plugin.getServer().addRecipe(netz2);

		plugin.getServer().addRecipe(sattel1);
		plugin.getServer().addRecipe(sattel2);
		plugin.getServer().addRecipe(sattel3);

		plugin.getServer().addRecipe(grassbueschel);

		plugin.getServer().addRecipe(chain_helm1);
		plugin.getServer().addRecipe(chain_helm2);
		plugin.getServer().addRecipe(chain_brust);
		plugin.getServer().addRecipe(chain_bein);
		plugin.getServer().addRecipe(chain_fuss1);
		plugin.getServer().addRecipe(chain_fuss2);

		plugin.getServer().addRecipe(rottenflesh);

		plugin.getServer().addRecipe(feder1);
		plugin.getServer().addRecipe(feder2);
		plugin.getServer().addRecipe(feder3);
		plugin.getServer().addRecipe(feder4);
		plugin.getServer().addRecipe(feder5);
		plugin.getServer().addRecipe(feder6);

		plugin.getServer().addRecipe(ender);
		
		plugin.getServer().addRecipe(slime);
		
		plugin.getServer().addRecipe(flint);
		
		
		if (RecipePlugin.getConfigLoader().getnetherrack()) {
			plugin.getServer().addRecipe(nrack);
		}

		if (RecipePlugin.getConfigLoader().getnetherwartseed()) {

			plugin.getServer().addRecipe(netherwartseed1);
			plugin.getServer().addRecipe(netherwartseed2);
		}

		if (RecipePlugin.getConfigLoader().getblazerod()) {

			plugin.getServer().addRecipe(blazerod);
		}

		if (RecipePlugin.getConfigLoader().getnetherbrick()) {

			plugin.getServer().addRecipe(nbrick);
		}
		if (RecipePlugin.getConfigLoader().getglowstone()) {

			plugin.getServer().addRecipe(glows1);
			plugin.getServer().addRecipe(glows2);
			plugin.getServer().addRecipe(glows3);
			plugin.getServer().addRecipe(glows4);
		}
		if (RecipePlugin.getConfigLoader().getsoulsand()) {

			plugin.getServer().addRecipe(soul1);
			plugin.getServer().addRecipe(soul2);
			plugin.getServer().addRecipe(soul3);
			plugin.getServer().addRecipe(soul4);
		}
		if (RecipePlugin.getConfigLoader().getnetherstar()) {

			plugin.getServer().addRecipe(netherstar);
		}
		if (RecipePlugin.getConfigLoader().getquartz()) {

			plugin.getServer().addRecipe(quartz);
		}
	}

}
