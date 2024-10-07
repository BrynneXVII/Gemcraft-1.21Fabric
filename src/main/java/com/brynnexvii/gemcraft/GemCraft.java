package com.brynnexvii.gemcraft;

import com.brynnexvii.gemcraft.block.GCBlocks;
import com.brynnexvii.gemcraft.item.GCItemGroups;
import com.brynnexvii.gemcraft.item.GCItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GemCraft implements ModInitializer {
	public static final String MOD_ID = "gemcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		GCItemGroups.registerItemGroups();

		GCItems.registerGCItems();
		GCBlocks.registerGCBlocks();
	}
}