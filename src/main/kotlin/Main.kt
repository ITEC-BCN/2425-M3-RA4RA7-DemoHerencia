package org.example

import org.example.models.*

fun main() {
    val gos = Gos("gris", "Árgar")
    println(gos) //el missatge que sortirà d'aquest println és molt simple ja que no s'ha implementat l'override toString a la classe Gos i farà servir la de la classe Animal, més simple
    gos.menjar()
    gos.dormir()
    gos.acariciar()
    gos.bordar()

    val lleo = Lleo("daurat", "Selva Amazònica")
    println(lleo)
    lleo.menjar()
    lleo.dormir()
    lleo.rugir()

    val lloro = Lloro("vermell", true)
    println(lloro)
    lloro.menjar()
    lloro.dormir()
    lloro.acariciar()
    lloro.parlar("Hola company, què fas aquesta tarda?")

}
