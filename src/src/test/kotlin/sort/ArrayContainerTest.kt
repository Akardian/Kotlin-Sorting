package sort

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

import org.junit.jupiter.api.Test
import sort.bubblesort.BubbleSortInt

internal class ArrayContainerTest {

    private val emptyArray = emptyArray<Int>()
    private val defaultArray = arrayOf(0,1,2,3,4,5,6,7,8,9)

    @Test
    @DisplayName("Create empty Array")
    fun createEmpty() {
        val array = BubbleSortInt(emptyArray)

        println("createEmpty: " + array.size)
        assertEquals(0, array.size)
    }

    @Test
    @DisplayName("Create Array with 50 entry's")
    fun createArray() {
        val array = BubbleSortInt(defaultArray)

        println("createArray: " + array.size)
        assertEquals(10, array.size)
    }

    @Test
    @DisplayName("Check Array Sum Values")
    fun checkArraySum() {
        val array = BubbleSortInt(defaultArray)

        println("checkArraySum: " + array.sum())
        assertEquals(45, array.sum())
    }

    @Test
    @DisplayName("Compare 2 shuffled Arrays")
    fun compareArray() {
        val array1 = BubbleSortInt(defaultArray)
        val array2 = BubbleSortInt(defaultArray)

        array1.shuffle(seed = 12345)
        array2.shuffle(seed = 12345)

        println("compareArray: " + array1.print())
        println("compareArray: " + array2.print())
        assertArrayEquals(array1.array, array2.array)
    }

    @Test
    @DisplayName("Swap 2 integers")
    fun swapInt() {
        val array = arrayOf(2, 1)
        println("swapArray: " + array[0] + " " + array[1])

        val test = BubbleSortInt(defaultArray)
        test.shuffle(seed = 123456)

        test.swap(firstIndex = 0, secondIndex = 1)

        println("swapArray: " + array[0] + " " + array[1])
        assertArrayEquals(array, arrayOf(1, 2))
    }
}