package chap06.section2

import kotlin.properties.Delegates

// vetoable() 함수 - onChange()의 람다식에 Boolean을 사용하고 있어서 true일 때 새로운 값이 지정되로 false이면 기존 oldValue 유지
fun main() {
    var max: Int by Delegates.vetoable(0) { // 초깃값은 0
        prop, old, new ->
        new > old // 조건에 맞지 않으면 거부권 행사
    }

    println(max)
    max = 10
    println(max)

    max = 5
    println(max) // 기존값이 새 값보다 크므로 false
}