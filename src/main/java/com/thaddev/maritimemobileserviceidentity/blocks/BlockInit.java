package com.thaddev.maritimemobileserviceidentity.blocks;

import com.thaddev.maritimemobileserviceidentity.MMSI;
import com.thaddev.maritimemobileserviceidentity.items.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;

public class BlockInit {
	public static final Block AMOGUS_PLUSH = new AmogusPlushieBlock(DyeColor.WHITE,
		QuiltBlockSettings.create()
			.mapColor(MapColor.SNOW)
			.strength(0.1F)
			.sounds(BlockSoundGroup.WOOL)
			.lavaIgnitable()
	);
	public static final Block ORANGE_AMOGUS_PLUSH = new AmogusPlushieBlock(DyeColor.ORANGE,
		QuiltBlockSettings.create()
			.mapColor(MapColor.SNOW)
			.strength(0.1F)
			.sounds(BlockSoundGroup.WOOL)
			.lavaIgnitable()
	);
	public static final Block MAGENTA_AMOGUS_PLUSH = new AmogusPlushieBlock(DyeColor.MAGENTA,
		QuiltBlockSettings.create()
			.mapColor(MapColor.SNOW)
			.strength(0.1F)
			.sounds(BlockSoundGroup.WOOL)
			.lavaIgnitable()
	);
	public static final Block LIGHT_BLUE_AMOGUS_PLUSH = new AmogusPlushieBlock(DyeColor.LIGHT_BLUE,
		QuiltBlockSettings.create()
			.mapColor(MapColor.SNOW)
			.strength(0.1F)
			.sounds(BlockSoundGroup.WOOL)
			.lavaIgnitable()
	);
	public static final Block YELLOW_AMOGUS_PLUSH = new AmogusPlushieBlock(DyeColor.YELLOW,
		QuiltBlockSettings.create()
			.mapColor(MapColor.SNOW)
			.strength(0.1F)
			.sounds(BlockSoundGroup.WOOL)
			.lavaIgnitable()
	);
	public static final Block LIME_AMOGUS_PLUSH = new AmogusPlushieBlock(DyeColor.LIME,
		QuiltBlockSettings.create()
			.mapColor(MapColor.SNOW)
			.strength(0.1F)
			.sounds(BlockSoundGroup.WOOL)
			.lavaIgnitable()
	);
	public static final Block PINK_AMOGUS_PLUSH = new AmogusPlushieBlock(DyeColor.PINK,
		QuiltBlockSettings.create()
			.mapColor(MapColor.SNOW)
			.strength(0.1F)
			.sounds(BlockSoundGroup.WOOL)
			.lavaIgnitable()
	);
	public static final Block GRAY_AMOGUS_PLUSH = new AmogusPlushieBlock(DyeColor.GRAY,
		QuiltBlockSettings.create()
			.mapColor(MapColor.SNOW)
			.strength(0.1F)
			.sounds(BlockSoundGroup.WOOL)
			.lavaIgnitable()
	);
	public static final Block LIGHT_GRAY_AMOGUS_PLUSH = new AmogusPlushieBlock(DyeColor.LIGHT_GRAY,
		QuiltBlockSettings.create()
			.mapColor(MapColor.SNOW)
			.strength(0.1F)
			.sounds(BlockSoundGroup.WOOL)
			.lavaIgnitable()
	);
	public static final Block CYAN_AMOGUS_PLUSH = new AmogusPlushieBlock(DyeColor.CYAN,
		QuiltBlockSettings.create()
			.mapColor(MapColor.SNOW)
			.strength(0.1F)
			.sounds(BlockSoundGroup.WOOL)
			.lavaIgnitable()
	);
	public static final Block PURPLE_AMOGUS_PLUSH = new AmogusPlushieBlock(DyeColor.PURPLE,
		QuiltBlockSettings.create()
			.mapColor(MapColor.SNOW)
			.strength(0.1F)
			.sounds(BlockSoundGroup.WOOL)
			.lavaIgnitable()
	);
	public static final Block BLUE_AMOGUS_PLUSH = new AmogusPlushieBlock(DyeColor.BLUE,
		QuiltBlockSettings.create()
			.mapColor(MapColor.SNOW)
			.strength(0.1F)
			.sounds(BlockSoundGroup.WOOL)
			.lavaIgnitable()
	);
	public static final Block BROWN_AMOGUS_PLUSH = new AmogusPlushieBlock(DyeColor.BROWN,
		QuiltBlockSettings.create()
			.mapColor(MapColor.SNOW)
			.strength(0.1F)
			.sounds(BlockSoundGroup.WOOL)
			.lavaIgnitable()
	);
	public static final Block GREEN_AMOGUS_PLUSH = new AmogusPlushieBlock(DyeColor.GREEN,
		QuiltBlockSettings.create()
			.mapColor(MapColor.SNOW)
			.strength(0.1F)
			.sounds(BlockSoundGroup.WOOL)
			.lavaIgnitable()
	);
	public static final Block RED_AMOGUS_PLUSH = new AmogusPlushieBlock(DyeColor.RED,
		QuiltBlockSettings.create()
			.mapColor(MapColor.SNOW)
			.strength(0.1F)
			.sounds(BlockSoundGroup.WOOL)
			.lavaIgnitable()
	);
	public static final Block BLACK_AMOGUS_PLUSH = new AmogusPlushieBlock(DyeColor.BLACK,
		QuiltBlockSettings.create()
			.mapColor(MapColor.SNOW)
			.strength(0.1F)
			.sounds(BlockSoundGroup.WOOL)
			.lavaIgnitable()
	);

