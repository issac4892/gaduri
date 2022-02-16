/*
 * Copyright (c) 2022 BaeHyeonWoo
 *
 *  Licensed under the General Public License, Version 3.0. (https://opensource.org/licenses/gpl-3.0/)
 */

package pw.simsim.gaduri.tasks

import pw.simsim.gaduri.objects.Object.plugin

/***
 * @author BaeHyeonWoo
 *
 * "Until my feet are crushed,"
 * "Until I can get ahead of myself."
 */

class Task : Runnable {
    override fun run() {
        plugin.logger.info("Hello World!")
    }
}