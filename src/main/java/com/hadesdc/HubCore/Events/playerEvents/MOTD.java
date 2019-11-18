package com.hadesdc.HubCore.Events.playerEvents;

import com.hadesdc.HubCore.settings.Settings;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class MOTD implements Listener {
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

    @EventHandler
    public void onPlayerJoinMOTD(PlayerJoinEvent event){

        event.setJoinMessage("" + "" );

    }
}
