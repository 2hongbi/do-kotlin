package chap02.section3

fun main() {
    var test : Number = 12.2
    println("$test")

    test = 12 // int형으로 스마트 캐스트
    println("$test")

    test = 120L // Long으로 스마트 캐스트
    println("$test")

    test += 12.0f // Float형으로 스마트 캐스트
    println("$test")
}