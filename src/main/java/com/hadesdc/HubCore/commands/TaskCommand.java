package com.hadesdc.HubCore.commands;

import com.hadesdc.HubCore.HubCore;
import org.bukkit.entity.EntityType;
import org.bukkit.scheduler.BukkitRunnable;
import org.mineacademy.fo.command.SimpleCommand;
import org.mineacademy.fo.remain.CompSound;

public class TaskCommand extends SimpleCommand {
    public TaskCommand() {
        super("Task");

        setMinArguments(1);
        setUsage("<sync|stop|start|async>");

    }
    @Override
    protected void onCommand() {

        final String param = args [0].toLowerCase();

        if ("sync".equals(param)) {

            new BukkitRunnable() {
                @Override
                public void run() {
                    tell("Spawning cat (1/2)");

                    CompSound.CAT_MEOW.play(getPlayer());
                    getPlayer().getWorld().spawnEntity(getPlayer().getLocation(), EntityType.OCELOT);
                }
            }.runTaskLater(HubCore.getInstance(), 3 * 20);


        } else if ("async".equals(param)) {

        } else if ("start".equals(param)) {

        } else if ("stop".equals(param)) {

        } else
            tell("Not the correct args try again using..........");

    }
}
