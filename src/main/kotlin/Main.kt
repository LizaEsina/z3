import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Введите натуральное число: ")
    var number = scanner.nextInt()

    var binaryString = ""

    while (number != 0) {
        binaryString = (number % 2).toString() + binaryString
        number /= 2
    }

    println("Двоичное представление числа: $binaryString")
}
