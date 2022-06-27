package chap05.section5.burglar

class Tico (_year: Int, _model: String, _power: String, _wheel: String,
            var name: String, private var key: Boolean) : Car(_year, _model, _power, _wheel) {
    override var power: String = "50hp"
    val driver = Driver(name, "first class")

    constructor(_name: String, _key: Boolean) : this (2014, "basic", "100hp", "normal", _name, _key){
        name = _name
        key = _key
    }

    fun access(password: String) {
        if (password == "gotico") {
            println("----[Tico] access()----")
            // super.year  // private 접근 불가
            println("super.model = ${super.model}") // public
            println("super.power = ${super.power}") // protected
            println("super.wheel = ${super.wheel}") // internal
            super.start(key) // protected

            // driver.name //private 접근 불가
            println("Driver().license = ${driver.license}")
            driver.driving() // internal
        } else {
            println("You're a burglar")
        }
    }
}