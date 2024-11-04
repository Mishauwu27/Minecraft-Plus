package dev.mishauwu27.minecraftplus;

import dev.mishauwu27.minecraftplus.init.PlusItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftPlus implements ModInitializer {
	public static final String MOD_ID = "minecraft-plus";
    public static final Logger LOGGER = LoggerFactory.getLogger("Minecraft+");

	@Override
	public void onInitialize() {
		PlusItems.load();
	}

	public static Identifier id(String path) { return Identifier.of(MOD_ID, path); }
}
