package me.dovide.stuff.items;

import me.dovide.stuff.RandomStuff;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RUBY_ORE = new Block(FabricBlockSettings.create().strength(5.5f).requiresTool());
    public static final BlockItem RUBY_ORE_ITEM = new BlockItem(RUBY_ORE, new FabricItemSettings());

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.create().strength(7f).requiresTool());
    public static final BlockItem RUBY_BLOCK_ITEM = new BlockItem(RUBY_BLOCK, new FabricItemSettings());

    private static Block registerBlock(String name, Block block){
        return Registry.register(Registries.BLOCK, new Identifier(RandomStuff.MOD_ID, name), block);
    }

    private static BlockItem registerBlockItem(String name, BlockItem blockItem){
        return Registry.register(Registries.ITEM, new Identifier(RandomStuff.MOD_ID, name), blockItem);
    }


    public static void registerAll(){
        registerBlock("ruby_ore", RUBY_ORE);
        registerBlock("ruby_block", RUBY_BLOCK);

        registerBlockItem("ruby_ore", RUBY_ORE_ITEM);
        registerBlockItem("ruby_block", RUBY_BLOCK_ITEM);
    }

}
