package com.xiaoyue.celestial_artifacts.content.curios.head;

import com.xiaoyue.celestial_artifacts.content.core.feature.SkillFeature;
import com.xiaoyue.celestial_artifacts.content.core.modular.SingleLineText;
import com.xiaoyue.celestial_artifacts.data.CALang;
import com.xiaoyue.celestial_artifacts.register.CAItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.server.level.ServerPlayer;

public class SeaGodCrown implements SingleLineText, SkillFeature {//TODO check

	@Override
	public void trigger(ServerPlayer player) {
		if (!player.serverLevel().isRaining()) {
			if (!player.getCooldowns().isOnCooldown(CAItems.SEA_GOD_CROWN.get())) {
				player.serverLevel().setWeatherParameters(0, 20000, true, true);
				player.getCooldowns().addCooldown(CAItems.SEA_GOD_CROWN.get(), 600);
			}
		}
	}

	@Override
	public MutableComponent getLine() {
		return CALang.Head.SEA_GOD_CROWN.get();
	}

}
