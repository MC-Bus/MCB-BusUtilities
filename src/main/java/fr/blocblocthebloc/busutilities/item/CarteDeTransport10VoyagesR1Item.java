
package fr.blocblocthebloc.busutilities.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class CarteDeTransport10VoyagesR1Item extends Item {
	public CarteDeTransport10VoyagesR1Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Carte de transport nominative"));
		list.add(Component.literal("Contenue de la carte : 1 Voyages sur 10"));
		list.add(Component.literal("Pensez \u00E0 la recharg\u00E9 \u00E0 la gare !"));
	}
}
