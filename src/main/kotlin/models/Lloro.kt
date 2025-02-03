package org.example.models

class Lloro : Animal, IDomesticable {
    private var parla: Boolean = false

    constructor(color: String, parla: Boolean) : super(color) {
        this.parla = parla
    }

    fun getParla(): Boolean {
        return this.parla
    }

    fun setParla(parla: Boolean) {
        this.parla = parla
    }

    override fun menjar() {
        println("El lloro està menjant, pipes és clar!")
    }

    override fun dormir() {
        println("El lloro necessita que el tapin per dormir.")
    }

    override fun acariciar() {
        println("A gaires lloros els agrada que els acariciïn. Al lloro Juanito del Quimet (en pau descansi) SÍ!")
    }

    fun parlar(frase: String) {
        println("El lloro repeteix frases: '$frase'")
    }


    public override fun toString(): String {
        return "Color: ${super.getColor()} - Parla: " + if(this.parla) "sí" else "no" // us agrada aquesta forma de programar?
    }
}