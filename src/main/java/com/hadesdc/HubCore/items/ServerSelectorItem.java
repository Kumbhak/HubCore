package com.hadesdc.HubCore.items;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bukkit.EntityEffect;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.menu.model.ItemCreator;
import org.mineacademy.fo.menu.tool.Tool;
import org.mineacademy.fo.remain.CompMaterial;

@NoArgsConstructor(access = AccessLevel.PRIVATE)

public class ServerSelectorItem extends Tool {
    @Getter
    private static final Tool Instance = new ServerSelectorItem();


    @Override
    public ItemStack getItem() {
        return ItemCreator.of(CompMaterial.COMPASS,
                "&4Server Selector",
                "",
                "Right click to select",
                "a server from our menu")
                .glow(true).build().make();
    }

    @Override
    protected void onBlockClick(PlayerInteractEvent playerInteractEvent) {
        if (playerInteractEvent.getAction() == Action.RIGHT_CLICK_BLOCK) {
            playerInteractEvent.getClickedBlock().setType(CompMaterial.DIAMOND_BLOCK.getMaterial());
            playerInteractEvent.getPlayer().playEffect(EntityEffect.FIREWORK_EXPLODE);
        }


    }



}
