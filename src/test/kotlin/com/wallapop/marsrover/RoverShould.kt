package com.wallapop.marsrover

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoverShould {

    @Test
    fun `report its position in the initial state`() {
        val rover = Rover()
        val report = State(Direction.North, Coordinates(0, 0))

        assertThat(rover.report()).isEqualTo(report)
    }

    @Test
    fun `move forward facing north`() {
        val rover = Rover()
        val initialCoordinates = rover.report().coordinates
        val expected = initialCoordinates.incrementY()

        rover.moveForward()

        assertThat(rover.report().coordinates).isEqualTo(expected)
    }

    @Test
    fun `move forward facing south`() {
        val rover = Rover(Coordinates(0, 0), Direction.South)
        val initialCoordinates = rover.report().coordinates
        val expected = initialCoordinates.decrementY()

        rover.moveForward()

        assertThat(rover.report().coordinates).isEqualTo(expected)
    }

    @Test
    fun `move forward facing east`() {
        val rover = Rover(Coordinates(0, 0), Direction.East)
        val initialCoordinates = rover.report().coordinates
        val expected = initialCoordinates.incrementX()

        rover.moveForward()

        assertThat(rover.report().coordinates).isEqualTo(expected)
    }
}
