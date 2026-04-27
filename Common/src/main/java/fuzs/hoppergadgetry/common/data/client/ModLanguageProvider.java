package fuzs.hoppergadgetry.common.data.client;

import fuzs.hoppergadgetry.common.HopperGadgetry;
import fuzs.hoppergadgetry.common.init.ModRegistry;
import fuzs.hoppergadgetry.common.world.level.block.entity.ChuteBlockEntity;
import fuzs.hoppergadgetry.common.world.level.block.entity.DuctBlockEntity;
import fuzs.hoppergadgetry.common.world.level.block.entity.GratedHopperBlockEntity;
import fuzs.puzzleslib.common.api.client.data.v2.AbstractLanguageProvider;
import fuzs.puzzleslib.common.api.data.v2.core.DataProviderContext;

public class ModLanguageProvider extends AbstractLanguageProvider {

    public ModLanguageProvider(DataProviderContext context) {
        super(context);
    }

    @Override
    public void addTranslations(TranslationBuilder builder) {
        builder.add(ModRegistry.CREATIVE_MODE_TAB.value(), HopperGadgetry.MOD_NAME);
        builder.add(ModRegistry.CHUTE_BLOCK.value(), "Chute");
        builder.add(ModRegistry.DUCT_BLOCK.value(), "Duct");
        builder.add(ModRegistry.GRATED_HOPPER_BLOCK.value(), "Grated Hopper");
        builder.add(ModRegistry.GRATED_HOPPER_MINECART_ITEM.value(), "Grated Hopper Minecart");
        builder.add(ModRegistry.GRATED_HOPPER_MINECART_ENTITY_TYPE.value(), "Minecart with Grated Hopper");
        builder.add(ModRegistry.CHUTE_MINECART_ITEM.value(), "Chute Minecart");
        builder.add(ModRegistry.CHUTE_MINECART_ENTITY_TYPE.value(), "Minecart with Chute");
        builder.add(GratedHopperBlockEntity.COMPONENT_GRATED_HOPPER, "Grated Hopper");
        builder.add(ChuteBlockEntity.COMPONENT_CHUTE, "Item Chute");
        builder.add(DuctBlockEntity.COMPONENT_DUCT, "Item Duct");
    }
}
