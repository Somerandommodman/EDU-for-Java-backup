
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eduforjava.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class EduForJavaModTabs {
	public static CreativeModeTab TAB_EDU;

	public static void load() {
		TAB_EDU = new CreativeModeTab("tabedu") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.STRUCTURE_BLOCK);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
