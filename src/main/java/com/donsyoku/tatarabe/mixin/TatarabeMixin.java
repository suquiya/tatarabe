package com.donsyoku.tatarabe.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.donsyoku.tatarabe.Tatarabe;

@Mixin(TitleScreen.class)
public class TatarabeMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		Tatarabe.LOGGER.info("Tatarabenization start!");
	}
}
