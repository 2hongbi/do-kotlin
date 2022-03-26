package chap02.section2

fun main() { // 형식화된 다중 문자열 출력해 보기
    val num = 10
    val formattedString = """
        var a = 6
        var b = "Kotlin"
        println(a + num) // num의 값은 $num
    """
    println(formattedString)
}