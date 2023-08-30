
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fr.blocblocthebloc.busutilities.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import fr.blocblocthebloc.busutilities.world.inventory.TermsBlocGUIMenu;
import fr.blocblocthebloc.busutilities.world.inventory.RetraitsBanqueMenu;
import fr.blocblocthebloc.busutilities.world.inventory.DepotsBanqueMenu;
import fr.blocblocthebloc.busutilities.world.inventory.DebugBlokosSysMenu;
import fr.blocblocthebloc.busutilities.world.inventory.CryptoPhoneUpgradeGUIMenu;
import fr.blocblocthebloc.busutilities.world.inventory.CryptoPhoneCoreShopPhysiqueGUIMenu;
import fr.blocblocthebloc.busutilities.world.inventory.CryptoPhoneCoreShopBanqueGUIMenu;
import fr.blocblocthebloc.busutilities.world.inventory.CalculeBlocGUIMenu;
import fr.blocblocthebloc.busutilities.world.inventory.BoutiqueticketcarteselectbankMenu;
import fr.blocblocthebloc.busutilities.world.inventory.BoutiqueTicketPhyMenu;
import fr.blocblocthebloc.busutilities.world.inventory.BoutiqueTicketCarteSelectPhyMenu;
import fr.blocblocthebloc.busutilities.world.inventory.BoutiqueTicketBankMenu;
import fr.blocblocthebloc.busutilities.world.inventory.BoutiqueCartesMenu;
import fr.blocblocthebloc.busutilities.world.inventory.BoutiqueCarteDeTransportPhyMenu;
import fr.blocblocthebloc.busutilities.world.inventory.BoutiqueCarteDeTransportBankMenu;
import fr.blocblocthebloc.busutilities.world.inventory.BanqueablokosMenu;
import fr.blocblocthebloc.busutilities.world.inventory.BABLiteMenu;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

public class BusutilitiesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BusutilitiesMod.MODID);
	public static final RegistryObject<MenuType<BanqueablokosMenu>> BANQUEABLOKOS = REGISTRY.register("banqueablokos", () -> IForgeMenuType.create(BanqueablokosMenu::new));
	public static final RegistryObject<MenuType<RetraitsBanqueMenu>> RETRAITS_BANQUE = REGISTRY.register("retraits_banque", () -> IForgeMenuType.create(RetraitsBanqueMenu::new));
	public static final RegistryObject<MenuType<DepotsBanqueMenu>> DEPOTS_BANQUE = REGISTRY.register("depots_banque", () -> IForgeMenuType.create(DepotsBanqueMenu::new));
	public static final RegistryObject<MenuType<CryptoPhoneUpgradeGUIMenu>> CRYPTO_PHONE_UPGRADE_GUI = REGISTRY.register("crypto_phone_upgrade_gui", () -> IForgeMenuType.create(CryptoPhoneUpgradeGUIMenu::new));
	public static final RegistryObject<MenuType<CryptoPhoneCoreShopPhysiqueGUIMenu>> CRYPTO_PHONE_CORE_SHOP_PHYSIQUE_GUI = REGISTRY.register("crypto_phone_core_shop_physique_gui", () -> IForgeMenuType.create(CryptoPhoneCoreShopPhysiqueGUIMenu::new));
	public static final RegistryObject<MenuType<CryptoPhoneCoreShopBanqueGUIMenu>> CRYPTO_PHONE_CORE_SHOP_BANQUE_GUI = REGISTRY.register("crypto_phone_core_shop_banque_gui", () -> IForgeMenuType.create(CryptoPhoneCoreShopBanqueGUIMenu::new));
	public static final RegistryObject<MenuType<DebugBlokosSysMenu>> DEBUG_BLOKOS_SYS = REGISTRY.register("debug_blokos_sys", () -> IForgeMenuType.create(DebugBlokosSysMenu::new));
	public static final RegistryObject<MenuType<TermsBlocGUIMenu>> TERMS_BLOC_GUI = REGISTRY.register("terms_bloc_gui", () -> IForgeMenuType.create(TermsBlocGUIMenu::new));
	public static final RegistryObject<MenuType<CalculeBlocGUIMenu>> CALCULE_BLOC_GUI = REGISTRY.register("calcule_bloc_gui", () -> IForgeMenuType.create(CalculeBlocGUIMenu::new));
	public static final RegistryObject<MenuType<BABLiteMenu>> BAB_LITE = REGISTRY.register("bab_lite", () -> IForgeMenuType.create(BABLiteMenu::new));
	public static final RegistryObject<MenuType<BoutiqueTicketCarteSelectPhyMenu>> BOUTIQUE_TICKET_CARTE_SELECT_PHY = REGISTRY.register("boutique_ticket_carte_select_phy", () -> IForgeMenuType.create(BoutiqueTicketCarteSelectPhyMenu::new));
	public static final RegistryObject<MenuType<BoutiqueticketcarteselectbankMenu>> BOUTIQUETICKETCARTESELECTBANK = REGISTRY.register("boutiqueticketcarteselectbank", () -> IForgeMenuType.create(BoutiqueticketcarteselectbankMenu::new));
	public static final RegistryObject<MenuType<BoutiqueTicketPhyMenu>> BOUTIQUE_TICKET_PHY = REGISTRY.register("boutique_ticket_phy", () -> IForgeMenuType.create(BoutiqueTicketPhyMenu::new));
	public static final RegistryObject<MenuType<BoutiqueTicketBankMenu>> BOUTIQUE_TICKET_BANK = REGISTRY.register("boutique_ticket_bank", () -> IForgeMenuType.create(BoutiqueTicketBankMenu::new));
	public static final RegistryObject<MenuType<BoutiqueCartesMenu>> BOUTIQUE_CARTES = REGISTRY.register("boutique_cartes", () -> IForgeMenuType.create(BoutiqueCartesMenu::new));
	public static final RegistryObject<MenuType<BoutiqueCarteDeTransportPhyMenu>> BOUTIQUE_CARTE_DE_TRANSPORT_PHY = REGISTRY.register("boutique_carte_de_transport_phy", () -> IForgeMenuType.create(BoutiqueCarteDeTransportPhyMenu::new));
	public static final RegistryObject<MenuType<BoutiqueCarteDeTransportBankMenu>> BOUTIQUE_CARTE_DE_TRANSPORT_BANK = REGISTRY.register("boutique_carte_de_transport_bank", () -> IForgeMenuType.create(BoutiqueCarteDeTransportBankMenu::new));
}