	public static void register() {
		MMSI.LOGGER.info(" [ST] Registering blocks...");
		registerBlock(AMOGUS_PLUSH, "amogus_plush", ItemGroups.COLORED_BLOCKS);
		registerBlock(ORANGE_AMOGUS_PLUSH, "orange_amogus_plush", ItemGroups.COLORED_BLOCKS);
		registerBlock(MAGENTA_AMOGUS_PLUSH, "magenta_amogus_plush", ItemGroups.COLORED_BLOCKS);
		registerBlock(LIGHT_BLUE_AMOGUS_PLUSH, "light_blue_amogus_plush", ItemGroups.COLORED_BLOCKS);
		registerBlock(YELLOW_AMOGUS_PLUSH, "yellow_amogus_plush", ItemGroups.COLORED_BLOCKS);
		registerBlock(LIME_AMOGUS_PLUSH, "lime_amogus_plush", ItemGroups.COLORED_BLOCKS);
		registerBlock(PINK_AMOGUS_PLUSH, "pink_amogus_plush", ItemGroups.COLORED_BLOCKS);
		registerBlock(GRAY_AMOGUS_PLUSH, "gray_amogus_plush", ItemGroups.COLORED_BLOCKS);
		registerBlock(LIGHT_GRAY_AMOGUS_PLUSH, "light_gray_amogus_plush", ItemGroups.COLORED_BLOCKS);
		registerBlock(CYAN_AMOGUS_PLUSH, "cyan_amogus_plush", ItemGroups.COLORED_BLOCKS);
		registerBlock(PURPLE_AMOGUS_PLUSH, "purple_amogus_plush", ItemGroups.COLORED_BLOCKS);
		registerBlock(BLUE_AMOGUS_PLUSH, "blue_amogus_plush", ItemGroups.COLORED_BLOCKS);
		registerBlock(BROWN_AMOGUS_PLUSH, "brown_amogus_plush", ItemGroups.COLORED_BLOCKS);
		registerBlock(GREEN_AMOGUS_PLUSH, "green_amogus_plush", ItemGroups.COLORED_BLOCKS);
		registerBlock(RED_AMOGUS_PLUSH, "red_amogus_plush", ItemGroups.COLORED_BLOCKS);
		registerBlock(BLACK_AMOGUS_PLUSH, "black_amogus_plush", ItemGroups.COLORED_BLOCKS);
		MMSI.LOGGER.info(" [OK] Registered blocks.");
	}

	public static void registerBlock(Block block, String id, RegistryKey<ItemGroup> group) {
		Registry.register(Registries.BLOCK, new Identifier(MMSI.MOD_ID, id), block);
		ItemInit.registerBlockItem(block, id, group);
	}
}
