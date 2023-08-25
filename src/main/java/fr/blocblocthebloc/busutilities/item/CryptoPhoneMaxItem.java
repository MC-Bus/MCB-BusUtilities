
package fr.blocblocthebloc.busutilities.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import java.util.List;

import fr.blocblocthebloc.busutilities.procedures.BlokosGenCryptoPhoneMaxProcedure;

public class CryptoPhoneMaxItem extends Item {
	public CryptoPhoneMaxItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("CryptoPhone Max"));
		list.add(Component.literal("Version 4 du CryptoPhone"));
		list.add(Component.literal("Date du firmware : 31/02/2000"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		BlokosGenCryptoPhoneMaxProcedure.execute(world, entity, itemstack);
		return ar;
	}
}
