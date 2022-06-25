package chap03.section3

fun main() {
    shortFunc3(3) {
        println("First call: $it")
        return
    }
}

inline fun shortFunc3(a: Int, out: (Int) -> Unit) {
    println("Before calling out( )")
    out(a)  // 인라인되어 대체되기 때문에 return문까지 포함됨
    println("After calling out( ")
}