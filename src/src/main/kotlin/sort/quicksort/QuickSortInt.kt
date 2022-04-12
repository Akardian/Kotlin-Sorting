/**
 * This Class Implements the sorting algorithm Bubble Sort
 */
package sort.quicksort

import sort.comparator.Comparator
import sort.comparator.ComparatorInt

class QuickSortInt(
    _array: Array<Int>,
    comparatorInt: Comparator<Int> = ComparatorInt()
    ) : QuickSort<Int>(_array), Comparator<Int> by comparatorInt {

        fun sum() : Int {
            return array.sum()
        }
    }
