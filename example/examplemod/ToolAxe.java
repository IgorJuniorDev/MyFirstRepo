package com.example.examplemod;

import com.google.common.collect.Sets;
import com.jcraft.jorbis.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.block.state.IBlockState;

import java.util.HashSet;
import java.util.Set;


public class ToolAxe extends ItemAxe implements IHasModule {

    private static final HashSet<Block> EFFECTIVE_ON = Sets.newHashSet();
    public ToolAxe(String name, Item.ToolMaterial material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        CommonProxy commonProxy = new CommonProxy();
        commonProxy.registerItemRenderer(this, 0, "inventory");
    }

}
