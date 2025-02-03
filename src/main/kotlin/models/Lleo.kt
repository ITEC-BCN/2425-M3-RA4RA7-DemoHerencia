package org.example.models

class Lleo : Animal {
    private var selvaOrigen: String = ""

    constructor(color: String, selvaOrigen: String) : super(color) {
        this.selvaOrigen = selvaOrigen
    }

    fun setSelvaOrigen(selvaOrigen: String) {
        this.selvaOrigen = selvaOrigen
    }

    fun getSelvaOrigen(): String {
        return this.selvaOrigen
    }

    override fun menjar() {
        println("El lleó està menjant. Jo no m'aproparia gaire.")
    }

    override fun dormir() {
        println("El lleó està dormit, però jo no faria gaire soroll.")
    }

    fun rugir() {
        println("El lleó està rugint: ROAR!")
    }

    public override fun toString(): String {
        return "Color: ${super.getColor()} - Selva d'origen: ${this.selvaOrigen}"
    }
}
