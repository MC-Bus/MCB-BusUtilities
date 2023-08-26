
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.blocblocthebloc.busutilities.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import fr.blocblocthebloc.busutilities.block.TermsBlocBlock;
import fr.blocblocthebloc.busutilities.block.CryptoPhoneUpgradeTableBlock;
import fr.blocblocthebloc.busutilities.block.CryptoPhoneCoreShopBlock;
import fr.blocblocthebloc.busutilities.block.CryptoPhoneBaseShopBlock;
import fr.blocblocthebloc.busutilities.block.ControleBlocBlock;
import fr.blocblocthebloc.busutilities.block.CalculeBlocBlock;
import fr.blocblocthebloc.busutilities.block.BoutiqueDeTicketEtCartesBlock;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

public class BusutilitiesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BusutilitiesMod.MODID);
	public static final RegistryObject<Block> CRYPTO_PHONE_UPGRADE_TABLE = REGISTRY.register("crypto_phone_upgrade_table", () -> new CryptoPhoneUpgradeTableBlock());
	public static final RegistryObject<Block> CRYPTO_PHONE_CORE_SHOP = REGISTRY.register("crypto_phone_core_shop", () -> new CryptoPhoneCoreShopBlock());
	public static final RegistryObject<Block> CRYPTO_PHONE_BASE_SHOP = REGISTRY.register("crypto_phone_base_shop", () -> new CryptoPhoneBaseShopBlock());
	public static final RegistryObject<Block> TERMS_BLOC = REGISTRY.register("terms_bloc", () -> new TermsBlocBlock());
	public static final RegistryObject<Block> CALCULE_BLOC = REGISTRY.register("calcule_bloc", () -> new CalculeBlocBlock());
	public static final RegistryObject<Block> CONTROLE_BLOC = REGISTRY.register("controle_bloc", () -> new ControleBlocBlock());
	public static final RegistryObject<Block> BOUTIQUE_DE_TICKET_ET_CARTES = REGISTRY.register("boutique_de_ticket_et_cartes", () -> new BoutiqueDeTicketEtCartesBlock());
}
