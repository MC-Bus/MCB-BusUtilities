
package fr.blocblocthebloc.busutilities.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

import fr.blocblocthebloc.busutilities.world.inventory.BoutiqueTicketPhyMenu;
import fr.blocblocthebloc.busutilities.procedures.BoutiqueTicketVente3VProcedure;
import fr.blocblocthebloc.busutilities.procedures.BoutiqueTicketVente1VProcedure;
import fr.blocblocthebloc.busutilities.procedures.BoutiqueTicketVente10VProcedure;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BoutiqueTicketPhyButtonMessage {
	private final int buttonID, x, y, z;

	public BoutiqueTicketPhyButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BoutiqueTicketPhyButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BoutiqueTicketPhyButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BoutiqueTicketPhyButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = BoutiqueTicketPhyMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			BoutiqueTicketVente1VProcedure.execute(entity);
		}
		if (buttonID == 1) {

			BoutiqueTicketVente3VProcedure.execute(entity);
		}
		if (buttonID == 2) {

			BoutiqueTicketVente10VProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		BusutilitiesMod.addNetworkMessage(BoutiqueTicketPhyButtonMessage.class, BoutiqueTicketPhyButtonMessage::buffer, BoutiqueTicketPhyButtonMessage::new, BoutiqueTicketPhyButtonMessage::handler);
	}
}
