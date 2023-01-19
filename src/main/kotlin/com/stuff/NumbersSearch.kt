package com.stuff

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
        var currentIndex = 0

        numbersToSearch.forEach { numToSearch ->
            found = false

            for (i in currentIndex until numbers.size) {
                if (numbers[i] == numToSearch) {
                    found = true
                    currentIndex += numbers.indexOf(numbers[i]) + 1
                    break
                }
            }
        }
        return found
    }

    /**
     * Recursively searches a list of integers for the selected numbers and if the order is the same
     *
     * @param numbers   list of integers
     * @param numbersToSearch  list of integers, with the numbers to search for
     *
     * @return true if the numbers exist in the list and in the same order, and false otherwise
     */
    fun findNumbersRecursion(numbers: List<Int>, numbersToSearch: List<Int>, found: Boolean): Boolean {
        if (numbers.isEmpty() or numbersToSearch.isEmpty()) return found

        if (numbersToSearch.first() == numbers.first()) {
            return findNumbersRecursion(numbers.subList(1, numbers.size), numbersToSearch.drop(1), true)
        }

        return findNumbersRecursion(numbers.subList(1, numbers.size), numbersToSearch, false)
    }
}