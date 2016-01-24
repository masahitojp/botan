package com.github.masahitojp.implementation.handlers;

import com.github.masahitojp.botan.Robot;
import com.github.masahitojp.botan.handler.BotanMessageHandlers;
import com.github.masahitojp.botan.message.BotanMessageSimple;

@SuppressWarnings("unused")
public class PingMessageHandlers implements BotanMessageHandlers {

    @Override
    public void register(final Robot robot) {
        robot.respond(
                "ping$",
                "ping method",
                message -> message.reply("pong")
        );
    }
}
