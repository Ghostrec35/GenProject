package genesis.item;

import genesis.common.GenesisConfig;
import genesis.common.GenesisCreativeTabs;
import genesis.util.Constants;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFlintAndSteel;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ItemFlintAndMarcasite extends ItemFlintAndSteel {
    public ItemFlintAndMarcasite() {
        super();
        setMaxDamage(GenesisConfig.flintAndMarcasiteMaxDamage);
        setCreativeTab(GenesisCreativeTabs.TOOLS);
    }

    @Override
    public Item setUnlocalizedName(String unlocalizedName) {
        return super.setUnlocalizedName(Constants.setUnlocalizedName(unlocalizedName));
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
        pos = pos.offset(side);

        if (!playerIn.canPlayerEdit(pos, side, stack)) {
            return false;
        } else {
            if (worldIn.isAirBlock(pos)) {
                worldIn.playSoundEffect((double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D, Constants.MOD_ID + ":fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
                worldIn.setBlockState(pos, Blocks.fire.getDefaultState());
            }

            stack.damageItem(1, playerIn);
            return true;
        }
    }
}