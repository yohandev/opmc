package com.opmc.akumanomi.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;

/**
 * Represents a single instance of a click
 */
public class Click
{
	/**
	 * Enumerates over standard mouse buttons
	 */
	public enum Button
	{
		/**
		 * Left mouse button
		 */
		Left,
		/**
		 * Right mouse button
		 */
		Right,
	}

	/**
	 * Button pressed for this click
	 */
	public final Button button;

	/**
	 * Position of the player when they clicked
	 */
	public final Vec3d position;
	/**
	 * Result of the ray cast during this click
	 */
	public final HitResult hit;


	public Click(Button button, MinecraftClient client)
	{
		this.button = button;

		assert client.player != null;

		this.position = client.player.getPos();
		this.hit = client.crosshairTarget;
	}
}
