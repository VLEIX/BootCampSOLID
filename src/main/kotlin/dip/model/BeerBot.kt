package dip.model

import dip.DrinksBot

class BeerBot : DrinksBot {
    override fun dispense() {
        println("Dispensing beer")
    }
}