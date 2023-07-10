package me.dovide.stuff.customtools;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class CustomHoe extends HoeItem {
    public CustomHoe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
