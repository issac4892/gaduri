/*
 * Copyright (c) 2022 BaeHyeonWoo
 *
 *  Licensed under the General Public License, Version 3.0. (https://opensource.org/licenses/gpl-3.0/)
 */

package pw.simsim.gaduri.events

import org.bukkit.ChatColor
import org.bukkit.Location
import org.bukkit.Sound
import org.bukkit.entity.Minecart
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent
import pw.simsim.gaduri.objects.Object.plugin

/***
 * @author BaeHyeonWoo
 *
 * "Until my feet are crushed,"
 * "Until I can get ahead of myself."
 */

class PlayerMoveEvent : Listener {
    @EventHandler
    fun onPlayerJoin(e: PlayerMoveEvent) {
        if(plugin.config.getBoolean("enabled")) {
            val loc = e.player.location
            val minx = plugin.config.getInt("minx")
            val miny = plugin.config.getInt("miny")
            val minz = plugin.config.getInt("minz")
            val maxx = plugin.config.getInt("maxx")
            val maxy = plugin.config.getInt("maxy")
            val maxz = plugin.config.getInt("maxz")
            val spawn = plugin.config.getIntegerList("spawn")
            val location = Location(e.player.world, spawn[0].toDouble(), spawn[1].toDouble(), spawn[2].toDouble())
            if(loc.x<minx || loc.y<miny || loc.z<minz || loc.x>maxx || loc.y>maxy || loc.z>maxz ) {
                e.player.teleport(location)
                e.player.sendMessage("구역을 벗어나려고 하지 마세요!")

            }
        }
    }
}