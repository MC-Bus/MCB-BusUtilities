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

import fr.blocblocthebloc.busutilities.world.inventory.CryptoPhoneUpgradeGUIMenu;
import fr.blocblocthebloc.busutilities.network.CryptoPhoneUpgradeGUIButtonMessage;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class CryptoPhoneUpgradeGUIScreen extends AbstractContainerScreen<CryptoPhoneUpgradeGUIMenu> {
	private final static HashMap<String, Object> guistate = CryptoPhoneUpgradeGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_ameliorer;

	public CryptoPhoneUpgradeGUIScreen(CryptoPhoneUpgradeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 199;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("busutilities:textures/screens/crypto_phone_upgrade_gui.png");

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

		guiGraphics.blit(new ResourceLocation("busutilities:textures/screens/cryptophone_base.png"), this.leftPos + 14, this.topPos + 19, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("busutilities:textures/screens/cryptophone_mini_core.png"), this.leftPos + 50, this.topPos + 19, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.crypto_phone_upgrade_gui.label_table_damelioration_de_cryptoph"), 7, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.crypto_phone_upgrade_gui.label_empty"), 38, 40, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_ameliorer = Button.builder(Component.translatable("gui.busutilities.crypto_phone_upgrade_gui.button_ameliorer"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new CryptoPhoneUpgradeGUIButtonMessage(0, x, y, z));
				CryptoPhoneUpgradeGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 77, this.topPos + 36, 72, 20).build();
		guistate.put("button:button_ameliorer", button_ameliorer);
		this.addRenderableWidget(button_ameliorer);
	}
}
