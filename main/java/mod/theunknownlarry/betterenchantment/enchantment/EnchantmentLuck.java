package mod.theunknownlarry.betterenchantment.enchantment;

import mod.theunknownlarry.betterenchantment.Main;
import mod.theunknownlarry.betterenchantment.init.EnchantmentInit;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class EnchantmentLuck extends Enchantment {

	public EnchantmentLuck() {
		
		super(Rarity.VERY_RARE, EnumEnchantmentType.ARMOR_HEAD, new EntityEquipmentSlot[] {EntityEquipmentSlot.HEAD});
		this.setName("Luck");
		this.setRegistryName(new ResourceLocation(Main.MODID + ":Luck"));
		
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
		
		return 1;
		
	}
	
	@Override
	protected boolean canApplyTogether(Enchantment ench) {
		
		return super.canApplyTogether(ench) && ench != mod.theunknownlarry.betterenchantment.init.EnchantmentInit.BAD_LUCK;
		
	}

}
