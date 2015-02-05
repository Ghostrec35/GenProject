package genesis.client;

import genesis.common.Genesis;
import genesis.common.GenesisFluids;
import genesis.util.Constants;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TextureStitchHandler {

	@SubscribeEvent
	public void onTextureStitch(TextureStitchEvent.Pre e){
		Genesis.logger.info("Stitching...");
		GenesisFluids.KOMATIITIC_LAVA.setStillIcon(e.map.registerSprite(new ResourceLocation(Constants.ASSETS+"blocks/komatiitic_lava_still")));
		GenesisFluids.KOMATIITIC_LAVA.setFlowingIcon(e.map.registerSprite(new ResourceLocation(Constants.ASSETS+"blocks/komatiitic_lava_flow")));
	}
	
}
