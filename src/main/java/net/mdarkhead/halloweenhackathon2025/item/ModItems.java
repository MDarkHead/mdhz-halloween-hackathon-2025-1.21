package net.mdarkhead.halloweenhackathon2025.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mdarkhead.halloweenhackathon2025.MdhzHalloweenHackathon2025;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //items
    public static final Item ORANGE_GEM = registerItem("orange_gem", new Item(new Item.Settings()));
    public static final Item RAW_ORANGE_GEM = registerItem("raw_orange_gem", new Item(new Item.Settings()));

    //helper
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MdhzHalloweenHackathon2025.MOD_ID, name), item);
    }

    public static void registerModItems(){
        MdhzHalloweenHackathon2025.LOGGER.info("Registering Mod Items for " + MdhzHalloweenHackathon2025.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ORANGE_GEM);
            entries.add(RAW_ORANGE_GEM);
        });

    }

}
