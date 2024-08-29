package fletchermed.b3;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class Blocks {

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> {
            itemGroup.add(Blocks.CARVED_MELON.asItem());
            itemGroup.add(Blocks.JOHN_O_LANTERN.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(Blocks.IRON_GRATE.asItem());
        });
    }

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(BetaButBetter.MOD_ID, name);
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        return Registry.register(Registries.BLOCK, id, block);
    }

    public static final Block CARVED_MELON = register(
            new WearableCarvedMelonBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(1.0F)),
            "carved_melon",
            true
    );

    public static final Block JOHN_O_LANTERN = register(
            new CarvedMelonBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(1.0F).luminance(state -> 15)),
            "john_o_lantern",
            true
    );

    public static final Block IRON_GRATE = register(
            new TranslucentBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).strength(3.0F).nonOpaque().solidBlock(net.minecraft.block.Blocks::never).suffocates(net.minecraft.block.Blocks::never).blockVision(net.minecraft.block.Blocks::never)),
            "iron_grate",
            true
    );
}
