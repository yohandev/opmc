package com.opmc.akumanomi;

import com.opmc.akumanomi.util.Click;
import net.minecraft.entity.player.PlayerEntity;

/**
 * An abstract Devil Fruit
 */
public abstract class DevilFruit
{
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

	/**
	 * Perform a spell on click combination
	 * @param a The first click, guaranteed to be a right click
	 * @param b The second click
	 * @param c The third click
	 */
	protected abstract void onClickCombo(Click a, Click b, Click c);

	/**
	 * Get the user of this devil fruit
	 * @return A player entity
	 */
	public PlayerEntity user()
	{
		// implementation TODO
		return null;
	}
}