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

import fr.blocblocthebloc.busutilities.world.inventory.BoutiqueTicketCarteSelectPhyMenu;
import fr.blocblocthebloc.busutilities.network.BoutiqueTicketCarteSelectPhyButtonMessage;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class BoutiqueTicketCarteSelectPhyScreen extends AbstractContainerScreen<BoutiqueTicketCarteSelectPhyMenu> {
	private final static HashMap<String, Object> guistate = BoutiqueTicketCarteSelectPhyMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_acheter_des_tickets;
	Button button_acheter_des_cartes;

	public BoutiqueTicketCarteSelectPhyScreen(BoutiqueTicketCarteSelectPhyMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("busutilities:textures/screens/boutique_ticket_carte_select_phy.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_ticket_carte_select_phy.label_boutique_de_tickets"), 37, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_ticket_carte_select_phy.label_et_cartes"), 61, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_ticket_carte_select_phy.label_passer_en_paiement_bancaire"), 17, 118, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_ticket_carte_select_phy.label_pour_acheter_des_cartes"), 27, 128, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_acheter_des_tickets = Button.builder(Component.translatable("gui.busutilities.boutique_ticket_carte_select_phy.button_acheter_des_tickets"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new BoutiqueTicketCarteSelectPhyButtonMessage(0, x, y, z));
				BoutiqueTicketCarteSelectPhyButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 26, this.topPos + 43, 124, 20).build();
		guistate.put("button:button_acheter_des_tickets", button_acheter_des_tickets);
		this.addRenderableWidget(button_acheter_des_tickets);
		button_acheter_des_cartes = Button.builder(Component.translatable("gui.busutilities.boutique_ticket_carte_select_phy.button_acheter_des_cartes"), e -> {
		}).bounds(this.leftPos + 28, this.topPos + 97, 119, 20).build();
		guistate.put("button:button_acheter_des_cartes", button_acheter_des_cartes);
		this.addRenderableWidget(button_acheter_des_cartes);
	}
}
