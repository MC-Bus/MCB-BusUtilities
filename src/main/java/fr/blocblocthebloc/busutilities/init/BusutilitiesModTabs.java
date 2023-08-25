
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
				builder -> builder.title(Component.translatable("item_group.busutilities.bus_utilities_creatif_tab")).icon(() -> new ItemStack(BusutilitiesModItems.BLOKOS.get())).displayItems((parameters, tabData) -> {
					tabData.accept(BusutilitiesModItems.BLOKOS.get());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_BASE.get());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_MINI.get());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_ADVENCE.get());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_MAX.get());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_PRO.get());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_ELITE.get());
					tabData.accept(BusutilitiesModBlocks.CRYPTO_PHONE_UPGRADE_TABLE.get().asItem());
					tabData.accept(BusutilitiesModItems.CRYPTO_PHONE_MINICORE.get());
				})

		);
	}
}
