package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_PlayerData;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Shows a players warning count", usage = "/<command>", aliases = "wl")
public class Command_warnlevel extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        Player player = getPlayer(args[0]);
        if (TFM_PlayerData.getPlayerData(player).getWarningCount() >= 0)
        {
            int warnLvl = TFM_PlayerData.getPlayerData(player).getWarningCount();
            playerMsg(ChatColor.RED + "Your warning level is: " + ChatColor.GOLD + warnLvl);
        }
        else
        {
            playerMsg("There has been an error with the code please contact one of the developers");
        }
        
        return true;
    }
}
