package com.hadesdc.HubCore.Events.onConnectLeave;

import com.hadesdc.HubCore.settings.Settings;
import javafx.scene.layout.Priority;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinMessage implements Listener {
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
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onJoinTell(PlayerJoinEvent event){
        event.getPlayer().sendMessage(colorize(Settings.JOIN_MESSAGE_LINE1));
        event.getPlayer().sendMessage(colorize(Settings.JOIN_MESSAGE_LINE2));
        event.getPlayer().sendMessage(colorize(Settings.JOIN_MESSAGE_LINE3));
        event.getPlayer().sendMessage(colorize(Settings.JOIN_MESSAGE_LINE4));
        event.getPlayer().sendMessage(colorize(Settings.JOIN_MESSAGE_LINE5));

    }
}
