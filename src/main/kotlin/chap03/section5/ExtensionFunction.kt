package chap03.section3

fun main( ) {
    // String 클래스에 확장 함수 추가하기
    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))
}

// String 클래스를 확장해 getLongString() 함수 추가
fun String.getLongString(target: String) : String =
    if (this.length > target.length) this else target