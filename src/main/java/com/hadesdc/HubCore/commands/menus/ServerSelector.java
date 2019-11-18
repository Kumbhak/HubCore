package com.hadesdc.HubCore.commands.menus;

import com.hadesdc.HubCore.settings.Settings;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.menu.Menu;
import org.mineacademy.fo.menu.button.Button;
import org.mineacademy.fo.menu.model.ItemCreator;
import org.mineacademy.fo.remain.CompMaterial;

public class ServerSelector extends Menu {

    /*
    BORDER
     */
    private final Button border;


    /*
    Servers
     */
    private final Button server1;
    private final Button server2;
    private final Button server3;



    public ServerSelector() {
        setTitle("Settings.ServerGUI_Name");
        setSize(9 * 5);

        server1 = new Button() {
            @Override
            public void onClickedInMenu(Player player, Menu menu, ClickType clickType) {

                ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();

                String command = "/";
                Bukkit.dispatchCommand(console, command);

            }
            @Override
            public ItemStack getItem() {
                return ItemCreator.of(CompMaterial.DIAMOND_SWORD,
                        "Settings.SERVER1_NAME",
                        "").glow(true)
                        .build().make();
            }
        };
        server2 = new Button() {
            @Override
            public void onClickedInMenu(Player player, Menu menu, ClickType clickType) {

            }

            @Override
            public ItemStack getItem() {
                return ItemCreator.of(CompMaterial.DIAMOND_SWORD,
                        "Settings.SERVER2_NAME",
                        "").glow(true)
                        .build().make();
            }
        };
        server3 = new Button() {
            @Override
            public void onClickedInMenu(Player player, Menu menu, ClickType clickType) {

            }

            @Override
            public ItemStack getItem() {
                return ItemCreator.of(CompMaterial.GRASS_BLOCK,
                        "Settings.SERVER3_NAME",
                        "").glow(true)
                        .build().make();
            }
        };
            /*
    BORDER DESIGNATION
    BORDER DESIGNATION
    BORDER DESIGNATION
     */

        border = new Button() {
            @Override
            public void onClickedInMenu(Player player, Menu menu, ClickType clickType) {

            }

            @Override
            public ItemStack getItem() {
                return ItemCreator.of(CompMaterial.BLACK_STAINED_GLASS_PANE,
                        "Border",
                        "").build().make();
            }
        };
    }


    @Override
    public ItemStack getItemAt(final int slot) {

        /*
        Servers
         */
        if (slot == 20)
            return server1.getItem();
        if (slot == 22)
            return server2.getItem();
        if (slot == 24)
            return server3.getItem();

        /*
        Border
         */
        if (slot == 0)
            return border.getItem();
        if (slot == 1)
            return border.getItem();
        if (slot == 2)
            return border.getItem();
        if (slot == 3)
            return border.getItem();
        if (slot == 4)
            return border.getItem();
        if (slot == 5)
            return border.getItem();
        if (slot == 6)
            return border.getItem();
        if (slot == 7)
            return border.getItem();
        if (slot == 8)
            return border.getItem();
        if (slot == 9)
            return border.getItem();
        if (slot == 17)
            return border.getItem();
        if (slot == 18)
            return border.getItem();
        if (slot == 26)
            return border.getItem();
        if (slot == 27)
            return border.getItem();
        if (slot == 35)
            return border.getItem();
        if (slot == 36)
            return border.getItem();
        if (slot == 37)
            return border.getItem();
        if (slot == 38)
            return border.getItem();
        if (slot == 39)
            return border.getItem();
        if (slot == 40)
            return border.getItem();
        if (slot == 41)
            return border.getItem();
        if (slot == 42)
            return border.getItem();
        if (slot == 43)
            return border.getItem();
        if (slot == 44)
            return border.getItem();
        if (slot == 45)
            return border.getItem();
        if (slot == 20)

            return super.getItemAt(slot);
        return null;
    }


    @Override
    protected String[] getInfo() {
        return null;
    }
}
