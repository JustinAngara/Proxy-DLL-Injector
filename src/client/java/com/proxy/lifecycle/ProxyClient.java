//      ___________              _____          _________ .__  .__               __
//		\__    ___/___________ _/ ____\         \_   ___ \|  | |__| ____   _____/  |_
//		|    |  \_  __ \__  \\   __\          /    \  \/|  | |  |/ __ \ /    \   __\
//		|    |   |  | \// __ \|  |            \     \___|  |_|  \  ___/|   |  \  |
//		|____|   |__|  (____  /__|             \______  /____/__|\___  >___|  /__|
//		                    \/                        \/             \/     \/
//
//
//      @Author Justin

package com.proxy.lifecycle;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import com.proxy.injector.EntryPoint;
public class ProxyClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {

	// to make injection work simply just go into a game
	ClientPlayConnectionEvents.JOIN.register((handler, sender, client) -> {
		// perform injection entry point here
		String pe = "cs2.exe";
		EntryPoint ep = new EntryPoint(pe);
		ep.run();
	});

	}

}
