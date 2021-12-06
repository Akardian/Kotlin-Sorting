package sort

import sort.comparator.Comparator

abstract class Sort<T> : ArrayContainer<T>, Comparator<T> {

    constructor(_array: Array<T>) : super(_array){ }

    /**
     * Sort Array
     */
    abstract fun sort()

    /**
     * Swap 2 values in place
     */
    fun swap(array : Array<T>, firstIndex: Int, secondIndex: Int) {
        val temp = array[firstIndex]
        array[firstIndex] = array[secondIndex]
        array[secondIndex]  = temp
    }
}