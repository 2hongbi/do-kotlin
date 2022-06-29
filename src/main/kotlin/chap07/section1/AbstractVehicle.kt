package chap07.section1

abstract class Vehicle(val name: String, val color: String, val weight: Double) {
    // 추상 클래스. 주 생성자에는 비추상 프로퍼티 매개변수가 3개 있음

    abstract var maxSpeed: Double // 추상 프로퍼티 (반드시 하위 클래스에서 재정의해 초기화해야 함)

    var year = "2018" // 일반 프로퍼티 (초깃값인 상태를 저장할 수 있음)

    abstract fun start() // 추상 메서드 (반드시 하위 클래스에서 구현해야 함)
    abstract fun stop()

    fun displaySpecs() {
        println("Name: $name, Color: $color, Weight: $weight, Year: $year, Max Speed: $maxSpeed")
    }
}

class Car(name: String, color: String, weight: Double, override var maxSpeed: Double) : Vehicle(name, color, weight) {
    override fun start() {
        println("Car Started")
    }

    override fun stop() {
        println("Car Stopped!")
    }
}

class Motorcycle(name: String, color: String, weight: Double, override var maxSpeed: Double) : Vehicle(name, color, weight) {
    override fun start() {
        println("Bike Started")
    }

    override fun stop() {
        println("Bike Stopped")
    }
}

fun main() {
    val car = Car("SuperMatiz", "yellow", 1110.0, 270.0)
    val motor = Motorcycle("DreamBike", "red", 173.0, 100.0)

    car.year = "2013"

    car.displaySpecs()
    car.start()
    motor.displaySpecs()
    motor.start()
}