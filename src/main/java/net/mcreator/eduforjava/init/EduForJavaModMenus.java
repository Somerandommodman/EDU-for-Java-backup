
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eduforjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.eduforjava.world.inventory.LabTableMenu;
import net.mcreator.eduforjava.EduForJavaMod;

public class EduForJavaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EduForJavaMod.MODID);
	public static final RegistryObject<MenuType<LabTableMenu>> LAB_TABLE = REGISTRY.register("lab_table",
			() -> IForgeMenuType.create(LabTableMenu::new));
}
