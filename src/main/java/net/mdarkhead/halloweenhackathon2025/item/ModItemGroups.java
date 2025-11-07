package net.mdarkhead.halloweenhackathon2025.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mdarkhead.halloweenhackathon2025.MdhzHalloweenHackathon2025;
import net.mdarkhead.halloweenhackathon2025.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup MDHZ_HALLOWEEN_HACKATHON_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MdhzHalloweenHackathon2025.MOD_ID, "mdhz_halloween_hackathon_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ORANGE_GEM))
                    .displayName(Text.translatable("itemgroup.MdhzHalloweenHackathon2025.mdhz_halloween_hackathon_objects"))
                    .entries((displayContext, entries) -> {
                        //items
                        entries.add(ModItems.ORANGE_GEM);
                        entries.add(ModItems.RAW_ORANGE_GEM);
                        entries.add(ModItems.COMET);
                        //blocks
                        entries.add(ModBlocks.ORANGE_GEM_BLOCK);
                        entries.add(ModBlocks.ORANGE_GEM_ORE);

                    }).build());



    public static void registerItemGroups(){
        MdhzHalloweenHackathon2025.LOGGER.info("Registering Item Groups for " +  MdhzHalloweenHackathon2025.MOD_ID);



    }
}
