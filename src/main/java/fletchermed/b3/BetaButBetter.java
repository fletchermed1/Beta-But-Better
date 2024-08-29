package fletchermed.b3;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetaButBetter implements ModInitializer {
	public static final String MOD_ID = "beta-but-better";
	// This is so I can modify vanilla blocks I bet there is a better way to do this but as I am writing this and doing this, this is like my 3rd day since I started relearning java since I knew very little to begin with
	public static final String VANILLA_ID = "minecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Items.initialize();
		Blocks.initialize();
		VanillaBlocks.initialize();

		LOGGER.info("Beta But Better is now loaded and watching your every move");
	}
}