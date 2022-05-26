package chap03.section3

fun main() {
    noParam({"Hello World!"})
    noParam{"Hello World!"}  // 위와 동일 결과, 소괄호 생략 가능
}

// 매개변수가 없는 람다식이 noParam 함수의 매개변수 out으로 지정됨
fun noParam(p: () -> String) = println(p())