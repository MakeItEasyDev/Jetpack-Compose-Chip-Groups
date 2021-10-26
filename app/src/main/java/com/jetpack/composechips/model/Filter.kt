package com.jetpack.composechips.model

import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateOf

@Stable
class Filter(
    val name: String,
    enabled: Boolean = false
) {
    val enabled = mutableStateOf(enabled)
}

val fruitFilters = listOf(
    Filter("Apple"),
    Filter("Bananas"),
    Filter("Cherries"),
    Filter("Damson"),
    Filter("Elderberry"),
    Filter("Finger"),
    Filter("Grapefruit"),
    Filter("Honeydew"),
    Filter("Indonesian"),
    Filter("Jack"),
    Filter("Kaffir"),
    Filter("Longan"),
    Filter("Mandarin"),
    Filter("Navel"),
    Filter("Oval")
)