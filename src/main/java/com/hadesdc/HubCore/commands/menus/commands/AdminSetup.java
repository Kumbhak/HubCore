package com.hadesdc.HubCore.commands.menus.commands;

import com.hadesdc.HubCore.commands.menus.ServerSelector;
import org.mineacademy.fo.command.SimpleCommand;

public class AdminSetup extends SimpleCommand {
    public AdminSetup() {
        super("adminsetup");
    }

    @Override
    protected void onCommand() {
        checkConsole();

        new ServerSelector().displayTo(getPlayer());

    }
}
