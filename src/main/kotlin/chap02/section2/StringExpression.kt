package chap02.section2

fun main() {  // 문자열에 표현식 사용하기, p.66
    var a = 1
    var str1 = "a = $a"
    var str2 = "a = ${a + 2}" // 문자열에 표현식 사용

    println("str1: \"$str1\", str2: \"$str2\"")

    // 중괄호를 사용해서 큰따옴표나 $ 표현하기
    val special = "${'"'}${'$'}9.99${'"'}" // "$9.99"
    println(special)
}