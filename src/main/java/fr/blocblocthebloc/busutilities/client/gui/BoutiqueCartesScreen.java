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

import fr.blocblocthebloc.busutilities.world.inventory.BoutiqueCartesMenu;
import fr.blocblocthebloc.busutilities.procedures.InfoBAB1Procedure;
import fr.blocblocthebloc.busutilities.procedures.InfoBAB0Procedure;
import fr.blocblocthebloc.busutilities.network.BoutiqueCartesButtonMessage;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class BoutiqueCartesScreen extends AbstractContainerScreen<BoutiqueCartesMenu> {
	private final static HashMap<String, Object> guistate = BoutiqueCartesMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_acheter_10_voyages;
	Button button_acheter_essentiel;
	Button button_acheter_illimite;

	public BoutiqueCartesScreen(BoutiqueCartesMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("busutilities:textures/screens/boutique_cartes.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_cartes.label_boutique_de_tickets"), 39, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_cartes.label_ticket_1_voyage_1_b"), -124, 119, -16724890, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_cartes.label_ticket_3_voyages_4_b"), -121, 140, -205, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_cartes.label_ticket_10_voyages_11b"), -123, 162, -16750849, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_cartes.label_bienvenue"), 61, -33, -1, false);
		guiGraphics.drawString(this.font,

				InfoBAB0Procedure.execute(entity), 69, -21, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_cartes.label_vous_avez"), 207, 59, -1, false);
		guiGraphics.drawString(this.font,

				InfoBAB1Procedure.execute(entity), 217, 74, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.boutique_cartes.label_blokos"), 221, 92, -1, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_acheter_10_voyages = Button.builder(Component.translatable("gui.busutilities.boutique_cartes.button_acheter_10_voyages"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new BoutiqueCartesButtonMessage(0, x, y, z));
				BoutiqueCartesButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -122, this.topPos + 12, 119, 20).build();
		guistate.put("button:button_acheter_10_voyages", button_acheter_10_voyages);
		this.addRenderableWidget(button_acheter_10_voyages);
		button_acheter_essentiel = Button.builder(Component.translatable("gui.busutilities.boutique_cartes.button_acheter_essentiel"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new BoutiqueCartesButtonMessage(1, x, y, z));
				BoutiqueCartesButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -119, this.topPos + 43, 114, 20).build();
		guistate.put("button:button_acheter_essentiel", button_acheter_essentiel);
		this.addRenderableWidget(button_acheter_essentiel);
		button_acheter_illimite = Button.builder(Component.translatable("gui.busutilities.boutique_cartes.button_acheter_illimite"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new BoutiqueCartesButtonMessage(2, x, y, z));
				BoutiqueCartesButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + -115, this.topPos + 72, 108, 20).build();
		guistate.put("button:button_acheter_illimite", button_acheter_illimite);
		this.addRenderableWidget(button_acheter_illimite);
	}
}
