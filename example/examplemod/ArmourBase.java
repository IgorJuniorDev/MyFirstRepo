package com.example.examplemod;

import net.minecraft.item.ItemArmor;
import com.example.examplemod.IHasModule;
import net.minecraft.item.ItemArmor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.example.examplemod.ItemInit;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ArmourBase extends ItemArmor implements IHasModule {

    public ArmourBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot entityEquipmentSlot)
    {
        super(materialIn, renderIndexIn, entityEquipmentSlot);
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
