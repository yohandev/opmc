package com.opmc.akumanomi.fruits

import com.opmc.akumanomi.util.Clicks

/**
 * Used to annotate and auto-register devil fruit abilities
 */
@Target(AnnotationTarget.FUNCTION)
annotation class FruitAbility
(
	/**
	 * Left/Right click combination for this ability to trigger
	 */
	val clicks: Clicks,
	/**
	 * Level required for this ability to unlock
	 */
	val level: Int = 0,
)
