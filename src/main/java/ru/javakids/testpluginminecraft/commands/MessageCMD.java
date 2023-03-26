package ru.javakids.testpluginminecraft.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MessageCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (strings[0].equalsIgnoreCase("hello")) {
            commandSender.sendMessage("Привет :)");
            return true;
        } else if (strings[0].equalsIgnoreCase("goodbye")) {
            commandSender.sendMessage("Пока :(");
            return true;
        }else if (strings[0].equalsIgnoreCase("whatsup")) {
            commandSender.sendMessage("Как дела ?:)");
            return true;
        }

        return false;
    }

}
