package sort.bubblesort

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

import org.junit.jupiter.api.Test

internal class BubbleSortTest {

    private val defaultArray = arrayOf(0,1,2,3,4,5,6,7,8,9)

    @Test
    @DisplayName("Sort Array with Bubble Sort")
    fun sortArrayRandom() {
        val array = BubbleSortInt(defaultArray)
        array.shuffle(seed = 12345)

        println("sortArray: " + array.print())

        array.sort()
        println("sortArray: " + array.print())

        assertArrayEquals(array.array, arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))
    }

    @Test
    @DisplayName("Sort Array with Bubble Sort and Equal numbers")
    fun sortArraySame() {
        val array = BubbleSortInt(defaultArray)
        array.shuffle(seed = 12345)

        println("sortArray: " + array.print())

        array.sort()
        println("sortArray: " + array.print())

        assertArrayEquals(array.array, arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))
    }

    @Test
    @DisplayName("Sort Array with Bubble Sort")
    fun sortArray() {
        val array = BubbleSortInt(defaultArray)
        array.shuffle(seed = 12345)

        println("sortArray: " + array.print())

        array.sort()
        println("sortArray: " + array.print())

        assertArrayEquals(array.array, arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))
    }
}