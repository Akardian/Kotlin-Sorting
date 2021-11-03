/**
 * This Class Implements the sorting algorithm Bubble Sort
 */
package sort.bubblesort

import sort.ArrayGenerator

class BubbleSort(_size: Int = 0, _seed: Int = -1) : ArrayGenerator(_size, _seed) {

    override fun sort() {
        var length = size //array length
        do {
            var newLength = 0
            for (index in 1 until length) {
                if(array[index - 1] > array[index]) {
                    swapLong(array, firstIndex = index - 1, secondIndex = index)
                    newLength = index //Set last changed index as new length
                }
            }
            length = newLength
        } while (length >= 1) //end sorting when no element changed
    }
}
