package org.minecraft.minecraftMobExplode;

import org.bukkit.plugin.java.JavaPlugin;


public final class MinecraftCowCannon extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin Enabled for Cow Cannon!");
        getServer().getPluginManager().registerEvents(new EntityListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin Disabled for Cow Cannon!");
    }
}
