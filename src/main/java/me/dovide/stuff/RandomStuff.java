package me.dovide.stuff;

import me.dovide.stuff.items.ModBlocks;
import me.dovide.stuff.items.ModItemGroups;
import me.dovide.stuff.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomStuff implements ModInitializer {
	public static final String MOD_ID = "randomstuff";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerAll();
		ModItemGroups.registerItemGroups();
	}
}