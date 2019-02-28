package fr.devsylone.fallenkingdom.commands.rules.rulescommands.capcommands;

import org.bukkit.entity.Player;

import fr.devsylone.fallenkingdom.commands.rules.FkCapCommand;
import fr.devsylone.fallenkingdom.players.FkPlayer;

public class PvpCap extends FkCapCommand
{
	public PvpCap()
	{
		super("pvpCap", "Définit le jour où le pvp devient actif.");
	}

	public void execute(Player sender, FkPlayer fkp, String[] args)
	{
		executeCap(args[0], "Le pvp est maintenant actif");
	}
}
