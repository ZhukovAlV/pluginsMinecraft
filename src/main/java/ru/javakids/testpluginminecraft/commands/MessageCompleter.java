package ru.javakids.testpluginminecraft.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.List;

public class MessageCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {

        if (strings.length == 1) {
            return List.of(
                    "hello",
                    "goodbye",
                    "whatsup"
            );
        }

        return null;
    }
}
