package fr.blocblocthebloc.busutilities.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import fr.blocblocthebloc.busutilities.network.BusutilitiesModVariables;

public class EntreBlokosProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component
					.literal(("\u00A7a" + "[BAB]" + " " + "Vous avez re\u00E7u" + " " + (entity.getCapability(BusutilitiesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BusutilitiesModVariables.PlayerVariables())).EntreBlokosMontant + " "
							+ "Blokos de" + " " + (entity.getCapability(BusutilitiesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BusutilitiesModVariables.PlayerVariables())).EntreBlokosNom)),
					false);
	}
}
