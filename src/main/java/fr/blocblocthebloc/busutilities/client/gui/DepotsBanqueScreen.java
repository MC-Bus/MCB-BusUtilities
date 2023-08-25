package fr.blocblocthebloc.busutilities.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import java.util.HashMap;

import fr.blocblocthebloc.busutilities.world.inventory.DepotsBanqueMenu;
import fr.blocblocthebloc.busutilities.network.DepotsBanqueButtonMessage;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class DepotsBanqueScreen extends AbstractContainerScreen<DepotsBanqueMenu> {
	private final static HashMap<String, Object> guistate = DepotsBanqueMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_retiter_1_blokos;

	public DepotsBanqueScreen(DepotsBanqueMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("busutilities:textures/screens/depots_banque.png");

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
		this.font.draw(poseStack, Component.translatable("gui.busutilities.depots_banque.label_bab"), 77, 5, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.depots_banque.label_retraits_de_fonds"), 46, 19, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_retiter_1_blokos = Button.builder(Component.translatable("gui.busutilities.depots_banque.button_retiter_1_blokos"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new DepotsBanqueButtonMessage(0, x, y, z));
				DepotsBanqueButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 34, this.topPos + 56, 108, 20).build();
		guistate.put("button:button_retiter_1_blokos", button_retiter_1_blokos);
		this.addRenderableWidget(button_retiter_1_blokos);
	}
}