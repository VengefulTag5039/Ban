package net.ggwpgaming.bou;

import net.fabricmc.api.ModInitializer;
import net.ggwpgaming.bou.init.BouModBrewingRecipes;
import net.ggwpgaming.bou.init.BouModMobEffects;
import net.ggwpgaming.bou.init.BouModPotions;
import net.ggwpgaming.bou.init.BouModProcedures;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BouMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "bou";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing BouMod");

		BouModMobEffects.load();
		BouModPotions.load();
		BouModProcedures.load();
		BouModBrewingRecipes.load();
	}
}
