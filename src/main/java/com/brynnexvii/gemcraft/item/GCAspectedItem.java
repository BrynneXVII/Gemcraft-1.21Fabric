package com.brynnexvii.gemcraft.item;

import com.brynnexvii.gemcraft.utility.enums.GCAspect;
import com.brynnexvii.gemcraft.utility.enums.GCRarity;
import net.minecraft.item.Item;

public class GCAspectedItem extends Item {
    private final GCRarity rarity;
    private final GCAspect aspect;

    public GCAspectedItem(Settings settings, GCRarity rarity, GCAspect aspect) {
        super(settings);
        this.rarity = rarity;
        this.aspect = aspect;
    }
}
