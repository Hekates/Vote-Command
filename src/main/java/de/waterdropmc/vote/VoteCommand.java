package de.waterdropmc.vote;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VoteCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("vote")){
            if (!(sender.hasPermission("vote.use"))){
                sender.sendMessage(Vote.getPlugin(Vote.class)
                        .getConfig().getString("permission-message"));
                return true;
            }
            if (!(sender instanceof Player)){
                sender.sendMessage(Vote.getPlugin(Vote.class)
                        .getConfig().getString("no-player-message"));
                return true;
            }
            Player player = (Player) sender;
            player.sendMessage(Vote.getPlugin(Vote.class)
                    .getConfig().getString("vote-message")
                    + " "
                    + Vote.getPlugin(Vote.class)
                    .getConfig().getString("vote-link"));
        }

        return false;
    }
}
