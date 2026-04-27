package fuzs.hoppergadgetry.fabric.client;

import fuzs.hoppergadgetry.common.HopperGadgetry;
import fuzs.hoppergadgetry.common.client.HopperGadgetryClient;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import net.fabricmc.api.ClientModInitializer;

public class HopperGadgetryFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientModConstructor.construct(HopperGadgetry.MOD_ID, HopperGadgetryClient::new);
    }
}
