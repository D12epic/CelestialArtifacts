package com.xiaoyue.celestial_artifacts.data;

import com.tterrag.registrate.providers.RegistrateRecipeProvider;
import com.tterrag.registrate.util.DataIngredient;
import com.tterrag.registrate.util.entry.RegistryEntry;
import com.xiaoyue.celestial_artifacts.register.CAItems;
import com.xiaoyue.celestial_core.register.CCItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.BiFunction;

public class CARecipeGen {

	public static void onRecipeGen(RegistrateRecipeProvider pvd) {
		// curios
		{
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.SEA_GOD_SCROLL.get(), 1)::unlockedBy, Items.TRIDENT).pattern("DEB").pattern("ACD").pattern("FDF").define('A', Items.TRIDENT).define('B', Items.PAPER).define('C', Items.HEART_OF_THE_SEA).define('D', Items.PRISMARINE_SHARD).define('E', CCItems.OCEAN_ESSENCE.get()).define('F', Items.PRISMARINE_CRYSTALS).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.TWISTED_SCROLL.get(), 1)::unlockedBy, Items.PAPER).pattern(" AA").pattern("ADB").pattern("AAC").define('A', Items.PAPER).define('B', Items.AMETHYST_SHARD).define('C', Items.INK_SAC).define('D', CCItems.MIDNIGHT_FRAGMENT.get()).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.SKYWALKER_SCROLL.get(), 1)::unlockedBy, Items.PAPER).pattern("CBA").pattern("BAB").pattern("ABD").define('A', Items.PAPER).define('B', Items.ENDER_PEARL).define('C', Items.GLOW_INK_SAC).define('D', CCItems.LIGHT_FRAGMENT.get()).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.TWISTED_SCABBARD.get(), 1)::unlockedBy, CAItems.IRON_SCABBARD.get()).pattern(" CB").pattern("CAC").pattern("DC ").define('A', CAItems.IRON_SCABBARD.get()).define('B', Items.END_CRYSTAL).define('C', Items.NETHERITE_INGOT).define('D', CCItems.DEATH_ESSENCE.get()).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.TITAN_SCABBARD.get(), 1)::unlockedBy, CAItems.IRON_SCABBARD.get()).pattern(" DB").pattern("EAD").pattern("CE ").define('A', CAItems.IRON_SCABBARD.get()).define('B', CCItems.LIGHT_FRAGMENT.get()).define('C', Items.EXPERIENCE_BOTTLE).define('D', Items.GOLD_INGOT).define('E', Items.LIME_DYE).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.MAGIC_ARROW_BAG.get(), 1)::unlockedBy, Items.AMETHYST_SHARD).pattern("ABB").pattern("CBB").pattern("ACA").define('A', Items.AMETHYST_SHARD).define('B', Items.ARROW).define('C', Items.LEATHER).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.IRON_SCABBARD.get(), 1)::unlockedBy, Items.IRON_INGOT).pattern("BA ").pattern("A A").pattern("AAB").define('A', Items.IRON_INGOT).define('B', Items.LEATHER).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.FLAME_ARROW_BAG.get(), 1)::unlockedBy, Items.BLAZE_POWDER).pattern("BAB").pattern("ACA").pattern("BAB").define('A', Items.BLAZE_POWDER).define('B', Items.REDSTONE).define('C', CAItems.MAGIC_ARROW_BAG.get()).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.CHAOTIC_PENDANT.get(), 1)::unlockedBy, Items.ENCHANTED_BOOK).pattern(" C ").pattern("BDB").pattern(" A ").define('A', Items.ENCHANTED_BOOK).define('B', Items.BLAZE_POWDER).define('C', CAItems.THE_END_DUST.get()).define('D', CAItems.UNOWNED_PENDANT.get()).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.SHADOW_PENDANT.get(), 1)::unlockedBy, Items.AMETHYST_SHARD).pattern(" A ").pattern("CED").pattern(" B ").define('A', Items.AMETHYST_SHARD).define('B', Items.NETHERITE_INGOT).define('C', CCItems.VOID_ESSENCE.get()).define('D', CAItems.THE_END_DUST.get()).define('E', CAItems.UNOWNED_PENDANT.get()).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.PRAYER_CROWN.get(), 1)::unlockedBy, Items.REDSTONE_BLOCK).pattern("B B").pattern("BAB").pattern("CDC").define('A', Items.REDSTONE_BLOCK).define('B', Items.GOLD_INGOT).define('C', Items.IRON_INGOT).define('D', CAItems.CROSS_NECKLACE.get()).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.EVIL_EYE.get(), 1)::unlockedBy, Items.ENDER_EYE).pattern(" B ").pattern("BAB").pattern("DCD").define('A', Items.ENDER_EYE).define('B', Items.BLAZE_POWDER).define('C', Items.INK_SAC).define('D', Items.IRON_INGOT).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.SEA_GOD_CROWN.get(), 1)::unlockedBy, Items.PRISMARINE_SHARD).pattern("A A").pattern("ADA").pattern("BCB").define('A', Items.PRISMARINE_SHARD).define('B', Items.DIAMOND).define('C', Items.HEART_OF_THE_SEA).define('D', CCItems.OCEAN_ESSENCE.get()).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.ABYSS_CORE.get(), 1)::unlockedBy, Items.DIAMOND).pattern(" A ").pattern("CBC").pattern("DCD").define('A', Items.DIAMOND).define('B', Items.ENDER_PEARL).define('C', Items.PRISMARINE_SHARD).define('D', CCItems.VOID_ESSENCE.get()).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.PURIFIED_POWDER.get(), 1)::unlockedBy, Items.REDSTONE).pattern("   ").pattern(" C ").pattern("BAB").define('A', Items.REDSTONE).define('B', CCItems.LIGHT_FRAGMENT.get()).define('C', Items.EXPERIENCE_BOTTLE).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.BACKTRACK_MIRROR.get(), 1)::unlockedBy, Items.ENDER_PEARL).pattern(" BA").pattern("CEB").pattern("DC ").define('A', Items.ENDER_PEARL).define('B', Items.ECHO_SHARD).define('C', Items.COPPER_INGOT).define('D', Items.NETHERITE_INGOT).define('E', Items.GLASS_PANE).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.REPENT_MIRROR.get(), 1)::unlockedBy, Items.ECHO_SHARD).pattern(" BA").pattern("CEB").pattern("DC ").define('A', Items.ECHO_SHARD).define('B', CCItems.LIGHT_FRAGMENT.get()).define('C', Items.DIAMOND).define('D', Items.NETHERITE_INGOT).define('E', Items.GLASS_PANE).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.CURSED_TALISMAN.get(), 1)::unlockedBy, Items.NETHERITE_INGOT).pattern("ABA").pattern("CEC").pattern(" D ").define('A', Items.NETHERITE_INGOT).define('B', CCItems.MIDNIGHT_FRAGMENT.get()).define('C', Items.BLAZE_POWDER).define('D', Items.GHAST_TEAR).define('E', Items.ENCHANTED_BOOK).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.KNIGHT_SHELTER.get(), 1)::unlockedBy, Items.NETHER_STAR).pattern("BAB").pattern("BCB").pattern(" B ").define('A', Items.NETHER_STAR).define('B', Items.GOLD_INGOT).define('C', CCItems.LIGHT_FRAGMENT.get()).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.WAR_DEAD_BADGE.get(), 1)::unlockedBy, CCItems.FIRE_ESSENCE.get()).pattern("DCD").pattern("BEA").pattern("DCD").define('A', CCItems.FIRE_ESSENCE.get()).define('B', CCItems.DEATH_ESSENCE.get()).define('C', CAItems.THE_END_DUST.get()).define('D', Items.NETHERITE_INGOT).define('E', Items.SKELETON_SKULL).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.GLUTTONY_BADGE.get(), 1)::unlockedBy, Items.IRON_INGOT).pattern("BAB").pattern("ACA").pattern("BAB").define('A', Items.IRON_INGOT).define('B', Items.ROTTEN_FLESH).define('C', CCItems.DEATH_ESSENCE.get()).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.CORRUPT_BADGE.get(), 1)::unlockedBy, Items.SHULKER_SHELL).pattern(" E ").pattern("CBA").pattern(" D ").define('A', Items.SHULKER_SHELL).define('B', CAItems.THE_END_DUST.get()).define('C', Items.ENDER_PEARL).define('D', Items.POTION).define('E', Items.NETHERITE_INGOT).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.SOUL_BOX.get(), 1)::unlockedBy, Items.NETHERITE_INGOT).pattern("DED").pattern("ABA").pattern("CAC").define('A', Items.NETHERITE_INGOT).define('B', Items.GOLD_INGOT).define('C', CCItems.LIGHT_FRAGMENT.get()).define('D', Items.GOLD_INGOT).define('E', Items.AMETHYST_BLOCK).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.HOLY_TALISMAN.get(), 1)::unlockedBy, CCItems.PURE_NETHER_STAR.get()).pattern("ABB").pattern("CDB").pattern("ECC").define('A', CCItems.PURE_NETHER_STAR.get()).define('B', Items.FEATHER).define('C', Items.GOLD_INGOT).define('D', CAItems.HEIRLOOM_NECKLACE.get()).define('E', CCItems.LIGHT_FRAGMENT.get()).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.SOLAR_MAGNET.get(), 1)::unlockedBy, Items.IRON_INGOT).pattern("B B").pattern("ADA").pattern("ACA").define('A', Items.IRON_INGOT).define('B', Items.REDSTONE).define('C', CCItems.LIGHT_FRAGMENT.get()).define('D', Items.EXPERIENCE_BOTTLE).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.ANGEL_PEARL.get(), 1)::unlockedBy, Items.ENDER_PEARL).pattern(" D ").pattern("BAB").pattern("CCC").define('A', Items.ENDER_PEARL).define('B', Items.FEATHER).define('C', Items.DIAMOND).define('D', CCItems.PURE_NETHER_STAR.get()).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.ABYSS_WILL_BADGE.get(), 1)::unlockedBy, Items.ECHO_SHARD).pattern("DCD").pattern("DBD").pattern("EAE").define('A', Items.ECHO_SHARD).define('B', Items.ENDER_PEARL).define('C', CCItems.VOID_ESSENCE.get()).define('D', Items.NETHERITE_INGOT).define('E', Items.DISC_FRAGMENT_5).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.CURSED_PROTECTOR.get(), 1)::unlockedBy, Items.NETHERITE_INGOT).pattern("ABA").pattern("ACA").pattern(" A ").define('A', Items.NETHERITE_INGOT).define('B', CCItems.DEATH_ESSENCE.get()).define('C', Items.ENDER_PEARL).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.ANGEL_HEART.get(), 1)::unlockedBy, CCItems.PURE_NETHER_STAR.get()).pattern(" B ").pattern("BAB").pattern("CDC").define('A', CCItems.PURE_NETHER_STAR.get()).define('B', Items.FEATHER).define('C', Items.DIAMOND).define('D', Items.DIAMOND_BLOCK).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.DESTROYER_BADGE.get(), 1)::unlockedBy, Items.PIGLIN_HEAD).pattern("CBC").pattern("BAB").pattern("DCD").define('A', Items.PIGLIN_HEAD).define('B', Items.GOLD_INGOT).define('C', Items.AMETHYST_SHARD).define('D', Items.BONE_BLOCK).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.UNDEAD_CHARM.get(), 1)::unlockedBy, Items.SKELETON_SKULL).pattern("DCD").pattern("BAB").pattern("EBE").define('A', Items.SKELETON_SKULL).define('B', Items.GLISTERING_MELON_SLICE).define('C', Items.IRON_INGOT).define('D', Items.IRON_NUGGET).define('E', Items.BONE_BLOCK).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.CURSED_TOTEM.get(), 1)::unlockedBy, Items.ECHO_SHARD).pattern(" E ").pattern("CDC").pattern("BAB").define('A', Items.ECHO_SHARD).define('B', Items.WITHER_ROSE).define('C', CCItems.MIDNIGHT_FRAGMENT.get()).define('D', Items.TOTEM_OF_UNDYING).define('E', Items.ENDER_PEARL).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.GREEDY_HEART.get(), 1)::unlockedBy, CCItems.HEART_FRAGMENT.get()).pattern("CBC").pattern("BAB").pattern("DBD").define('A', CCItems.HEART_FRAGMENT.get()).define('B', Items.NETHER_STAR).define('C', Items.NETHERITE_BLOCK).define('D', Items.GOLD_BLOCK).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.EMERALD_RING.get(), 1)::unlockedBy, Items.EMERALD).pattern("AAA").pattern("A A").pattern("AAA").define('A', Items.EMERALD).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.NETHERITE_RING.get(), 1)::unlockedBy, CAItems.DIAMOND_RING.get()).pattern(" B ").pattern("BAB").pattern(" B ").define('A', CAItems.DIAMOND_RING.get()).define('B', Items.NETHERITE_SCRAP).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.NETHER_FIRE.get(), 1)::unlockedBy, CAItems.NETHERITE_RING.get()).pattern(" C ").pattern("BAB").pattern(" D ").define('A', CAItems.NETHERITE_RING.get()).define('B', Items.BLAZE_POWDER).define('C', Items.REDSTONE).define('D', CCItems.FIRE_ESSENCE.get()).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.GOLD_RING.get(), 1)::unlockedBy, Items.GOLD_INGOT).pattern("AAA").pattern("A A").pattern("AAA").define('A', Items.GOLD_INGOT).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.FLIGHT_RING.get(), 1)::unlockedBy, CAItems.GOLD_RING.get()).pattern(" C ").pattern("BAB").pattern("   ").define('A', CAItems.GOLD_RING.get()).define('B', Items.FEATHER).define('C', CCItems.SOARING_WINGS.get()).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.FREEZE_RING.get(), 1)::unlockedBy, CAItems.DIAMOND_RING.get()).pattern(" B ").pattern("CAC").pattern(" C ").define('A', CAItems.DIAMOND_RING.get()).define('B', Items.BLUE_ICE).define('C', Items.DIAMOND).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.RING_OF_LIFE.get(), 1)::unlockedBy, Items.CHERRY_SAPLING).pattern("ACD").pattern("IBE").pattern("FGH").define('A', Items.CHERRY_SAPLING).define('B', CAItems.EMERALD_RING.get()).define('C', Items.BAMBOO).define('D', Items.GREEN_DYE).define('E', Items.PITCHER_PLANT).define('F', Items.GLOW_BERRIES).define('G', Items.WHEAT_SEEDS).define('H', Items.NETHER_WART).define('I', Items.MANGROVE_PROPAGULE).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.DIAMOND_RING.get(), 1)::unlockedBy, Items.DIAMOND).pattern("AAA").pattern("A A").pattern("AAA").define('A', Items.DIAMOND).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.AMETHYST_RING.get(), 1)::unlockedBy, CAItems.GOLD_RING.get()).pattern(" B ").pattern("BAB").pattern("   ").define('A', CAItems.GOLD_RING.get()).define('B', Items.AMETHYST_SHARD).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.HIDDEN_BRACELET.get(), 1)::unlockedBy, Items.DISC_FRAGMENT_5).pattern("GBG").pattern("ADC").pattern("FEF").define('A', Items.DISC_FRAGMENT_5).define('B', Items.NETHERITE_INGOT).define('C', Items.EXPERIENCE_BOTTLE).define('D', Items.LEATHER).define('E', Items.BLAZE_POWDER).define('F', CCItems.DEATH_ESSENCE.get()).define('G', Items.INK_SAC).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.LIFE_BRACELET.get(), 1)::unlockedBy, Items.REDSTONE).pattern(" A ").pattern("ABA").pattern(" C ").define('A', Items.REDSTONE).define('B', Items.LEATHER).define('C', Items.GHAST_TEAR).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.PRECIOUS_BRACELET.get(), 1)::unlockedBy, Items.AMETHYST_SHARD).pattern(" A ").pattern("ABA").pattern("DCD").define('A', Items.AMETHYST_SHARD).define('B', Items.ENDER_PEARL).define('C', CCItems.TREASURE_FRAGMENT.get()).define('D', Items.DIAMOND).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.EMERALD_BRACELET.get(), 1)::unlockedBy, Items.EMERALD).pattern(" A ").pattern("ABA").pattern(" C ").define('A', Items.EMERALD).define('B', Items.LEATHER).define('C', Items.RABBIT_FOOT).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.LOCK_OF_ABYSS.get(), 1)::unlockedBy, Items.LAPIS_LAZULI).pattern("AAA").pattern("ACA").pattern("DBD").define('A', Items.LAPIS_LAZULI).define('B', Items.DIAMOND).define('C', CCItems.VOID_ESSENCE.get()).define('D', Items.ICE).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.STAR_NECKLACE.get(), 1)::unlockedBy, Items.LAPIS_LAZULI).pattern("AAA").pattern("ABA").pattern("DCD").define('A', Items.LAPIS_LAZULI).define('B', Items.BLAZE_POWDER).define('C', CCItems.MIDNIGHT_FRAGMENT.get()).define('D', Items.GOLD_INGOT).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.GALLOP_NECKLACE.get(), 1)::unlockedBy, Items.GOLD_INGOT).pattern("AAA").pattern("ABA").pattern("DCD").define('A', Items.GOLD_INGOT).define('B', Items.REDSTONE_BLOCK).define('C', Items.RABBIT_FOOT).define('D', Items.SUGAR).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.ENDER_PROTECTOR.get(), 1)::unlockedBy, Items.AMETHYST_SHARD).pattern("EAE").pattern("ABA").pattern("DCD").define('A', Items.AMETHYST_SHARD).define('B', Items.ENDER_EYE).define('C', CCItems.SHULKER_SCRAP.get()).define('D', Items.GLOW_INK_SAC).define('E', Items.AMETHYST_BLOCK).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.HOLY_NECKLACE.get(), 1)::unlockedBy, Items.GOLD_INGOT).pattern("AAA").pattern("ABA").pattern("DCD").define('A', Items.GOLD_INGOT).define('B', CAItems.CROSS_NECKLACE.get()).define('C', CCItems.LIGHT_FRAGMENT.get()).define('D', Items.EXPERIENCE_BOTTLE).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.EMERALD_NECKLACE.get(), 1)::unlockedBy, Items.DIAMOND).pattern("AAA").pattern("ADA").pattern("BCB").define('A', Items.DIAMOND).define('B', Items.IRON_INGOT).define('C', Items.EMERALD).define('D', CCItems.TREASURE_FRAGMENT.get()).save(pvd);
			unlock(pvd, ShapedRecipeBuilder.shaped(RecipeCategory.MISC, CAItems.PRECIOUS_NECKLACE.get(), 1)::unlockedBy, Items.DIAMOND).pattern("AAA").pattern("ABA").pattern("CDC").define('A', Items.DIAMOND).define('B', Items.EXPERIENCE_BOTTLE).define('C', Items.NETHERITE_SCRAP).define('D', CCItems.TREASURE_FRAGMENT.get()).save(pvd);
		}

		// tools
		{
			upgradeEarth(pvd, Items.NETHERITE_AXE, CAItems.EARTH_AXE);
			upgradeEarth(pvd, Items.NETHERITE_HOE, CAItems.EARTH_HOE);
			upgradeEarth(pvd, Items.NETHERITE_SHOVEL, CAItems.EARTH_SHOVEL);
			upgradeEarth(pvd, Items.NETHERITE_PICKAXE, CAItems.EARTH_PICKAXE);
		}
	}

	private static void upgradeEarth(RegistrateRecipeProvider pvd, Item in, RegistryEntry<Item> out) {
		unlock(pvd, SmithingTransformRecipeBuilder.smithing(
				Ingredient.of(CAItems.NEBULA_CUBE),
				Ingredient.of(in), Ingredient.of(CCItems.EARTH_CORE),
				RecipeCategory.MISC, out.get())::unlocks, out.get())
				.save(pvd, out.getId());
	}

	public static <T> T unlock(RegistrateRecipeProvider pvd, BiFunction<String, InventoryChangeTrigger.TriggerInstance, T> func, Item item) {
		return func.apply("has_" + pvd.safeName(item), DataIngredient.items(item).getCritereon(pvd));
	}

}
