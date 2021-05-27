package com.opmc.akumanomi.fruits

import com.opmc.akumanomi.util.Clicks

/**
 * Mera Mera no Mi(Flame-Flame Fruit)
 */
class FlameFlameFruit : DevilFruit()
{
	override val nameEn = "Flame-Flame Fruit"
	override val nameJp = "Mera Mera no Mi"

	override val abilities = mapOf(
		Clicks.RRR to LogiaForm,
		Clicks.RLL to FireFist,
		Clicks.RLR to BlazeNet,
		Clicks.RRL to Fireflies,
	)

	/**
	 * Renders the user intangible to physical attacks, exceptions being their elements'
	 * natural weaknesses and Armament Haki
	 */
	object LogiaForm : Ability
	{
		override val nameEn = "Logia Form"
		override val nameJp = "Logia Form"

		override val minLvl = 0

		override fun execute()
		{
			TODO("Not yet implemented")
		}
	}

	/**
	 * Throws a punch that sets whatever is hit ablaze, and causes an explosion
	 * that sets a small radius on fire. Consumes 2 hunger.
	 */
	object FireFist : Ability
	{
		override val nameEn = "Fire Fist"
		override val nameJp = "Hiken"

		override val minLvl = 0

		override fun execute()
		{
			TODO("Not yet implemented")
		}
	}

	/**
	 * Creates a ring of fire around the user. Consumes 3 hunger.
	 */
	object BlazeNet : Ability
	{
		override val nameEn = "Blaze Net"
		override val nameJp = "Enjomo"

		override val minLvl = 0

		override fun execute()
		{
			TODO("Not yet implemented")
		}
	}

	/**
	 * Summons a dozen "fireflies"(red XP entities with a large follow radius) that
	 * sets whatever is hit on fire. Consumes 4 hunger.
	 */
	object Fireflies : Ability
	{
		override val nameEn = "Fireflies"
		override val nameJp = "Hotarubi"

		override val minLvl = 0

		override fun execute()
		{
			TODO("Not yet implemented")
		}
	}
}