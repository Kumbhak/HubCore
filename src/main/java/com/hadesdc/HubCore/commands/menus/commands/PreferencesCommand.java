package com.hadesdc.HubCore.commands.menus.commands;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.command.SimpleCommand;
import org.mineacademy.fo.menu.model.InventoryDrawer;
import org.mineacademy.fo.menu.model.ItemCreator;
import org.mineacademy.fo.remain.CompMaterial;

public class PreferencesCommand extends SimpleCommand {
    public PreferencesCommand() {
        super("preferences|pref");
    }

    @Override
    protected void onCommand() {
        checkConsole();
        /*
        ITEM CREATOR
         */
/*

        InventoryDrawer drawer = InventoryDrawer.of(9*5, "&4User Preferences");

        drawer.setItem(0, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        drawer.setItem(1, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        drawer.setItem(2, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        drawer.setItem(3, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        drawer.setItem(4, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        drawer.setItem(5, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        drawer.setItem(6, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        drawer.setItem(7, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        drawer.setItem(8, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        drawer.setItem(9, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        drawer.setItem(17, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        drawer.setItem(18, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        drawer.setItem( 20, ItemCreator.of(CompMaterial.COMPASS,
                "&4Server 1",
                "Simple server selector",
                "Choose your destiny!")
                .glow(true)
                .build().make());
        drawer.setItem(23, ItemCreator.of(CompMaterial.APPLE,
                "Apple of God",
                "Hide all players")
        .glow(true)
        .build().make());


        drawer.display(getPlayer());
        */
    }
}
