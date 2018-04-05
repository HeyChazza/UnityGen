package io.chazza.unitygen.command;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandCompletion;
import co.aikar.commands.annotation.Subcommand;
import io.chazza.unitygen.Lang;
import io.chazza.unitygen.Main;
import io.chazza.unitygen.UnityGenAPI;
import io.chazza.unitygen.util.ColorUtil;
import io.chazza.unitygen.util.ConfigManager;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

@CommandAlias("%cmd")
public class InfoCommand extends BaseCommand {

    @Subcommand("info|in")
    @CommandCompletion("info")
    public void onVersion(Player sender) {

        ConfigManager cm = ConfigManager.getConfig(sender.getUniqueId());
        FileConfiguration fc = cm.getConfig();

        sender.sendMessage(ColorUtil.translate("&cLimit: " + UnityGenAPI.getPlayerLimit(sender)));
        sender.sendMessage(ColorUtil.translate("&cYou've placed " + Main.getCount(fc)));
    }
}
