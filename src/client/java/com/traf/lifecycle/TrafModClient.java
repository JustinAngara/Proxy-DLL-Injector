//      ___________              _____          _________ .__  .__               __
//		\__    ___/___________ _/ ____\         \_   ___ \|  | |__| ____   _____/  |_
//		|    |  \_  __ \__  \\   __\          /    \  \/|  | |  |/ __ \ /    \   __\
//		|    |   |  | \// __ \|  |            \     \___|  |_|  \  ___/|   |  \  |
//		|____|   |__|  (____  /__|             \______  /____/__|\___  >___|  /__|
//		                    \/                        \/             \/     \/
//
//
//      @Author Justin

package com.traf.lifecycle;

import com.traf.TrafMod;
import com.traf.lifecycle.display.Display;
import com.traf.lifecycle.menu.Menu;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.resources.Identifier;

public class TrafModClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {

	// to make injection work simply just go into a game
	ClientPlayConnectionEvents.JOIN.register((handler, sender, client) -> {
		// perform injection entry point here

	});

	}

}
