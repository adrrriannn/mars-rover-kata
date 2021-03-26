package com.wallapop.marsrover

class Rover(
    private var coordinates: Coordinates = Coordinates(0, 0),
    private val direction: Direction = Direction.North) {

    fun report() = State(direction, coordinates)
    fun moveForward() {
        coordinates = when(direction) {
            Direction.East -> coordinates.incrementX()
            Direction.North -> coordinates.incrementY()
            Direction.South -> coordinates.decrementY()
            Direction.West -> TODO()
        }
    }

}

data class State(val direction: Direction, val coordinates: Coordinates)

data class Coordinates(val x: Int, val y: Int) {
    fun incrementY() = copy(y = y + 1)
    fun decrementY() = copy(y = y - 1)
    fun incrementX() = copy(x = x + 1)
}

sealed class Direction {
    object North : Direction()
    object South : Direction()
    object East : Direction()
    object West : Direction()
}
