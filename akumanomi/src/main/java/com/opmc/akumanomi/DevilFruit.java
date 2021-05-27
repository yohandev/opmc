package com.opmc.akumanomi;

/**
 * An abstract Devil Fruit
 */
public abstract class DevilFruit
{
	protected DevilFruit() { }

	/**
	 * Get this Devil Fruit's name in English
	 * @return Name, including " Fruit" suffix.
	 */
	public abstract String nameEn();

	/**
	 * Get this Devil Fruit's name in Japanese
	 * @return Name, including " no Mi" suffix.
	 */
	public abstract String nameJp();
}