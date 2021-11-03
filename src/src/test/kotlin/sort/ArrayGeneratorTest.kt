package sort

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

import org.junit.jupiter.api.Test
import sort.bubblesort.BubbleSort

internal class ArrayGeneratorTest {

    @Test
    @DisplayName("Create empty Array")
    fun createEmpty() {
        val array = BubbleSort()

        println("createEmpty: " + array.size)
        assertEquals(0, array.size)
    }

    @Test
    @DisplayName("Create Array with 50 entry's")
    fun createArray() {
        val array = BubbleSort(_size = 50)

        println("createArray: " + array.size)
        assertEquals(50, array.size)
    }

    @Test
    @DisplayName("Check Array Sum Values")
    fun checkArraySum() {
        val array = BubbleSort(_size = 10)

        println("checkArraySum: " + array.sum())
        assertEquals(45, array.sum())
    }

    @Test
    @DisplayName("Compare 2 shuffled Arrays")
    fun compareArray() {
        val array1 = BubbleSort(_size = 10, _seed = 12345)
        val array2 = BubbleSort(_size = 10, _seed = 12345)

        println("compareArray: " + array1.print())
        println("compareArray: " + array2.print())
        assertArrayEquals(array1.array, array2.array)
    }

    @Test
    @DisplayName("Swap 2 integers")
    fun swapInt() {
        val array = longArrayOf(2, 1)
        println("swapArray: " + array[0] + " " + array[1])

        val test = BubbleSort()
        test.swapLong(array, firstIndex = 0, secondIndex = 1)

        println("swapArray: " + array[0] + " " + array[1])
        assertArrayEquals(array, longArrayOf(1, 2))
    }
}