package com.hadesdc.HubCore.Events.playerEvents;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class PlayerSneakLaunch implements Listener {
    @EventHandler
    public void onSneak(PlayerToggleSneakEvent event){
        event.getPlayer().setVelocity(event.getPlayer().getVelocity().setY(10).setX(10).setZ(10));
    }
}
