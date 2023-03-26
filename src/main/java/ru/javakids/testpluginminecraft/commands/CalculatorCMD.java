package ru.javakids.testpluginminecraft.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CalculatorCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        int a, b;
        try {
            a = Integer.parseInt(strings[0]);
            b = Integer.parseInt(strings[2]);
        } catch (NumberFormatException e) {
            return false;
        }


        if (strings[1].equals("+")) {
            commandSender.sendMessage("Result = " + (a + b));
            return true;
        } else if (strings[1].equals("-")) {
            commandSender.sendMessage("Result = " + (a - b));
            return true;
        } else if (strings[1].equals("/")) {
            commandSender.sendMessage("Result = " + (a / b));
            return true;
        } else if (strings[1].equals("*")) {
            commandSender.sendMessage("Result = " + (a * b));
            return true;
        }

        return false;
    }

}
