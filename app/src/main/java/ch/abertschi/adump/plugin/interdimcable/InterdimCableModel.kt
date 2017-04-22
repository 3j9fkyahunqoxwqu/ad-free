package ch.abertschi.adump.plugin.interdimcable

/**
 * Created by abertschi on 22.04.17.
 */
data class InterdimCableModel(val channels: List<Channel>?) {
    constructor() : this(listOf<Channel>())
}

data class Channel(var name: String?, var path: String?, var version: Int?) {
    constructor() : this(null, null, null)
}