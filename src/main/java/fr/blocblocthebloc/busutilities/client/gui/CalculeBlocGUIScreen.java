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

import fr.blocblocthebloc.busutilities.world.inventory.CalculeBlocGUIMenu;
import fr.blocblocthebloc.busutilities.procedures.ValeurCalcule2Procedure;
import fr.blocblocthebloc.busutilities.procedures.ValeurCalcule1Procedure;
import fr.blocblocthebloc.busutilities.procedures.InfoBAB1Procedure;
import fr.blocblocthebloc.busutilities.procedures.InfoBAB0Procedure;
import fr.blocblocthebloc.busutilities.network.CalculeBlocGUIButtonMessage;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class CalculeBlocGUIScreen extends AbstractContainerScreen<CalculeBlocGUIMenu> {
	private final static HashMap<String, Object> guistate = CalculeBlocGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox resultat;
	Button button_valider;

	public CalculeBlocGUIScreen(CalculeBlocGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("busutilities:textures/screens/calcule_bloc_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		resultat.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (resultat.isFocused())
			return resultat.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		resultat.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.calcule_bloc_gui.label_calcule_bloc"), 56, 6, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.calcule_bloc_gui.label_bienvenue"), 64, -34, -1, false);
		guiGraphics.drawString(this.font,

				InfoBAB0Procedure.execute(entity), 70, -20, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.calcule_bloc_gui.label_vous_avez"), 201, 48, -1, false);
		guiGraphics.drawString(this.font,

				InfoBAB1Procedure.execute(entity), 210, 66, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.calcule_bloc_gui.label_blokos"), 213, 84, -1, false);
		guiGraphics.drawString(this.font,

				ValeurCalcule1Procedure.execute(entity), 65, 26, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.calcule_bloc_gui.label_empty"), 73, 43, -12829636, false);
		guiGraphics.drawString(this.font,

				ValeurCalcule2Procedure.execute(entity), 65, 59, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.busutilities.calcule_bloc_gui.label_empty1"), 73, 77, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		resultat = new EditBox(this.font, this.leftPos + 25, this.topPos + 98, 120, 20, Component.translatable("gui.busutilities.calcule_bloc_gui.resultat"));
		resultat.setMaxLength(32767);
		guistate.put("text:resultat", resultat);
		this.addWidget(this.resultat);
		button_valider = Button.builder(Component.translatable("gui.busutilities.calcule_bloc_gui.button_valider"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new CalculeBlocGUIButtonMessage(0, x, y, z));
				CalculeBlocGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 54, this.topPos + 131, 61, 20).build();
		guistate.put("button:button_valider", button_valider);
		this.addRenderableWidget(button_valider);
	}
}
