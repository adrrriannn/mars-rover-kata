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
    fun `move forward from the default starting point`() {
        val rover = Rover()
        rover.moveForward()

        val expectedCoordinates = Coordinates(0, 1)

        assertThat(rover.report().position).isEqualTo(expectedCoordinates)
    }
}