package chap05.section5.internal

internal class InternalClass {
    internal var i = 1
    internal fun icFunc() {
        i += 1
    }
    fun access() {
        icFunc()
    }
}

class Other {
    internal val ic = InternalClass() // 프로퍼티 지정 시 internal로 맞춰야 함
    fun test() {
        ic.i //접근 허용
        ic.icFunc()
    }
}

fun main() {
    val mic = InternalClass()
    mic.i
    mic.icFunc()
}