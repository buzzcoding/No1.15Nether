package com.buzzthegamer23.no115nether;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;
import us.myles.ViaVersion.api.Via;

public class DisableNether
	implements Listener {
	@EventHandler
	public void onTeleport(PlayerTeleportEvent e) {
		if (e.getCause() == PlayerTeleportEvent.TeleportCause.NETHER_PORTAL && Via.getAPI().getPlayerVersion(e.getPlayer()) < 701) {
			e.getPlayer().sendMessage("Please use version 1.16 or above if you want to play on the nether.");
			e.setCancelled(true);
		}
	}
}
