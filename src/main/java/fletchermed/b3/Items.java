package fletchermed.b3;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Items {
    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(Items.COBBLESTONE_BRICK));
    }

    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(BetaButBetter.MOD_ID, id);
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
        return registeredItem;
    }

    public static final Item COBBLESTONE_BRICK = register(
            new Item(new Item.Settings()),
            "cobblestone_brick"
    );

}