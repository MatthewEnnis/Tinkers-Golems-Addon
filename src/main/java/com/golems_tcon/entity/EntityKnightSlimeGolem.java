package com.golems_tcon.entity;

import com.golems.entity.GolemBase;
import com.golems_tcon.init.TconGolems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import slimeknights.tconstruct.shared.TinkerCommons;

public class EntityKnightSlimeGolem extends GolemBase {
	
	public EntityKnightSlimeGolem(World world) {
		super(world);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.238D);
		this.setLootTableLoc(TconGolems.MODID, "golem_knightslime");
		this.setCreativeReturn(TinkerCommons.blockKnightSlime);
	}

	@Override
	protected ResourceLocation applyTexture() {
		return GolemBase.makeGolemTexture(TconGolems.MODID, "knightslime");
	}

	@Override
	public SoundEvent getGolemSound() {
		return SoundEvents.BLOCK_METAL_STEP;
	}
}