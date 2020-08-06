package com.github.hazard7.massracing

import hazard7.altv.kotlin.Resource
import hazard7.altv.kotlin.logInfo
import hazard7.altv.kotlin.math.Float3

fun main(res: Resource) {
    logInfo("Starting massive racing")

    res.onPlayerConnect {
        logInfo("${it.player.name} connected")

        it.player.spawn(Float3(0, 0, 72))
        it.player.setModel("s_m_y_airworker")

        true
    }
}
