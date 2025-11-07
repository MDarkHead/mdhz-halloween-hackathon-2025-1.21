package net.mdarkhead.halloweenhackathon2025;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.mdarkhead.halloweenhackathon2025.block.ModBlocks;
import net.mdarkhead.halloweenhackathon2025.item.ModItemGroups;
import net.mdarkhead.halloweenhackathon2025.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//
public class MdhzHalloweenHackathon2025 implements ModInitializer {
	public static final String MOD_ID = "mdhz-halloween-hackathon-2025";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        FuelRegistry.INSTANCE.add(ModItems.COMET,20000);
	}
}