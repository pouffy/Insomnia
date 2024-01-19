package com.pouffydev.insomnia.init;

import com.pouffydev.insomnia.Insomnia;
import com.pouffydev.insomnia.common.component.TirednessComponent;
import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer;
import dev.onyxstudios.cca.api.v3.entity.RespawnCopyStrategy;

public class InitEntityComponents implements EntityComponentInitializer {

	public static final ComponentKey<TirednessComponent> TIREDNESS = ComponentRegistry.getOrCreate(Insomnia.id("tiredness"), TirednessComponent.class);
	@Override
	public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
		registry.registerForPlayers(TIREDNESS, player -> new TirednessComponent(), RespawnCopyStrategy.ALWAYS_COPY);
	}
}
