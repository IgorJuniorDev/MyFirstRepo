package com.example.examplemod;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    public static void onBlockRegister(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }


    public static void onModelRegister(ModelRegistryEvent event){
        for (Item item : ItemInit.ITEMS)
        {
            if (item instanceof IHasModule){
                ((IHasModule) item).registerModels();
            }
        }

        for (Block block : BlockInit.BLOCKS){
            if (block instanceof IHasModule){
                ((IHasModule) block).registerModels();
            }
        }
    }
}
