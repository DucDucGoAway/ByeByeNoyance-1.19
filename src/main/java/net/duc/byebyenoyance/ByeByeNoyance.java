package net.duc.byebyenoyance;

import net.duc.byebyenoyance.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ByeByeNoyance implements ModInitializer {
	public static final String MOD_ID = "byebyenoyance";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		ModBlocks.registerModBlocks();

	}
}
