package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

import javax.tools.Tool;

public class ToolHoe extends ItemHoe implements IHasModule {

    public ToolHoe(String name, ToolMaterial material){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        CommonProxy commonProxy = new CommonProxy();
        commonProxy.registerItemRenderer(this, 0, "inventory");
    }

}
