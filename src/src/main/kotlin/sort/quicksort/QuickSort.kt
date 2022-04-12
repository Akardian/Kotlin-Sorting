/**
 * This Class Implements the sorting algorithm Bubble Sort
 */
package sort.quicksort

import sort.Sort

abstract class QuickSort<T> : Sort<T> {

    constructor(_array: Array<T>) : super(_array){ }

    override fun sort() {
       quicksort(lowIndex = 0, highIndex = size - 1)
    }

    private fun quicksort(lowIndex: Int, highIndex: Int) {
        //Correct Order
        if(lowIndex >= highIndex || lowIndex < 0) {
            return
        }

        //Find the pivot index
        val partition = lomutoPartition(lowIndex, highIndex)

        //Sort left and right of the pivot
        quicksort(lowIndex = lowIndex, highIndex = partition - 1)
        quicksort(lowIndex = partition + 1, highIndex = highIndex)
    }

    private fun lomutoPartition(lowIndex: Int, highIndex: Int) : Int{
        val pivot = array[highIndex] //Last element selected as pivot
        print("pivot = $pivot array = ")
        var newPivot = lowIndex - 1  //Temporary pivot Index

        for (index in lowIndex .. highIndex) {
            print(array[index])
        }

        for (index in lowIndex until highIndex) {
            if(compare(array[index], pivot) <= 0) {
                newPivot++ //Move Index
                swap(newPivot, index)
            }
        }

        newPivot++
        swap(newPivot, highIndex)

        print(" sorted = ")
        for (index in lowIndex .. highIndex) {
            print(array[index])
        }
        println()

        return newPivot
    }
}
/*
pivot := A[hi] // Choose the last element as the pivot

// Temporary pivot index
i := lo - 1

for j := lo to hi - 1 do
// If the current element is less than or equal to the pivot
if A[j] <= pivot then
// Move the temporary pivot index forward
i := i + 1

// Swap the current element with the element at the temporary pivot index
swap A[i] with A[j]
// Move the pivot element to the correct pivot position (between the smaller and larger elements)
i := i + 1
swap A[i] with A[hi]
*/