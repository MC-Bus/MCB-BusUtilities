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

public class BoutiqueCarteVente10VProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == BusutilitiesModItems.CARTE_DE_TRANSPORT
				.get()) {
			if ((entity.getCapability(BusutilitiesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BusutilitiesModVariables.PlayerVariables())).Blokos >= 9) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(BusutilitiesModItems.CARTE_DE_TRANSPORT_10_VOYAGES.get());
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				{
					double _setval = (entity.getCapability(BusutilitiesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BusutilitiesModVariables.PlayerVariables())).Blokos - 9;
					entity.getCapability(BusutilitiesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Blokos = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 9;
					entity.getCapability(BusutilitiesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SortieBlokosMontant = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "BOUTIQUECARTE";
					entity.getCapability(BusutilitiesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SortieBlokosNom = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				SortieBlokosProcedure.execute(entity);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("[BOUTIQUE] : Vous n'avez pas assez de fonds"), false);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("[BOUTIQUE] : Aucune carte de transport d\u00E9tecter"), false);
		}
	}
}
