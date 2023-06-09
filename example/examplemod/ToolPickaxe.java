package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModule {

    public ToolPickaxe(String name, Item.ToolMaterial material){
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
