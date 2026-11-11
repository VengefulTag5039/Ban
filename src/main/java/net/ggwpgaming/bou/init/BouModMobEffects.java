package net.ggwpgaming.bou.init;

import net.ggwpgaming.bou.BouMod;
import net.ggwpgaming.bou.potion.BlessingUnbindingMobEffect;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;

public class BouModMobEffects {
	public static MobEffect BLESSING_UNBINDING;

	public static void load() {
		BLESSING_UNBINDING = Registry.register(BuiltInRegistries.MOB_EFFECT, new ResourceLocation(BouMod.MODID, "blessing_unbinding"), new BlessingUnbindingMobEffect());
	}
}
