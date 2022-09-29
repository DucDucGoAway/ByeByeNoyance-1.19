package net.duc.byebyenoyance.item;

import net.duc.byebyenoyance.ByeByeNoyance;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item SCULKED_DEEPSLATE_BRICKS = registerItem("sculked_deepslate_bricks",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ByeByeNoyance.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ByeByeNoyance.LOGGER.info("Registering ModItems for " + ByeByeNoyance.MOD_ID);
    }

}
