package com.hadesdc.HubCore;

import com.hadesdc.HubCore.Events.onConnectLeave.JoinEvent;
import com.hadesdc.HubCore.Events.onConnectLeave.LeaveEvent;
import com.hadesdc.HubCore.commands.Donate;
import com.hadesdc.HubCore.commands.SetSpawn;
import com.hadesdc.HubCore.commands.TaskCommand;
import com.hadesdc.HubCore.commands.menus.commands.AdminSetup;
import com.hadesdc.HubCore.commands.menus.commands.PreferencesCommand;
import com.hadesdc.HubCore.commands.menus.commands.ServerSelectorCommand;
import com.hadesdc.HubCore.settings.Settings;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;
import org.mineacademy.fo.settings.YamlStaticConfig;
import java.util.Arrays;
import java.util.List;

public class HubCore extends SimplePlugin {
    @Override
    protected void onPluginStart() {
        Common.log("Loading: HubCore by HadesDC");
        /*

        Events

         */
        registerEvents(new JoinEvent());
        registerEvents(new LeaveEvent());
        /*

        Commands

         */
        registerCommand(new TaskCommand());
        registerCommand(new PreferencesCommand());
        registerCommand(new ServerSelectorCommand());
        registerCommand(new AdminSetup());
        registerCommand(new Donate());
        registerCommand(new SetSpawn());

        Common.log("Finished loading HubCore by HadesDC");
    }

    @Override
    public List<Class<? extends YamlStaticConfig>> getSettings() {
        return Arrays.asList(Settings.class);
    }
}
