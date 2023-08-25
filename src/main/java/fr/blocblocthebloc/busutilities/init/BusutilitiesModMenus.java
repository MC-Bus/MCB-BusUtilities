
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fr.blocblocthebloc.busutilities.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import fr.blocblocthebloc.busutilities.world.inventory.RetraitsBanqueMenu;
import fr.blocblocthebloc.busutilities.world.inventory.DepotsBanqueMenu;
import fr.blocblocthebloc.busutilities.world.inventory.CryptoPhoneUpgradeGUIMenu;
import fr.blocblocthebloc.busutilities.world.inventory.BanqueablokosMenu;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

public class BusutilitiesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BusutilitiesMod.MODID);
	public static final RegistryObject<MenuType<BanqueablokosMenu>> BANQUEABLOKOS = REGISTRY.register("banqueablokos", () -> IForgeMenuType.create(BanqueablokosMenu::new));
	public static final RegistryObject<MenuType<RetraitsBanqueMenu>> RETRAITS_BANQUE = REGISTRY.register("retraits_banque", () -> IForgeMenuType.create(RetraitsBanqueMenu::new));
	public static final RegistryObject<MenuType<DepotsBanqueMenu>> DEPOTS_BANQUE = REGISTRY.register("depots_banque", () -> IForgeMenuType.create(DepotsBanqueMenu::new));
	public static final RegistryObject<MenuType<CryptoPhoneUpgradeGUIMenu>> CRYPTO_PHONE_UPGRADE_GUI = REGISTRY.register("crypto_phone_upgrade_gui", () -> IForgeMenuType.create(CryptoPhoneUpgradeGUIMenu::new));
}
