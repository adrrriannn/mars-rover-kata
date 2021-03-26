package com.wallapop.marsrover

class Rover(
    private val coordinates: Coordinates = Coordinates(0, 0),
    private val direction: Direction = Direction.North) {

    fun report() = Report(direction, coordinates)
    fun moveForward() {

    }

}

data class Report(val direction: Direction, val position: Coordinates)

data class Coordinates(val x: Int, val y: Int)

sealed class Direction {
    object North : Direction()
    object South : Direction()
    object East : Direction()
    object West : Direction()
}
