package net.ggwpgaming.bou.init;

import net.ggwpgaming.bou.BouMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;

public class BouModPotions {
	public static Potion UNBINDING_POTION;

	public static void load() {
		UNBINDING_POTION = Registry.register(BuiltInRegistries.POTION, new ResourceLocation(BouMod.MODID, "unbinding_potion"),
				new Potion(new MobEffectInstance(BouModMobEffects.BLESSING_UNBINDING, 3600, 0, false, true)));
	}
}
