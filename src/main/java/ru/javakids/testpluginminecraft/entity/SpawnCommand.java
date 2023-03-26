package ru.javakids.testpluginminecraft.entity;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        Player player = (Player)commandSender;

        for (int i = 0; i < 100; i++) {
            player.getWorld().spawnEntity(player.getLocation(), EntityType.BEE);
        }
        return true;
    }
}
