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

import fr.blocblocthebloc.busutilities.world.inventory.BanqueablokosMenu;
import fr.blocblocthebloc.busutilities.procedures.InfoBAB1Procedure;
import fr.blocblocthebloc.busutilities.procedures.InfoBAB0Procedure;
import fr.blocblocthebloc.busutilities.network.BanqueablokosButtonMessage;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class BanqueablokosScreen extends AbstractContainerScreen<BanqueablokosMenu> {
	private final static HashMap<String, Object> guistate = BanqueablokosMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_retraits;
	Button button_depots;

	public BanqueablokosScreen(BanqueablokosMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("busutilities:textures/screens/banqueablokos.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.banqueablokos.label_bab"), 77, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.banqueablokos.label_banque_a_blokos"), 46, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.banqueablokos.label_bonjour"), 67, 37, -12829636, false);
		guiGraphics.drawString(this.font,

				InfoBAB0Procedure.execute(entity), 67, 51, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.banqueablokos.label_vous_avez"), 57, 104, -12829636, false);
		guiGraphics.drawString(this.font,

				InfoBAB1Procedure.execute(entity), 72, 120, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.banqueablokos.label_blokos1"), 70, 135, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_retraits = Button.builder(Component.translatable("gui.busutilities.banqueablokos.button_retraits"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new BanqueablokosButtonMessage(0, x, y, z));
				BanqueablokosButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 10, this.topPos + 72, 67, 20).build();
		guistate.put("button:button_retraits", button_retraits);
		this.addRenderableWidget(button_retraits);
		button_depots = Button.builder(Component.translatable("gui.busutilities.banqueablokos.button_depots"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new BanqueablokosButtonMessage(1, x, y, z));
				BanqueablokosButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 103, this.topPos + 71, 56, 20).build();
		guistate.put("button:button_depots", button_depots);
		this.addRenderableWidget(button_depots);
	}
}
