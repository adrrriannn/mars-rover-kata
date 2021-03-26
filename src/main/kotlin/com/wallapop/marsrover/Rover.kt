package com.wallapop.marsrover

class Rover(
    private var coordinates: Coordinates = Coordinates(0, 0),
    private val direction: Direction = Direction.North) {

    fun report() = Report(direction, coordinates)
    fun moveForward() {
        coordinates = coordinates.incrementY()
    }

}

data class Report(val direction: Direction, val coordinates: Coordinates)

data class Coordinates(val x: Int, val y: Int) {
    fun incrementY() = copy(y = y + 1)
}

sealed class Direction {
    object North : Direction()
    object South : Direction()
    object East : Direction()
    object West : Direction()
}
