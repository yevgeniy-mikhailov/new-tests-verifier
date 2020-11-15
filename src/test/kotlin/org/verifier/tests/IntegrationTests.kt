package org.verifier.tests

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class IntegrationTests {

    @Test
    fun testOne() = Assertions.assertTrue(true)

    @Test
    fun testTwo() = Assertions.assertTrue(false)

    @Test
    fun testThree() = Assertions.assertTrue(true)

    @Test
    fun testFour() = Assertions.assertTrue(false)

    @Test
    fun testFive() = Assertions.assertTrue(false)
}