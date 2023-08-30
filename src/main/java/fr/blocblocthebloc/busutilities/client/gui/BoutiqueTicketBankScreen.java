package fr.blocblocthebloc.busutilities.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import fr.blocblocthebloc.busutilities.world.inventory.BoutiqueTicketBankMenu;
import fr.blocblocthebloc.busutilities.procedures.InfoBAB1Procedure;
import fr.blocblocthebloc.busutilities.procedures.InfoBAB0Procedure;
import fr.blocblocthebloc.busutilities.network.BoutiqueTicketBankButtonMessage;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class BoutiqueTicketBankScreen extends AbstractContainerScreen<BoutiqueTicketBankMenu> {
	private final static HashMap<String, Object> guistate = BoutiqueTicketBankMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_ticket_1_voyage;
	Button button_ticket_3_voyages;
	Button button_ticket_10_voyages;

	public BoutiqueTicketBankScreen(BoutiqueTicketBankMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("busutilities:textures/screens/boutique_ticket_bank.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_ticket_bank.label_boutique_de_tickets"), 39, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_ticket_bank.label_ticket_1_voyage_1_b"), -116, 121, -39322, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_ticket_bank.label_ticket_3_voyages_4_b"), -118, 142, -205, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_ticket_bank.label_ticket_10_voyages_11b"), -121, 163, -16750849, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_ticket_bank.label_bienvenue"), 61, -33, -1, false);
		guiGraphics.drawString(this.font,

				InfoBAB0Procedure.execute(entity), 69, -21, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_ticket_bank.label_vous_avez"), 207, 59, -1, false);
		guiGraphics.drawString(this.font,

				InfoBAB1Procedure.execute(entity), 217, 74, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_ticket_bank.label_blokos"), 221, 92, -1, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_ticket_1_voyage = Button.builder(Component.translatable("gui.busutilities.boutique_ticket_bank.button_ticket_1_voyage"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new BoutiqueTicketBankButtonMessage(0, x, y, z));
				BoutiqueTicketBankButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -114, this.topPos + 7, 103, 20).build();
		guistate.put("button:button_ticket_1_voyage", button_ticket_1_voyage);
		this.addRenderableWidget(button_ticket_1_voyage);
		button_ticket_3_voyages = Button.builder(Component.translatable("gui.busutilities.boutique_ticket_bank.button_ticket_3_voyages"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new BoutiqueTicketBankButtonMessage(1, x, y, z));
				BoutiqueTicketBankButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -117, this.topPos + 46, 108, 20).build();
		guistate.put("button:button_ticket_3_voyages", button_ticket_3_voyages);
		this.addRenderableWidget(button_ticket_3_voyages);
		button_ticket_10_voyages = Button.builder(Component.translatable("gui.busutilities.boutique_ticket_bank.button_ticket_10_voyages"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new BoutiqueTicketBankButtonMessage(2, x, y, z));
				BoutiqueTicketBankButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -119, this.topPos + 83, 113, 20).build();
		guistate.put("button:button_ticket_10_voyages", button_ticket_10_voyages);
		this.addRenderableWidget(button_ticket_10_voyages);
	}
}
