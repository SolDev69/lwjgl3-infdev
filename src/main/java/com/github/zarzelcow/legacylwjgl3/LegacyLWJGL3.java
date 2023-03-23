package com.github.zarzelcow.legacylwjgl3;

//import net.fabricmc.api.ModInitializer;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

public class LegacyLWJGL3 {
	public static class Logger {
		public void info(String s) { System.out.println(s); }
	}
	public static final Logger LOGGER = new Logger();
	public void onInitialize() {
		LOGGER.info("This is definitely a 100% legit legacy LWJGL2 mod!");
	}
}
