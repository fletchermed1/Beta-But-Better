package fletchermed.b3;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class VanillaBlocks {

    // There is probably a better way to do this but I am learning java and stuff as I go and I just need a quick and easy way to edit vanilla blocks for now
    public static void initialize() {
    }

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(BetaButBetter.VANILLA_ID, name);
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        return Registry.register(Registries.BLOCK, id, block);
    }

    public static final Block MELON = register(
            new Melon(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOD).strength(1.0F)),
            "melon",
            true
    );
}
