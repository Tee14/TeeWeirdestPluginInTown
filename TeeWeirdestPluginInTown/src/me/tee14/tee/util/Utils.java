package me.tee14.tee.util;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import ru.tehkode.permissions.PermissionGroup;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Utils {

	public static void fakeOut(Player player, String message) {
		
		Bukkit.broadcastMessage(player.getDisplayName() + " §3§l> " + message);
	}
}