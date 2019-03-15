package me.tee14.tee.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.tee14.tee.util.Utils;

public class CSuidice implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			
			Player player = (Player) sender;
			
			Location loc = new Location(player.getWorld(), player.getLocation().getX(), 5000, player.getLocation().getZ());
			player.teleport(loc);
			Utils.fakeOut(player, "§1Gotta blast!");
			player.sendMessage("§cPopo didn't like that!");
		}
		
		return true;
	}
}

//My favorite command, one that shoots you up 5000 blocks relative to your current X and Z position.