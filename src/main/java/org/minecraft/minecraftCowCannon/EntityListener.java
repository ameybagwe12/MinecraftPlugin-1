package org.minecraft.minecraftCowCannon;

import org.bukkit.entity.Cow;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class EntityListener implements Listener {

    // NOTE: This event handler causes a cow to explode when a player right-clicks on it.
    @EventHandler
    public void onEntityRightClick (PlayerInteractAtEntityEvent event) {
        System.out.println("Right Clicked : "+ event.getRightClicked().getClass());
        if(event.getRightClicked() instanceof Villager) {
            Villager villager = (Villager) event.getRightClicked();
            villager.getWorld().createExplosion(villager.getLocation(), 2.5F);
        }
    }
}
