package com.example.examplemod;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.SoundEvent.*;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import com.example.examplemod.Reference.*;




public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item.ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool copper", 1, 180, 5.0F, 1.5F, 5);

    public static final ItemArmor.ArmorMaterial ARMOUR_COPPER = EnumHelper.addArmorMaterial("armour_copper", Reference.MODID + ": copper", 13, new int[]{1, 4, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);


    //Предмет
    public static final Item COPPER_INGOT = new ItemBase("copper_ingot");

    //Инструменты
    public static final Item AXE_COPPER = new ToolAxe("axe_copper", TOOL_COPPER);

    public static final Item SWORD_COPPER = new ToolSword("sword_copper", TOOL_COPPER);
    public static final Item HOE_COPPER = new ToolHoe("hoe_copper", TOOL_COPPER);
    public static final Item PICKAXE_COPPER = new ToolPickaxe("pickaxe_copper", TOOL_COPPER);
    public static final Item SHOVEL_COPPER = new ToolShovel("shovel_copper", TOOL_COPPER);


    //Броня
    public static final Item HELMET_COPPER = new ArmourBase("helmet_copper", ARMOUR_COPPER, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_COPPER = new ArmourBase("chestplate_copper", ARMOUR_COPPER, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_COPPER = new ArmourBase("leggings_copper", ARMOUR_COPPER, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_COPPER = new ArmourBase("boots_copper", ARMOUR_COPPER, 1, EntityEquipmentSlot.FEET);

}
