package com.stuff

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class SearchIntegersTest {

    private val testNumbersList = listOf(354, 5324, 1051, 713, 5781, 9770, 3843, 4215)

    @Test
    fun findHighestInteger() {
        println("testFindHighestNumber")
        val result = SearchIntegers().findHighestInteger(testNumbersList)
        assertEquals(9770, result)
    }

    @Test
    fun searchIntegersAndOrdering() {
        println("testSearchIntegersAndOrdering")
        var result = SearchIntegers().searchIntegersAndOrdering(testNumbersList, listOf(5324, 713, 3843))
        assertEquals(true, result)

        result = SearchIntegers().searchIntegersAndOrdering(testNumbersList, listOf(5324, 9770, 713))
        assertEquals(false, result)
    }
}