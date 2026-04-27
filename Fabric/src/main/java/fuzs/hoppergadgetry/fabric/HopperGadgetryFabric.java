package fuzs.hoppergadgetry.fabric;

import fuzs.hoppergadgetry.common.HopperGadgetry;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import net.fabricmc.api.ModInitializer;

public class HopperGadgetryFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ModConstructor.construct(HopperGadgetry.MOD_ID, HopperGadgetry::new);
    }
}
