package chap02.section3

fun main() {
    val a : Int = 128
    val b = a
    println(a === b) // 자료형이 기본형인 int형이 되어 값이 동일하므로 true

    val c : Int? = a
}