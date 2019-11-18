package com.hadesdc.HubCore.Events.onConnectLeave;

import com.hadesdc.HubCore.settings.Settings;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveEvent implements Listener {

    /** Start Colorizing **/

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

    /** end Colorizing **/

    @EventHandler
    public void onLeaveEvent(PlayerQuitEvent event) {
        event.setQuitMessage(Settings.LEAVE_MESSAGE_COLOR + Settings.LEAVE_MESSAGE + event.getPlayer().getName() + Settings.LEAVE_MESSAGE_END);
    }
}
