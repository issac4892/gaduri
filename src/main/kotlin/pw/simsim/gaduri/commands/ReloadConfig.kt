/*
 * Copyright (c) 2022 BaeHyeonWoo
 *
 *  Licensed under the General Public License, Version 3.0. (https://opensource.org/licenses/gpl-3.0/)
 */

package pw.simsim.gaduri.commands

import io.github.monun.kommand.node.LiteralNode
import net.kyori.adventure.text.Component.text
import pw.simsim.gaduri.tasks.ConfigReloadTask

/***
 * @author BaeHyeonWoo
 *
 * "Until my feet are crushed,"
 * "Until I can get ahead of myself."
 */

object ReloadConfig {
    fun register(builder: LiteralNode) {
        builder.apply {
            requires { isOp }
            executes {
                try{
                    ConfigReloadTask()
                    sender.sendMessage(text("Success!"))
                }
                catch (e: Exception){
                    sender.sendMessage("Failed! $e")
                }
            }
        }
    }
}