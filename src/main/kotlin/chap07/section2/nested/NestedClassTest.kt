package chap07.section2.nested

class Outer {
    val ov = 5
    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello ! $nv" // 외부의 ov 변수에는 접근 불가
    }

    fun outside() {
        val msg = Nested().greeting()
        println("[Outer]: $msg, ${Nested().nv}")
    }
}

fun main() {
    val output = Outer.Nested().greeting()
    println(output)

    val outer = Outer() // 외부 클래스의 경우는 객체를 생성해야 함
    outer.outside()
}