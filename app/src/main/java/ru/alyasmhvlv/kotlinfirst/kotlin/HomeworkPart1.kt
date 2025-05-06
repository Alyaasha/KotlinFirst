package ru.alyasmhvlv.kotlinfirst.kotlin
import kotlin.math.min
import kotlin.math.pow



fun main() {
//    task1()
//    task2()
//    task3()
//    task4()
//    task5()
//    task6()
//    task7()
//    task8()
//    task9()
//    task10()
    task11()
}

/**
 * В переменной celsius хранится целое число — температура воздуха.
 * Выведите в консоль:
 * «Freezing», если celsius ≤ 0;
 * «Cool», если 1 ≤ celsius ≤ 15;
 * «Warm», если 16 ≤ celsius ≤ 25;
 * «Hot», если celsius > 25
 */
fun task1() {

    val celsius = 30

    when {
        celsius <= 0 -> println("Freezing")
        celsius in 1..15 -> println("Cool")
        celsius in 16..25 -> println("Warm")
        celsius > 25 -> println("Hot")
    }

}

/**
 * Пассажир сообщает свой возраст в переменной age.
 * Определите стоимость билета по тарифам и выведите найденную стоимость:
 * до 7 лет (включительно) — 0 ₽,
 * 8–17 лет — 15 ₽,
 * 18–60 лет — 30 ₽,
 * старше 60 лет — 20 ₽.
 */
fun task2() {

    val age = 6

    if (age < 7) {
        println("Your rate: 0 P")
    } else if (age in 8..17) {
        println("Your rate: 15 P")
    } else if (age in 18..60) {
        println("Your rate: 30 P")
    } else if (age > 60) {
        println("Your rate: 20 P")
    } else {
        println("Invalid value")
    }
}

/**
 * В переменной month дан номер месяца (1–12).
 * Напечатайте название времени года на английском: «Winter», «Spring», «Summer»
 * или «Autumn».
 */
fun task3() {

    val month = 5

    when (month) {
        in 1..3 -> println("Winter")
        in 4..6 -> println("Spring")
        in 7..9 -> println("Summer")
        in 10..12 -> println("Autumn")
        else -> println("Invalid value")
    }

}

/**
 * В переменной ch хранится одна заглавная латинская буква (A – Z). Выведите строку
 * «YES», если эта буква относится к гласным (A, E, I, O, U, Y), и «NO» в противном
 * случае.
 */
fun task4() {

    val ch = "Q"
    val condition = listOf("A", "E","I","O", "U", "Y")

    if (condition.contains(ch)) {
        println("YES")
    } else {
        println("NO")
    }

}

/**
 * Пользователь вводит число n (1–9).
 * Выведите в одной строке через пробел значения n × 1, n × 2, …, n × 10
 */
fun task5() {

    val n = 5
    var result = 1
    for (i in 1..10)
    {
        print("${n * i} ")
    }


}

/**
 * В коде объявлен массив cities из пяти названий городов.
 * Выведите их по одному на строке в обратном порядке (последний → первый).
 */
fun task6() {

    val cities = arrayOf("Moscow", "New-York", "Paris", "London", "Tokyo")
    for (city in cities.reversed()) {
        println("$city")
    }
}

/**
 * Вводится произвольная строка text.
 * Посчитайте и выведите количество русских гласных букв
 * («аоиеёэыуюя», регистр неважен).
 */
fun task7() {
    var cnt = 0
    val text = "азбукаАУ"
    val vowels = "аоиеёэыуюя"
    for (letter in text.lowercase()) {
        if (letter in vowels) {
            cnt += 1
        }
    }
    println("The number of russian vowels is $cnt")
}

/**
 * Есть изменяемый список целых чисел numbers: MutableList<Int>. Последний
 * элемент списка равен 0 Определите наименьшее значение среди всех элементов,
 * стоящих до этого нуля, и запишите результат в переменную minValue: Int.
 */
fun task8() {
    val numbers = mutableListOf(1, 5, 25, 14, 10, 0)
    numbers.removeAt(numbers.lastIndex)
    var minValue = numbers.min()
    println("$minValue")
}

/**
 * Дан список целых чисел data: List<Int>.
 * Просматривайте элементы по порядку, накапливая их сумму в переменной total:
 * Int, до тех пор, пока total не станет больше 1000 По завершении работы
 * программы в total должно находиться получившееся итоговое значение.
 */
fun task9() {
    val data = listOf(1, 15, 25, 100, 3)
    var total = 0
    do {
        for (n in data) {
            total += n
        }
    } while (total < 1000)
    println("$total")
}

/**
 * Задано натуральное число k: Int. Найдите наименьшую степень двойки 2^m,
 * которая не меньше k, и сохраните это значение в переменной closestPower: Int.
 * Число m выводить или сохранять не требуется.
 */
fun task10() {
    val k = 5
    var cnt = 0
    var closestPower = 1.0
        do {
            closestPower = 2.0.pow(cnt)
            cnt += 1
        } while (k >= closestPower)
    println("$closestPower")
    }


/**
 * В коде уже объявлена переменная middleName: String? = null.
 * Напечатайте строку вида «Количество символов = X»,
 * где X — длина middleName, если значение не null,
 * или 0, если переменная равна null.
 */
fun task11() {
    val middleName: String? = null
    val middleNameLen = middleName?.length
    when (middleNameLen) {
        null -> println("The number of symbols = 0")
        else -> println("The number of symbols = $middleNameLen")
    }
}