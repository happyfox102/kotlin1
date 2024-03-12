import java.util.Scanner
class Fraction(private var numerator: Int, private var denominator: Int) {

    init {
        require(denominator != 0) { "Знаменатель не может быть равен нулю" }
    }

    fun add(other: Fraction): Fraction {
        val commonDenominator = findCommonDenominator(denominator, other.denominator)
        val newNumerator = numerator * (commonDenominator / denominator) + other.numerator * (commonDenominator / other.denominator)
        return Fraction(newNumerator, commonDenominator)
    }

    fun subtract(other: Fraction): Fraction {
        val commonDenominator = findCommonDenominator(denominator, other.denominator)
        val newNumerator = numerator * (commonDenominator / denominator) - other.numerator * (commonDenominator / other.denominator)
        return Fraction(newNumerator, commonDenominator)
    }

    fun multiply(other: Fraction): Fraction {
        return Fraction(numerator * other.numerator, denominator * other.denominator)
    }

    fun divide(other: Fraction): Fraction {
        return Fraction(numerator * other.denominator, denominator * other.numerator)
    }

    private fun findCommonDenominator(a: Int, b: Int): Int {
        var max = if (a > b) a else b

        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max
            }
            max++
        }
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }
}



fun main() {
    val scanner = Scanner(System.`in`)

    print("Введите числитель для дроби 1: ")
    val numerator1 = scanner.nextInt()
    print("Введите знаменатель для дроби 1: ")
    val denominator1 = scanner.nextInt()

    print("Введите числитель для дроби 2: ")
    val numerator2 = scanner.nextInt()
    print("Введите знаменатель для дроби 2: ")
    val denominator2 = scanner.nextInt()

    val fraction1 = Fraction(numerator1, denominator1)
    val fraction2 = Fraction(numerator2, denominator2)

    println("Дробь 1: $fraction1")
    println("Дробь 2: $fraction2")

    val sum = fraction1.add(fraction2)
    println("Сумма: $sum")

    val difference = fraction1.subtract(fraction2)
    println("Разность: $difference")

    val product = fraction1.multiply(fraction2)
    println("Произведение: $product")

    val quotient = fraction1.divide(fraction2)
    println("Частное: $quotient")
}