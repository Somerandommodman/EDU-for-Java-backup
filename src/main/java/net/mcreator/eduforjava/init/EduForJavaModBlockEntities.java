
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.eduforjava.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.eduforjava.block.entity.LabtableBlockEntity;
import net.mcreator.eduforjava.EduForJavaMod;

public class EduForJavaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			EduForJavaMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> LABTABLE = register("labtable", EduForJavaModBlocks.LABTABLE, LabtableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
