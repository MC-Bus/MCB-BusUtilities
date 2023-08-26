package fr.blocblocthebloc.busutilities.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;

import java.util.HashMap;

import fr.blocblocthebloc.busutilities.world.inventory.TermsBlocGUIMenu;
import fr.blocblocthebloc.busutilities.procedures.InfoBAB1Procedure;
import fr.blocblocthebloc.busutilities.procedures.InfoBAB0Procedure;
import fr.blocblocthebloc.busutilities.network.TermsBlocGUIButtonMessage;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TermsBlocGUIScreen extends AbstractContainerScreen<TermsBlocGUIMenu> {
	private final static HashMap<String, Object> guistate = TermsBlocGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Checkbox signature;
	Button button_terminer;

	public TermsBlocGUIScreen(TermsBlocGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("busutilities:textures/screens/terms_bloc_gui.png");

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
		this.font.draw(poseStack, Component.translatable("gui.busutilities.terms_bloc_gui.label_terms_bloc"), 60, 4, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.terms_bloc_gui.label_lu_et_approuve"), 63, 43, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.terms_bloc_gui.label_bienvenue"), 65, -32, -1);
		this.font.draw(poseStack,

				InfoBAB0Procedure.execute(entity), 70, -18, -1);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.terms_bloc_gui.label_vous_avez"), 202, 61, -1);
		this.font.draw(poseStack,

				InfoBAB1Procedure.execute(entity), 211, 79, -1);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.terms_bloc_gui.label_blokos"), 211, 98, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_terminer = Button.builder(Component.translatable("gui.busutilities.terms_bloc_gui.button_terminer"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new TermsBlocGUIButtonMessage(0, x, y, z));
				TermsBlocGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 50, this.topPos + 105, 67, 20).build();
		guistate.put("button:button_terminer", button_terminer);
		this.addRenderableWidget(button_terminer);
		signature = new Checkbox(this.leftPos + 31, this.topPos + 38, 20, 20, Component.translatable("gui.busutilities.terms_bloc_gui.signature"), false);
		guistate.put("checkbox:signature", signature);
		this.addRenderableWidget(signature);
	}
}
