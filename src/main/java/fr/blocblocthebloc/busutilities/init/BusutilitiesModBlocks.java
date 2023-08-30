
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.blocblocthebloc.busutilities.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import fr.blocblocthebloc.busutilities.block.TermsBlocBlock;
import fr.blocblocthebloc.busutilities.block.LigneHBlocBlock;
import fr.blocblocthebloc.busutilities.block.LigneGBlocBlock;
import fr.blocblocthebloc.busutilities.block.LigneFBlocBlock;
import fr.blocblocthebloc.busutilities.block.LigneEBlocBlock;
import fr.blocblocthebloc.busutilities.block.LigneDEBlocBlock;
import fr.blocblocthebloc.busutilities.block.LigneDBlocBlock;
import fr.blocblocthebloc.busutilities.block.LigneCblocBlock;
import fr.blocblocthebloc.busutilities.block.LigneCEBlocBlock;
import fr.blocblocthebloc.busutilities.block.LigneBEBlocBlock;
import fr.blocblocthebloc.busutilities.block.LigneBBlocBlock;
import fr.blocblocthebloc.busutilities.block.LigneAEBlocBlock;
import fr.blocblocthebloc.busutilities.block.LigneABlocBlock;
import fr.blocblocthebloc.busutilities.block.CryptoPhoneUpgradeTableBlock;
import fr.blocblocthebloc.busutilities.block.CryptoPhoneCoreShopBlock;
import fr.blocblocthebloc.busutilities.block.CryptoPhoneBaseShopBlock;
import fr.blocblocthebloc.busutilities.block.ControleBlocBlock;
import fr.blocblocthebloc.busutilities.block.CalculeBlocBlock;
import fr.blocblocthebloc.busutilities.block.BoutiqueDeTicketEtCartesBlock;
import fr.blocblocthebloc.busutilities.block.BoutiqueCarteDeTransportBlock;
import fr.blocblocthebloc.busutilities.block.BABBlocBlock;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

public class BusutilitiesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BusutilitiesMod.MODID);
	public static final RegistryObject<Block> CRYPTO_PHONE_UPGRADE_TABLE = REGISTRY.register("crypto_phone_upgrade_table", () -> new CryptoPhoneUpgradeTableBlock());
	public static final RegistryObject<Block> BAB_BLOC = REGISTRY.register("bab_bloc", () -> new BABBlocBlock());
	public static final RegistryObject<Block> TERMS_BLOC = REGISTRY.register("terms_bloc", () -> new TermsBlocBlock());
	public static final RegistryObject<Block> CALCULE_BLOC = REGISTRY.register("calcule_bloc", () -> new CalculeBlocBlock());
	public static final RegistryObject<Block> CRYPTO_PHONE_CORE_SHOP = REGISTRY.register("crypto_phone_core_shop", () -> new CryptoPhoneCoreShopBlock());
	public static final RegistryObject<Block> BOUTIQUE_DE_TICKET_ET_CARTES = REGISTRY.register("boutique_de_ticket_et_cartes", () -> new BoutiqueDeTicketEtCartesBlock());
	public static final RegistryObject<Block> BOUTIQUE_CARTE_DE_TRANSPORT = REGISTRY.register("boutique_carte_de_transport", () -> new BoutiqueCarteDeTransportBlock());
	public static final RegistryObject<Block> CRYPTO_PHONE_BASE_SHOP = REGISTRY.register("crypto_phone_base_shop", () -> new CryptoPhoneBaseShopBlock());
	public static final RegistryObject<Block> CONTROLE_BLOC = REGISTRY.register("controle_bloc", () -> new ControleBlocBlock());
	public static final RegistryObject<Block> LIGNE_A_BLOC = REGISTRY.register("ligne_a_bloc", () -> new LigneABlocBlock());
	public static final RegistryObject<Block> LIGNE_B_BLOC = REGISTRY.register("ligne_b_bloc", () -> new LigneBBlocBlock());
	public static final RegistryObject<Block> LIGNE_CBLOC = REGISTRY.register("ligne_cbloc", () -> new LigneCblocBlock());
	public static final RegistryObject<Block> LIGNE_D_BLOC = REGISTRY.register("ligne_d_bloc", () -> new LigneDBlocBlock());
	public static final RegistryObject<Block> LIGNE_E_BLOC = REGISTRY.register("ligne_e_bloc", () -> new LigneEBlocBlock());
	public static final RegistryObject<Block> LIGNE_F_BLOC = REGISTRY.register("ligne_f_bloc", () -> new LigneFBlocBlock());
	public static final RegistryObject<Block> LIGNE_G_BLOC = REGISTRY.register("ligne_g_bloc", () -> new LigneGBlocBlock());
	public static final RegistryObject<Block> LIGNE_H_BLOC = REGISTRY.register("ligne_h_bloc", () -> new LigneHBlocBlock());
	public static final RegistryObject<Block> LIGNE_AE_BLOC = REGISTRY.register("ligne_ae_bloc", () -> new LigneAEBlocBlock());
	public static final RegistryObject<Block> LIGNE_BE_BLOC = REGISTRY.register("ligne_be_bloc", () -> new LigneBEBlocBlock());
	public static final RegistryObject<Block> LIGNE_CE_BLOC = REGISTRY.register("ligne_ce_bloc", () -> new LigneCEBlocBlock());
	public static final RegistryObject<Block> LIGNE_DE_BLOC = REGISTRY.register("ligne_de_bloc", () -> new LigneDEBlocBlock());
}
