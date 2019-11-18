package com.hadesdc.HubCore.commands.menus;

import com.hadesdc.HubCore.items.RocketMan;
import com.hadesdc.HubCore.items.ServerSelectorItem;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.menu.Menu;
import org.mineacademy.fo.menu.button.Button;
import org.mineacademy.fo.menu.button.ButtonMenu;
import org.mineacademy.fo.menu.model.ItemCreator;
import org.mineacademy.fo.remain.CompMaterial;

public class AdminMenu extends Menu {


    private final Button border;
    private final Button SetSpawn;

    public AdminMenu(Button toolsMenu) {
        setTitle("Admin Menu");
        setSize(9 * 3);

        border = new Button() {
            @Override
            public void onClickedInMenu(Player player, Menu menu, ClickType clickType) {

            }

            @Override
            public ItemStack getItem() {
                return ItemCreator.of(CompMaterial.BLACK_STAINED_GLASS_PANE,
                        "",
                        "").glow(true)
                        .build().make();
            }
        };

        SetSpawn = new Button() {
            @Override
            public void onClickedInMenu(Player player, Menu menu, ClickType clickType) {


            }

            @Override
            public ItemStack getItem() {
                return ItemCreator.of(CompMaterial.ARMOR_STAND,
                        "",
                        "").glow(false)
                        .build().make();
            }
        };
    }

    @Override
    protected String[] getInfo() {
        return null;
    }
}


