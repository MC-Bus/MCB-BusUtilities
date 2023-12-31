package fr.blocblocthebloc.busutilities.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import fr.blocblocthebloc.busutilities.world.inventory.BABLiteMenu;
import fr.blocblocthebloc.busutilities.procedures.InfoBAB1Procedure;
import fr.blocblocthebloc.busutilities.procedures.InfoBAB0Procedure;

import com.mojang.blaze3d.systems.RenderSystem;

public class BABLiteScreen extends AbstractContainerScreen<BABLiteMenu> {
	private final static HashMap<String, Object> guistate = BABLiteMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BABLiteScreen(BABLiteMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("busutilities:textures/screens/bab_lite.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.bab_lite.label_bienvenue"), 60, 23, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.bab_lite.label_banque_a_blokos"), 48, 5, -12829636, false);
		guiGraphics.drawString(this.font,

				InfoBAB0Procedure.execute(entity), 68, 37, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.bab_lite.label_vous_avez_sur_votre_compte"), 15, 69, -12829636, false);
		guiGraphics.drawString(this.font,

				InfoBAB1Procedure.execute(entity), 75, 92, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.bab_lite.label_blokos"), 66, 112, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
