package fletchermed.b3;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Equipment;

public class WearableCarvedMelonBlock extends CarvedMelonBlock implements Equipment {
    public static final MapCodec<WearableCarvedMelonBlock> CODEC = createCodec(WearableCarvedMelonBlock::new);

    public MapCodec<WearableCarvedMelonBlock> getCodec() {
        return CODEC;
    }

    public WearableCarvedMelonBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    public EquipmentSlot getSlotType() {
        return EquipmentSlot.HEAD;
    }
}