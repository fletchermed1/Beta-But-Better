//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package fletchermed.b3;

import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import com.mojang.serialization.MapCodec;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.Direction;
import net.minecraft.block.Block;

public class CarvedMelonBlock extends HorizontalFacingBlock {
    public static final MapCodec<CarvedMelonBlock> CODEC = createCodec(CarvedMelonBlock::new);
    public MapCodec<? extends CarvedMelonBlock> getCodec() {
        return CODEC;
    }

    public CarvedMelonBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING});
    }

}
