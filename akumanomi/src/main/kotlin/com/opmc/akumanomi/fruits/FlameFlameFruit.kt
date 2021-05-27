package com.opmc.akumanomi.fruits

import com.opmc.akumanomi.util.Clicks

/**
 * Mera Mera no Mi(Flame-Flame Fruit)
 */
class FlameFlameFruit : DevilFruit()
{
	override fun nameEn() = "Flame-Flame Fruit"
	override fun nameJp() = "Mera Mera no Mi"

	/**
	 * Throws a punch that sets whatever is hit ablaze, and causes an explosion
	 * that sets a small radius on fire. Consumes 2 hunger.
	 */
	@FruitAbility(Clicks.RLL, level = 0)
	fun fireFist()
	{

	}

	/**
	 * Creates a ring of fire around the user. Consumes 3 hunger.
	 */
	@FruitAbility(Clicks.RLR, level = 5)
	fun blazeNet()
	{

	}

	/**
	 * Summons a dozen "fireflies"(red XP entities with a large follow radius) that
	 * sets whatever is hit on fire. Consumes 4 hunger.
	 */
	@FruitAbility(Clicks.RRL, level = 10)
	fun fireflies()
	{

	}
}