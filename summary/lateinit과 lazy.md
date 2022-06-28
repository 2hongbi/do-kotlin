### lateinit

* var로 선언된 프로퍼티만 가능
* 프로퍼티에 대한 게터와 세터를 사용할 수 없음









### lazy

* 호출 시점에 by lazy {...} 정의에 의해 블록 부분의 초기화를 진행
* 불변의 변수 선언인 val에서만 사용 가능함(읽기 전용) → val이므로 값을 다시 변경할 수 없음

```kotlin
val subject by lazy {
  println("lazy initialized")
}
```

* lazy의 모드
  * `SYNCHRONIZED` -  lock을 사용해 단일 스레드만이 사용하는 것을 보장 (기본값)
  * `PUBLICATION` - 여러 군데에서 호출될 수 있으나 처음 초기화된 후 반환값을 사용
  * `NONE` - lock을 사용하지 않기 때문에 빠르지만 다중 스레드가 접근할 수 있음(값의 일관성 보장 못함)