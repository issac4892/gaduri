/*
 * Copyright (c) 2022 BaeHyeonWoo
 *
 *  Licensed under the General Public License, Version 3.0. (https://opensource.org/licenses/gpl-3.0/)
 */

package pw.simsim.gaduri.config

import io.github.monun.tap.config.Config
import io.github.monun.tap.config.ConfigSupport
import java.io.File

/***
 * @author BaeHyeonWoo
 *
 * "Until my feet are crushed,"
 * "Until I can get ahead of myself."
 */

object Config {
    @Config
    var enabled = false
    @Config
    var minx = 0
    @Config
    var miny = 0
    @Config
    var minz = 0
    @Config
    var maxx = 0
    @Config
    var maxy = 0
    @Config
    var maxz = 0
    @Config
    var spawn = arrayListOf<Int>(0, 0, 0)

    fun load(configFile: File) {
        ConfigSupport.compute(this, configFile)
    }
}