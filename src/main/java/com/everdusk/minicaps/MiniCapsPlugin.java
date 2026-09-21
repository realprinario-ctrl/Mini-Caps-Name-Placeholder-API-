package com.everdusk.minicaps;

import org.bukkit.plugin.java.JavaPlugin;

public final class MiniCapsPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        new MiniCapsExpansion("player_name_minicaps").register();
        new MiniCapsExpansion("pnmc").register();
        getLogger().info("MiniCapsName enabled. Placeholders: %player_name_minicaps% and %pnmc%");
    }
}
