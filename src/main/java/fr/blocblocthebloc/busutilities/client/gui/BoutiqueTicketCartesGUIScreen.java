package fr.blocblocthebloc.busutilities.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import java.util.HashMap;

import fr.blocblocthebloc.busutilities.world.inventory.BoutiqueTicketCartesGUIMenu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BoutiqueTicketCartesGUIScreen extends AbstractContainerScreen<BoutiqueTicketCartesGUIMenu> {
	private final static HashMap<String, Object> guistate = BoutiqueTicketCartesGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_liste_des_tickets;
	Button button_liste_des_cartes;
	Button button_switch;

	public BoutiqueTicketCartesGUIScreen(BoutiqueTicketCartesGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("busutilities:textures/screens/boutique_ticket_cartes_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.busutilities.boutique_ticket_cartes_gui.label_boutique_de_tickets"), 38, 6, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.boutique_ticket_cartes_gui.label_et_cartes_de_transport"), 31, 17, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.boutique_ticket_cartes_gui.label_mode_de_paiement_physique"), -120, -29, -1);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.boutique_ticket_cartes_gui.label_indisponible_en"), 46, 119, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.boutique_ticket_cartes_gui.label_paiement_physique"), 40, 128, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.boutique_ticket_cartes_gui.label_passer_en_paiement"), -108, 86, -1);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.boutique_ticket_cartes_gui.label_bancaire"), -83, 103, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_liste_des_tickets = Button.builder(Component.translatable("gui.busutilities.boutique_ticket_cartes_gui.button_liste_des_tickets"), e -> {
		}).bounds(this.leftPos + 29, this.topPos + 45, 113, 20).build();
		guistate.put("button:button_liste_des_tickets", button_liste_des_tickets);
		this.addRenderableWidget(button_liste_des_tickets);
		button_liste_des_cartes = Button.builder(Component.translatable("gui.busutilities.boutique_ticket_cartes_gui.button_liste_des_cartes"), e -> {
		}).bounds(this.leftPos + 32, this.topPos + 98, 108, 20).build();
		guistate.put("button:button_liste_des_cartes", button_liste_des_cartes);
		this.addRenderableWidget(button_liste_des_cartes);
		button_switch = Button.builder(Component.translatable("gui.busutilities.boutique_ticket_cartes_gui.button_switch"), e -> {
		}).bounds(this.leftPos + -89, this.topPos + 121, 56, 20).build();
		guistate.put("button:button_switch", button_switch);
		this.addRenderableWidget(button_switch);
	}
}
