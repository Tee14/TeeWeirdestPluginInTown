package me.tee14.tee.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.tee14.tee.util.Utils;

public class CShrug implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		String shrug = "¯\\_(ツ)_/¯";
		
		if(sender instanceof Player) {
			
			Player player = (Player) sender;
			Utils.fakeOut(player, "§4" + shrug);
		}
		
		return true;
	}
}