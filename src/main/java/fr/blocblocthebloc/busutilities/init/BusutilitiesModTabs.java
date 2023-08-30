
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.blocblocthebloc.busutilities.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BusutilitiesModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("busutilities", "bus_utilities_creatif_tab"),
				builder -> builder.title(Component.translatable("item_group.busutilities.bus_utilities_creatif_tab")).icon(() -> new ItemStack(BusutilitiesModItems.TICKET_VIERGE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(BusutilitiesModBlocks.CONTROLE_BLOC.get().asItem());
					tabData.accept(BusutilitiesModItems.TICKET_VIERGE.get());
					tabData.accept(BusutilitiesModItems.TICKET_1_VOYAGE.get());
					tabData.accept(BusutilitiesModItems.TICKET_3_VOYAGES.get());
					tabData.accept(BusutilitiesModItems.TICKET_10_VOYAGES.get());
					tabData.accept(BusutilitiesModItems.CARTE_DE_TRANSPORT.get());
					tabData.accept(BusutilitiesModItems.CARTE_DE_TRANSPORT_10_VOYAGES.get());
					tabData.accept(BusutilitiesModItems.CARTE_DE_TRANSPORT_ESSENTIEL.get());
					tabData.accept(BusutilitiesModItems.CARTE_DE_TRANSPORT_ILLIMITE.get());
					tabData.accept(BusutilitiesModBlocks.LIGNE_A_BLOC.get().asItem());
					tabData.accept(BusutilitiesModBlocks.LIGNE_B_BLOC.get().asItem());
					tabData.accept(BusutilitiesModBlocks.LIGNE_CBLOC.get().asItem());
					tabData.accept(BusutilitiesModBlocks.LIGNE_D_BLOC.get().asItem());
					tabData.accept(BusutilitiesModBlocks.LIGNE_E_BLOC.get().asItem());
					tabData.accept(BusutilitiesModBlocks.LIGNE_F_BLOC.get().asItem());
					tabData.accept(BusutilitiesModBlocks.LIGNE_G_BLOC.get().asItem());
					tabData.accept(BusutilitiesModBlocks.LIGNE_H_BLOC.get().asItem());
					tabData.accept(BusutilitiesModBlocks.LIGNE_AE_BLOC.get().asItem());
					tabData.accept(BusutilitiesModBlocks.LIGNE_BE_BLOC.get().asItem());
					tabData.accept(BusutilitiesModBlocks.LIGNE_CE_BLOC.get().asItem());
					tabData.accept(BusutilitiesModBlocks.LIGNE_DE_BLOC.get().asItem());
					tabData.accept(BusutilitiesModItems.LIGNE_A_ITEM.get());
					tabData.accept(BusutilitiesModItems.LIGNE_B_ITEM.get());
					tabData.accept(BusutilitiesModItems.LIGNE_C_ITEM.get());
					tabData.accept(BusutilitiesModItems.LIGNE_D_ITEM.get());
					tabData.accept(BusutilitiesModItems.LIGNE_E_ITEM.get());
					tabData.accept(BusutilitiesModItems.LIGNE_F_ITEM.get());
					tabData.accept(BusutilitiesModItems.LIGNE_G_ITEM.get());
					tabData.accept(BusutilitiesModItems.LIGNE_H_ITEM.get());
					tabData.accept(BusutilitiesModItems.LIGNE_AE_ITEM.get());
					tabData.accept(BusutilitiesModItems.LIGNE_BE_ITEM.get());
					tabData.accept(BusutilitiesModItems.LIGNE_CE_ITEM.get());
					tabData.accept(BusutilitiesModItems.LIGNE_DE_ITEM.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("busutilities", "blokos_money_system"),
				builder -> builder.title(Component.translatable("item_group.busutilities.blokos_money_system")).icon(() -> new ItemStack(BusutilitiesModItems.BLOKOS.get())).displayItems((parameters, tabData) -> {
					tabData.accept(BusutilitiesModItems.BLOKOS.get());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_BASE.get());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_MINI.get());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_ADVENCE.get());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_MAX.get());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_PRO.get());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_ELITE.get());
					tabData.accept(BusutilitiesModBlocks.CRYPTO_PHONE_CORE_SHOP.get().asItem());
					tabData.accept(BusutilitiesModBlocks.CRYPTO_PHONE_BASE_SHOP.get().asItem());
					tabData.accept(BusutilitiesModBlocks.TERMS_BLOC.get().asItem());
					tabData.accept(BusutilitiesModBlocks.CALCULE_BLOC.get().asItem());
					tabData.accept(BusutilitiesModBlocks.BOUTIQUE_DE_TICKET_ET_CARTES.get().asItem());
					tabData.accept(BusutilitiesModBlocks.BAB_BLOC.get().asItem());
					tabData.accept(BusutilitiesModBlocks.BOUTIQUE_CARTE_DE_TRANSPORT.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("busutilities", "bus_utilisties_tab"),
				builder -> builder.title(Component.translatable("item_group.busutilities.bus_utilisties_tab")).icon(() -> new ItemStack(BusutilitiesModItems.CRYPTO_PHONE_PRO_CORE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(BusutilitiesModBlocks.CRYPTO_PHONE_UPGRADE_TABLE.get().asItem());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_MINICORE.get());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_ADVENCE_CORE.get());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_MAX_CORE.get());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_PRO_CORE.get());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_ELITE_CORE.get());
				})

		);
	}
}
