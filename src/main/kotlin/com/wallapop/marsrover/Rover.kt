package com.wallapop.marsrover

class Rover {

    fun report() = Report(Direction.North, Coordinates(0, 0))

}

data class Report(val direction: Direction, val position: Coordinates)

data class Coordinates(val x: Int, val y: Int)

sealed class Direction {
    object North : Direction()
    object South : Direction()
    object East : Direction()
    object West : Direction()
}
