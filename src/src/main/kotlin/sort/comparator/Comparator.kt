package sort.comparator

interface Comparator<T> {
    /**
     * Compare two values and return -1 if "Value1" is smaller +1 if  "Value1"
     * is bigger and 0 if they are Equal
     */
    fun compare(val1: T, val2: T) : Int
}