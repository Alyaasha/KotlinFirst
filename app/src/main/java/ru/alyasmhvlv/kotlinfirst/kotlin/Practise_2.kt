//package ru.alyasmhvlv.kotlinfirst.kotlin
//
//fun main() {
//    task11()
//}
//
//fun task1() {
////    val - неизменяемая переменная
//    val number = -7
//
//    if (number > 0) {
//        println("$number is positive")
//    } else if (number < 0) {
//        println("$number is negative")
//    } else {
//        println("The numder is zero")
//    }
//}
//
//fun task2() {
//    val age = 15
//
//    if (age in 1..17) {
//        println("Yes")
//    } else {
//        println("No")
//    }
//
//}
//
//fun task3() {
//
//    when (val day = 6) {
//        1,2,3,4,5 -> println("Weekday")
//        6,7 -> println("Weekend")
//        else -> {
//            println("Wrong day numder!")
//        }
//    }
//}
//
//fun task4() {
//    val score = 82
//
//    val grade = when (score) {
//        in 90..100 -> "A"
//        in 80..89 -> "B"
//        in 70..79 -> "C"
//        in 60..69 -> "D"
//        else -> {}
//    }
//    println("Grade = $grade")
//}
//
//fun task5() {
//    for (i in 1..5) {
//        println("$i ")
//    }
//}
//
//fun task6() {
//    for (i in 5 downTo 1) {
//        println("$i")
//    }
//}
//
//fun task7() {
//    for (i in 0..10 step 2) {
//        println("$i")
//    }
//}
//
//fun task8() {
//
//    val pets = arrayOf("dog", "cat", "canary")
//
//    for ((index, value) in pets.withIndex()) {
//        println("Item at $index is $value")
//    }
//}
//
//fun task9() {
//    repeat(3) {
//        println("kotlin")
//    }
//}
//
//fun task10() {
//    val n = 5
//    var sum = 0
//    for (i in 1..n) {
//        sum += 1
//    }
//println("The sum is $sum")
//
//}
//
//fun task11() {
//
//    var books: Int? = null
//
//    books = books?.dec() ?: 0
//
//    println("$books")
//    println(1.0/2.0)
//
//
//}