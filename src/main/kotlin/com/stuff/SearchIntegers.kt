package com.stuff

/**
 * A set of functions to search for integers, according to a certain criteria.
 *
 * @author Pimentel
 */
class SearchIntegers() {

    /**
     * Searches (iteratively) for the highest integer in a given list
     *
     * @param integers list of integers
     * @return highest integer
     */
    fun findHighestInteger(integers: List<Int>): Int {
        var highestFound = integers[0]

        integers.forEach {
            highestFound = when (it > highestFound) {
                true -> it
                else -> highestFound
            }
        }
        return highestFound
    }

    /**
     * Searches a list of integers for the selected numbers and if the order is the same
     *
     * @param integers         list of integers
     * @param integersToSearch list of integers, with the numbers to search for
     *
     * @return true if the numbers exist in the list and in the same order, and false otherwise
     */
    fun searchIntegersAndOrdering(integers: List<Any>, integersToSearch: List<Int>): Boolean {
        var found = false
        var currentIndex = 0

        integersToSearch.forEach { intToSearch ->
            found = false

            for (i in currentIndex until integers.size) {
                if (integers[i] == intToSearch) {
                    found = true
                    currentIndex += integers.indexOf(integers[i]) + 1
                    break
                }
            }
        }
        return found
    }
}