
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.blocblocthebloc.busutilities.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import fr.blocblocthebloc.busutilities.item.TicketViergeItem;
import fr.blocblocthebloc.busutilities.item.Ticket3VoyagesItem;
import fr.blocblocthebloc.busutilities.item.Ticket3Voyages2RItem;
import fr.blocblocthebloc.busutilities.item.Ticket3Voyages1RItem;
import fr.blocblocthebloc.busutilities.item.Ticket1VoyageItem;
import fr.blocblocthebloc.busutilities.item.Ticket10VoyagesR9Item;
import fr.blocblocthebloc.busutilities.item.Ticket10VoyagesR8Item;
import fr.blocblocthebloc.busutilities.item.Ticket10VoyagesR7Item;
import fr.blocblocthebloc.busutilities.item.Ticket10VoyagesR6Item;
import fr.blocblocthebloc.busutilities.item.Ticket10VoyagesR5Item;
import fr.blocblocthebloc.busutilities.item.Ticket10VoyagesR4Item;
import fr.blocblocthebloc.busutilities.item.Ticket10VoyagesR3Item;
import fr.blocblocthebloc.busutilities.item.Ticket10VoyagesR2Item;
import fr.blocblocthebloc.busutilities.item.Ticket10VoyagesR1Item;
import fr.blocblocthebloc.busutilities.item.Ticket10VoyagesItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneProItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneProCoreItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneMinicoreItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneMiniItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneMaxItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneMaxCoreItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneEliteItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneEliteCoreItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneBaseItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneAdvenceItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneAdvenceCoreItem;
import fr.blocblocthebloc.busutilities.item.CarteDeTransportItem;
import fr.blocblocthebloc.busutilities.item.CarteDeTransportIllimiteItem;
import fr.blocblocthebloc.busutilities.item.CarteDeTransportEssentielR4Item;
import fr.blocblocthebloc.busutilities.item.CarteDeTransportEssentielR3Item;
import fr.blocblocthebloc.busutilities.item.CarteDeTransportEssentielR2Item;
import fr.blocblocthebloc.busutilities.item.CarteDeTransportEssentielR1Item;
import fr.blocblocthebloc.busutilities.item.CarteDeTransportEssentielItem;
import fr.blocblocthebloc.busutilities.item.CarteDeTransport10VoyagesR9Item;
import fr.blocblocthebloc.busutilities.item.CarteDeTransport10VoyagesR8Item;
import fr.blocblocthebloc.busutilities.item.CarteDeTransport10VoyagesR7Item;
import fr.blocblocthebloc.busutilities.item.CarteDeTransport10VoyagesR6Item;
import fr.blocblocthebloc.busutilities.item.CarteDeTransport10VoyagesR5Item;
import fr.blocblocthebloc.busutilities.item.CarteDeTransport10VoyagesR4Item;
import fr.blocblocthebloc.busutilities.item.CarteDeTransport10VoyagesR3Item;
import fr.blocblocthebloc.busutilities.item.CarteDeTransport10VoyagesR2Item;
import fr.blocblocthebloc.busutilities.item.CarteDeTransport10VoyagesR1Item;
import fr.blocblocthebloc.busutilities.item.CarteDeTransport10VoyagesItem;
import fr.blocblocthebloc.busutilities.item.BlokosItem;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

