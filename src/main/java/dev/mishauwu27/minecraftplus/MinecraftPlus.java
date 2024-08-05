package dev.mishauwu27.minecraftplus;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftPlus implements ModInitializer {
	public static final String MOD_ID = "minecraft-plus";
    public static final Logger LOGGER = LoggerFactory.getLogger("Minecraft+");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
