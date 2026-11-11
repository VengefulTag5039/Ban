package net.ggwpgaming.bou.potion;

import com.google.common.collect.ImmutableMap;
import net.ggwpgaming.bou.procedures.BlessingUnbindingEffectOnEffectActiveTickProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

public class BlessingUnbindingMobEffect extends MobEffect {
	public BlessingUnbindingMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.bou.blessing_unbinding";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		BlessingUnbindingEffectOnEffectActiveTickProcedure.execute(ImmutableMap.<String, Object>builder().put("entity", entity).build());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
