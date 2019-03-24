package classes

class Warrior(name: String, age: String, gender: String, val strength: Int) : Player(name, age, gender) {
    fun taunt() {
        println("Im facing my enemies")
    }
}