package com.example.helpai;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;

public class HelpAiMod implements ModInitializer {

    @Override
    public void onInitialize() {
        // Adds "ai" as a sub-command of the existing vanilla /help command.
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) ->
            dispatcher.register(
                Commands.literal("help")
                    .then(Commands.literal("ai")
                        .executes(context -> {
                            context.getSource().sendSuccess(
                                () -> Component.literal("READY TO HELP ALWAYS"), false);
                            return 1;
                        }))
            )
        );
    }
}
