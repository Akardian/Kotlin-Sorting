package sort

import kotlin.random.Random

/**
 * Creates a shuffled array.
 *
 * only positive seeds are used
 */
abstract class ArrayContainer<T> {
    var array: Array<T>
    var size: Int

    constructor(_array: Array<T>) {
        array = _array
        size = array.size
    }

    /**
     * Shuffle the array with a random seed
     */
    fun shuffle() {
        array.shuffle()

    }

    /**
     * Shuffle the array with a set seed
     */
    fun shuffle(seed: Int) {
        array.shuffle(Random(seed))
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
}