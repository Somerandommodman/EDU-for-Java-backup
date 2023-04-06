
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eduforjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.eduforjava.block.SmallblackboardBlock;
import net.mcreator.eduforjava.block.LabtableBlock;
import net.mcreator.eduforjava.block.BbarrierBlock;
import net.mcreator.eduforjava.block.BarrierBlock;
import net.mcreator.eduforjava.EduForJavaMod;

public class EduForJavaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EduForJavaMod.MODID);
	public static final RegistryObject<Block> BBARRIER = REGISTRY.register("bbarrier", () -> new BbarrierBlock());
	public static final RegistryObject<Block> BARRIER = REGISTRY.register("barrier", () -> new BarrierBlock());
	public static final RegistryObject<Block> SMALLBLACKBOARD = REGISTRY.register("smallblackboard", () -> new SmallblackboardBlock());
	public static final RegistryObject<Block> LABTABLE = REGISTRY.register("labtable", () -> new LabtableBlock());
}
