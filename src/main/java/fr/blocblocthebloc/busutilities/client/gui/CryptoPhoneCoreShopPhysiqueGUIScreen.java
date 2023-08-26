package fr.blocblocthebloc.busutilities.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import java.util.HashMap;

import fr.blocblocthebloc.busutilities.world.inventory.CryptoPhoneCoreShopPhysiqueGUIMenu;
import fr.blocblocthebloc.busutilities.network.CryptoPhoneCoreShopPhysiqueGUIButtonMessage;
import fr.blocblocthebloc.busutilities.BusutilitiesMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CryptoPhoneCoreShopPhysiqueGUIScreen extends AbstractContainerScreen<CryptoPhoneCoreShopPhysiqueGUIMenu> {
	private final static HashMap<String, Object> guistate = CryptoPhoneCoreShopPhysiqueGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_coeur_advence;
	Button button_coeur_max;
	Button button_coeur_pro;
	Button button_coeur_elite;
	Button button_coeur_mini;

	public CryptoPhoneCoreShopPhysiqueGUIScreen(CryptoPhoneCoreShopPhysiqueGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 181;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("busutilities:textures/screens/crypto_phone_core_shop_physique_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("busutilities:textures/screens/cryptophone_mini_core.png"));
		this.blit(ms, this.leftPos + -101, this.topPos + 7, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("busutilities:textures/screens/cryptophone_advence_core.png"));
		this.blit(ms, this.leftPos + -115, this.topPos + 37, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("busutilities:textures/screens/cryptophone_max_core.png"));
		this.blit(ms, this.leftPos + -94, this.topPos + 64, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("busutilities:textures/screens/cryptophone_pro_core.png"));
		this.blit(ms, this.leftPos + 258, this.topPos + 8, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("busutilities:textures/screens/cryptophone_elite_core.png"));
		this.blit(ms, this.leftPos + 269, this.topPos + 36, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, Component.translatable("gui.busutilities.crypto_phone_core_shop_physique_gui.label_boutique_de_coeur_de_cryptophone"), 6, 5, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.crypto_phone_core_shop_physique_gui.label_paiement_physique"), 45, 18, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.crypto_phone_core_shop_physique_gui.label_coeur_mini_8_blokos"), -120, 117, -9044002);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.crypto_phone_core_shop_physique_gui.label_coeur_advence_30_blokos"), -120, 129, -14928129);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.crypto_phone_core_shop_physique_gui.label_coeur_max_45_b"), -120, 144, -589991);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.crypto_phone_core_shop_physique_gui.label_coeur_pro_64_b"), -120, 159, -54471);
		this.font.draw(poseStack, Component.translatable("gui.busutilities.crypto_phone_core_shop_physique_gui.label_coeur_elite_128_b_paiement_ba"), -120, 171, -12058369);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_coeur_advence = Button.builder(Component.translatable("gui.busutilities.crypto_phone_core_shop_physique_gui.button_coeur_advence"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new CryptoPhoneCoreShopPhysiqueGUIButtonMessage(0, x, y, z));
				CryptoPhoneCoreShopPhysiqueGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -97, this.topPos + 34, 93, 20).build();
		guistate.put("button:button_coeur_advence", button_coeur_advence);
		this.addRenderableWidget(button_coeur_advence);
		button_coeur_max = Button.builder(Component.translatable("gui.busutilities.crypto_phone_core_shop_physique_gui.button_coeur_max"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new CryptoPhoneCoreShopPhysiqueGUIButtonMessage(1, x, y, z));
				CryptoPhoneCoreShopPhysiqueGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + -76, this.topPos + 61, 72, 20).build();
		guistate.put("button:button_coeur_max", button_coeur_max);
		this.addRenderableWidget(button_coeur_max);
		button_coeur_pro = Button.builder(Component.translatable("gui.busutilities.crypto_phone_core_shop_physique_gui.button_coeur_pro"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new CryptoPhoneCoreShopPhysiqueGUIButtonMessage(2, x, y, z));
				CryptoPhoneCoreShopPhysiqueGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 182, this.topPos + 6, 72, 20).build();
		guistate.put("button:button_coeur_pro", button_coeur_pro);
		this.addRenderableWidget(button_coeur_pro);
		button_coeur_elite = Button.builder(Component.translatable("gui.busutilities.crypto_phone_core_shop_physique_gui.button_coeur_elite"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new CryptoPhoneCoreShopPhysiqueGUIButtonMessage(3, x, y, z));
				CryptoPhoneCoreShopPhysiqueGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 182, this.topPos + 33, 82, 20).build();
		guistate.put("button:button_coeur_elite", button_coeur_elite);
		this.addRenderableWidget(button_coeur_elite);
		button_coeur_mini = Button.builder(Component.translatable("gui.busutilities.crypto_phone_core_shop_physique_gui.button_coeur_mini"), e -> {
			if (true) {
				BusutilitiesMod.PACKET_HANDLER.sendToServer(new CryptoPhoneCoreShopPhysiqueGUIButtonMessage(4, x, y, z));
				CryptoPhoneCoreShopPhysiqueGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + -82, this.topPos + 6, 77, 20).build();
		guistate.put("button:button_coeur_mini", button_coeur_mini);
		this.addRenderableWidget(button_coeur_mini);
	}
}
