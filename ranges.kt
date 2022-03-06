fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return (first < date || date == first) && (date < last || date == last)
}
