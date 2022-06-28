package chap06.section2

import kotlin.properties.Delegates

// observable() 함수 - 프로퍼티의 값이 변경되는지 감시
class User {
    var name: String by Delegates.observable("NONAME" ) { // 프로퍼티 위임
        prop, old, new -> // 람다식 매개변수로 프로퍼티, 기존값, 새로운값 지정
        println("$old -> $new")
    }
}

fun main() {
    val user = User()
    user.name = "Kildong" // 값이 변경되는 시점에서 첫 이벤트 발생
    user.name = "Dooly" // 값이 변경되는 시점에서 두 번째 이벤트 발생
}