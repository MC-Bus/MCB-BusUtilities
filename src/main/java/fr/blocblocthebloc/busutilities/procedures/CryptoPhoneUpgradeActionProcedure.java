package fr.blocblocthebloc.busutilities.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import java.util.function.Supplier;
import java.util.Map;

import fr.blocblocthebloc.busutilities.init.BusutilitiesModItems;

public class CryptoPhoneUpgradeActionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == BusutilitiesModItems.CRYPTO_PHONE_BASE
				.get()) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
					.getItem() == BusutilitiesModItems.CRYPTO_PHONE_MINICORE.get()) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).set(ItemStack.EMPTY);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(1)).set(ItemStack.EMPTY);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(BusutilitiesModItems.CRYPTO_PHONE_MINI.get());
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == BusutilitiesModItems.CRYPTO_PHONE_MINI
					.get()) {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem() == BusutilitiesModItems.CRYPTO_PHONE_ADVENCE_CORE.get()) {
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(0)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get(1)).set(ItemStack.EMPTY);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(BusutilitiesModItems.CRYPTO_PHONE_ADVENCE.get());
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
						.getItem() == BusutilitiesModItems.CRYPTO_PHONE_ADVENCE.get()) {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
							.getItem() == BusutilitiesModItems.CRYPTO_PHONE_MAX_CORE.get()) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(0)).set(ItemStack.EMPTY);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							((Slot) _slots.get(1)).set(ItemStack.EMPTY);
							_player.containerMenu.broadcastChanges();
						}
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(BusutilitiesModItems.CRYPTO_PHONE_MAX.get());
							_setstack.setCount(1);
							((Slot) _slots.get(2)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
					}
				} else {
					if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
							.getItem() == BusutilitiesModItems.CRYPTO_PHONE_MAX.get()) {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == BusutilitiesModItems.CRYPTO_PHONE_PRO_CORE.get()) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(0)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								((Slot) _slots.get(1)).set(ItemStack.EMPTY);
								_player.containerMenu.broadcastChanges();
							}
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack _setstack = new ItemStack(BusutilitiesModItems.CRYPTO_PHONE_PRO.get());
								_setstack.setCount(1);
								((Slot) _slots.get(2)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
						}
					} else {
						if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
								.getItem() == BusutilitiesModItems.CRYPTO_PHONE_PRO.get()) {
							if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
									.getItem() == BusutilitiesModItems.CRYPTO_PHONE_ELITE_CORE.get()) {
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									((Slot) _slots.get(0)).set(ItemStack.EMPTY);
									_player.containerMenu.broadcastChanges();
								}
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									((Slot) _slots.get(1)).set(ItemStack.EMPTY);
									_player.containerMenu.broadcastChanges();
								}
								if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
									ItemStack _setstack = new ItemStack(BusutilitiesModItems.CRYPTO_PHONE_ELITE.get());
									_setstack.setCount(1);
									((Slot) _slots.get(2)).set(_setstack);
									_player.containerMenu.broadcastChanges();
								}
							}
						} else {
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("[Table d'am\u00E9lioration de CryptoPhone] : Vous n'avez pas mis les bons objets"), false);
						}
					}
				}
			}
		}
	}
}
