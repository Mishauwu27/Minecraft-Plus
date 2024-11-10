package dev.mishauwu27.minecraftplus;

import dev.mishauwu27.minecraftplus.data.provider.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MinecraftPlusDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(PlusItemTagProvider::new);
		pack.addProvider(PlusRecipeProvider::new);
		pack.addProvider(PlusModelProvider::new);
		pack.addProvider(PlusEnUsLangProvider::new);
	}
}
