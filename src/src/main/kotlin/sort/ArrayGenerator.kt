package sort

import kotlin.random.Random

/**
 * Creates a shuffled array.
 *
 * only positive seeds are used
 */
abstract class ArrayGenerator(_size: Int, _seed: Int) {
    var array: LongArray
    val size: Int

    init {
        array = LongArray(_size) {index ->
            index.toLong()
        }

        if(_seed < 0) {
            array.shuffle()
        } else {
            array.shuffle(Random(_seed))
        }
        size = array.size
    }

    /**
     * Sum of all Array Values
     */
    fun sum() : Long {
        return array.sum()
    }

    /**
     * Returns a pretty string of array values
     */
    fun print() : String {
        var output = ""
        array.forEach { value ->
            output = if (output.isBlank()){
                "$value"
            }else {
                "$output $value"
            }
        }
        return output
    }

    /**
     * Swap 2 integer values in place
     */
    fun swapLong(array : LongArray, firstIndex: Int, secondIndex: Int) {
        array[firstIndex]  = array[firstIndex] + array[secondIndex]
        array[secondIndex] = array[firstIndex] - array[secondIndex];
        array[firstIndex]  = array[firstIndex] - array[secondIndex];
    }

    abstract fun sort()
}