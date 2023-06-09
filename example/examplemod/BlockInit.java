package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;
public class BlockInit {
    public static final List<BlockBase> BLOCKS = new ArrayList<BlockBase>();

    public static final Block BLOCK_COPPER;

    static {
        BLOCK_COPPER = new BlockBase("block copper", Material.IRON);
    }
}
