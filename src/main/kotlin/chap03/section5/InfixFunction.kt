package chap03.section3

fun main( ) {
    // 일반 표현법
    // val multi = 3.multiply(10)

    // 중위 표현법
    val multi = 3 multiply 10
    println("multi: $multi")
}

infix fun Int.multiply(x: Int): Int {
    // int를 확장해서 multiply() 함수를 하나 더 추가하며, infix로 선언되면 중위 함수
    return this * x
}