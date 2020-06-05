package mod.theunknownlarry.betterenchantment.enchantment;

import mod.theunknownlarry.betterenchantment.Main;
import mod.theunknownlarry.betterenchantment.init.EnchantmentInit;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class EnchantmentInstantHealth extends Enchantment {

	public EnchantmentInstantHealth() {
		
		super(Rarity.VERY_RARE, EnumEnchantmentType.ARMOR, new EntityEquipmentSlot[] {EntityEquipmentSlot.HEAD,EntityEquipmentSlot.CHEST,EntityEquipmentSlot.LEGS,EntityEquipmentSlot.FEET});
		this.setName("Instant Health");
		this.setRegistryName(new ResourceLocation(Main.MODID + ":instant_health"));
		
		EnchantmentInit.ENCHANTMENTS.add(this);
		
	}
	
	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		
		return 20 * enchantmentLevel;
		
	}
	
	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		
		return this.getMinEnchantability(enchantmentLevel) + 10;
		
	}
	
	@Override
	public int getMaxLevel() {
		
		return 2;
		
	}
	
	@Override
	protected boolean canApplyTogether(Enchantment ench) {
		
		return super.canApplyTogether(ench) && ench != mod.theunknownlarry.betterenchantment.init.EnchantmentInit.INSTANT_DAMAGE && ench != mod.theunknownlarry.betterenchantment.init.EnchantmentInit.POISON && ench != mod.theunknownlarry.betterenchantment.init.EnchantmentInit.WITHER;
		
	}

}
