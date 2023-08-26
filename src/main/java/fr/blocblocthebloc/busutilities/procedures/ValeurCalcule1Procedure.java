package fr.blocblocthebloc.busutilities.procedures;

import net.minecraft.world.entity.Entity;

import fr.blocblocthebloc.busutilities.network.BusutilitiesModVariables;

public class ValeurCalcule1Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "" + (entity.getCapability(BusutilitiesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BusutilitiesModVariables.PlayerVariables())).Calcule1;
	}
}
