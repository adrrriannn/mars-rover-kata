package com.wallapop.marsrover

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoverShould {

    @Test
    fun `report its position in the initial state`() {
        val rover = Rover()
        val report = Report(Direction.North, Coordinates(0, 0))

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
}
