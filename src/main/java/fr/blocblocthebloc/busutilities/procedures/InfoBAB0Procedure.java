package fr.blocblocthebloc.busutilities.procedures;

import net.minecraft.world.entity.Entity;

public class InfoBAB0Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return entity.getDisplayName().getString();
	}
}
