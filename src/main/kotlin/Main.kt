package org.example

import org.example.models.*

fun main() {
    val gos = Gos("gris", "Árgar")
    println(gos) //el missatge que sortirà d'aquest println és molt simple ja que no s'ha implementat l'override toString a la classe Gos i farà servir la de la classe Animal, més simple
    gos.bordar()
    gos.menjar()

    val lleo = Lleo("daurat", "Selva Amazònica")
    println(lleo)
    lleo.rugir()
    lleo.menjar()
}
