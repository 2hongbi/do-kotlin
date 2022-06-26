package chap05.section4

open class A {
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}

interface B {
    fun f() = println("B Interface f()") // 인터페이스는 기본적으로 open
    fun b() = println("B Interface b()")
}

class C : A(), B { // 클래스와 인터페이스 지정
    override fun f() = println("C Class f()")

    fun test() {
        f()
        b()
        super<A>.f()    // A 클래스의 f()
        super<B>.f()    // B 클래스의 f()
    }
}

fun main() {
    val c = C()
    c.test()
}