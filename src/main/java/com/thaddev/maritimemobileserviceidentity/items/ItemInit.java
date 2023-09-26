package com.thaddev.maritimemobileserviceidentity.items;

import com.thaddev.maritimemobileserviceidentity.MMSI;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ItemInit {
	public static void registerBlockItem(Block block, String id, RegistryKey<ItemGroup> group) {
		Registry.register(Registries.ITEM, new Identifier(MMSI.MOD_ID, id), new BlockItem(block, new QuiltItemSettings()));
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> {
			entries.addItem(block.asItem());
		});
	}
}
