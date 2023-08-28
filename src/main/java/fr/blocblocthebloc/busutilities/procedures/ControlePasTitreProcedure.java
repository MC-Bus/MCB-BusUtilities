package fr.blocblocthebloc.busutilities.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class ControlePasTitreProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7c[Contr\u00F4le Bloc] : Vous n'avez pas de titre de transport valide"), true);
	}
}
