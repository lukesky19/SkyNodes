/*
    SkyMines tracks blocks broken in specific regions, replaces them, gives items, and sends client-side block changes.
    Copyright (C) 2023-2025  lukeskywlker19

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
package com.github.lukesky19.skymines.listeners;

import com.github.lukesky19.skymines.manager.MineManager;
import com.github.lukesky19.skymines.mine.Mine;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * This classes listens for when a block is clicked and if that block is inside a mine, the event is passed to that mine.
 */
public class BlockClickListener implements Listener {
    private final MineManager mineManager;

    /**
     * Constructor
     * @param mineManager A MineManager instance.
     */
    public BlockClickListener(MineManager mineManager) {
        this.mineManager = mineManager;
    }

    /**
     * Listens for when a player interacts with a block and if that block is inside a mine, the event is passed to that mine.
     * @param playerInteractEvent A PlayerInteractEvent
     */
    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onBlockClick(PlayerInteractEvent playerInteractEvent) {
        if(playerInteractEvent.getClickedBlock() == null) return;

        Mine mine = mineManager.getMineByLocation(playerInteractEvent.getClickedBlock().getLocation());
        if(mine != null) {
           mine.handlePlayerInteract(playerInteractEvent);
        }
    }
}

