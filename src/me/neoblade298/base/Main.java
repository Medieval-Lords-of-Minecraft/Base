package me.neoblade298.base;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.neoblade298.neocore.bukkit.commands.SubcommandManager;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	private static Main inst;
	
	public void onEnable() {
		Bukkit.getServer().getLogger().info("NeoPPRs Enabled");
		// Bukkit.getPluginManager().registerEvents(this, this);
		initCommands();
		
		inst = this;
	}
	
	public void onDisable() {
	    org.bukkit.Bukkit.getServer().getLogger().info("NeoPPRs Disabled");
	    super.onDisable();
	}
	
	private void initCommands() {
		// SubcommandManager mngr = new SubcommandManager("disenchant", "disenchant.use", ChatColor.RED, this);
		// mngr.register(new CmdDisenchant("disenchant", "Disenchants the item", null, SubcommandRunner.PLAYER_ONLY));
	}
	
	public static Main inst() {
		return inst;
	}
}
