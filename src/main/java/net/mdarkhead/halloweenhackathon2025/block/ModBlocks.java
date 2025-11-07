package net.mdarkhead.halloweenhackathon2025.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mdarkhead.halloweenhackathon2025.MdhzHalloweenHackathon2025;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;


public class ModBlocks{
    //blocks
    public static final Block ORANGE_GEM_BLOCK = registerBlock("orange_gem_block", new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3f).sounds(BlockSoundGroup.METAL)));
    public static final Block ORANGE_GEM_ORE = registerBlock("orange_gem_ore", new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3f).sounds(BlockSoundGroup.METAL)));



    //helper
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MdhzHalloweenHackathon2025.MOD_ID, name), block);
    }

    //helper
    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(MdhzHalloweenHackathon2025.MOD_ID, name), new BlockItem(block, new Item.Settings()));

    }

    public static void registerModBlocks(){
        MdhzHalloweenHackathon2025.LOGGER.info("Registering Mod Items for " + MdhzHalloweenHackathon2025.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.ORANGE_GEM_BLOCK);
            entries.add(ModBlocks.ORANGE_GEM_ORE);
        });
    }

}
