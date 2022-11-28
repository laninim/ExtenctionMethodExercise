//Write an extension method that filters a list by value (e.g. smaller than 500).
// Write an extension method that prints list values. Then create a list that that has at least 10 members,
// filter them and then print the values that pass the filter.

fun main(args: Array<String>) {
    val values = listOf(1, 5, 22, 731,434,224,1040,440,234,3829,329)
    values.filterSmaller().printsAllValuesList()
}


fun List<Int>.filterSmaller(): List<Int> {
    return this.filter { it -> it < 500 }
}

fun List<Int>.printsAllValuesList () {
    this.forEach { it -> println("Value: $it") }
}