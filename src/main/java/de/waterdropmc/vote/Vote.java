package de.waterdropmc.vote;

import org.bukkit.plugin.java.JavaPlugin;

public final class Vote extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getCommand("vote").setExecutor(new VoteCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
