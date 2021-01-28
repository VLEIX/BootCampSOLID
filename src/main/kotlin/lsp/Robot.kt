package lsp

// robots
// robots can move
// 2 types: heavy and lightweight

abstract class Robot {
    abstract fun goToLocation(lat: Double, lon: Double)
}