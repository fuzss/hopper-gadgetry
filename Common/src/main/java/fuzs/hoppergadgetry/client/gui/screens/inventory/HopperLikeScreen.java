package fuzs.hoppergadgetry.client.gui.screens.inventory;

import fuzs.hoppergadgetry.HopperGadgetry;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;

public class HopperLikeScreen<T extends AbstractContainerMenu> extends AbstractContainerScreen<T> {
    public static final Identifier GRATED_HOPPER_LOCATION = HopperGadgetry.id("textures/gui/container/grated_hopper.png");
    public static final Identifier DUCT_LOCATION = HopperGadgetry.id("textures/gui/container/duct.png");
    public static final int GRATED_HOPPER_IMAGE_HEIGHT = 164;
    public static final int DUCT_IMAGE_HEIGHT = 133;

    private final Identifier identifier;

    public HopperLikeScreen(Identifier identifier, T menu, Inventory playerInventory, Component title, int imageHeight) {
        super(menu, playerInventory, title, 176, imageHeight);
        this.identifier = identifier;
        this.inventoryLabelY = imageHeight - 94;
    }

    public static <T extends AbstractContainerMenu> MenuScreens.ScreenConstructor<T, HopperLikeScreen<T>> create(Identifier identifier, int imageHeight) {
        return (T abstractContainerMenu, Inventory inventory, Component component) -> {
            return new HopperLikeScreen<>(identifier, abstractContainerMenu, inventory, component, imageHeight);
        };
    }

    @Override
    public void extractBackground(GuiGraphicsExtractor guiGraphics, int mouseX, int mouseY, float partialTick) {
        super.extractBackground(guiGraphics, mouseX, mouseY, partialTick);
        guiGraphics.blit(RenderPipelines.GUI_TEXTURED,
                this.identifier,
                this.leftPos,
                this.topPos,
                0,
                0,
                this.imageWidth,
                this.imageHeight,
                256,
                256);
    }
}
