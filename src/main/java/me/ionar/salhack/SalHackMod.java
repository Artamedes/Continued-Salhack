package me.ionar.salhack;

import me.ionar.salhack.main.SalHack;
import me.zero.alpine.fork.bus.EventManager;
import net.fabricmc.api.ClientModInitializer;
import me.zero.alpine.fork.bus.EventBus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SalHackMod implements ClientModInitializer {
    public static final Logger log = LoggerFactory.getLogger("sal");
	public static final String NAME = "SalHack";
	public static final String MOD_ID = "sal-hack";
	public static final String VERSION = "v0.5 Beta";

	public static final EventBus EVENT_BUS = new EventManager();

	@Override
	public void onInitializeClient() {
		log.info("Welcome to " + NAME);
		SalHack.Init();
	}
}