package me.dustine.dustypink.rose;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class RoseArmorMaterial implements ArmorMaterial {
  public static final RoseArmorMaterial INSTANCE = new RoseArmorMaterial();

  private static final int[] BASE_DURABILITY = new int[] { 13, 15, 16, 11 };
  private static final int[] PROTECTION_VALUES = new int[] { 2, 5, 6, 2 };

  @Override
  public int getDurability(EquipmentSlot slot) {
    return BASE_DURABILITY[slot.getEntitySlotId()] * 25;
  }

  @Override
  public int getProtectionAmount(EquipmentSlot slot) {
    return PROTECTION_VALUES[slot.getEntitySlotId()];
  }

  @Override
  public int getEnchantability() {
    return 28;
  }

  @Override
  public SoundEvent getEquipSound() {
    return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
  }

  @Override
  public Ingredient getRepairIngredient() {
    return Ingredient.ofItems(Items.COPPER_INGOT);
  }

  @Override
  public String getName() {
    return "rose";
  }

  @Override
  public float getToughness() {
    return 1.0F;
  }

  @Override
  public float getKnockbackResistance() {
    return 0;
  }

}

/*
 * | Iron | Turtle | Rose | Diamond |
 * 
 * 
 */
