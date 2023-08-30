package fr.blocblocthebloc.busutilities.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import fr.blocblocthebloc.busutilities.world.inventory.DebugBlokosSysMenu;
import fr.blocblocthebloc.busutilities.network.DebugBlokosSysButtonMessage;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class DebugBlokosSysScreen extends AbstractContainerScreen<DebugBlokosSysMenu> {
	private final static HashMap<String, Object> guistate = DebugBlokosSysMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox debug;
	Button button_set;

	public DebugBlokosSysScreen(DebugBlokosSysMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("busutilities:textures/screens/debug_blokos_sys.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		debug.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (debug.isFocused())
			return debug.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		debug.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		debug = new EditBox(this.font, this.leftPos + 28, this.topPos + 46, 120, 20, Component.translatable("gui.busutilities.debug_blokos_sys.debug"));
		debug.setMaxLength(32767);
		guistate.put("text:debug", debug);
		this.addWidget(this.debug);
		button_set = Button.builder(Component.translatable("gui.busutilities.debug_blokos_sys.button_set"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new DebugBlokosSysButtonMessage(0, x, y, z));
				DebugBlokosSysButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 63, this.topPos + 101, 40, 20).build();
		guistate.put("button:button_set", button_set);
		this.addRenderableWidget(button_set);
	}
}
