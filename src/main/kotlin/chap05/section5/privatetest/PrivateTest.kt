package chap05.section5.privatetest

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1
    }
    fun access() {
        privateFunc() // 접근 혀용
    }
}

class OtherClass {
    // val opc = PrivateTest() // 불가. 프로퍼티 opc는 private이 되어야 함
    fun test() {
        val pc = PrivateClass()
    }
}

fun main() {
    val pc = PrivateClass() // 생성 가능
    // pc.i // 접근 불가
    // pc.privateFunc() // 접근 불가
}

fun TopFunction() {
    val tpc = PrivateClass()
}