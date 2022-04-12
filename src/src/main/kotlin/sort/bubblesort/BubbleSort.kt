/**
 * This Class Implements the sorting algorithm Bubble Sort
 */
package sort.bubblesort

import sort.Sort

abstract class BubbleSort<T> : Sort<T> {

    constructor(_array: Array<T>) : super(_array){ }

    override fun sort() {
        var length = size //array length
        do {
            var newLength = 0
            for (index in 1 until length) {
                if(compare(array[index - 1], array[index]) > 0 ) {
                    //Swap Element if compare is smaller
                    swap(firstIndex = index - 1, secondIndex = index)
                    newLength = index //Set last changed index as new length
                }
            }
            length = newLength
        } while (length >= 1) //end sorting when no element changed
    }
}
