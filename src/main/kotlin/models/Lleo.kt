package org.example.models

class Lleo : Animal {
    private var selvaOrigen: String

    constructor(color: String, selvaOrigen: String) : super (color){
        this.selvaOrigen = selvaOrigen
    }

    fun setSelvaOrigen(selvaOrigen: String) {
        this.selvaOrigen = selvaOrigen
    }

    fun getSelvaOrigen() : String {
        return this.selvaOrigen
    }

    fun menjar() {
        println("El lleó està menjant.")
    }

    fun rugir() {
        println("El lleó està rugint: ROAR!")
    }
    public override fun toString(): String {
        return "Color: ${super.getColor()} - Selva d'origen: ${this.selvaOrigen}"
    }
}
