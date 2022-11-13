
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eduforjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.eduforjava.block.BarrierBlock;
import net.mcreator.eduforjava.EduForJavaMod;

public class EduForJavaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EduForJavaMod.MODID);
	public static final RegistryObject<Block> BARRIER = REGISTRY.register("barrier", () -> new BarrierBlock());
}
