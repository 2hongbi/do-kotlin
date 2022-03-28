package chap02.section2

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null // 코틀린은 변수에 null 허용 안함. 하지만, 자료형 뒤에 물음표(?) 기호를 명시하면 null 값 할당 가능
    println("str1: $str1 length: ${str1?.length}")  // null 허용시, length가 실행될 수 없음 > str1을 세이프콜로 안전하게 호출

    var len = if(str1 != null) str1.length else -1
    println("str1: $str1 length: ${len}")
}