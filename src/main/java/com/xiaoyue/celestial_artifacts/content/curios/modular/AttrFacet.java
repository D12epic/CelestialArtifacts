package com.xiaoyue.celestial_artifacts.content.curios.modular;

import com.google.common.collect.Multimap;
import com.xiaoyue.celestial_core.CelestialCore;
import com.xiaoyue.celestial_core.register.CCAttributes;
import dev.xkmc.l2damagetracker.init.L2DamageTracker;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.UUID;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

import static net.minecraft.world.item.ItemStack.ATTRIBUTE_MODIFIER_FORMAT;

public record AttrFacet(Supplier<Attribute> attr, DoubleSupplier val,
						AttributeModifier.Operation op) implements IFacet {

	public static AttrFacet add(Supplier<Attribute> attr, DoubleSupplier val) {
		return new AttrFacet(attr, val, AttributeModifier.Operation.ADDITION);
	}

	public static AttrFacet multBase(Supplier<Attribute> attr, DoubleSupplier val) {
		return new AttrFacet(attr, val, AttributeModifier.Operation.MULTIPLY_BASE);
	}

	public static AttrFacet multTotal(Supplier<Attribute> attr, DoubleSupplier val) {
		return new AttrFacet(attr, val, AttributeModifier.Operation.MULTIPLY_TOTAL);
	}

	public void modify(UUID uuid, String id, Multimap<Attribute, AttributeModifier> ans) {
		ans.put(attr.get(), new AttributeModifier(uuid, id, val.getAsDouble(), op));
	}

	public static MutableComponent getDesc(Attribute attr, double val, AttributeModifier.Operation op) {
		var text = Component.translatable(attr.getDescriptionId());
		MutableComponent base;
		if (isMult(attr)) {
			if (op == AttributeModifier.Operation.ADDITION) {
				base = Component.literal(val < 0 ? "-" : "+");
				base.append(ATTRIBUTE_MODIFIER_FORMAT.format(Math.abs(val * 100)));
				base.append("%");

			} else {
				base = Component.literal("x");
				base.append(ATTRIBUTE_MODIFIER_FORMAT.format(val + 1));
			}
		} else {
			base = Component.literal(val < 0 ? "-" : "+");
			if (op == AttributeModifier.Operation.ADDITION) {
				base.append(ATTRIBUTE_MODIFIER_FORMAT.format(Math.abs(val)));
			} else {
				base.append(ATTRIBUTE_MODIFIER_FORMAT.format(Math.abs(val * 100)));
				base.append("%");
			}
		}
		base.append(" ");
		base.append(text);
		return base.withStyle((val < 0 ^ attr == L2DamageTracker.REDUCTION.get()) ? ChatFormatting.RED : ChatFormatting.BLUE);
	}

	public static MutableComponent getSimple(Component text, int val) {
		MutableComponent base = Component.literal(val < 0 ? "-" : "+");
		base.append(ATTRIBUTE_MODIFIER_FORMAT.format(Math.abs(val)));
		base.append(" ");
		base.append(text);
		return base.withStyle(val < 0 ? ChatFormatting.RED : ChatFormatting.BLUE);
	}

	public static boolean isMult(Attribute attr) {
		if (attr == L2DamageTracker.ABSORB.get()) return false;
		if (attr == CCAttributes.ARROW_KNOCK.get()) return false;
		var rl = ForgeRegistries.ATTRIBUTES.getKey(attr);
		assert rl != null;
		return rl.getNamespace().equals(L2DamageTracker.MODID) ||
				rl.getNamespace().equals(CelestialCore.MODID);
	}

}
