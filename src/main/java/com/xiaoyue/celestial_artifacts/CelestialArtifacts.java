package com.xiaoyue.celestial_artifacts;

import com.tterrag.registrate.providers.ProviderType;
import com.tterrag.registrate.util.entry.RegistryEntry;
import com.xiaoyue.celestial_artifacts.content.core.CurioCacheCap;
import com.xiaoyue.celestial_artifacts.data.CommonConfig;
import com.xiaoyue.celestial_artifacts.data.CARecipeGen;
import com.xiaoyue.celestial_artifacts.events.AttackMain;
import com.xiaoyue.celestial_artifacts.events.OtherMain;
import com.xiaoyue.celestial_artifacts.network.CMessages;
import com.xiaoyue.celestial_artifacts.register.CAItems;
import dev.xkmc.l2damagetracker.contents.attack.AttackEventHandler;
import dev.xkmc.l2library.base.L2Registrate;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CelestialArtifacts.MODID)
public class CelestialArtifacts {
	public static final String MODID = "celestial_artifacts";
	public static final L2Registrate REGISTRATE = new L2Registrate(MODID);

	public static final RegistryEntry<CreativeModeTab> TAB =
			REGISTRATE.buildModCreativeTab("curios", "Celestial Artifacts",
					e -> e.icon(CAItems.AMETHYST_RING::asStack));

	public CelestialArtifacts() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		modEventBus.addListener(this::commonSetup);
		CAItems.register();
		CurioCacheCap.register();

		MinecraftForge.EVENT_BUS.register(this);
		MinecraftForge.EVENT_BUS.register(new AttackMain());
		MinecraftForge.EVENT_BUS.register(new OtherMain());
		AttackEventHandler.register(4500, new AttackMain());

		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CommonConfig.spec);

		REGISTRATE.addDataGenerator(ProviderType.RECIPE, CARecipeGen::onRecipeGen);
	}


	private void commonSetup(final FMLCommonSetupEvent event) {
		CMessages.register();
	}

	public static ResourceLocation loc(String id) {
		return new ResourceLocation(MODID, id);
	}


}
