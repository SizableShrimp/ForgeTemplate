package me.sizableshrimp.examplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = "Example Mod", version = "@VERSION@")
public class ExampleMod {
    public static final String MODID = "examplemod";
    public static final Logger LOGGER = LogManager.getLogger();

    public ExampleMod() {}

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("HELLO from pre init!");
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        LOGGER.info("HELLO from init!");
    }
}
