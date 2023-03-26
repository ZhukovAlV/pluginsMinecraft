package ru.javakids.testpluginminecraft.items;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GiveItem implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        Player player = (Player)commandSender;

        ItemStack itemStack = new ItemStack(Material.APPLE, 15);

        player.getInventory().addItem(itemStack);

        return true;
    }
}
