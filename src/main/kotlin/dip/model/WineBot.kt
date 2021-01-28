package dip.model

import dip.DrinksBot

class WineBot : DrinksBot {
    override fun dispense() {
        println("Dispensing wine")
    }
}