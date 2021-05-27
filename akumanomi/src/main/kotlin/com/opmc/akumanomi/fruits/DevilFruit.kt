package com.opmc.akumanomi.fruits

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
	abstract fun nameEn(): String

	/**
	 * Get this Devil Fruit's name in Japanese
	 * @return Name, including " no Mi" suffix.
	 */
	abstract fun nameJp(): String
}