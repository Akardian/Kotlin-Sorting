package sort.comparator

class ComparatorInt : Comparator<Int> {

    override fun compare(val1: Int, val2: Int): Int {
        return (val1 - val2)
    }
}