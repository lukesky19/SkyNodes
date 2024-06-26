/*
    SkyNodes places a random configured schematic after a set period of time.
    Copyright (C) 2023  lukeskywlker19

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published
    by the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/
package com.github.lukesky19.skynodes.configuration.locale;

import net.kyori.adventure.text.Component;

import java.util.List;

public record FormattedLocale(
        Component prefix,
        List<Component> help,
        Component reload,
        Component configLoadError,
        Component startTasksSuccess,
        Component noTasksFound,
        String noNodesFound,
        Component operationFailure,
        String clipboardLoadFailure,
        Component noPermission,
        Component unknownArgument,
        Component missingArgumentTaskId,
        Component missingArgumentNodeId,
        String nodePasteSuccess,
        String nodePasteFailure,
        String worldNotFound,
        String schematicsListError,
        String schematicNotFound,
        String invalidLocation,
        String invalidSafeLocation,
        String invalidRegion,
        String blocksAllowedListError,
        String invalidBlockMaterial,
        Component undo,
        Component redo,
        Component noUndo,
        Component noRedo,
        String invalidTaskId,
        String invalidNodeId,
        Component inGameOnly,
        Component softDisable,
        Component bypassedSafeTeleport,
        Component bypassedBlockBreakCheck,
        Component canMine,
        Component canNotMine) {
}
