package com.pouffydev.insomnia;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Insomnia implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("Insomnia");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
	}
}
