package dip

class RoboPub(private val drinksBot: List<DrinksBot>) {

    fun dispenseDrinks() {
        drinksBot.forEach {
            it.dispense()
        }
    }
}