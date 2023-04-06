
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eduforjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.eduforjava.EduForJavaMod;

public class EduForJavaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EduForJavaMod.MODID);
	public static final RegistryObject<Item> BBARRIER = block(EduForJavaModBlocks.BBARRIER, EduForJavaModTabs.TAB_EDU);
	public static final RegistryObject<Item> BARRIER = block(EduForJavaModBlocks.BARRIER, EduForJavaModTabs.TAB_EDU);
	public static final RegistryObject<Item> SMALLBLACKBOARD = block(EduForJavaModBlocks.SMALLBLACKBOARD, EduForJavaModTabs.TAB_EDU);
	public static final RegistryObject<Item> LABTABLE = block(EduForJavaModBlocks.LABTABLE, EduForJavaModTabs.TAB_EDU);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
