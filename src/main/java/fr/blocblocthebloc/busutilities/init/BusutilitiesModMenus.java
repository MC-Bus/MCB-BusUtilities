
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
import fr.blocblocthebloc.busutilities.world.inventory.BoutiqueTicketCartesGUIMenu;
import fr.blocblocthebloc.busutilities.world.inventory.BoutiqueTicketCartesBankModeGUIMenu;
import fr.blocblocthebloc.busutilities.world.inventory.BanqueablokosMenu;
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
	public static final RegistryObject<MenuType<BoutiqueTicketCartesGUIMenu>> BOUTIQUE_TICKET_CARTES_GUI = REGISTRY.register("boutique_ticket_cartes_gui", () -> IForgeMenuType.create(BoutiqueTicketCartesGUIMenu::new));
	public static final RegistryObject<MenuType<BoutiqueTicketCartesBankModeGUIMenu>> BOUTIQUE_TICKET_CARTES_BANK_MODE_GUI = REGISTRY.register("boutique_ticket_cartes_bank_mode_gui",
			() -> IForgeMenuType.create(BoutiqueTicketCartesBankModeGUIMenu::new));
}
