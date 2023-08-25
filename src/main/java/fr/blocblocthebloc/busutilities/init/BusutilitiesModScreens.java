
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fr.blocblocthebloc.busutilities.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import fr.blocblocthebloc.busutilities.client.gui.RetraitsBanqueScreen;
import fr.blocblocthebloc.busutilities.client.gui.DepotsBanqueScreen;
import fr.blocblocthebloc.busutilities.client.gui.CryptoPhoneUpgradeGUIScreen;
import fr.blocblocthebloc.busutilities.client.gui.BanqueablokosScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BusutilitiesModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BusutilitiesModMenus.BANQUEABLOKOS.get(), BanqueablokosScreen::new);
			MenuScreens.register(BusutilitiesModMenus.RETRAITS_BANQUE.get(), RetraitsBanqueScreen::new);
			MenuScreens.register(BusutilitiesModMenus.DEPOTS_BANQUE.get(), DepotsBanqueScreen::new);
			MenuScreens.register(BusutilitiesModMenus.CRYPTO_PHONE_UPGRADE_GUI.get(), CryptoPhoneUpgradeGUIScreen::new);
		});
	}
}
