
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

import fr.blocblocthebloc.busutilities.item.CryptoPhoneProItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneMinicoreItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneMiniItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneMaxItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneEliteItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneBaseItem;
import fr.blocblocthebloc.busutilities.item.CryptoPhoneAdvenceItem;
import fr.blocblocthebloc.busutilities.item.BlokosItem;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

public class BusutilitiesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BusutilitiesMod.MODID);
	public static final RegistryObject<Item> BLOKOS = REGISTRY.register("blokos", () -> new BlokosItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_BASE = REGISTRY.register("crypto_phone_base", () -> new CryptoPhoneBaseItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_MINI = REGISTRY.register("crypto_phone_mini", () -> new CryptoPhoneMiniItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_ADVENCE = REGISTRY.register("crypto_phone_advence", () -> new CryptoPhoneAdvenceItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_MAX = REGISTRY.register("crypto_phone_max", () -> new CryptoPhoneMaxItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_PRO = REGISTRY.register("crypto_phone_pro", () -> new CryptoPhoneProItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_ELITE = REGISTRY.register("crypto_phone_elite", () -> new CryptoPhoneEliteItem());
	public static final RegistryObject<Item> CRYPTO_PHONE_UPGRADE_TABLE = block(BusutilitiesModBlocks.CRYPTO_PHONE_UPGRADE_TABLE);
	public static final RegistryObject<Item> CRYPTO_PHONE_MINICORE = REGISTRY.register("crypto_phone_minicore", () -> new CryptoPhoneMinicoreItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
