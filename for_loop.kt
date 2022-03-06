class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate>{
    val DateIterator = object : Iterator<MyDate> {
        var current = start
        override fun hasNext(): Boolean {
            return current < end || current == end
        }

        override fun next(): MyDate {
            val temp = current
            current = current.followingDate()
            return temp
        }
    }
    override fun iterator(): Iterator<MyDate> = DateIterator
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
