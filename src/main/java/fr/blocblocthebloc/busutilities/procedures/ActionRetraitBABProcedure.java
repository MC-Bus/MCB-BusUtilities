package fr.blocblocthebloc.busutilities.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import java.util.function.Supplier;
import java.util.Map;

import fr.blocblocthebloc.busutilities.network.BusutilitiesModVariables;
import fr.blocblocthebloc.busutilities.init.BusutilitiesModItems;

public class ActionRetraitBABProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(BusutilitiesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BusutilitiesModVariables.PlayerVariables())).Blokos > 1) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(0) != 64) {
				{
					double _setval = (entity.getCapability(BusutilitiesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BusutilitiesModVariables.PlayerVariables())).Blokos - 1;
					entity.getCapability(BusutilitiesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Blokos = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(BusutilitiesModItems.BLOKOS.get());
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0) + 1));
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("[BAB] : Vous avez bien retirer 1 Blokos de votre compte"), false);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("[BAB] : Vous avez plus assez de place dans les retraits"), false);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("[BAB] : Vous n'avez pas assez de fonds"), false);
		}
	}
}
