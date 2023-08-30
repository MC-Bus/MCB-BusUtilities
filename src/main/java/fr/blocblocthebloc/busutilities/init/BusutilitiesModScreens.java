
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fr.blocblocthebloc.busutilities.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import fr.blocblocthebloc.busutilities.client.gui.TermsBlocGUIScreen;
import fr.blocblocthebloc.busutilities.client.gui.RetraitsBanqueScreen;
import fr.blocblocthebloc.busutilities.client.gui.DepotsBanqueScreen;
import fr.blocblocthebloc.busutilities.client.gui.DebugBlokosSysScreen;
import fr.blocblocthebloc.busutilities.client.gui.CryptoPhoneUpgradeGUIScreen;
import fr.blocblocthebloc.busutilities.client.gui.CryptoPhoneCoreShopPhysiqueGUIScreen;
import fr.blocblocthebloc.busutilities.client.gui.CryptoPhoneCoreShopBanqueGUIScreen;
import fr.blocblocthebloc.busutilities.client.gui.CalculeBlocGUIScreen;
import fr.blocblocthebloc.busutilities.client.gui.BoutiqueticketcarteselectbankScreen;
import fr.blocblocthebloc.busutilities.client.gui.BoutiqueTicketPhyScreen;
import fr.blocblocthebloc.busutilities.client.gui.BoutiqueTicketCarteSelectPhyScreen;
import fr.blocblocthebloc.busutilities.client.gui.BoutiqueTicketBankScreen;
import fr.blocblocthebloc.busutilities.client.gui.BoutiqueCartesScreen;
import fr.blocblocthebloc.busutilities.client.gui.BoutiqueCarteDeTransportPhyScreen;
import fr.blocblocthebloc.busutilities.client.gui.BoutiqueCarteDeTransportBankScreen;
import fr.blocblocthebloc.busutilities.client.gui.BanqueablokosScreen;
import fr.blocblocthebloc.busutilities.client.gui.BABLiteScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BusutilitiesModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BusutilitiesModMenus.BANQUEABLOKOS.get(), BanqueablokosScreen::new);
			MenuScreens.register(BusutilitiesModMenus.RETRAITS_BANQUE.get(), RetraitsBanqueScreen::new);
			MenuScreens.register(BusutilitiesModMenus.DEPOTS_BANQUE.get(), DepotsBanqueScreen::new);
			MenuScreens.register(BusutilitiesModMenus.CRYPTO_PHONE_UPGRADE_GUI.get(), CryptoPhoneUpgradeGUIScreen::new);
			MenuScreens.register(BusutilitiesModMenus.CRYPTO_PHONE_CORE_SHOP_PHYSIQUE_GUI.get(), CryptoPhoneCoreShopPhysiqueGUIScreen::new);
			MenuScreens.register(BusutilitiesModMenus.CRYPTO_PHONE_CORE_SHOP_BANQUE_GUI.get(), CryptoPhoneCoreShopBanqueGUIScreen::new);
			MenuScreens.register(BusutilitiesModMenus.DEBUG_BLOKOS_SYS.get(), DebugBlokosSysScreen::new);
			MenuScreens.register(BusutilitiesModMenus.TERMS_BLOC_GUI.get(), TermsBlocGUIScreen::new);
			MenuScreens.register(BusutilitiesModMenus.CALCULE_BLOC_GUI.get(), CalculeBlocGUIScreen::new);
			MenuScreens.register(BusutilitiesModMenus.BAB_LITE.get(), BABLiteScreen::new);
			MenuScreens.register(BusutilitiesModMenus.BOUTIQUE_TICKET_CARTE_SELECT_PHY.get(), BoutiqueTicketCarteSelectPhyScreen::new);
			MenuScreens.register(BusutilitiesModMenus.BOUTIQUETICKETCARTESELECTBANK.get(), BoutiqueticketcarteselectbankScreen::new);
			MenuScreens.register(BusutilitiesModMenus.BOUTIQUE_TICKET_PHY.get(), BoutiqueTicketPhyScreen::new);
			MenuScreens.register(BusutilitiesModMenus.BOUTIQUE_TICKET_BANK.get(), BoutiqueTicketBankScreen::new);
			MenuScreens.register(BusutilitiesModMenus.BOUTIQUE_CARTES.get(), BoutiqueCartesScreen::new);
			MenuScreens.register(BusutilitiesModMenus.BOUTIQUE_CARTE_DE_TRANSPORT_PHY.get(), BoutiqueCarteDeTransportPhyScreen::new);
			MenuScreens.register(BusutilitiesModMenus.BOUTIQUE_CARTE_DE_TRANSPORT_BANK.get(), BoutiqueCarteDeTransportBankScreen::new);
		});
	}
}
