package chap05.section5.burglar

class Burglar() {
    fun steal(anycar: Any) {
        if (anycar is Tico) {
            println("----[Burglar] steal()----")
            println("anycar.name = ${anycar.name}")
            println("anycar.wheel = ${anycar.wheel}")
            println("anycar.model = ${anycar.model}")

            println(anycar.driver.license) // public 접근
            anycar.driver.driving() //internal 접근(같은 모듈 안에 있으므로)
            anycar.access("dontknow")
        } else {
            println("Nothing to steal")
        }
    }
}

fun main() {
    // val car = Car() // protected 생성 불가
    val tico = Tico("Kildong", true)
    tico.access("gotico")

    val burglar = Burglar()
    burglar.steal(tico)
}