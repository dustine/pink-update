package me.dustine.dustypink;

import me.dustine.dustypink.rose.Rose;
import net.fabricmc.api.ModInitializer;

public class PinkUpdate implements ModInitializer {
	public static final String MOD_ID = "dustypink";

	@Override
	public void onInitialize() {
		Rose.register();
	}

}
