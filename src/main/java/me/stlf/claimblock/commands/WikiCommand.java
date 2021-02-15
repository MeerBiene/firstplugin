package me.stlf.claimblock.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class WikiCommand implements CommandExecutor {
    
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String firstarg, @NotNull String[] args) {
        Date date = new Date();
        sender.sendMessage("Es ist gerade " + date.toString());
        


        return false;
    }


}
