package genesis.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GenesisProxy {
    public void registerBlock(Block block, String name) {
        GameRegistry.registerBlock(block, name);
    }

    public void registerItem(Item item, String name) {
        GameRegistry.registerItem(item, name);
    }

    protected void preInit() {}

    protected void init() {}

    protected void postInit() {}
}