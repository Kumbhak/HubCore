package com.hadesdc.HubCore.commands.menus.commands;

import com.hadesdc.HubCore.commands.menus.ServerSelector;
import org.mineacademy.fo.command.SimpleCommand;

public class ServerSelectorCommand extends SimpleCommand {
    public ServerSelectorCommand() {
        super("selector|serverselector|servs");
    }

    @Override
    protected void onCommand() {
        checkConsole();

        new ServerSelector().displayTo(getPlayer());

    }
}
