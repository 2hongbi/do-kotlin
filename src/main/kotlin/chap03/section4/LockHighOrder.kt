package chap03.section3

import java.util.concurrent.locks.ReentrantLock

var shareable = 1 // 보호가 필요한 공유 자원

fun main() {
    val reLock = ReentrantLock()
    lock(reLock, { criticalFunc() })
    lock(reLock) { criticalFunc() }
    lock(reLock, ::criticalFunc) // 가장 간략화된 함수 참조로 호출하는 방법이 좋음

    println(shareable)
}

fun criticalFunc() {
    // 공유 자원 접근 코드 사용
    shareable += 1
}

fun <T> lock(reLock: ReentrantLock, body: () -> T) : T {
    reLock.lock()
    try {
        return body()
    } finally {
        reLock.unlock()
    }
}