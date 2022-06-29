package chap07.section1

interface Pet {
    var category: String // abstract가 없어도 기본은 추상 프로퍼티
    val msgTags: String
        get() = "I'm your lovely pet!"
    var species: String
    fun feeding() // 추상 메서드
    fun patting() { // 입반 메서드
        println("Keep patting!")
    }
}

class Cat(name: String, override var category: String) : Pet, Animal(name) {
    override var species: String = "cat"
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}
