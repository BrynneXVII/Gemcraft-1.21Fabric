package com.brynnexvii.gemcraft.block;

import com.brynnexvii.gemcraft.GemCraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class GCBlocks {

    //Blocks
    //Ignis Ores
    public static final Block IGNIS_GEM_ORE = registerBlock("ignis_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
            )
    );
    public static final Block DEEPSLATE_IGNIS_GEM_ORE = registerBlock("deepslate_ignis_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(4.5F, 3.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE)
            )
    );
    public static final Block NETHER_IGNIS_GEM_ORE = registerBlock("nether_ignis_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
                            .sounds(BlockSoundGroup.NETHER_ORE)
            )
    );
    public static final Block END_STONE_IGNIS_GEM_ORE = registerBlock("end_stone_ignis_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(4, 8),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 9.0F)
            )
    );
    //Zephyr Ores
    public static final Block ZEPHYR_GEM_ORE = registerBlock("zephyr_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
            )
    );
    public static final Block DEEPSLATE_ZEPHYR_GEM_ORE = registerBlock("deepslate_zephyr_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(4.5F, 3.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE)
            )
    );
    public static final Block NETHER_ZEPHYR_GEM_ORE = registerBlock("nether_zephyr_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
                            .sounds(BlockSoundGroup.NETHER_ORE)
            )
    );
    public static final Block END_STONE_ZEPHYR_GEM_ORE = registerBlock("end_stone_zephyr_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(4, 8),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 9.0F)
            )
    );
    //Terra ores
    public static final Block TERRA_GEM_ORE = registerBlock("terra_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
            )
    );
    public static final Block DEEPSLATE_TERRA_GEM_ORE = registerBlock("deepslate_terra_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(4.5F, 3.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE)
            )
    );
    public static final Block NETHER_TERRA_GEM_ORE = registerBlock("nether_terra_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
                            .sounds(BlockSoundGroup.NETHER_ORE)
            )
    );
    public static final Block END_STONE_TERRA_GEM_ORE = registerBlock("end_stone_terra_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(4, 8),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 9.0F)
            )
    );
    //Mizu Ores
    public static final Block MIZU_GEM_ORE = registerBlock("mizu_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
            )
    );
    public static final Block DEEPSLATE_MIZU_GEM_ORE = registerBlock("deepslate_mizu_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(4.5F, 3.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE)
            )
    );
    public static final Block NETHER_MIZU_GEM_ORE = registerBlock("nether_mizu_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
                            .sounds(BlockSoundGroup.NETHER_ORE)
            )
    );
    public static final Block END_STONE_MIZU_GEM_ORE = registerBlock("end_stone_mizu_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(4, 8),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 9.0F)
            )
    );
    //Aether ores
    public static final Block AETHER_GEM_ORE = registerBlock("aether_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
            )
    );
    public static final Block DEEPSLATE_AETHER_GEM_ORE = registerBlock("deepslate_aether_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(4.5F, 3.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE)
            )
    );
    public static final Block NETHER_AETHER_GEM_ORE = registerBlock("nether_aether_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
                            .sounds(BlockSoundGroup.NETHER_ORE)
            )
    );
    public static final Block END_STONE_AETHER_GEM_ORE = registerBlock("end_stone_aether_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(4, 8),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 9.0F)
            )
    );
    //Lys ores
    public static final Block LYS_GEM_ORE = registerBlock("lys_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
            )
    );
    public static final Block DEEPSLATE_LYS_GEM_ORE = registerBlock("deepslate_lys_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(4.5F, 3.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE)
            )
    );
    public static final Block NETHER_LYS_GEM_ORE = registerBlock("nether_lys_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
                            .sounds(BlockSoundGroup.NETHER_ORE)
            )
    );
    public static final Block END_STONE_LYS_GEM_ORE = registerBlock("end_stone_lys_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(4, 8),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 9.0F)
            )
    );
    //Inanis ores
    public static final Block INANIS_GEM_ORE = registerBlock("inanis_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
            )
    );
    public static final Block DEEPSLATE_INANIS_GEM_ORE = registerBlock("deepslate_inanis_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(4.5F, 3.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE)
            )
    );
    public static final Block NETHER_INANIS_GEM_ORE = registerBlock("nether_inanis_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
                            .sounds(BlockSoundGroup.NETHER_ORE)
            )
    );
    public static final Block END_STONE_INANIS_GEM_ORE = registerBlock("end_stone_inanis_gem_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(4, 8),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 9.0F)
            )
    );




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GemCraft.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GemCraft.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerGCBlocks() {
        GemCraft.LOGGER.info("Registering mod blocks for " + GemCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(GCBlocks.IGNIS_GEM_ORE);
            entries.add(GCBlocks.DEEPSLATE_IGNIS_GEM_ORE);
            entries.add(GCBlocks.NETHER_IGNIS_GEM_ORE);
            entries.add(GCBlocks.END_STONE_IGNIS_GEM_ORE);
            entries.add(GCBlocks.ZEPHYR_GEM_ORE);
            entries.add(GCBlocks.DEEPSLATE_ZEPHYR_GEM_ORE);
            entries.add(GCBlocks.NETHER_ZEPHYR_GEM_ORE);
            entries.add(GCBlocks.END_STONE_ZEPHYR_GEM_ORE);
            entries.add(GCBlocks.TERRA_GEM_ORE);
            entries.add(GCBlocks.DEEPSLATE_TERRA_GEM_ORE);
            entries.add(GCBlocks.NETHER_TERRA_GEM_ORE);
            entries.add(GCBlocks.END_STONE_TERRA_GEM_ORE);
            entries.add(GCBlocks.MIZU_GEM_ORE);
            entries.add(GCBlocks.DEEPSLATE_MIZU_GEM_ORE);
            entries.add(GCBlocks.NETHER_MIZU_GEM_ORE);
            entries.add(GCBlocks.END_STONE_MIZU_GEM_ORE);
            entries.add(GCBlocks.AETHER_GEM_ORE);
            entries.add(GCBlocks.DEEPSLATE_AETHER_GEM_ORE);
            entries.add(GCBlocks.NETHER_AETHER_GEM_ORE);
            entries.add(GCBlocks.END_STONE_AETHER_GEM_ORE);
            entries.add(GCBlocks.LYS_GEM_ORE);
            entries.add(GCBlocks.DEEPSLATE_LYS_GEM_ORE);
            entries.add(GCBlocks.NETHER_LYS_GEM_ORE);
            entries.add(GCBlocks.END_STONE_LYS_GEM_ORE);
            entries.add(GCBlocks.INANIS_GEM_ORE);
            entries.add(GCBlocks.DEEPSLATE_INANIS_GEM_ORE);
            entries.add(GCBlocks.NETHER_INANIS_GEM_ORE);
            entries.add(GCBlocks.END_STONE_INANIS_GEM_ORE);
        });
    }
}
