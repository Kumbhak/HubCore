package com.hadesdc.HubCore.Events.onConnectLeave;

import com.hadesdc.HubCore.settings.Settings;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
public class JoinEvent implements Listener {
    /** IMPORTS COLOR START **/
    public String colorize(String msg)
    {
        String coloredMsg = "";
        for(int i = 0; i < msg.length(); i++)
        {
            if(msg.charAt(i) == '&')
                coloredMsg += '§';
            else
                coloredMsg += msg.charAt(i);
        }
        return coloredMsg;
    }
    /** END OF COLOR **/

    @EventHandler
    public void onPlayerJoinFeed(PlayerJoinEvent event) {
        event.getPlayer().setFoodLevel(20);
    }

    @EventHandler
    public void onPlayerJoinSetSpeed(PlayerJoinEvent event) {
        event.getPlayer().setWalkSpeed(Float.parseFloat(Settings.PLAYER_WALK_SPEED));
    }
    @EventHandler
    public void onJoinGiveHealth(PlayerJoinEvent event){
        event.getPlayer().setHealth(20);
    }

    @EventHandler
    public void onJoinNoPickup(PlayerJoinEvent event){
        event.getPlayer().setCanPickupItems(false);
    }

    @EventHandler
    public void onJoinNoDrop(PlayerDropItemEvent event){
        event.setCancelled(true);
    }
}

