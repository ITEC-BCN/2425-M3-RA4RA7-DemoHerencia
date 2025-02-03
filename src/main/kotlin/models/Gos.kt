package org.example.models

class Gos : Animal, IDomesticable {
    private var propietari: String = ""

    constructor(color: String, propietari: String) : super(color) {
        this.propietari = propietari
    }

    fun getPropietari(): String {
        return propietari
    }

    fun setPropietari(propietari: String) {
        this.propietari = propietari
    }

    override fun menjar() {
        println("El gos està menjant.")
    }

    override fun dormir() {
        println("El gos està dormint al teu llit!")
    }

    override fun acariciar() {
        println("El gos es deixa acariciar, i li encanta!")
    }

    fun bordar() {
        println("El gos està bordant: WOOF WOOF!")
    }


    public override fun toString(): String {
        return "Color: ${super.getColor()} - Propietari: ${this.propietari}"
    }
}