package fr.blocblocthebloc.busutilities.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import fr.blocblocthebloc.busutilities.network.BusutilitiesModVariables;
import fr.blocblocthebloc.busutilities.init.BusutilitiesModItems;

public class BlokosGenCryptoPhoneMiniProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (BusutilitiesModVariables.MapVariables.get(world).CryptoPhoneGenState == true) {
				BusutilitiesModVariables.MapVariables.get(world).CryptoPhoneGenState = false;
				BusutilitiesModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("[CryptoPhone] : Vos Blokos irons dans votre inventaire"), true);
			} else {
				BusutilitiesModVariables.MapVariables.get(world).CryptoPhoneGenState = true;
				BusutilitiesModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("[CryptoPhone] : Vos Blokos irons dans sur votre compte bancaire"), true);
			}
		} else {
			if (BusutilitiesModVariables.MapVariables.get(world).CryptoPhoneGenState == false) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 900);
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(BusutilitiesModItems.BLOKOS.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("[CryptoPhone] : 1 Blokos \u00E0 \u00E9t\u00E9 ajout\u00E9 \u00E0 votre inventaire"), true);
			} else {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 900);
				{
					double _setval = (entity.getCapability(BusutilitiesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BusutilitiesModVariables.PlayerVariables())).Blokos + 1;
					entity.getCapability(BusutilitiesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Blokos = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1;
					entity.getCapability(BusutilitiesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.EntreBlokosMontant = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = "CRYPTOPHONEMINI";
					entity.getCapability(BusutilitiesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.EntreBlokosNom = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				EntreBlokosProcedure.execute(entity);
			}
		}
	}
}
