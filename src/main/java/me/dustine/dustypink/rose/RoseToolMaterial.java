package me.dustine.dustypink.rose;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RoseToolMaterial implements ToolMaterial {
  public static final RoseToolMaterial INSTANCE = new RoseToolMaterial();

  @Override
  public int getDurability() {
    return 1280;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    return 12.0F;
  }

  @Override
  public float getAttackDamage() {
    return 2.0F;
  }

  @Override
  public int getMiningLevel() {
    return 2;
  }

  @Override
  public int getEnchantability() {
    return 25;
  }

  @Override
  public Ingredient getRepairIngredient() {
    return Ingredient.ofItems(Items.COPPER_INGOT);
  }

}
