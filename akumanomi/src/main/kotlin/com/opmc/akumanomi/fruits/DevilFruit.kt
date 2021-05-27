package com.opmc.akumanomi.fruits

import com.opmc.akumanomi.util.Clicks

/**
 * An abstract Devil Fruit, responsible for registering
 * click-combo listeners of sub-classes
 */
abstract class DevilFruit
{
	/**
	 * Get this Devil Fruit's name in English
	 * @return Name, including " Fruit" suffix.
	 */
	abstract val nameEn: String

	/**
	 * Get this Devil Fruit's name in Japanese
	 * @return Name, including " no Mi" suffix.
	 */
	abstract val nameJp: String

	/**
	 * Map of ability bound to each left/right click combination, if any.
	 */
	abstract val abilities: Map<Clicks, Ability>

	/** Interface for Devil Fruit abilities */
	interface Ability
	{
		/** Get this ability's name, in English **/
		val nameEn: String
		/** Get this ability's name, in Japanese */
		val nameJp: String

		/** The minimum devil fruit level(inclusive) at which this ability unlocks */
		val minLvl: Int

		/**
		 * Execute this ability given the individual clicks that triggered it
		 */
		fun execute(/* TODO */)
	}
}