import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

data class Interval(val interval: TimeInterval, val amount: Int = 1)

operator fun TimeInterval.times(amount: Int): Interval = Interval(this, amount)

operator fun MyDate.plus(timeInterval: Interval): MyDate = this.addTimeIntervals(timeInterval.interval, timeInterval.amount)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval, 1)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
