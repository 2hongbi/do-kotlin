package chap03.section3

fun main( ) {
    shortFunc4(3) {
        println("First call: $it")
        // return 사용 불가
    }
}

inline fun shortFunc4(a: Int, crossinline out: (Int) -> Unit) { // crossinline 키워드는 비지역 반환을 금지해야 하는 람다식에 사용
    println("Before calling out( )")
    nestedFunc { out(a) }
    println("After calling out( )")
}

fun nestedFunc(body: () -> Unit) {
    body( )
}

