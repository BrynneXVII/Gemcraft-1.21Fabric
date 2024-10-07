package com.brynnexvii.gemcraft.item;

import com.brynnexvii.gemcraft.GemCraft;
import com.brynnexvii.gemcraft.utility.enums.GCAspect;
import com.brynnexvii.gemcraft.utility.enums.GCRarity;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GCItems {
    //Items
    //------------ raw gems
    // Ignis
    public static final Item RAW_GARNET = registerItem("raw_garnet", new GCAspectedItem(new Item.Settings(), GCRarity.COMMON, GCAspect.IGNIS));
    public static final Item RAW_SPHALERITE = registerItem("raw_sphalerite", new GCAspectedItem(new Item.Settings(), GCRarity.UNCOMMON, GCAspect.IGNIS));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new GCAspectedItem(new Item.Settings(), GCRarity.RARE, GCAspect.IGNIS));
    // Zephyr
    public static final Item RAW_GOLDEN_BERYL = registerItem("raw_golden_beryl", new GCAspectedItem(new Item.Settings(), GCRarity.COMMON, GCAspect.ZEPHYR));
    public static final Item RAW_CITRINE = registerItem("raw_citrine", new GCAspectedItem(new Item.Settings(), GCRarity.UNCOMMON, GCAspect.ZEPHYR));
    public static final Item RAW_TOPAZ = registerItem("raw_golden_beryl", new GCAspectedItem(new Item.Settings(), GCRarity.RARE, GCAspect.ZEPHYR));
    // Terra
    public static final Item RAW_JADE = registerItem("raw_jade", new GCAspectedItem(new Item.Settings(), GCRarity.COMMON, GCAspect.TERRA));
    public static final Item RAW_PERIDOT = registerItem("raw_peridot", new GCAspectedItem(new Item.Settings(), GCRarity.UNCOMMON, GCAspect.TERRA));
    public static final Item RAW_EMERALD = registerItem("raw_emerald", new GCAspectedItem(new Item.Settings(), GCRarity.RARE, GCAspect.TERRA));
    // Mizu
    public static final Item RAW_AQUAMARINE = registerItem("raw_aquamarine", new GCAspectedItem(new Item.Settings(), GCRarity.COMMON, GCAspect.MIZU));
    public static final Item RAW_IOLITE = registerItem("raw_iolite", new GCAspectedItem(new Item.Settings(), GCRarity.UNCOMMON, GCAspect.MIZU));
    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire", new GCAspectedItem(new Item.Settings(), GCRarity.RARE, GCAspect.MIZU));
    // Aether
    public static final Item RAW_AMETHYST = registerItem("raw_amethyst", new GCAspectedItem(new Item.Settings(), GCRarity.COMMON, GCAspect.AETHER));
    public static final Item RAW_CHAROITE = registerItem("raw_charoite", new GCAspectedItem(new Item.Settings(), GCRarity.UNCOMMON, GCAspect.AETHER));
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite", new GCAspectedItem(new Item.Settings(), GCRarity.RARE, GCAspect.AETHER));
    // Lys
    public static final Item RAW_ALBITE = registerItem("raw_albite", new GCAspectedItem(new Item.Settings(), GCRarity.COMMON, GCAspect.LYS));
    public static final Item RAW_DENDRITIC_OPAL = registerItem("raw_dendritic_opal", new GCAspectedItem(new Item.Settings(), GCRarity.UNCOMMON, GCAspect.LYS));
    public static final Item RAW_DIAMOND = registerItem("raw_diamond", new GCAspectedItem(new Item.Settings(), GCRarity.RARE, GCAspect.LYS));
    // Inanis
    public static final Item RAW_SMOKY_QUARTZ = registerItem("raw_smoky_quartz", new GCAspectedItem(new Item.Settings(), GCRarity.COMMON, GCAspect.INANIS));
    public static final Item RAW_FERBERITE = registerItem("raw_ferberite", new GCAspectedItem(new Item.Settings(), GCRarity.UNCOMMON, GCAspect.INANIS));
    public static final Item RAW_ONYX = registerItem("raw_onyx", new GCAspectedItem(new Item.Settings(), GCRarity.RARE, GCAspect.INANIS));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(GemCraft.MOD_ID, name), item);
    }

    public static void registerGCItems() {
        GemCraft.LOGGER.info("Registering mod items for " + GemCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
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
        });
    }
}
