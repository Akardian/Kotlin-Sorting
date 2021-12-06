/**
 * This Class Implements the sorting algorithm Bubble Sort
 */
package sort.bubblesort

import sort.comparator.Comparator
import sort.comparator.ComparatorInt

class BubbleSortInt(
    _array: Array<Int>,
    comparatorInt: Comparator<Int> = ComparatorInt()
    ) : BubbleSort<Int>(_array), Comparator<Int> by comparatorInt {

        fun sum() : Int {
            return array.sum()
        }
    }
