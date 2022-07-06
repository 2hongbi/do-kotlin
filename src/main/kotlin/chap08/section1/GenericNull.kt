package chap08.section1

class GenericNull<T> { // 기본적으로 null이 허용되는 형식 매개변수
    fun EqualityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj = GenericNull<String>()
    obj.EqualityFunc("Hello", "World")

    val obj2 = GenericNull<Int?>()
    obj2.EqualityFunc(null, 10)
}