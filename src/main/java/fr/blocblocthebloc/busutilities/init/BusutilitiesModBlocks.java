
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.blocblocthebloc.busutilities.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import fr.blocblocthebloc.busutilities.block.CryptoPhoneUpgradeTableBlock;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

public class BusutilitiesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BusutilitiesMod.MODID);
	public static final RegistryObject<Block> CRYPTO_PHONE_UPGRADE_TABLE = REGISTRY.register("crypto_phone_upgrade_table", () -> new CryptoPhoneUpgradeTableBlock());
}
