package chap03.section1

fun main() { // 최초의 스택 프레임
    val num1 = 10
    val num2 = 3
    val result: Int

    result = max(num1, num2) // 두 번째 스택 프레임
    println(result)
}

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun max(a: Int, b: Int) = if (a > b) a else b