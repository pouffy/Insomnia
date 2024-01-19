package com.pouffydev.insomnia;

import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Insomnia implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("Insomnia");
	public static final String MOD_ID = "insomnia";
	public static @NotNull Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
	}
}
