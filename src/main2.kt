fun bubbleSort(arr: IntArray) {
    val n = arr.size
    var temp: Int
    for (i in 0 until n - 1) {
        for (j in 0 until n - 1 - i) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}
fun main() {
    print("Введите числа через пробел: ")
    val input = readLine()
    val numbers = input?.split(" ")?.map { it.toInt() }?.toIntArray()
    if (numbers != null) {
        bubbleSort(numbers)
        println("Отсортированный массив: ${numbers.joinToString()}")
    } else {
        println("Ошибка ввода. Пожалуйста, введите числа через пробел.")
    }
}
