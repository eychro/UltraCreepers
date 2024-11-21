package dev.eychro.ultraCreepers;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class UltraCreepers extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onCreeperSpawn(EntitySpawnEvent e) {
        Entity entity = e.getEntity();
        if (entity instanceof Creeper) {
            Creeper creeper = (Creeper) entity;
            creeper.setExplosionRadius(20);
            creeper.setPowered(true);
            creeper.setHealth(1);
        }
    }

}
