package ru.vueproject.bonsaiextra;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant.EnumPlantType;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IPlantable;

public class SoilBlock extends Block {
	public SoilBlock(String blockName) {
		super(Material.GRASS);
        this.setRegistryName(blockName);
        this.setUnlocalizedName(blockName);
        this.setCreativeTab(BonsaiExtraMod.CTAB);
        this.setSoundType(SoundType.SAND);
	}
}
