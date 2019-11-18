package com.hadesdc.HubCore.items;

import lombok.Getter;
import org.bukkit.entity.DragonFireball;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.menu.model.ItemCreator;
import org.mineacademy.fo.menu.tool.Rocket;
import org.mineacademy.fo.menu.tool.Tool;
import org.mineacademy.fo.remain.CompMaterial;

public class RocketMan extends Rocket {

    @Getter
    private static final Tool instance = new RocketMan();

    private RocketMan() {
        super(DragonFireball.class, 2F, 10F);
    }


    @Override
    public ItemStack getItem() {
        return ItemCreator.of(CompMaterial.FIRE_CHARGE,
                "&7Rocket_Man",
                "Rocket man",
                "Just shoots a rocket").glow(true).build().make();
    }
}
