/*
 * This file is part of Uniform, licensed under the GNU General Public License v3.0.
 *
 *  Copyright (c) Tofaa2
 *  Copyright (c) William278 <will27528@gmail.com>
 *  Copyright (c) contributors
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package net.william278.uniform;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

public class ExampleCrossPlatCommand implements Command {

    @Override
    @NotNull
    public String getName() {
        return "example-crossplat";
    }

    @Override
    @NotNull
    public String getDescription() {
        return "An example cross-platform command";
    }

    @Override
    public <S> void provide(@NotNull BaseCommand<S> command) {
        command.setCondition(source -> true);
        command.setDefaultExecutor((ctx) -> {
            final Audience user = command.getUser(ctx.getSource()).getAudience();
            user.sendMessage(Component.text("Hello, world!"));
        });
    }

}