public class BusutilitiesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BusutilitiesMod.MODID);
	public static final RegistryObject<Item> CRYPTO_PHONE_UPGRADE_TABLE = block(BusutilitiesModBlocks.CRYPTO_PHONE_UPGRADE_TABLE);
	public static final RegistryObject<Item> CRYPTO_PHONE_MINICORE = REGISTRY.register("crypto_phone_minicore", () -> new CryptoPhoneMinicoreItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_ADVENCE_CORE = REGISTRY.register("crypto_phone_advence_core", () -> new CryptoPhoneAdvenceCoreItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_MAX_CORE = REGISTRY.register("crypto_phone_max_core", () -> new CryptoPhoneMaxCoreItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_PRO_CORE = REGISTRY.register("crypto_phone_pro_core", () -> new CryptoPhoneProCoreItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_ELITE_CORE = REGISTRY.register("crypto_phone_elite_core", () -> new CryptoPhoneEliteCoreItem());
	public static final RegistryObject<Item> BLOKOS = REGISTRY.register("blokos", () -> new BlokosItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_BASE = REGISTRY.register("crypto_phone_base", () -> new CryptoPhoneBaseItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_MINI = REGISTRY.register("crypto_phone_mini", () -> new CryptoPhoneMiniItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_ADVENCE = REGISTRY.register("crypto_phone_advence", () -> new CryptoPhoneAdvenceItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_MAX = REGISTRY.register("crypto_phone_max", () -> new CryptoPhoneMaxItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_PRO = REGISTRY.register("crypto_phone_pro", () -> new CryptoPhoneProItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_ELITE = REGISTRY.register("crypto_phone_elite", () -> new CryptoPhoneEliteItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_CORE_SHOP = block(BusutilitiesModBlocks.CRYPTO_PHONE_CORE_SHOP);
	public static final RegistryObject<Item> CRYPTO_PHONE_BASE_SHOP = block(BusutilitiesModBlocks.CRYPTO_PHONE_BASE_SHOP);
	public static final RegistryObject<Item> TERMS_BLOC = block(BusutilitiesModBlocks.TERMS_BLOC);
	public static final RegistryObject<Item> CALCULE_BLOC = block(BusutilitiesModBlocks.CALCULE_BLOC);
	public static final RegistryObject<Item> CONTROLE_BLOC = block(BusutilitiesModBlocks.CONTROLE_BLOC);
	public static final RegistryObject<Item> TICKET_VIERGE = REGISTRY.register("ticket_vierge", () -> new TicketViergeItem());
	public static final RegistryObject<Item> TICKET_1_VOYAGE = REGISTRY.register("ticket_1_voyage", () -> new Ticket1VoyageItem());
	public static final RegistryObject<Item> TICKET_3_VOYAGES = REGISTRY.register("ticket_3_voyages", () -> new Ticket3VoyagesItem());
	public static final RegistryObject<Item> TICKET_10_VOYAGES = REGISTRY.register("ticket_10_voyages", () -> new Ticket10VoyagesItem());
	public static final RegistryObject<Item> TICKET_3_VOYAGES_2_R = REGISTRY.register("ticket_3_voyages_2_r", () -> new Ticket3Voyages2RItem());
	public static final RegistryObject<Item> TICKET_3_VOYAGES_1_R = REGISTRY.register("ticket_3_voyages_1_r", () -> new Ticket3Voyages1RItem());
	public static final RegistryObject<Item> TICKET_10_VOYAGES_R_9 = REGISTRY.register("ticket_10_voyages_r_9", () -> new Ticket10VoyagesR9Item());
	public static final RegistryObject<Item> TICKET_10_VOYAGES_R_8 = REGISTRY.register("ticket_10_voyages_r_8", () -> new Ticket10VoyagesR8Item());
	public static final RegistryObject<Item> TICKET_10_VOYAGES_R_7 = REGISTRY.register("ticket_10_voyages_r_7", () -> new Ticket10VoyagesR7Item());
	public static final RegistryObject<Item> TICKET_10_VOYAGES_R_6 = REGISTRY.register("ticket_10_voyages_r_6", () -> new Ticket10VoyagesR6Item());
	public static final RegistryObject<Item> TICKET_10_VOYAGES_R_5 = REGISTRY.register("ticket_10_voyages_r_5", () -> new Ticket10VoyagesR5Item());
	public static final RegistryObject<Item> TICKET_10_VOYAGES_R_4 = REGISTRY.register("ticket_10_voyages_r_4", () -> new Ticket10VoyagesR4Item());
	public static final RegistryObject<Item> TICKET_10_VOYAGES_R_3 = REGISTRY.register("ticket_10_voyages_r_3", () -> new Ticket10VoyagesR3Item());
	public static final RegistryObject<Item> TICKET_10_VOYAGES_R_2 = REGISTRY.register("ticket_10_voyages_r_2", () -> new Ticket10VoyagesR2Item());
	public static final RegistryObject<Item> TICKET_10_VOYAGES_R_1 = REGISTRY.register("ticket_10_voyages_r_1", () -> new Ticket10VoyagesR1Item());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT = REGISTRY.register("carte_de_transport", () -> new CarteDeTransportItem());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT_10_VOYAGES = REGISTRY.register("carte_de_transport_10_voyages", () -> new CarteDeTransport10VoyagesItem());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT_10_VOYAGES_R_9 = REGISTRY.register("carte_de_transport_10_voyages_r_9", () -> new CarteDeTransport10VoyagesR9Item());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT_10_VOYAGES_R_8 = REGISTRY.register("carte_de_transport_10_voyages_r_8", () -> new CarteDeTransport10VoyagesR8Item());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT_10_VOYAGES_R_7 = REGISTRY.register("carte_de_transport_10_voyages_r_7", () -> new CarteDeTransport10VoyagesR7Item());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT_10_VOYAGES_R_6 = REGISTRY.register("carte_de_transport_10_voyages_r_6", () -> new CarteDeTransport10VoyagesR6Item());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT_10_VOYAGES_R_5 = REGISTRY.register("carte_de_transport_10_voyages_r_5", () -> new CarteDeTransport10VoyagesR5Item());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT_10_VOYAGES_R_4 = REGISTRY.register("carte_de_transport_10_voyages_r_4", () -> new CarteDeTransport10VoyagesR4Item());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT_10_VOYAGES_R_3 = REGISTRY.register("carte_de_transport_10_voyages_r_3", () -> new CarteDeTransport10VoyagesR3Item());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT_10_VOYAGES_R_2 = REGISTRY.register("carte_de_transport_10_voyages_r_2", () -> new CarteDeTransport10VoyagesR2Item());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT_10_VOYAGES_R_1 = REGISTRY.register("carte_de_transport_10_voyages_r_1", () -> new CarteDeTransport10VoyagesR1Item());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT_ESSENTIEL = REGISTRY.register("carte_de_transport_essentiel", () -> new CarteDeTransportEssentielItem());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT_ESSENTIEL_R_4 = REGISTRY.register("carte_de_transport_essentiel_r_4", () -> new CarteDeTransportEssentielR4Item());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT_ESSENTIEL_R_3 = REGISTRY.register("carte_de_transport_essentiel_r_3", () -> new CarteDeTransportEssentielR3Item());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT_ESSENTIEL_R_2 = REGISTRY.register("carte_de_transport_essentiel_r_2", () -> new CarteDeTransportEssentielR2Item());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT_ESSENTIEL_R_1 = REGISTRY.register("carte_de_transport_essentiel_r_1", () -> new CarteDeTransportEssentielR1Item());
	public static final RegistryObject<Item> CARTE_DE_TRANSPORT_ILLIMITE = REGISTRY.register("carte_de_transport_illimite", () -> new CarteDeTransportIllimiteItem());
	public static final RegistryObject<Item> BOUTIQUE_DE_TICKET_ET_CARTES = block(BusutilitiesModBlocks.BOUTIQUE_DE_TICKET_ET_CARTES);
	public static final RegistryObject<Item> BAB_BLOC = block(BusutilitiesModBlocks.BAB_BLOC);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
