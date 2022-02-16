/*
 * Copyright (c) 2022 BaeHyeonWoo
 *
 *  Licensed under the General Public License, Version 3.0. (https://opensource.org/licenses/gpl-3.0/)
 */

package pw.simsim.gaduri

import pw.simsim.gaduri.commands.ReloadConfig.register
import pw.simsim.gaduri.config.Config.load
import pw.simsim.gaduri.events.PlayerMoveEvent
import io.github.monun.kommand.kommand
import org.bukkit.plugin.java.JavaPlugin
import java.io.File

/***
 * @author BaeHyeonWoo
 *
 * "Until my feet are crushed,"
 * "Until I can get ahead of myself."
 */

class PluginMain : JavaPlugin() {

    companion object {
        lateinit var instance: PluginMain
            private set
    }

    private val configFile = File(dataFolder, "config.yml")

    override fun onEnable() {
        instance = this
        load(configFile)
        logger.info("Gaduri is starting!")
        server.pluginManager.registerEvents(PlayerMoveEvent(), this)
//        server.scheduler.runTaskTimer(this, SampleConfigReloadTask(), 0L, 20L)

        kommand {
            register("gaduri reload") {
                register(this)
            }
        }
    }
}