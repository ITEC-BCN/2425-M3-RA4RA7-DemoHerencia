package org.example.models

open class Animal{
    private var color: String = ""
    constructor(color: String){ this.color = color }
    public fun getColor(): String { return color }
    public fun setColor(color: String) { this.color = color }
    public override fun toString(): String {
        return "Color: ${this.color}"
    }
}