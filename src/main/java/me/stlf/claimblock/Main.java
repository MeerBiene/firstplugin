package me.stlf.claimblock;

import me.stlf.claimblock.listeners.JoinListener;
import me.stlf.claimblock.commands.WikiCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {  
    
    // This code is called after the server starts and after the /reload command
    @Override
    public void onEnable() {
        getCommand("claimblock").setExecutor(new WikiCommand());
        listenerRegistration();
    }

    // This code is called before the server stops and after the /reload command
    @Override
    public void onDisable() {
    
    }

    private void listenerRegistration(){
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinListener(), this);
    }

    

// ================================
// the bracket below ends the class
}