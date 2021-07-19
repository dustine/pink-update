package me.dustine.dustypink.rose;

import me.dustine.dustypink.CustomAxeItem;
import me.dustine.dustypink.CustomHoeItem;
import me.dustine.dustypink.CustomPickaxeItem;
import me.dustine.dustypink.PinkUpdate;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Rose {
  private Rose() {
  }

  // Rose Tools
  public static final ToolItem ROSE_AXE = new CustomAxeItem(RoseToolMaterial.INSTANCE, 5.0F, -3.0F,
      new Item.Settings().group(ItemGroup.TOOLS));
  public static final ToolItem ROSE_HOE = new CustomHoeItem(RoseToolMaterial.INSTANCE, -2, -1.0F,
      new Item.Settings().group(ItemGroup.TOOLS));
  public static final ToolItem ROSE_PICKAXE = new CustomPickaxeItem(RoseToolMaterial.INSTANCE, 1, -2.8F,
      new Item.Settings().group(ItemGroup.TOOLS));
  public static final ToolItem ROSE_SHOVEL = new ShovelItem(RoseToolMaterial.INSTANCE, 1.50F, -3.0F,
      new Item.Settings().group(ItemGroup.TOOLS));
  public static final ToolItem ROSE_SWORD = new SwordItem(RoseToolMaterial.INSTANCE, 3, -2.4F,
      new Item.Settings().group(ItemGroup.COMBAT));

  // Rose Armor
  public static final ArmorItem ROSE_BOOTS = new ArmorItem(RoseArmorMaterial.INSTANCE, EquipmentSlot.FEET,
      new Item.Settings().group(ItemGroup.COMBAT));
  public static final ArmorItem ROSE_CHESTPLATE = new ArmorItem(RoseArmorMaterial.INSTANCE, EquipmentSlot.CHEST,
      new Item.Settings().group(ItemGroup.COMBAT));
  public static final ArmorItem ROSE_HELMET = new ArmorItem(RoseArmorMaterial.INSTANCE, EquipmentSlot.HEAD,
      new Item.Settings().group(ItemGroup.COMBAT));
  public static final ArmorItem ROSE_LEGGINGS = new ArmorItem(RoseArmorMaterial.INSTANCE, EquipmentSlot.LEGS,
      new Item.Settings().group(ItemGroup.COMBAT));

  // Rose Blocks
  public static final Block ROSE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));

  public static void register() {
    // Rose Items
    Registry.register(Registry.ITEM, new Identifier(PinkUpdate.MOD_ID, "rose_axe"), ROSE_AXE);
    Registry.register(Registry.ITEM, new Identifier(PinkUpdate.MOD_ID, "rose_hoe"), ROSE_HOE);
    Registry.register(Registry.ITEM, new Identifier(PinkUpdate.MOD_ID, "rose_pickaxe"), ROSE_PICKAXE);
    Registry.register(Registry.ITEM, new Identifier(PinkUpdate.MOD_ID, "rose_shovel"), ROSE_SHOVEL);
    Registry.register(Registry.ITEM, new Identifier(PinkUpdate.MOD_ID, "rose_sword"), ROSE_SWORD);

    // Rose Armor
    Registry.register(Registry.ITEM, new Identifier(PinkUpdate.MOD_ID, "rose_boots"), ROSE_BOOTS);
    Registry.register(Registry.ITEM, new Identifier(PinkUpdate.MOD_ID, "rose_chestplate"), ROSE_CHESTPLATE);
    Registry.register(Registry.ITEM, new Identifier(PinkUpdate.MOD_ID, "rose_helmet"), ROSE_HELMET);
    Registry.register(Registry.ITEM, new Identifier(PinkUpdate.MOD_ID, "rose_leggings"), ROSE_LEGGINGS);

    // Rose Block
    Registry.register(Registry.BLOCK, new Identifier(PinkUpdate.MOD_ID, "rose_block"), ROSE_BLOCK);
    Registry.register(Registry.ITEM, new Identifier(PinkUpdate.MOD_ID, "rose_block"), new BlockItem(ROSE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
  }

}
