package net.ggwpgaming.bou.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;

public class BouModBrewingRecipes {
	public static void load() {
		// Mundane Potion + Netherite Ingot -> Potion of Unbinding
		PotionBrewing.addMix(Potions.MUNDANE, Items.NETHERITE_INGOT, BouModPotions.UNBINDING_POTION);
	}
}
