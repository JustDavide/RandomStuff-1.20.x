package me.dovide.stuff.materials;

import me.dovide.stuff.items.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RubyToolMaterial implements ToolMaterial {

    public static final RubyToolMaterial INSTANCE = new RubyToolMaterial();

    @Override
    public int getDurability() {
        return 1200;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9.5f;
    }

    @Override
    public float getAttackDamage() {
        return 7f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 32;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.RUBY);
    }
}
