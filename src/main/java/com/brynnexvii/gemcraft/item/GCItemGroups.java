package com.brynnexvii.gemcraft.item;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.block.GCBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class GCItemGroups {
    public static final ItemGroup GEMCRAFT_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GemCraft.MOD_ID, "gemcraft_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(GCItems.RAW_TANZANITE))
                    .displayName(Text.translatable("itemgroup.gemcraft.gemcraft_group"))
                    .entries((displayContext, entries) -> {
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

                        entries.add(GCItems.RAW_GARNET);
                        entries.add(GCItems.RAW_SPHALERITE);
                        entries.add(GCItems.RAW_RUBY);
                        entries.add(GCItems.RAW_GOLDEN_BERYL);
                        entries.add(GCItems.RAW_CITRINE);
                        entries.add(GCItems.RAW_TOPAZ);
                        entries.add(GCItems.RAW_JADE);
                        entries.add(GCItems.RAW_PERIDOT);
                        entries.add(GCItems.RAW_EMERALD);
                        entries.add(GCItems.RAW_AQUAMARINE);
                        entries.add(GCItems.RAW_IOLITE);
                        entries.add(GCItems.RAW_SAPPHIRE);
                        entries.add(GCItems.RAW_AMETHYST);
                        entries.add(GCItems.RAW_CHAROITE);
                        entries.add(GCItems.RAW_TANZANITE);
                        entries.add(GCItems.RAW_ALBITE);
                        entries.add(GCItems.RAW_DENDRITIC_OPAL);
                        entries.add(GCItems.RAW_DIAMOND);
                        entries.add(GCItems.RAW_SMOKY_QUARTZ);
                        entries.add(GCItems.RAW_FERBERITE);
                        entries.add(GCItems.RAW_ONYX);
                    }).build());

    public static final ItemGroup GEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GemCraft.MOD_ID, "gem_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(GCItems.RAW_GARNET))
                    .displayName(Text.translatable("itemgroup.gemcraft.gem_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(GCItems.RAW_GARNET);
                        entries.add(GCItems.RAW_SPHALERITE);
                        entries.add(GCItems.RAW_RUBY);
                        entries.add(GCItems.RAW_GOLDEN_BERYL);
                        entries.add(GCItems.RAW_CITRINE);
                        entries.add(GCItems.RAW_TOPAZ);
                        entries.add(GCItems.RAW_JADE);
                        entries.add(GCItems.RAW_PERIDOT);
                        entries.add(GCItems.RAW_EMERALD);
                        entries.add(GCItems.RAW_AQUAMARINE);
                        entries.add(GCItems.RAW_IOLITE);
                        entries.add(GCItems.RAW_SAPPHIRE);
                        entries.add(GCItems.RAW_AMETHYST);
                        entries.add(GCItems.RAW_CHAROITE);
                        entries.add(GCItems.RAW_TANZANITE);
                        entries.add(GCItems.RAW_ALBITE);
                        entries.add(GCItems.RAW_DENDRITIC_OPAL);
                        entries.add(GCItems.RAW_DIAMOND);
                        entries.add(GCItems.RAW_SMOKY_QUARTZ);
                        entries.add(GCItems.RAW_FERBERITE);
                        entries.add(GCItems.RAW_ONYX);
                    }).build());

    public static void registerItemGroups(){
        GemCraft.LOGGER.info("Registering item groups for " + GemCraft.MOD_ID);
    }
}
