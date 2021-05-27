package com.opmc.akumanomi

/**
 * Singleton object for the `akumanomi` mod
 */
object Mod
{
	/**
	 * Unique identifier for this mod, also configured in
	 * `fabric.mod.json` among other places
	 */
	const val ID = "akumanomi"

	/**
	 * Entry point for this mod
	 */
	fun init()
	{
		// Runs as soon as Minecraft is ready for mods, but *not*
		// necessarily when things like resources are all loaded.

		println("Hello, World, from Kotlin Fabric!")
	}
}