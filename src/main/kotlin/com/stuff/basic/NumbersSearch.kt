package com.stuff.basic

/**
 * A set of functions to search for numbers, according to a certain criteria.
 *
 * @author Pimentel
 */
class NumbersSearch() {

    /**
     * Searches for the highest integer of a given list
     *
     * @param numbers list of integers
     * @return highest integer
     */
    fun findMax(numbers: List<Int>): Int {
        var maxFound = numbers[0]
        numbers.forEach {
            maxFound = when (it > maxFound) {
                true -> it
                else -> maxFound
            }
        }
        return maxFound
    }

    /**
     * Searches a list of integers for the selected numbers and if the order is the same
     *
     * @param numbers   list of integers
     * @param numbersToSearch  list of integers, with the numbers to search for
     *
     * @return true if the numbers exist in the list and in the same order, and false otherwise
     */
    fun findNumbers(numbers: List<Int>, numbersToSearch: List<Int>): Boolean {
        var found = false
        var n = 0

        numbersToSearch.forEach { seqNum ->
            found = false

            for (i in n until numbers.size) {
                if (numbers[i] == seqNum) {
                    found = true
                    n += numbers.indexOf(numbers[i]) + 1
                    break
                }
            }
        }
        return found
    }

}