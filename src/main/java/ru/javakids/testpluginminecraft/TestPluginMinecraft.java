package ru.javakids.testpluginminecraft;

import org.bukkit.plugin.java.JavaPlugin;
import ru.javakids.testpluginminecraft.commands.CalculatorCMD;
import ru.javakids.testpluginminecraft.commands.MessageCMD;
import ru.javakids.testpluginminecraft.commands.MessageCompleter;
import ru.javakids.testpluginminecraft.entity.SpawnCommand;
import ru.javakids.testpluginminecraft.items.GiveItem;

public final class TestPluginMinecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hello World");

        getCommand("calculator").setExecutor(new CalculatorCMD());

        getCommand("message").setExecutor(new MessageCMD());
        getCommand("message").setTabCompleter(new MessageCompleter());

        getCommand("spawnEntity").setExecutor(new SpawnCommand());

        getCommand("giveItem").setExecutor(new GiveItem());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Bye World");
    }
}
