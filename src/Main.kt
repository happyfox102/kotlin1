fun main() {
    val numbers = mutableListOf<Int>()
    var input: String?

    do {
        print("Введите число (или 'q' для завершения): ")
        input = readLine()
        if (input != null && input != "q") {
            numbers.add(input.toInt())
        }
    } while (input != null && input != "q")

    if (numbers.isNotEmpty()) {
        val maxNumber = numbers.maxOrNull()
        println("Самое большое число: $maxNumber")
    } else {
        println("Вы не ввели ни одного числа")
    }
}