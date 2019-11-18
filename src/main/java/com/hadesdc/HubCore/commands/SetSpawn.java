package com.hadesdc.HubCore.commands;

import org.mineacademy.fo.command.SimpleCommand;

public class SetSpawn extends SimpleCommand {
    public SetSpawn() {
        super("hubsetspawn|spawnlocation|hsetspawn|adminspawn");
        setName("Set Spawn Command");
        setPermission("hubcore.spawn.set");
        setPermissionMessage("You must be an admin to change the spawn!");
    }

    @Override
    protected void onCommand() {
        checkConsole();
        getPlayer().getWorld().setSpawnLocation(getPlayer().getLocation().getBlockX(), getPlayer().getLocation().getBlockY(), getPlayer().getLocation().getBlockZ());

        tell("&cSet the player spawn");
    }
}
