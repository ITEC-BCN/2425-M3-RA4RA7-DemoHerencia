package org.example.models

class Gos: Animal {
    private var propietari: String

    constructor(color: String, propietari: String): super(color){
        this.propietari = propietari
    }

    fun getPropietari(): String {
        return propietari
    }
    fun setPropietari(propietari: String) {
        this.propietari = propietari
    }
    fun menjar() {
        println("El gos està menjant.")
    }
    fun bordar() {
        println("El gos està bordant: WOOF WOOF!")
    }

    //al no implementar l'override toString, la classe Gos hereta la de la classe Animal
    /*public override fun toString(): String {
        return "Color: ${super.getColor()} - Propietari: ${this.propietari}"
    }*/
}