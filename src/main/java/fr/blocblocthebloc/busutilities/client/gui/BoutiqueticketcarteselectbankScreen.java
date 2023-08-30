package fr.blocblocthebloc.busutilities.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import java.util.HashMap;

import fr.blocblocthebloc.busutilities.world.inventory.BoutiqueticketcarteselectbankMenu;
import fr.blocblocthebloc.busutilities.procedures.InfoBAB1Procedure;
import fr.blocblocthebloc.busutilities.procedures.InfoBAB0Procedure;
import fr.blocblocthebloc.busutilities.network.BoutiqueticketcarteselectbankButtonMessage;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BoutiqueticketcarteselectbankScreen extends AbstractContainerScreen<BoutiqueticketcarteselectbankMenu> {
	private final static HashMap<String, Object> guistate = BoutiqueticketcarteselectbankMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_acheter_des_tickets;
	Button button_acheter_des_cartes;

	public BoutiqueticketcarteselectbankScreen(BoutiqueticketcarteselectbankMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("busutilities:textures/screens/boutiqueticketcarteselectbank.png");

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
		this.font.draw(poseStack, Component.translatable("gui.busutilities.boutiqueticketcarteselectbank.label_boutique_de_tickets"), 37, 5, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.boutiqueticketcarteselectbank.label_et_cartes"), 61, 16, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.boutiqueticketcarteselectbank.label_bienvenue"), 62, -34, -1);
		this.font.draw(poseStack,

				InfoBAB0Procedure.execute(entity), 69, -20, -1);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.boutiqueticketcarteselectbank.label_vous_avez"), 205, 60, -1);
		this.font.draw(poseStack,

				InfoBAB1Procedure.execute(entity), 215, 78, -1);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.boutiqueticketcarteselectbank.label_blokos"), 216, 101, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_acheter_des_tickets = Button.builder(Component.translatable("gui.busutilities.boutiqueticketcarteselectbank.button_acheter_des_tickets"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new BoutiqueticketcarteselectbankButtonMessage(0, x, y, z));
				BoutiqueticketcarteselectbankButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 26, this.topPos + 43, 124, 20).build();
		guistate.put("button:button_acheter_des_tickets", button_acheter_des_tickets);
		this.addRenderableWidget(button_acheter_des_tickets);
		button_acheter_des_cartes = Button.builder(Component.translatable("gui.busutilities.boutiqueticketcarteselectbank.button_acheter_des_cartes"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new BoutiqueticketcarteselectbankButtonMessage(1, x, y, z));
				BoutiqueticketcarteselectbankButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 28, this.topPos + 97, 119, 20).build();
		guistate.put("button:button_acheter_des_cartes", button_acheter_des_cartes);
		this.addRenderableWidget(button_acheter_des_cartes);
	}
}
