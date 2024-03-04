fun main() {
    val numbers = mutableListOf<Int>()

    println("Введите числа (для завершения введите 'exit'): ")
    var input: String?
    do {
        input = readLine()
        if (input != "exit") {
            numbers.add(input!!.toInt())
        }
    } while (input != "exit")

    val sortedNumbers = numbers.sortedBy { it }
    println("Отсортированный список: $sortedNumbers")
}