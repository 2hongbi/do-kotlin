package chap03.section1

// 매개변수 이름과 함께 함수 호출하기
fun main() {
    namedParam(x = 200, z = 100)
    namedParam(z = 150)
}

fun namedParam(x: Int = 100, y: Int = 200, z: Int) {
    println(x + y + z)
}