package com.opmc.akumanomi.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.options.GameOptions;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin
{
	private static final int[] COUNTER = { 0 , 0 };
	private static final boolean[] STICKY  = { false, false };

	@Shadow @Final
	public GameOptions options;

	@Inject(at = @At("HEAD"), method = "doAttack")
	private void onPrimaryClick(CallbackInfo info)
	{
		if (!STICKY[0])
		{
			System.out.println("[Mixin] Detected primary click#" + COUNTER[0]++);
		}
		STICKY[0] = true;
	}

	@Inject(at = @At("HEAD"), method = "doItemUse")
	private void onSecondaryClick(CallbackInfo info)
	{
		if (!STICKY[1])
		{
			System.out.println("[Mixin] Detected secondary click#" + COUNTER[1]++);
		}
		STICKY[1] = true;
	}

	@Inject(at = @At("HEAD"), method = "handleInputEvents")
	private void onTick(CallbackInfo info)
	{
		STICKY[0] &= this.options.keyAttack.isPressed();
		STICKY[1] &= this.options.keyUse.isPressed();
	}
}
