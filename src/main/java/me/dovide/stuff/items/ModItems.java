package me.dovide.stuff.items;

import me.dovide.stuff.RandomStuff;
import me.dovide.stuff.customtools.*;
import me.dovide.stuff.materials.RubyToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // Ruby Items
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    // All the ruby tools
    public static final Item RUBY_SWORD = registerItem("ruby_sword", new CustomSword(RubyToolMaterial.INSTANCE, 7, 1.2f, new Item.Settings()));
    public static final Item RUBY_PICK = registerItem("ruby_pickaxe", new CustomPick(RubyToolMaterial.INSTANCE, 2, 1.2f, new Item.Settings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new CustomAxe(RubyToolMaterial.INSTANCE, 9, 2.2f, new Item.Settings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new CustomHoe(RubyToolMaterial.INSTANCE, 1, 1f, new Item.Settings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new CustomShovel(RubyToolMaterial.INSTANCE, 1, 1.4f, new Item.Settings()));

    private static void addItemToIngredients(FabricItemGroupEntries entries){
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(RandomStuff.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToIngredients);
    }

}
