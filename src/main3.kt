fun main() {
    println("Введите отсортированные числа через пробел:")
    val input = readLine()
    val sortedArray = input?.split(" ")?.map { it.toInt() } ?: emptyList()

    println("Введите число для поиска:")
    val target = readLine()?.toInt() ?: 0

    var found = false
    var index = -1

    var left = 0
    var right = sortedArray.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2

        if (sortedArray[mid] == target) {
            found = true
            index = mid
            break
        } else if (sortedArray[mid] < target) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    if (found) {
        println("Число найдено в позиции $index")
    } else {
        println("Число не найдено в массиве")
    }
}
