package chap05.section5.protectedtest

open class Base {
    // 최상위 클래스에는 protected를 사용할 수 없음
    protected var i = 1
    protected fun protectedFunc() {
        i += 1
    }

    fun access() {
        protectedFunc()
    }

    protected class Nested // 내부 클래스에는 지시자 허용
}

class Derived : Base() {
    fun test(base: Base): Int {
        protectedFunc()
        return i // Base 클래스의 프로퍼티 접근 가능
    }
}

fun main() {
    val base = Base()
    // base.i // 접근 불가. protected 멤버 프로터피인 i와 메서드 protectedFunc()의 하위 클래스인 Derived 클래스에서 접근 가능
    // base.protectedFunc() // 접근 불가
    base.access()
}