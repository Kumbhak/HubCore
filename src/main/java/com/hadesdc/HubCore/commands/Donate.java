package com.hadesdc.HubCore.commands;

import com.hadesdc.HubCore.settings.Settings;
import org.mineacademy.fo.command.SimpleCommand;

public class Donate extends SimpleCommand {
    public Donate() {
        super("donate|d");
    }

    @Override
    protected void onCommand() {
        tell(Settings.DONATION_COLOR + "========================");
        tell(Settings.DONATION_MESSAGE);
        tell(Settings.DONATION_LINK);
        tell(Settings.DONATION_COLOR + "========================");

    }
}
