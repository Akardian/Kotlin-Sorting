package sort.bubblesort

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

import org.junit.jupiter.api.Test

internal class BubbleSortTest {

    @Test
    @DisplayName("Sort Array with Bubble Sort")
    fun sortArray() {
        val array = BubbleSort(_size = 10, _seed = 12345)
        println("sortArray: " + array.print())

        array.sort()
        println("sortArray: " + array.print())

        assertArrayEquals(array.array, longArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))
    }
}