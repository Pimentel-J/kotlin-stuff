package com.stuff.basic

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*

/**
 * Tests of class SearchNumbers.
 *
 * @author Pimentel
 */
internal class SearchNumbersTest {

    private val testNumbersList = listOf(354, 5324, 1051, 713, 5781, 9770, 3843, 4215)

    @Test
    fun findMax() {
        val result = SearchNumbers().findMax(testNumbersList)
        assertEquals(9770, result)
    }

    @Test
    fun findNumbers() {
        var result = SearchNumbers().findNumbers(testNumbersList, listOf(5324, 713, 3843))
        assertEquals(true, result)

        result = SearchNumbers().findNumbers(testNumbersList, listOf(5324, 9770, 713))
        assertEquals(false, result)
    }
}