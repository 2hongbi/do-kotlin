package chap05.section5.burglar

open class Car protected constructor(_year: Int, _model: String, _power: String, _wheel: String) {
    // Car 클래스의 주 생성자에는 protected 지시자가 있기 때문에 constructor 키워드를 생략할 수 없음
    private var year: Int = _year
    public var model: String = _model  // public은 기본값이므로 생략 가능
    protected open var power: String = _power
    internal var wheel: String = _wheel

    protected fun start(key: Boolean) {
        if (key)
            println("Start the Engine!")
    }

    class Driver(_name: String, _license: String) {
        private var name: String = _name
        var license: String = _license
        internal fun driving() = println("[Driver] Driving() - $name")
    }
}