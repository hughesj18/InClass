package com.kroger.classdemoapp

data class Survivor(
    val name: String,
    val health: Int,
    val image: Int,
    val damage: Int,
    val regen: Int,
    val recItems: List<Int>
)

