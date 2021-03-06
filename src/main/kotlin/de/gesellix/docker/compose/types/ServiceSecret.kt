package de.gesellix.docker.compose.types

data class ServiceSecret(

        var source: String = "",
        var target: String? = "",
        var uid: String? = "",
        var gid: String? = "",
        var mode: Int = 0b0100100100 // = from octal 0444
)
